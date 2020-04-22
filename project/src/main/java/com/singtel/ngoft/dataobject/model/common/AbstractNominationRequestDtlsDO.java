
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMNominationRequestDtlsDO;


/**
 * <p>Java class for AbstractNominationRequestDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNominationRequestDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyMobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO"/>
 *         &lt;element name="specialRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prePaidInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topUpAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waiveInitialTopUpInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractNominationRequestDtlsDO
    implements Serializable
{

    protected String customerID;
    protected String customerIDType;
    protected String mobileNo;
    protected String keyMobile;
    protected String optOut;
    protected AddressDO registrationAddress;
    protected String specialRequest;
    protected String customerName;
    protected String prePaidInd;
    protected String topUpAmt;
    protected String waiveInitialTopUpInd;

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
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the keyMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyMobile() {
        return keyMobile;
    }

    /**
     * Sets the value of the keyMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyMobile(String value) {
        this.keyMobile = value;
    }

    /**
     * Gets the value of the optOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptOut() {
        return optOut;
    }

    /**
     * Sets the value of the optOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptOut(String value) {
        this.optOut = value;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setRegistrationAddress(AddressDO value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the specialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequest() {
        return specialRequest;
    }

    /**
     * Sets the value of the specialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequest(String value) {
        this.specialRequest = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the prePaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePaidInd() {
        return prePaidInd;
    }

    /**
     * Sets the value of the prePaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePaidInd(String value) {
        this.prePaidInd = value;
    }

    /**
     * Gets the value of the topUpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopUpAmt() {
        return topUpAmt;
    }

    /**
     * Sets the value of the topUpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopUpAmt(String value) {
        this.topUpAmt = value;
    }

    /**
     * Gets the value of the waiveInitialTopUpInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveInitialTopUpInd() {
        return waiveInitialTopUpInd;
    }

    /**
     * Sets the value of the waiveInitialTopUpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveInitialTopUpInd(String value) {
        this.waiveInitialTopUpInd = value;
    }

}
