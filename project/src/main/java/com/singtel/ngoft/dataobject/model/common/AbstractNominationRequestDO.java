
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMNominationRequestDO;


/**
 * <p>Java class for AbstractNominationRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNominationRequestDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationCRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentOrderRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingOrderReqType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pendingOrderTxnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractNominationRequestDO
    implements Serializable
{

    protected String applicationCRD;
    protected String svcNo;
    protected String svcType;
    protected String orderRequestID;
    protected String parentOrderRequestID;
    protected String pendingOrderReqType;
    protected String pendingOrderTxnType;

    /**
     * Gets the value of the applicationCRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCRD() {
        return applicationCRD;
    }

    /**
     * Sets the value of the applicationCRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCRD(String value) {
        this.applicationCRD = value;
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
     * Gets the value of the orderRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRequestID() {
        return orderRequestID;
    }

    /**
     * Sets the value of the orderRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRequestID(String value) {
        this.orderRequestID = value;
    }

    /**
     * Gets the value of the parentOrderRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderRequestID() {
        return parentOrderRequestID;
    }

    /**
     * Sets the value of the parentOrderRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderRequestID(String value) {
        this.parentOrderRequestID = value;
    }

    /**
     * Gets the value of the pendingOrderReqType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingOrderReqType() {
        return pendingOrderReqType;
    }

    /**
     * Sets the value of the pendingOrderReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingOrderReqType(String value) {
        this.pendingOrderReqType = value;
    }

    /**
     * Gets the value of the pendingOrderTxnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingOrderTxnType() {
        return pendingOrderTxnType;
    }

    /**
     * Sets the value of the pendingOrderTxnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingOrderTxnType(String value) {
        this.pendingOrderTxnType = value;
    }

}
