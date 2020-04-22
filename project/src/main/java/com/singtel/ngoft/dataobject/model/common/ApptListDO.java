
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApptListDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApptListDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptContNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptContNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptReqTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptLastUpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptLastUpDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptPrefDtTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptEndDtTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptContHomeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptContOfficeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class ApptListDO
    implements Serializable
{

    protected String workOrdNo;
    protected String apptId;
    protected String apptDesc;
    protected String apptContNm;
    protected String apptContNum;
    protected String apptReqTy;
    protected String apptLastUpId;
    protected String apptLastUpDt;
    protected String apptPrefDtTime;
    protected String apptEndDtTime;
    protected String apptContHomeNum;
    protected String apptContOfficeNum;

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
     * Gets the value of the apptContNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptContNm() {
        return apptContNm;
    }

    /**
     * Sets the value of the apptContNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptContNm(String value) {
        this.apptContNm = value;
    }

    /**
     * Gets the value of the apptContNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptContNum() {
        return apptContNum;
    }

    /**
     * Sets the value of the apptContNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptContNum(String value) {
        this.apptContNum = value;
    }

    /**
     * Gets the value of the apptReqTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptReqTy() {
        return apptReqTy;
    }

    /**
     * Sets the value of the apptReqTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptReqTy(String value) {
        this.apptReqTy = value;
    }

    /**
     * Gets the value of the apptLastUpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptLastUpId() {
        return apptLastUpId;
    }

    /**
     * Sets the value of the apptLastUpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptLastUpId(String value) {
        this.apptLastUpId = value;
    }

    /**
     * Gets the value of the apptLastUpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptLastUpDt() {
        return apptLastUpDt;
    }

    /**
     * Sets the value of the apptLastUpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptLastUpDt(String value) {
        this.apptLastUpDt = value;
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

    /**
     * Gets the value of the apptContHomeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptContHomeNum() {
        return apptContHomeNum;
    }

    /**
     * Sets the value of the apptContHomeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptContHomeNum(String value) {
        this.apptContHomeNum = value;
    }

    /**
     * Gets the value of the apptContOfficeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptContOfficeNum() {
        return apptContOfficeNum;
    }

    /**
     * Sets the value of the apptContOfficeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptContOfficeNum(String value) {
        this.apptContOfficeNum = value;
    }

}
