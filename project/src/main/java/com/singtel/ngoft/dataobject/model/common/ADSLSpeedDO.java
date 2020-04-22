
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADSLSpeedDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADSLSpeedDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aDSLSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portInInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newDElInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class ADSLSpeedDO
    implements Serializable
{

    protected String delNo;
    protected String adslSpeed;
    protected String requestType;
    protected String svcType;
    protected String txnType;
    protected String portInInd;
    protected String newDElInd;

    /**
     * Gets the value of the delNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelNo() {
        return delNo;
    }

    /**
     * Sets the value of the delNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelNo(String value) {
        this.delNo = value;
    }

    /**
     * Gets the value of the adslSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADSLSpeed() {
        return adslSpeed;
    }

    /**
     * Sets the value of the adslSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADSLSpeed(String value) {
        this.adslSpeed = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcType(String value) {
        this.svcType = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the portInInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortInInd() {
        return portInInd;
    }

    /**
     * Sets the value of the portInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortInInd(String value) {
        this.portInInd = value;
    }

    /**
     * Gets the value of the newDElInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDElInd() {
        return newDElInd;
    }

    /**
     * Sets the value of the newDElInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDElInd(String value) {
        this.newDElInd = value;
    }

}
