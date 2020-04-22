
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractNewSvcInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNewSvcInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcActionTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordAppliedDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custReqDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrdStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptDtTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptEndDtTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractNewSvcInfoDO
    implements Serializable
{

    protected String workOrdNo;
    protected String svcActionTy;
    protected String ordAppliedDt;
    protected String custReqDt;
    protected String workOrdStatus;
    protected String apptId;
    protected String apptDtTime;
    protected String apptEndDtTime;

    /**
     * Gets the value of the workOrdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdNo() {
        return workOrdNo;
    }

    /**
     * Sets the value of the workOrdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdNo(String value) {
        this.workOrdNo = value;
    }

    /**
     * Gets the value of the svcActionTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcActionTy() {
        return svcActionTy;
    }

    /**
     * Sets the value of the svcActionTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcActionTy(String value) {
        this.svcActionTy = value;
    }

    /**
     * Gets the value of the ordAppliedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdAppliedDt() {
        return ordAppliedDt;
    }

    /**
     * Sets the value of the ordAppliedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdAppliedDt(String value) {
        this.ordAppliedDt = value;
    }

    /**
     * Gets the value of the custReqDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustReqDt() {
        return custReqDt;
    }

    /**
     * Sets the value of the custReqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustReqDt(String value) {
        this.custReqDt = value;
    }

    /**
     * Gets the value of the workOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdStatus() {
        return workOrdStatus;
    }

    /**
     * Sets the value of the workOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdStatus(String value) {
        this.workOrdStatus = value;
    }

    /**
     * Gets the value of the apptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptId() {
        return apptId;
    }

    /**
     * Sets the value of the apptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptId(String value) {
        this.apptId = value;
    }

    /**
     * Gets the value of the apptDtTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptDtTime() {
        return apptDtTime;
    }

    /**
     * Sets the value of the apptDtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptDtTime(String value) {
        this.apptDtTime = value;
    }

    /**
     * Gets the value of the apptEndDtTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptEndDtTime() {
        return apptEndDtTime;
    }

    /**
     * Sets the value of the apptEndDtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptEndDtTime(String value) {
        this.apptEndDtTime = value;
    }

}
