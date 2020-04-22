
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrtRoutDetailsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrtRoutDetailsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cableCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="side" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lLUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chanTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class DrtRoutDetailsDO
    implements Serializable
{

    protected String exch;
    protected String nodeTy;
    protected String nodeId;
    protected String cableCd;
    protected String side;
    protected String termNo;
    protected String llUsage;
    protected String prUsage;
    protected String prTy;
    protected String chanTy;
    protected String hr;

    /**
     * Gets the value of the exch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExch() {
        return exch;
    }

    /**
     * Sets the value of the exch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExch(String value) {
        this.exch = value;
    }

    /**
     * Gets the value of the nodeTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeTy() {
        return nodeTy;
    }

    /**
     * Sets the value of the nodeTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeTy(String value) {
        this.nodeTy = value;
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
     * Gets the value of the cableCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableCd() {
        return cableCd;
    }

    /**
     * Sets the value of the cableCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableCd(String value) {
        this.cableCd = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the termNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermNo() {
        return termNo;
    }

    /**
     * Sets the value of the termNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermNo(String value) {
        this.termNo = value;
    }

    /**
     * Gets the value of the llUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLLUsage() {
        return llUsage;
    }

    /**
     * Sets the value of the llUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLLUsage(String value) {
        this.llUsage = value;
    }

    /**
     * Gets the value of the prUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrUsage() {
        return prUsage;
    }

    /**
     * Sets the value of the prUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrUsage(String value) {
        this.prUsage = value;
    }

    /**
     * Gets the value of the prTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTy() {
        return prTy;
    }

    /**
     * Sets the value of the prTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTy(String value) {
        this.prTy = value;
    }

    /**
     * Gets the value of the chanTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanTy() {
        return chanTy;
    }

    /**
     * Sets the value of the chanTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanTy(String value) {
        this.chanTy = value;
    }

    /**
     * Gets the value of the hr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHr() {
        return hr;
    }

    /**
     * Sets the value of the hr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHr(String value) {
        this.hr = value;
    }

}
