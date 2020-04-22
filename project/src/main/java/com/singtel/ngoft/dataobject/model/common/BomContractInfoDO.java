
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BomContractInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomContractInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bomContractStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bomContractEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bomRecontractDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bomEquipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BomContractInfoDO
    implements Serializable
{

    protected String bomContractStartDate;
    protected String bomContractEndDate;
    protected String bomRecontractDate;
    protected String bomEquipDate;

    /**
     * Gets the value of the bomContractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomContractStartDate() {
        return bomContractStartDate;
    }

    /**
     * Sets the value of the bomContractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomContractStartDate(String value) {
        this.bomContractStartDate = value;
    }

    /**
     * Gets the value of the bomContractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomContractEndDate() {
        return bomContractEndDate;
    }

    /**
     * Sets the value of the bomContractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomContractEndDate(String value) {
        this.bomContractEndDate = value;
    }

    /**
     * Gets the value of the bomRecontractDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomRecontractDate() {
        return bomRecontractDate;
    }

    /**
     * Sets the value of the bomRecontractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomRecontractDate(String value) {
        this.bomRecontractDate = value;
    }

    /**
     * Gets the value of the bomEquipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomEquipDate() {
        return bomEquipDate;
    }

    /**
     * Sets the value of the bomEquipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomEquipDate(String value) {
        this.bomEquipDate = value;
    }

}
