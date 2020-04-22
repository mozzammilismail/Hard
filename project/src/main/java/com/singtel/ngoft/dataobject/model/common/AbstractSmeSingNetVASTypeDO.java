
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractSmeSingNetVASTypeDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSmeSingNetVASTypeDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeOfSvc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcTypeDO"/>
 *         &lt;element name="componentFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public abstract class AbstractSmeSingNetVASTypeDO
    implements Serializable
{

    protected String productDescription;
    protected String productFamily;
    protected String productType;
    protected String svcNo;
    protected String typeOfSvc;
    protected SvcTypeDO svcType;
    protected String componentFlag;

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFamily() {
        return productFamily;
    }

    /**
     * Sets the value of the productFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFamily(String value) {
        this.productFamily = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

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
     * Gets the value of the typeOfSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSvc() {
        return typeOfSvc;
    }

    /**
     * Sets the value of the typeOfSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSvc(String value) {
        this.typeOfSvc = value;
    }

    /**
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcTypeDO }
     *     
     */
    public SvcTypeDO getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcTypeDO }
     *     
     */
    public void setSvcType(SvcTypeDO value) {
        this.svcType = value;
    }

    /**
     * Gets the value of the componentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentFlag() {
        return componentFlag;
    }

    /**
     * Sets the value of the componentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentFlag(String value) {
        this.componentFlag = value;
    }

}
