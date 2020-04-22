
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMSITieInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSITieInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arborSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainSuppInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcInstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siTieId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */



public class BPMSITieInfoDO
    implements Serializable
{

    protected String svcNo;
    protected String svcType;
    protected String arborSvcType;
    protected String mainSuppInd;
    protected String svcInstID;
    protected String siTieId;

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
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcType(String value) {
        this.svcType = value;
    }

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
     * Gets the value of the mainSuppInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSuppInd() {
        return mainSuppInd;
    }

    /**
     * Sets the value of the mainSuppInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSuppInd(String value) {
        this.mainSuppInd = value;
    }

    /**
     * Gets the value of the svcInstID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcInstID() {
        return svcInstID;
    }

    /**
     * Sets the value of the svcInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcInstID(String value) {
        this.svcInstID = value;
    }

    /**
     * Gets the value of the siTieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiTieId() {
        return siTieId;
    }

    /**
     * Sets the value of the siTieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiTieId(String value) {
        this.siTieId = value;
    }

}
