
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApptList1DO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApptList1DO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apptBookInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptPrefDtTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptTod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quotaUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subPremiseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class ApptList1DO
    implements Serializable
{

    protected String apptBookInd;
    protected String apptDesc;
    protected String apptId;
    protected String apptPrefDtTime;
    protected String apptStatus;
    protected String apptTod;
    protected String projectInd;
    protected String quotaUnits;
    protected String subPremiseId;
    protected String workOrdNo;

    /**
     * Gets the value of the apptBookInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptBookInd() {
        return apptBookInd;
    }

    /**
     * Sets the value of the apptBookInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptBookInd(String value) {
        this.apptBookInd = value;
    }

    /**
     * Gets the value of the apptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptDesc() {
        return apptDesc;
    }

    /**
     * Sets the value of the apptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptDesc(String value) {
        this.apptDesc = value;
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
     * Gets the value of the apptPrefDtTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptPrefDtTime() {
        return apptPrefDtTime;
    }

    /**
     * Sets the value of the apptPrefDtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptPrefDtTime(String value) {
        this.apptPrefDtTime = value;
    }

    /**
     * Gets the value of the apptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptStatus() {
        return apptStatus;
    }

    /**
     * Sets the value of the apptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptStatus(String value) {
        this.apptStatus = value;
    }

    /**
     * Gets the value of the apptTod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptTod() {
        return apptTod;
    }

    /**
     * Sets the value of the apptTod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptTod(String value) {
        this.apptTod = value;
    }

    /**
     * Gets the value of the projectInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectInd() {
        return projectInd;
    }

    /**
     * Sets the value of the projectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectInd(String value) {
        this.projectInd = value;
    }

    /**
     * Gets the value of the quotaUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaUnits() {
        return quotaUnits;
    }

    /**
     * Sets the value of the quotaUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaUnits(String value) {
        this.quotaUnits = value;
    }

    /**
     * Gets the value of the subPremiseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPremiseId() {
        return subPremiseId;
    }

    /**
     * Sets the value of the subPremiseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPremiseId(String value) {
        this.subPremiseId = value;
    }

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

}
