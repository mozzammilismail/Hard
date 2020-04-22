
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DELSpeedDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DELSpeedDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aDSLSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class DELSpeedDO
    implements Serializable
{

    protected String delNo;
    protected String adslSpeed;

    /**
     * Gets the value of the delNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelNo() {
        return delNo;
    }

    /**
     * Sets the value of the delNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelNo(String value) {
        this.delNo = value;
    }

    /**
     * Gets the value of the adslSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADSLSpeed() {
        return adslSpeed;
    }

    /**
     * Sets the value of the adslSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADSLSpeed(String value) {
        this.adslSpeed = value;
    }

}
