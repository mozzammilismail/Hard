
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMCorridorInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMCorridorInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCodeOrigin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countryCodeTarget" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pointCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pointOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corridorPlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnPdtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="trackingIdServ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMCorridorInfoDO
    implements Serializable
{

    protected String actionCode;
    protected Long countryCodeOrigin;
    protected Long countryCodeTarget;
    protected Long pointCategory;
    protected String pointOrigin;
    protected String pointTarget;
    protected Long corridorPlanId;
    protected String description;
    protected String txnPdtInd;
    protected Long trackingId;
    protected Long trackingIdServ;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the countryCodeOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountryCodeOrigin() {
        return countryCodeOrigin;
    }

    /**
     * Sets the value of the countryCodeOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountryCodeOrigin(Long value) {
        this.countryCodeOrigin = value;
    }

    /**
     * Gets the value of the countryCodeTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountryCodeTarget() {
        return countryCodeTarget;
    }

    /**
     * Sets the value of the countryCodeTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountryCodeTarget(Long value) {
        this.countryCodeTarget = value;
    }

    /**
     * Gets the value of the pointCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPointCategory() {
        return pointCategory;
    }

    /**
     * Sets the value of the pointCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPointCategory(Long value) {
        this.pointCategory = value;
    }

    /**
     * Gets the value of the pointOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOrigin() {
        return pointOrigin;
    }

    /**
     * Sets the value of the pointOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOrigin(String value) {
        this.pointOrigin = value;
    }

    /**
     * Gets the value of the pointTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointTarget() {
        return pointTarget;
    }

    /**
     * Sets the value of the pointTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointTarget(String value) {
        this.pointTarget = value;
    }

    /**
     * Gets the value of the corridorPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorridorPlanId() {
        return corridorPlanId;
    }

    /**
     * Sets the value of the corridorPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorridorPlanId(Long value) {
        this.corridorPlanId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the txnPdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnPdtInd() {
        return txnPdtInd;
    }

    /**
     * Sets the value of the txnPdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnPdtInd(String value) {
        this.txnPdtInd = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrackingId(Long value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the trackingIdServ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrackingIdServ() {
        return trackingIdServ;
    }

    /**
     * Sets the value of the trackingIdServ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrackingIdServ(Long value) {
        this.trackingIdServ = value;
    }

}
