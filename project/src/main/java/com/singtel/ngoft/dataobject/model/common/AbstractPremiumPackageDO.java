
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMPremiumPackageDO;


/**
 * <p>Java class for AbstractPremiumPackageDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPremiumPackageDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newPremiumPackageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPremiumPackageDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premiumPackageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premiumPackageDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractPremiumPackageDO
    implements Serializable
{

    protected String newPremiumPackageId;
    protected String newPremiumPackageDesc;
    protected String premiumPackageId;
    protected String premiumPackageDesc;
    protected String networkCode;

    /**
     * Gets the value of the newPremiumPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPremiumPackageId() {
        return newPremiumPackageId;
    }

    /**
     * Sets the value of the newPremiumPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPremiumPackageId(String value) {
        this.newPremiumPackageId = value;
    }

    /**
     * Gets the value of the newPremiumPackageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPremiumPackageDesc() {
        return newPremiumPackageDesc;
    }

    /**
     * Sets the value of the newPremiumPackageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPremiumPackageDesc(String value) {
        this.newPremiumPackageDesc = value;
    }

    /**
     * Gets the value of the premiumPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumPackageId() {
        return premiumPackageId;
    }

    /**
     * Sets the value of the premiumPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumPackageId(String value) {
        this.premiumPackageId = value;
    }

    /**
     * Gets the value of the premiumPackageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumPackageDesc() {
        return premiumPackageDesc;
    }

    /**
     * Sets the value of the premiumPackageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumPackageDesc(String value) {
        this.premiumPackageDesc = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCode(String value) {
        this.networkCode = value;
    }

}
