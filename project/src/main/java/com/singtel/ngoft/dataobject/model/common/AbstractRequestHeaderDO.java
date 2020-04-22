
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMRequestHeaderDO;


/**
 * Contains header information for the entire request. Header information will be use for OFT Order submission. 
 * 
 * <p>Java class for AbstractRequestHeaderDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestHeaderDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiateExtRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aMChanlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cSEId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesManCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subDealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submissionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secSalesChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aAInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="focalScopeTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pmpOffline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractRequestHeaderDO
    implements Serializable
{

    protected String srcSystem;
    protected String initiateExtRequestId;
    protected String amChanlId;
    protected String applicationDt;
    protected String applicationMode;
    protected String cseId;
    protected String dealerCode;
    protected String receivedDt;
    protected String salesChannelId;
    protected String salesManCode;
    protected String subDealerCode;
    protected String vendorCode;
    protected String submissionMode;
    protected String secSalesChannelId;
    protected String aaInd;
    protected String focalScopeTicket;
    protected String pmpOffline;

    /**
     * Gets the value of the srcSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcSystem() {
        return srcSystem;
    }

    /**
     * Sets the value of the srcSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcSystem(String value) {
        this.srcSystem = value;
    }

    /**
     * Gets the value of the initiateExtRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiateExtRequestId() {
        return initiateExtRequestId;
    }

    /**
     * Sets the value of the initiateExtRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiateExtRequestId(String value) {
        this.initiateExtRequestId = value;
    }

    /**
     * Gets the value of the amChanlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMChanlId() {
        return amChanlId;
    }

    /**
     * Sets the value of the amChanlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMChanlId(String value) {
        this.amChanlId = value;
    }

    /**
     * Gets the value of the applicationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDt() {
        return applicationDt;
    }

    /**
     * Sets the value of the applicationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDt(String value) {
        this.applicationDt = value;
    }

    /**
     * Gets the value of the applicationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationMode() {
        return applicationMode;
    }

    /**
     * Sets the value of the applicationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationMode(String value) {
        this.applicationMode = value;
    }

    /**
     * Gets the value of the cseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSEId() {
        return cseId;
    }

    /**
     * Sets the value of the cseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSEId(String value) {
        this.cseId = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the receivedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedDt() {
        return receivedDt;
    }

    /**
     * Sets the value of the receivedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedDt(String value) {
        this.receivedDt = value;
    }

    /**
     * Gets the value of the salesChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelId() {
        return salesChannelId;
    }

    /**
     * Sets the value of the salesChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelId(String value) {
        this.salesChannelId = value;
    }

    /**
     * Gets the value of the salesManCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesManCode() {
        return salesManCode;
    }

    /**
     * Sets the value of the salesManCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesManCode(String value) {
        this.salesManCode = value;
    }

    /**
     * Gets the value of the subDealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDealerCode() {
        return subDealerCode;
    }

    /**
     * Sets the value of the subDealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDealerCode(String value) {
        this.subDealerCode = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the submissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionMode() {
        return submissionMode;
    }

    /**
     * Sets the value of the submissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionMode(String value) {
        this.submissionMode = value;
    }

    /**
     * Gets the value of the secSalesChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecSalesChannelId() {
        return secSalesChannelId;
    }

    /**
     * Sets the value of the secSalesChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecSalesChannelId(String value) {
        this.secSalesChannelId = value;
    }

    /**
     * Gets the value of the aaInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAInd() {
        return aaInd;
    }

    /**
     * Sets the value of the aaInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAInd(String value) {
        this.aaInd = value;
    }

    /**
     * Gets the value of the focalScopeTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocalScopeTicket() {
        return focalScopeTicket;
    }

    /**
     * Sets the value of the focalScopeTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocalScopeTicket(String value) {
        this.focalScopeTicket = value;
    }

    /**
     * Gets the value of the pmpOffline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmpOffline() {
        return pmpOffline;
    }

    /**
     * Sets the value of the pmpOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmpOffline(String value) {
        this.pmpOffline = value;
    }

}
