package com.singtel.ngoft.dataobject.request;
/**
 * Wrapper Class for Request Object.
 * Accepts BPMOFTRequest and Rulesets to be triggered.
 */
import java.io.Serializable;
import java.util.List;

import com.singtel.ngoft.dataobject.model.server.BPMOFTRequest;
public class BPMOFTRequestWrapper implements Serializable {

	BPMOFTRequest oftRequest;
	List<String> ruleSets;

	public BPMOFTRequest getOftRequest() {
		return oftRequest;
	}

	public void setOftRequest(BPMOFTRequest oftRequest) {
		this.oftRequest = oftRequest;
	}

	public List<String> getRuleSets() {
		return ruleSets;
	}

	public void setRuleSets(List<String> ruleSets) {
		this.ruleSets = ruleSets;
	}
}
