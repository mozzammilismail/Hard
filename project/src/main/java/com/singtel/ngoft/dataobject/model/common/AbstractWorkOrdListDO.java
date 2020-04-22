
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractWorkOrdListDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractWorkOrdListDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrdStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custReqDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ordPriority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcInstId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="csExec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="closedDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creatorContacts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelledDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelledReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ceaseReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="softAct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="switchType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastModifyBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastModifyDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedWorkOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="csoGrpCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesmanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesmanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractWorkOrdListDO
    implements Serializable
{

    protected String workOrdNo;
    protected String workOrdType;
    protected String workOrdStatus;
    protected String projectId;
    protected String createdDt;
    protected String custReqDt;
    protected String ordPriority;
    protected String jobEffDt;
    protected String billEffDt;
    protected String createdBy;
    protected String cseCode;
    protected String svcInstId;
    protected String csExec;
    protected String closedDt;
    protected String creatorName;
    protected String creatorContacts;
    protected String cancelledDt;
    protected String cancelledReason;
    protected String ceaseReason;
    protected String softAct;
    protected String switchType;
    protected String lastModifyBy;
    protected String lastModifyDt;
    protected String dealerCd;
    protected String dealerName;
    protected String linkedWorkOrdNo;
    protected String csoGrpCd;
    protected String custId;
    protected String custNm;
    protected String salesmanId;
    protected String salesmanCd;

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
     * Gets the value of the workOrdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdType() {
        return workOrdType;
    }

    /**
     * Sets the value of the workOrdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdType(String value) {
        this.workOrdType = value;
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
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
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
     * Gets the value of the ordPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdPriority() {
        return ordPriority;
    }

    /**
     * Sets the value of the ordPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdPriority(String value) {
        this.ordPriority = value;
    }

    /**
     * Gets the value of the jobEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobEffDt() {
        return jobEffDt;
    }

    /**
     * Sets the value of the jobEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobEffDt(String value) {
        this.jobEffDt = value;
    }

    /**
     * Gets the value of the billEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillEffDt() {
        return billEffDt;
    }

    /**
     * Sets the value of the billEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillEffDt(String value) {
        this.billEffDt = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the cseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCseCode() {
        return cseCode;
    }

    /**
     * Sets the value of the cseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCseCode(String value) {
        this.cseCode = value;
    }

    /**
     * Gets the value of the svcInstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcInstId() {
        return svcInstId;
    }

    /**
     * Sets the value of the svcInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcInstId(String value) {
        this.svcInstId = value;
    }

    /**
     * Gets the value of the csExec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsExec() {
        return csExec;
    }

    /**
     * Sets the value of the csExec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsExec(String value) {
        this.csExec = value;
    }

    /**
     * Gets the value of the closedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedDt() {
        return closedDt;
    }

    /**
     * Sets the value of the closedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedDt(String value) {
        this.closedDt = value;
    }

    /**
     * Gets the value of the creatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * Sets the value of the creatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorName(String value) {
        this.creatorName = value;
    }

    /**
     * Gets the value of the creatorContacts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorContacts() {
        return creatorContacts;
    }

    /**
     * Sets the value of the creatorContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorContacts(String value) {
        this.creatorContacts = value;
    }

    /**
     * Gets the value of the cancelledDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledDt() {
        return cancelledDt;
    }

    /**
     * Sets the value of the cancelledDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledDt(String value) {
        this.cancelledDt = value;
    }

    /**
     * Gets the value of the cancelledReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledReason() {
        return cancelledReason;
    }

    /**
     * Sets the value of the cancelledReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledReason(String value) {
        this.cancelledReason = value;
    }

    /**
     * Gets the value of the ceaseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeaseReason() {
        return ceaseReason;
    }

    /**
     * Sets the value of the ceaseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeaseReason(String value) {
        this.ceaseReason = value;
    }

    /**
     * Gets the value of the softAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftAct() {
        return softAct;
    }

    /**
     * Sets the value of the softAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftAct(String value) {
        this.softAct = value;
    }

    /**
     * Gets the value of the switchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchType() {
        return switchType;
    }

    /**
     * Sets the value of the switchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchType(String value) {
        this.switchType = value;
    }

    /**
     * Gets the value of the lastModifyBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifyBy() {
        return lastModifyBy;
    }

    /**
     * Sets the value of the lastModifyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifyBy(String value) {
        this.lastModifyBy = value;
    }

    /**
     * Gets the value of the lastModifyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifyDt() {
        return lastModifyDt;
    }

    /**
     * Sets the value of the lastModifyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifyDt(String value) {
        this.lastModifyDt = value;
    }

    /**
     * Gets the value of the dealerCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCd() {
        return dealerCd;
    }

    /**
     * Sets the value of the dealerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCd(String value) {
        this.dealerCd = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the linkedWorkOrdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedWorkOrdNo() {
        return linkedWorkOrdNo;
    }

    /**
     * Sets the value of the linkedWorkOrdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedWorkOrdNo(String value) {
        this.linkedWorkOrdNo = value;
    }

    /**
     * Gets the value of the csoGrpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsoGrpCd() {
        return csoGrpCd;
    }

    /**
     * Sets the value of the csoGrpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsoGrpCd(String value) {
        this.csoGrpCd = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNm() {
        return custNm;
    }

    /**
     * Sets the value of the custNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNm(String value) {
        this.custNm = value;
    }

    /**
     * Gets the value of the salesmanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesmanId() {
        return salesmanId;
    }

    /**
     * Sets the value of the salesmanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesmanId(String value) {
        this.salesmanId = value;
    }

    /**
     * Gets the value of the salesmanCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesmanCd() {
        return salesmanCd;
    }

    /**
     * Sets the value of the salesmanCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesmanCd(String value) {
        this.salesmanCd = value;
    }

}
