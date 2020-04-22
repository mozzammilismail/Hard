
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMRelocationRequestDO;


/**
 * <p>Java class for AbstractRelocationRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRelocationRequestDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO"/>
 *         &lt;element name="relocationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public abstract class AbstractRelocationRequestDO
    implements Serializable
{

    protected String accountID;
    protected String crd;
    protected AddressDO targetAddress;
    protected String relocationType;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the crd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRD() {
        return crd;
    }

    /**
     * Sets the value of the crd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRD(String value) {
        this.crd = value;
    }

    /**
     * Gets the value of the targetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getTargetAddress() {
        return targetAddress;
    }

    /**
     * Sets the value of the targetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setTargetAddress(AddressDO value) {
        this.targetAddress = value;
    }

    /**
     * Gets the value of the relocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelocationType() {
        return relocationType;
    }

    /**
     * Sets the value of the relocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelocationType(String value) {
        this.relocationType = value;
    }

}
