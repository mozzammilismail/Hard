
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctPaymentInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctPaymentInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctCashDeposit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overdueAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disputeAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noRefund" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AcctPaymentInfoDO
    implements Serializable
{

    protected String acctCashDeposit;
    protected String invCurrency;
    protected String acctBalance;
    protected String overdueAmt;
    protected String disputeAmt;
    protected String noRefund;

    /**
     * Gets the value of the acctCashDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCashDeposit() {
        return acctCashDeposit;
    }

    /**
     * Sets the value of the acctCashDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCashDeposit(String value) {
        this.acctCashDeposit = value;
    }

    /**
     * Gets the value of the invCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCurrency() {
        return invCurrency;
    }

    /**
     * Sets the value of the invCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCurrency(String value) {
        this.invCurrency = value;
    }

    /**
     * Gets the value of the acctBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctBalance() {
        return acctBalance;
    }

    /**
     * Sets the value of the acctBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctBalance(String value) {
        this.acctBalance = value;
    }

    /**
     * Gets the value of the overdueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueAmt() {
        return overdueAmt;
    }

    /**
     * Sets the value of the overdueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueAmt(String value) {
        this.overdueAmt = value;
    }

    /**
     * Gets the value of the disputeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeAmt() {
        return disputeAmt;
    }

    /**
     * Sets the value of the disputeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeAmt(String value) {
        this.disputeAmt = value;
    }

    /**
     * Gets the value of the noRefund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRefund() {
        return noRefund;
    }

    /**
     * Sets the value of the noRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRefund(String value) {
        this.noRefund = value;
    }

}
