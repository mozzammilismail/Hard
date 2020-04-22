
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRDRangeDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRDRangeDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderPriority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class CRDRangeDO
    implements Serializable
{

    protected String orderPriority;
    protected String minCRD;
    protected String maxCRD;

    /**
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPriority(String value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the minCRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCRD() {
        return minCRD;
    }

    /**
     * Sets the value of the minCRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCRD(String value) {
        this.minCRD = value;
    }

    /**
     * Gets the value of the maxCRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCRD() {
        return maxCRD;
    }

    /**
     * Sets the value of the maxCRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCRD(String value) {
        this.maxCRD = value;
    }

}
