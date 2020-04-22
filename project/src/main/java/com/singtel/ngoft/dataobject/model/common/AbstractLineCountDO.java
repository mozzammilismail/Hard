
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMLineCountDO;


/**
 * Stores line count information
 * 
 * <p>Java class for AbstractLineCountDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractLineCountDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentBA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arborSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AbstractLineCountDO
    implements Serializable
{

    protected String svcType;
    protected int lineCount;
    protected String lineType;
    protected String parentBA;
    protected String arborSvcType;

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
     * Gets the value of the lineCount property.
     * 
     */
    public int getLineCount() {
        return lineCount;
    }

    /**
     * Sets the value of the lineCount property.
     * 
     */
    public void setLineCount(int value) {
        this.lineCount = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the parentBA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBA() {
        return parentBA;
    }

    /**
     * Sets the value of the parentBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBA(String value) {
        this.parentBA = value;
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

}
