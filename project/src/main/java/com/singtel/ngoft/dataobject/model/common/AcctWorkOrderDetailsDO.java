
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctWorkOrderDetailsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctWorkOrderDetailsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reqByDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installerNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dependency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="completionDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="controllerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="performerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="piInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AcctWorkOrderDetailsDO
    implements Serializable
{

    protected String workOrdNo;
    protected String actNo;
    protected String actId;
    protected String actDesc;
    protected String groupId;
    protected String statusCd;
    protected String reqByDt;
    protected String installerId;
    protected String installerNm;
    protected String dependency;
    protected String completionDt;
    protected String controllerId;
    protected String performerId;
    protected String actTy;
    protected String piInd;

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
     * Gets the value of the actNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * Sets the value of the actNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActNo(String value) {
        this.actNo = value;
    }

    /**
     * Gets the value of the actId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActId() {
        return actId;
    }

    /**
     * Sets the value of the actId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActId(String value) {
        this.actId = value;
    }

    /**
     * Gets the value of the actDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActDesc() {
        return actDesc;
    }

    /**
     * Sets the value of the actDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActDesc(String value) {
        this.actDesc = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the statusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCd() {
        return statusCd;
    }

    /**
     * Sets the value of the statusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    /**
     * Gets the value of the reqByDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqByDt() {
        return reqByDt;
    }

    /**
     * Sets the value of the reqByDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqByDt(String value) {
        this.reqByDt = value;
    }

    /**
     * Gets the value of the installerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallerId() {
        return installerId;
    }

    /**
     * Sets the value of the installerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallerId(String value) {
        this.installerId = value;
    }

    /**
     * Gets the value of the installerNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallerNm() {
        return installerNm;
    }

    /**
     * Sets the value of the installerNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallerNm(String value) {
        this.installerNm = value;
    }

    /**
     * Gets the value of the dependency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependency() {
        return dependency;
    }

    /**
     * Sets the value of the dependency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependency(String value) {
        this.dependency = value;
    }

    /**
     * Gets the value of the completionDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionDt() {
        return completionDt;
    }

    /**
     * Sets the value of the completionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionDt(String value) {
        this.completionDt = value;
    }

    /**
     * Gets the value of the controllerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerId() {
        return controllerId;
    }

    /**
     * Sets the value of the controllerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerId(String value) {
        this.controllerId = value;
    }

    /**
     * Gets the value of the performerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformerId() {
        return performerId;
    }

    /**
     * Sets the value of the performerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformerId(String value) {
        this.performerId = value;
    }

    /**
     * Gets the value of the actTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActTy() {
        return actTy;
    }

    /**
     * Sets the value of the actTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActTy(String value) {
        this.actTy = value;
    }

    /**
     * Gets the value of the piInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiInd() {
        return piInd;
    }

    /**
     * Sets the value of the piInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiInd(String value) {
        this.piInd = value;
    }

}
