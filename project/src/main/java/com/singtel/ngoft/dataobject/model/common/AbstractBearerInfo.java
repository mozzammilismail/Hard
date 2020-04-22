
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMBearerInfo;


/**
 * <p>Java class for AbstractBearerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractBearerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bearerIdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bearerNRIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bearerSalutation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bearerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bearerAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractBearerInfo
    implements Serializable
{

    protected String bearerIdType;
    protected String bearerNRIC;
    protected String bearerSalutation;
    protected String bearerName;
    protected AddressDO bearerAddress;
    protected String emailAddress;
    protected String contactNo;
    protected String dob;

    /**
     * Gets the value of the bearerIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerIdType() {
        return bearerIdType;
    }

    /**
     * Sets the value of the bearerIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerIdType(String value) {
        this.bearerIdType = value;
    }

    /**
     * Gets the value of the bearerNRIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerNRIC() {
        return bearerNRIC;
    }

    /**
     * Sets the value of the bearerNRIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerNRIC(String value) {
        this.bearerNRIC = value;
    }

    /**
     * Gets the value of the bearerSalutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerSalutation() {
        return bearerSalutation;
    }

    /**
     * Sets the value of the bearerSalutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerSalutation(String value) {
        this.bearerSalutation = value;
    }

    /**
     * Gets the value of the bearerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearerName() {
        return bearerName;
    }

    /**
     * Sets the value of the bearerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearerName(String value) {
        this.bearerName = value;
    }

    /**
     * Gets the value of the bearerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getBearerAddress() {
        return bearerAddress;
    }

    /**
     * Sets the value of the bearerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setBearerAddress(AddressDO value) {
        this.bearerAddress = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the contactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * Sets the value of the contactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNo(String value) {
        this.contactNo = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

}
