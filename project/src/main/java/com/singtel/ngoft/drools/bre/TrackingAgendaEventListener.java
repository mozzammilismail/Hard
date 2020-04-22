package com.singtel.ngoft.drools.bre;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kie.api.definition.rule.Rule;
/**
 * Logging for Rule Trigger
 */
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TrackingAgendaEventListener extends DefaultAgendaEventListener {
	Logger logger = LoggerFactory.getLogger(TrackingAgendaEventListener.class);

	private List<Activation> activationList = new ArrayList<Activation>();
	
	 public void agendaGroupPushed(AgendaGroupPushedEvent event) {
	      	super.agendaGroupPushed(event);
	      
	      	logger.info("BRESERVICE :: agendaGroupPushed :: RULESET FIRED :: " + 	event.getAgendaGroup().getName());
	    }
	 
	  @Override
	    public void afterMatchFired(AfterMatchFiredEvent event) {
	        Rule rule = event.getMatch().getRule();

	        String ruleName = rule.getName();
	        Map<String, Object> ruleMetaDataMap = rule.getMetaData();

	        activationList.add(new Activation(ruleName));
	        StringBuilder sb = new StringBuilder("BRESERVICE :: afterMatchFired :: RULE FIRED :: " + ruleName);

	        if (ruleMetaDataMap.size() > 0) {
	            sb.append("\n  With [" + ruleMetaDataMap.size() + "] meta-data:");
	            for (String key : ruleMetaDataMap.keySet()) {
	                sb.append("\n    key=" + key + ", value="
	                        + ruleMetaDataMap.get(key));
	            }
	        }

	        logger.info(sb.toString());
	    }

	    public boolean isRuleFired(String ruleName) {
	        return activationList.contains(ruleName);
	    }

	    public void reset() {
	        activationList.clear();
	    }

	    public final List<Activation> getActivationList() {
	        return activationList;
	    }

	    public String activationsToString() {
	        if (activationList.size() == 0) {
	            return "No activations occurred.";
	        } else {
	            StringBuilder sb = new StringBuilder("Activations: ");
	            for (Activation activation : activationList) {
	                sb.append("\n  rule: ").append(activation.getRuleName());
	            }
	            return sb.toString();
	        }
	    }

}
