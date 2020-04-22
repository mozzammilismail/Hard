
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MUXInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MUXInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spare" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l1term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="csiCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csiMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieCab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeMUX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCdInList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class MUXInfoDO
    implements Serializable
{

    protected String spare;
    protected String exchId;
    protected String nodeId;
    protected String l1Term;
    protected String version;
    protected String csiCode;
    protected String csiMessage;
    protected String tieCab;
    protected String changeMUX;
    protected String errorCdInList;
    protected String svcNo;

    /**
     * Gets the value of the spare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare() {
        return spare;
    }

    /**
     * Sets the value of the spare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare(String value) {
        this.spare = value;
    }

    /**
     * Gets the value of the exchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchId() {
        return exchId;
    }

    /**
     * Sets the value of the exchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchId(String value) {
        this.exchId = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the l1Term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL1Term() {
        return l1Term;
    }

    /**
     * Sets the value of the l1Term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL1Term(String value) {
        this.l1Term = value;
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

    /**
     * Gets the value of the csiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsiCode() {
        return csiCode;
    }

    /**
     * Sets the value of the csiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsiCode(String value) {
        this.csiCode = value;
    }

    /**
     * Gets the value of the csiMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsiMessage() {
        return csiMessage;
    }

    /**
     * Sets the value of the csiMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsiMessage(String value) {
        this.csiMessage = value;
    }

    /**
     * Gets the value of the tieCab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieCab() {
        return tieCab;
    }

    /**
     * Sets the value of the tieCab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieCab(String value) {
        this.tieCab = value;
    }

    /**
     * Gets the value of the changeMUX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeMUX() {
        return changeMUX;
    }

    /**
     * Sets the value of the changeMUX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeMUX(String value) {
        this.changeMUX = value;
    }

    /**
     * Gets the value of the errorCdInList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCdInList() {
        return errorCdInList;
    }

    /**
     * Sets the value of the errorCdInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCdInList(String value) {
        this.errorCdInList = value;
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

}
