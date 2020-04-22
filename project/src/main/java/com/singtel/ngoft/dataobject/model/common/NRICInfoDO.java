
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NRICInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NRICInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NRIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRICName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inactiveDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdatedDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nricBlacklistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nricMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class NRICInfoDO
    implements Serializable
{

    protected String nric;
    protected String nricName;
    protected String activeDt;
    protected String lastUpdateID;
    protected String inactiveDt;
    protected String lastUpdatedDt;
    protected Boolean nricBlacklistInd;
    protected String nricMessage;

    /**
     * Gets the value of the nric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRIC() {
        return nric;
    }

    /**
     * Sets the value of the nric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRIC(String value) {
        this.nric = value;
    }

    /**
     * Gets the value of the nricName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRICName() {
        return nricName;
    }

    /**
     * Sets the value of the nricName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRICName(String value) {
        this.nricName = value;
    }

    /**
     * Gets the value of the activeDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveDt() {
        return activeDt;
    }

    /**
     * Sets the value of the activeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDt(String value) {
        this.activeDt = value;
    }

    /**
     * Gets the value of the lastUpdateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateID() {
        return lastUpdateID;
    }

    /**
     * Sets the value of the lastUpdateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateID(String value) {
        this.lastUpdateID = value;
    }

    /**
     * Gets the value of the inactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveDt() {
        return inactiveDt;
    }

    /**
     * Sets the value of the inactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveDt(String value) {
        this.inactiveDt = value;
    }

    /**
     * Gets the value of the lastUpdatedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedDt() {
        return lastUpdatedDt;
    }

    /**
     * Sets the value of the lastUpdatedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedDt(String value) {
        this.lastUpdatedDt = value;
    }

    /**
     * Gets the value of the nricBlacklistInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNricBlacklistInd() {
        return nricBlacklistInd;
    }

    /**
     * Sets the value of the nricBlacklistInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNricBlacklistInd(Boolean value) {
        this.nricBlacklistInd = value;
    }

    /**
     * Gets the value of the nricMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNricMessage() {
        return nricMessage;
    }

    /**
     * Sets the value of the nricMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNricMessage(String value) {
        this.nricMessage = value;
    }

}
