
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcTypeDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcTypeDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arborSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class SvcTypeDO
    implements Serializable
{

    protected String arborSvcType;
    protected String svcTypeCode;
    protected String svcTypeDesc;

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
     * Gets the value of the svcTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTypeCode() {
        return svcTypeCode;
    }

    /**
     * Sets the value of the svcTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcTypeCode(String value) {
        this.svcTypeCode = value;
    }

    /**
     * Gets the value of the svcTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTypeDesc() {
        return svcTypeDesc;
    }

    /**
     * Sets the value of the svcTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcTypeDesc(String value) {
        this.svcTypeDesc = value;
    }

}
