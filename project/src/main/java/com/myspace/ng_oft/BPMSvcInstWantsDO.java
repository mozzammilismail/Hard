package com.myspace.ng_oft;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BPMSvcInstWantsDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String customerID;
	private java.lang.String svcPdtInfo;

	public BPMSvcInstWantsDO() {
	}

	public java.lang.String getCustomerID() {
		return this.customerID;
	}

	public void setCustomerID(java.lang.String customerID) {
		this.customerID = customerID;
	}

	public java.lang.String getSvcPdtInfo() {
		return this.svcPdtInfo;
	}

	public void setSvcPdtInfo(java.lang.String svcPdtInfo) {
		this.svcPdtInfo = svcPdtInfo;
	}

	public BPMSvcInstWantsDO(java.lang.String customerID,
			java.lang.String svcPdtInfo) {
		this.customerID = customerID;
		this.svcPdtInfo = svcPdtInfo;
	}

}