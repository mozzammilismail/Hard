
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMApptOrderDetailsDO;


/**
 * <p>Java class for AbstractApptOrderDetailsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractApptOrderDetailsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newSvcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcTypeDO"/>
 *         &lt;element name="crd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schemeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AbstractApptOrderDetailsDO
    implements Serializable
{

    protected String svcNo;
    protected String newSvcNo;
    protected SvcTypeDO svcType;
    protected String crd;
    protected String schemeId;

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
     * Gets the value of the newSvcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSvcNo() {
        return newSvcNo;
    }

    /**
     * Sets the value of the newSvcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSvcNo(String value) {
        this.newSvcNo = value;
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
     * Gets the value of the crd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrd() {
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
    public void setCrd(String value) {
        this.crd = value;
    }

    /**
     * Gets the value of the schemeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeId() {
        return schemeId;
    }

    /**
     * Sets the value of the schemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeId(String value) {
        this.schemeId = value;
    }

}
