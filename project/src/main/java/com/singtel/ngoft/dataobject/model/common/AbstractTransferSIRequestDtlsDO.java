
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMTransferSIRequestDtlsDO;


/**
 * <p>Java class for AbstractTransferSIRequestDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractTransferSIRequestDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferFeeWaiveInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcNoType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="juvenileRight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sponsorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sponsorIdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferFeePackageid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferFeeComponentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="srcAcctID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractTransferSIRequestDtlsDO
    implements Serializable
{

    protected String svcNo;
    protected String svcType;
    protected String customerID;
    protected String customerIDType;
    protected String transferFeeWaiveInd;
    protected String svcNoType;
    protected String requestType;
    protected String juvenileRight;
    protected String sponsorId;
    protected String sponsorIdType;
    protected String transferFeePackageid;
    protected String transferFeeComponentId;
    protected String srcAcctID;

    /**
     * Gets the value of the svcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNo() {
        return svcNo;
    }

    /**
     * Sets the value of the svcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNo(String value) {
        this.svcNo = value;
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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIDType() {
        return customerIDType;
    }

    /**
     * Sets the value of the customerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIDType(String value) {
        this.customerIDType = value;
    }

    /**
     * Gets the value of the transferFeeWaiveInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFeeWaiveInd() {
        return transferFeeWaiveInd;
    }

    /**
     * Sets the value of the transferFeeWaiveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFeeWaiveInd(String value) {
        this.transferFeeWaiveInd = value;
    }

    /**
     * Gets the value of the svcNoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNoType() {
        return svcNoType;
    }

    /**
     * Sets the value of the svcNoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNoType(String value) {
        this.svcNoType = value;
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
     * Gets the value of the juvenileRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJuvenileRight() {
        return juvenileRight;
    }

    /**
     * Sets the value of the juvenileRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJuvenileRight(String value) {
        this.juvenileRight = value;
    }

    /**
     * Gets the value of the sponsorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorId() {
        return sponsorId;
    }

    /**
     * Sets the value of the sponsorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorId(String value) {
        this.sponsorId = value;
    }

    /**
     * Gets the value of the sponsorIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorIdType() {
        return sponsorIdType;
    }

    /**
     * Sets the value of the sponsorIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorIdType(String value) {
        this.sponsorIdType = value;
    }

    /**
     * Gets the value of the transferFeePackageid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFeePackageid() {
        return transferFeePackageid;
    }

    /**
     * Sets the value of the transferFeePackageid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFeePackageid(String value) {
        this.transferFeePackageid = value;
    }

    /**
     * Gets the value of the transferFeeComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFeeComponentId() {
        return transferFeeComponentId;
    }

    /**
     * Sets the value of the transferFeeComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFeeComponentId(String value) {
        this.transferFeeComponentId = value;
    }

    /**
     * Gets the value of the srcAcctID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAcctID() {
        return srcAcctID;
    }

    /**
     * Sets the value of the srcAcctID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAcctID(String value) {
        this.srcAcctID = value;
    }

}
