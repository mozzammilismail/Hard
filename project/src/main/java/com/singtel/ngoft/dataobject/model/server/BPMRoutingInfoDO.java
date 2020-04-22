
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMRoutingInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMRoutingInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiecab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMRoutingInfoDO
    implements Serializable
{

    protected String exchid;
    protected String nodeid;
    protected Boolean tiecab;
    protected String version;

    /**
     * Gets the value of the exchid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchid() {
        return exchid;
    }

    /**
     * Sets the value of the exchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchid(String value) {
        this.exchid = value;
    }

    /**
     * Gets the value of the nodeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeid() {
        return nodeid;
    }

    /**
     * Sets the value of the nodeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeid(String value) {
        this.nodeid = value;
    }

    /**
     * Gets the value of the tiecab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTiecab() {
        return tiecab;
    }

    /**
     * Sets the value of the tiecab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTiecab(Boolean value) {
        this.tiecab = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
