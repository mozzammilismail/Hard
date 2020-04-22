
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortAssignmentDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortAssignmentDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newSvcArborType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existingPortInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existingConnectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newConnectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class PortAssignmentDO
    implements Serializable
{

    protected String newSvcArborType;
    protected String existingPortInd;
    protected String portNNo;
    protected String existingConnectType;
    protected String newConnectType;

    /**
     * Gets the value of the newSvcArborType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSvcArborType() {
        return newSvcArborType;
    }

    /**
     * Sets the value of the newSvcArborType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSvcArborType(String value) {
        this.newSvcArborType = value;
    }

    /**
     * Gets the value of the existingPortInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingPortInd() {
        return existingPortInd;
    }

    /**
     * Sets the value of the existingPortInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingPortInd(String value) {
        this.existingPortInd = value;
    }

    /**
     * Gets the value of the portNNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNNo() {
        return portNNo;
    }

    /**
     * Sets the value of the portNNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNNo(String value) {
        this.portNNo = value;
    }

    /**
     * Gets the value of the existingConnectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingConnectType() {
        return existingConnectType;
    }

    /**
     * Sets the value of the existingConnectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingConnectType(String value) {
        this.existingConnectType = value;
    }

    /**
     * Gets the value of the newConnectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewConnectType() {
        return newConnectType;
    }

    /**
     * Sets the value of the newConnectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewConnectType(String value) {
        this.newConnectType = value;
    }

}
