
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pmuCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imsiNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csiNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class MobileInfoDO
    implements Serializable
{

    protected String pmuCode;
    protected String imsiNo;
    protected String status;
    protected String type;
    protected String vendor;
    protected String numberFee;
    protected String csiNotes;

    /**
     * Gets the value of the pmuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmuCode() {
        return pmuCode;
    }

    /**
     * Sets the value of the pmuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmuCode(String value) {
        this.pmuCode = value;
    }

    /**
     * Gets the value of the imsiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsiNo() {
        return imsiNo;
    }

    /**
     * Sets the value of the imsiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsiNo(String value) {
        this.imsiNo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the numberFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFee() {
        return numberFee;
    }

    /**
     * Sets the value of the numberFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFee(String value) {
        this.numberFee = value;
    }

    /**
     * Gets the value of the csiNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsiNotes() {
        return csiNotes;
    }

    /**
     * Sets the value of the csiNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsiNotes(String value) {
        this.csiNotes = value;
    }

}
