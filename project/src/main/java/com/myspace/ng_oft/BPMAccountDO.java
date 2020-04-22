package com.myspace.ng_oft;

public class BPMAccountDO
{

    private java.lang.String bpmInternalAccountID;
    private java.lang.String internalTxnType;

    public String getBpmInternalAccountID() {
        return bpmInternalAccountID;
    }


    public void setBpmInternalAccountID(String value) {
        this.bpmInternalAccountID = value;
    }
	
	public String getInternalTxnType() {
        return internalTxnType;
    }


    public void setinternalTxnType(String value) {
        this.internalTxnType = value;
    }

	public BPMAccountDO(java.lang.String bpmInternalAccountID,
			java.lang.String internalTxnType) {
		this.bpmInternalAccountID = bpmInternalAccountID;
		this.internalTxnType = internalTxnType;
	}


}
