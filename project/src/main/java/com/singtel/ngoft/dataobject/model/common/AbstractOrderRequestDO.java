
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMOrderRequestDO;


/**
 * <p>Java class for AbstractOrderRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractOrderRequestDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcRequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalSrcRequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentOrderRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ivrApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO" minOccurs="0"/>
 *         &lt;element name="bEndInstallAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO" minOccurs="0"/>
 *         &lt;element name="byPassInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisioningProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billDependencyProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobCompDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldEngID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldEngVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldEngContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public abstract class AbstractOrderRequestDO
    implements Serializable
{

    protected String srcRequestID;
    protected String originalSrcRequestID;
    protected String parentOrderRequestID;
    protected String accountID;
    protected String specialRequest;
    protected String ivrApprovalCode;
    protected AddressDO installAddress;
    protected AddressDO bEndInstallAddress;
    protected String byPassInd;
    protected String vipInd;
    protected String provisioningProjectId;
    protected String billDependencyProjectId;
    protected String reasonCode;
    protected String reasonRemarks;
    protected String jobCompDt;
    protected String fieldEngID;
    protected String fieldEngVendor;
    protected String fieldEngContact;

    /**
     * Gets the value of the srcRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcRequestID() {
        return srcRequestID;
    }

    /**
     * Sets the value of the srcRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcRequestID(String value) {
        this.srcRequestID = value;
    }

    /**
     * Gets the value of the originalSrcRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSrcRequestID() {
        return originalSrcRequestID;
    }

    /**
     * Sets the value of the originalSrcRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSrcRequestID(String value) {
        this.originalSrcRequestID = value;
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
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the specialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequest() {
        return specialRequest;
    }

    /**
     * Sets the value of the specialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequest(String value) {
        this.specialRequest = value;
    }

    /**
     * Gets the value of the ivrApprovalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrApprovalCode() {
        return ivrApprovalCode;
    }

    /**
     * Sets the value of the ivrApprovalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrApprovalCode(String value) {
        this.ivrApprovalCode = value;
    }

    /**
     * Gets the value of the installAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getInstallAddress() {
        return installAddress;
    }

    /**
     * Sets the value of the installAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setInstallAddress(AddressDO value) {
        this.installAddress = value;
    }

    /**
     * Gets the value of the bEndInstallAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getBEndInstallAddress() {
        return bEndInstallAddress;
    }

    /**
     * Sets the value of the bEndInstallAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setBEndInstallAddress(AddressDO value) {
        this.bEndInstallAddress = value;
    }

    /**
     * Gets the value of the byPassInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByPassInd() {
        return byPassInd;
    }

    /**
     * Sets the value of the byPassInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByPassInd(String value) {
        this.byPassInd = value;
    }

    /**
     * Gets the value of the vipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipInd() {
        return vipInd;
    }

    /**
     * Sets the value of the vipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipInd(String value) {
        this.vipInd = value;
    }

    /**
     * Gets the value of the provisioningProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningProjectId() {
        return provisioningProjectId;
    }

    /**
     * Sets the value of the provisioningProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningProjectId(String value) {
        this.provisioningProjectId = value;
    }

    /**
     * Gets the value of the billDependencyProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDependencyProjectId() {
        return billDependencyProjectId;
    }

    /**
     * Sets the value of the billDependencyProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDependencyProjectId(String value) {
        this.billDependencyProjectId = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonRemarks() {
        return reasonRemarks;
    }

    /**
     * Sets the value of the reasonRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonRemarks(String value) {
        this.reasonRemarks = value;
    }

    /**
     * Gets the value of the jobCompDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCompDt() {
        return jobCompDt;
    }

    /**
     * Sets the value of the jobCompDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCompDt(String value) {
        this.jobCompDt = value;
    }

    /**
     * Gets the value of the fieldEngID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldEngID() {
        return fieldEngID;
    }

    /**
     * Sets the value of the fieldEngID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldEngID(String value) {
        this.fieldEngID = value;
    }

    /**
     * Gets the value of the fieldEngVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldEngVendor() {
        return fieldEngVendor;
    }

    /**
     * Sets the value of the fieldEngVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldEngVendor(String value) {
        this.fieldEngVendor = value;
    }

    /**
     * Gets the value of the fieldEngContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldEngContact() {
        return fieldEngContact;
    }

    /**
     * Sets the value of the fieldEngContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldEngContact(String value) {
        this.fieldEngContact = value;
    }

}
