package com.singtel.ngoft.drools.model.temp;

//Delete this package later
//Temporary Class.
import java.io.Serializable;

public class ErrorCode implements Serializable {

	/**
	 * Generated SerialVersionID
	 */
	private static final long serialVersionUID = 3990118863246970216L;
	private int rowIndex;

	private String errId;

	private String errMsg;

	private String errTy;
	private String errActionCd;
	private String errIActionCd;

	public ErrorCode() {

	}

	/*
	 * public ErrorCode(String errId, String errMsg, String errTy, String
	 * errActionCd, String errIActionCd) {
	 * 
	 * this.errId = errId; this.errMsg = errMsg; this.errTy = errTy;
	 * this.errActionCd = errActionCd; this.errIActionCd = errIActionCd;
	 * 
	 * }
	 * 
	 * public String getErrId() { return errId; }
	 * 
	 * public void setErrId(String errId) { this.errId = errId; }
	 * 
	 * public String getErrMsg() { return errMsg; }
	 * 
	 * public void setErrMsg(String errMsg) { this.errMsg = errMsg; }
	 * 
	 * public String getErrTy() { return errTy; }
	 * 
	 * public void setErrTy(String errTy) { this.errTy = errTy; }
	 * 
	 * public String getErrActionCd() { return errActionCd; }
	 * 
	 * public void setErrActionCd(String errActionCd) { this.errActionCd =
	 * errActionCd; }
	 * 
	 * public String getErrIActionCd() { return errIActionCd; }
	 * 
	 * public void setErrIActionCd(String errIActionCd) { this.errIActionCd =
	 * errIActionCd; }
	 */

	@Override
	public String toString() {
		return "ErrorCode{" + "rowIndex=" + rowIndex + ", errId=" + errId + ", errMsg='" + errMsg + '\'' + ", errTy='"
				+ errTy + '\'' + ", errActionCd=" + errActionCd + ", errIActionCd=" + errIActionCd + '}';
	}
}
