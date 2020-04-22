
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerEnjoyedPackDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEnjoyedPackDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sMSMSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airTimeVideo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airTimeVideoUnLtdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sMSMMSUnLtdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class CustomerEnjoyedPackDO
    implements Serializable
{

    protected String smsmss;
    protected String airTimeVideo;
    protected String localData;
    protected String airTimeVideoUnLtdInd;
    protected String smsmmsUnLtdInd;

    /**
     * Gets the value of the smsmss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSMSS() {
        return smsmss;
    }

    /**
     * Sets the value of the smsmss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSMSS(String value) {
        this.smsmss = value;
    }

    /**
     * Gets the value of the airTimeVideo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirTimeVideo() {
        return airTimeVideo;
    }

    /**
     * Sets the value of the airTimeVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirTimeVideo(String value) {
        this.airTimeVideo = value;
    }

    /**
     * Gets the value of the localData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalData() {
        return localData;
    }

    /**
     * Sets the value of the localData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalData(String value) {
        this.localData = value;
    }

    /**
     * Gets the value of the airTimeVideoUnLtdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirTimeVideoUnLtdInd() {
        return airTimeVideoUnLtdInd;
    }

    /**
     * Sets the value of the airTimeVideoUnLtdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirTimeVideoUnLtdInd(String value) {
        this.airTimeVideoUnLtdInd = value;
    }

    /**
     * Gets the value of the smsmmsUnLtdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSMMSUnLtdInd() {
        return smsmmsUnLtdInd;
    }

    /**
     * Sets the value of the smsmmsUnLtdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSMMSUnLtdInd(String value) {
        this.smsmmsUnLtdInd = value;
    }

}
