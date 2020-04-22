
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPenaltySubsInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPenaltySubsInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arborSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionPenaltyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionPenaltyStDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionPenaltyPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionPenaltyEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionPenaltyRemainDur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineTieInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricePlanDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractPenaltySubsInfoDO
    implements Serializable
{

    protected String svcNum;
    protected String opSvcType;
    protected String arborSvcType;
    protected String subscriptionPenaltyDesc;
    protected String subscriptionPenaltyStDt;
    protected String subscriptionPenaltyPeriod;
    protected String subscriptionPenaltyEndDt;
    protected String subscriptionPenaltyRemainDur;
    protected String schemeDesc;
    protected String lineTieInd;
    protected String pricePlanDesc;

    /**
     * Gets the value of the svcNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNum() {
        return svcNum;
    }

    /**
     * Sets the value of the svcNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNum(String value) {
        this.svcNum = value;
    }

    /**
     * Gets the value of the opSvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpSvcType() {
        return opSvcType;
    }

    /**
     * Sets the value of the opSvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpSvcType(String value) {
        this.opSvcType = value;
    }

    /**
     * Gets the value of the arborSvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArborSvcType() {
        return arborSvcType;
    }

    /**
     * Sets the value of the arborSvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArborSvcType(String value) {
        this.arborSvcType = value;
    }

    /**
     * Gets the value of the subscriptionPenaltyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPenaltyDesc() {
        return subscriptionPenaltyDesc;
    }

    /**
     * Sets the value of the subscriptionPenaltyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPenaltyDesc(String value) {
        this.subscriptionPenaltyDesc = value;
    }

    /**
     * Gets the value of the subscriptionPenaltyStDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPenaltyStDt() {
        return subscriptionPenaltyStDt;
    }

    /**
     * Sets the value of the subscriptionPenaltyStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPenaltyStDt(String value) {
        this.subscriptionPenaltyStDt = value;
    }

    /**
     * Gets the value of the subscriptionPenaltyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPenaltyPeriod() {
        return subscriptionPenaltyPeriod;
    }

    /**
     * Sets the value of the subscriptionPenaltyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPenaltyPeriod(String value) {
        this.subscriptionPenaltyPeriod = value;
    }

    /**
     * Gets the value of the subscriptionPenaltyEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPenaltyEndDt() {
        return subscriptionPenaltyEndDt;
    }

    /**
     * Sets the value of the subscriptionPenaltyEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPenaltyEndDt(String value) {
        this.subscriptionPenaltyEndDt = value;
    }

    /**
     * Gets the value of the subscriptionPenaltyRemainDur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPenaltyRemainDur() {
        return subscriptionPenaltyRemainDur;
    }

    /**
     * Sets the value of the subscriptionPenaltyRemainDur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPenaltyRemainDur(String value) {
        this.subscriptionPenaltyRemainDur = value;
    }

    /**
     * Gets the value of the schemeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeDesc() {
        return schemeDesc;
    }

    /**
     * Sets the value of the schemeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeDesc(String value) {
        this.schemeDesc = value;
    }

    /**
     * Gets the value of the lineTieInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTieInd() {
        return lineTieInd;
    }

    /**
     * Sets the value of the lineTieInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTieInd(String value) {
        this.lineTieInd = value;
    }

    /**
     * Gets the value of the pricePlanDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanDesc() {
        return pricePlanDesc;
    }

    /**
     * Sets the value of the pricePlanDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanDesc(String value) {
        this.pricePlanDesc = value;
    }

}
