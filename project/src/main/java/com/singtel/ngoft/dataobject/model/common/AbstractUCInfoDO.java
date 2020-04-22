
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMUCInfoDO;


/**
 * <p>Java class for AbstractUCInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractUCInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ucType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ucValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pendingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractUCInfoDO
    implements Serializable
{

    protected String ucType;
    protected String ucValue;
    protected String pendingInd;
    protected String startDt;
    protected String endDt;
    protected String productId;

    /**
     * Gets the value of the ucType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcType() {
        return ucType;
    }

    /**
     * Sets the value of the ucType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcType(String value) {
        this.ucType = value;
    }

    /**
     * Gets the value of the ucValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcValue() {
        return ucValue;
    }

    /**
     * Sets the value of the ucValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcValue(String value) {
        this.ucValue = value;
    }

    /**
     * Gets the value of the pendingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingInd() {
        return pendingInd;
    }

    /**
     * Sets the value of the pendingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingInd(String value) {
        this.pendingInd = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

}
