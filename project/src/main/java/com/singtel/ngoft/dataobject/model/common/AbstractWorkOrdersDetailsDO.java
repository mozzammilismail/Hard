
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractWorkOrdersDetailsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractWorkOrdersDetailsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rentalTariffGrp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcOrdStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submittedDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appliedDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receivedDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creatorContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractWorkOrdersDetailsDO
    implements Serializable
{

    protected String svcOrdNo;
    protected String svcType;
    protected String rentalTariffGrp;
    protected String svcOrdStatus;
    protected String workOrderType;
    protected String submittedDt;
    protected String appliedDt;
    protected String appMode;
    protected String receivedDt;
    protected String createdDt;
    protected String createBy;
    protected String creatorContact;

    /**
     * Gets the value of the svcOrdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcOrdNo() {
        return svcOrdNo;
    }

    /**
     * Sets the value of the svcOrdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcOrdNo(String value) {
        this.svcOrdNo = value;
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
     * Gets the value of the rentalTariffGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalTariffGrp() {
        return rentalTariffGrp;
    }

    /**
     * Sets the value of the rentalTariffGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalTariffGrp(String value) {
        this.rentalTariffGrp = value;
    }

    /**
     * Gets the value of the svcOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcOrdStatus() {
        return svcOrdStatus;
    }

    /**
     * Sets the value of the svcOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcOrdStatus(String value) {
        this.svcOrdStatus = value;
    }

    /**
     * Gets the value of the workOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderType() {
        return workOrderType;
    }

    /**
     * Sets the value of the workOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderType(String value) {
        this.workOrderType = value;
    }

    /**
     * Gets the value of the submittedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedDt() {
        return submittedDt;
    }

    /**
     * Sets the value of the submittedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedDt(String value) {
        this.submittedDt = value;
    }

    /**
     * Gets the value of the appliedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedDt() {
        return appliedDt;
    }

    /**
     * Sets the value of the appliedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedDt(String value) {
        this.appliedDt = value;
    }

    /**
     * Gets the value of the appMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppMode() {
        return appMode;
    }

    /**
     * Sets the value of the appMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppMode(String value) {
        this.appMode = value;
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
     * Gets the value of the createdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDt() {
        return createdDt;
    }

    /**
     * Sets the value of the createdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDt(String value) {
        this.createdDt = value;
    }

    /**
     * Gets the value of the createBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * Sets the value of the createBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateBy(String value) {
        this.createBy = value;
    }

    /**
     * Gets the value of the creatorContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorContact() {
        return creatorContact;
    }

    /**
     * Sets the value of the creatorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorContact(String value) {
        this.creatorContact = value;
    }

}
