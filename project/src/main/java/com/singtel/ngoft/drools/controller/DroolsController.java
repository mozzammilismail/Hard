package com.singtel.ngoft.drools.controller;

import java.util.List;

import org.drools.core.marshalling.impl.ProtobufMessages.Agenda.RuleFlowGroup;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;
import org.kie.internal.logger.KnowledgeRuntimeLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.ngoft.dataobject.model.server.BPMMessageDO;
import com.singtel.ngoft.dataobject.model.server.BPMOFTRequest;
import com.singtel.ngoft.dataobject.request.BPMOFTRequestWrapper;
import com.singtel.ngoft.drools.bre.BRERuntime;
import com.singtel.ngoft.drools.bre.FunctionHelper;
import com.singtel.ngoft.drools.bre.TrackingAgendaEventListener;

@RestController
public class DroolsController {

	@Autowired
	private KieContainer kieContainer;

	@Autowired
	private BRERuntime breRuntime;
	
	@Autowired
	FunctionHelper functionHelper;
	Logger logger = LoggerFactory.getLogger(DroolsController.class);

	// Trying to Send RequestBody in Get -- BPMOFTRequest
	// checkBRE -- returns the same object that has been passed.
	@PostMapping(path = "/bre/checkBRE", consumes = "application/json", produces = "application/json")
	public ResponseEntity<BPMOFTRequest> checkBRE(@RequestBody BPMOFTRequest req1) {
		KieSession kieSession = breRuntime.getDroolsKieSession();
		logger.info("BRESERVICE :: checkBRE :: ---->");
		logger.info("Cust ID : " + req1.getCustHasInfo().getCustomer().getPegasusCustomerID());

		kieSession.insert(req1); // which object to validate
		BPMOFTRequest resp = new BPMOFTRequest();
		resp = req1;
		kieSession.setGlobal("req2", resp);
		// setting only particular rulesets
		// setRuleAgenda(kieSession, req);
		Agenda agenda = kieSession.getAgenda();
		//Checking Customer Rule
		agenda.getAgendaGroup("CUSTOMER_RULES").setFocus();
		agenda.getAgendaGroup("Interim_Rule").clear();
		
		// Adding AgendaEventListener
		kieSession.addEventListener(new TrackingAgendaEventListener());

		// Passing logger
		kieSession.fireAllRules(); // fire all rules defined into drool file (drl)
		kieSession.dispose();
		return new ResponseEntity<BPMOFTRequest>(resp, HttpStatus.OK);

	}

	// Trying to Send RequestBody in Get -- BPMOFTRequest Setting in DM
	// checkBREDM -- returns the same object that has been passed. But RLCustomer is
	// populated and age is printed on console
	@PostMapping(path = "/bre/checkBREDM", consumes = "application/json", produces = "application/json")
	public ResponseEntity<BPMOFTRequest> checkBREDM(@RequestBody BPMOFTRequest req1) {
		KieSession kieSession = breRuntime.getDroolsKieSession();
		logger.info("BRESERVICE :: checkBREDM :: ---->");
		logger.info("Cust ID : " + req1.getCustHasInfo().getCustomer().getPegasusCustomerID());

		kieSession.insert(req1); // which object to validate
		BPMOFTRequest resp = new BPMOFTRequest();
		resp = req1;
		kieSession.setGlobal("req2", resp);
		// setting only particular rulesets
		// Using agenda for now -- to be replaced by triggering a particular .DRL file
		Agenda agenda = kieSession.getAgenda();
		agenda.getAgendaGroup("Interim_Rule").setFocus();
		agenda.getAgendaGroup("CUSTOMER_RULES").clear();
		// Adding AgendaEventListener
		kieSession.addEventListener(new TrackingAgendaEventListener());
		kieSession.fireAllRules(); // fire all rules defined into drool file (drl)
		kieSession.dispose();
		return new ResponseEntity<BPMOFTRequest>(resp, HttpStatus.OK);

	}
	
	
	//API call with wrapper object as RequestBody
	//Calling particular ruleset using agenda-group
	@PostMapping(path = "/bre/checkBREWrapper", consumes = "application/json", produces = "application/json")
	public ResponseEntity<BPMOFTRequest> checkBREWrapper(@RequestBody BPMOFTRequestWrapper req) {
		KieSession kieSession = breRuntime.getDroolsKieSession();
		logger.info("BRESERVICE :: checkBREWrapper :: ---->");
		logger.info("Cust ID : " + req.getOftRequest().getCustHasInfo().getCustomer().getCustomerDtls().getCustomerId());
		logger.info("Rulesets to be triggered :: "+req.getRuleSets().get(0));
		BPMOFTRequest req1 = req.getOftRequest();
		kieSession = functionHelper.insertObjectsIntoKieSession(req.getOftRequest(), kieSession);// which object to validate
		//kieSession.insert(req1); // which object to validate
		BPMOFTRequest resp = new BPMOFTRequest();
		resp = req.getOftRequest();
		kieSession.setGlobal("req2", resp);
		TrackingAgendaEventListener trackAgends = new TrackingAgendaEventListener();
		// setting only particular rulesets
		// Using agenda for now -- to be replaced by triggering a particular .DRL file
		Agenda agenda = kieSession.getAgenda();
		for (String rs : req.getRuleSets()) {
			agenda.getAgendaGroup(rs).setFocus();
			kieSession.addEventListener(trackAgends);
			kieSession.fireAllRules();
		}
		
		kieSession.dispose();
		/*
		 * agenda.getAgendaGroup("Interim_Rule").setFocus();
		 * //agenda.getAgendaGroup("Customer_Rules").setFocus();
		 * 
		 * kieSession.addEventListener(new TrackingAgendaEventListener());
		 * kieSession.fireAllRules(); // fire all rules defined into drool file (drl)
		 * 
		 * agenda.getAgendaGroup("Customer_Rules").setFocus();
		 * //agenda.getAgendaGroup("Customer_Rules").setFocus();
		 * 
		 * kieSession.addEventListener(new TrackingAgendaEventListener());
		 * kieSession.fireAllRules();
		 */
		
		return new ResponseEntity<BPMOFTRequest>(resp, HttpStatus.OK);
	}
	
	
}
