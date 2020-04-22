
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMBillCompInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMBillCompInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="compInstId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="compInstIdServ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="intCompInst" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="schemeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waiveRegFeeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waiverPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMElementInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nwPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNetworkPdtInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineTieReqInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txnPdtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMBillCompInfoDO
    implements Serializable
{

    protected String actionCode;
    protected String packageId;
    protected Long compId;
    protected Long compInstId;
    protected Long compInstIdServ;
    protected Long intCompInst;
    protected String schemeId;
    protected String schemeGrpId;
    protected String compDescription;
    protected String startDt;
    protected String endDt;
    protected String expiryDt;
    protected String waiveRegFeeInd;
    protected String waiverPenaltyInd;
    protected List<BPMElementInfoDO> elementInfo;
    protected List<BPMNetworkPdtInfoDO> nwPdtInfo;
    protected String lineTieReqInd;
    protected String txnPdtInd;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the compId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompId() {
        return compId;
    }

    /**
     * Sets the value of the compId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompId(Long value) {
        this.compId = value;
    }

    /**
     * Gets the value of the compInstId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompInstId() {
        return compInstId;
    }

    /**
     * Sets the value of the compInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompInstId(Long value) {
        this.compInstId = value;
    }

    /**
     * Gets the value of the compInstIdServ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompInstIdServ() {
        return compInstIdServ;
    }

    /**
     * Sets the value of the compInstIdServ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompInstIdServ(Long value) {
        this.compInstIdServ = value;
    }

    /**
     * Gets the value of the intCompInst property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntCompInst() {
        return intCompInst;
    }

    /**
     * Sets the value of the intCompInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntCompInst(Long value) {
        this.intCompInst = value;
    }

    /**
     * Gets the value of the schemeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeId() {
        return schemeId;
    }

    /**
     * Sets the value of the schemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeId(String value) {
        this.schemeId = value;
    }

    /**
     * Gets the value of the schemeGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeGrpId() {
        return schemeGrpId;
    }

    /**
     * Sets the value of the schemeGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeGrpId(String value) {
        this.schemeGrpId = value;
    }

    /**
     * Gets the value of the compDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompDescription() {
        return compDescription;
    }

    /**
     * Sets the value of the compDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompDescription(String value) {
        this.compDescription = value;
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
     * Gets the value of the expiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDt() {
        return expiryDt;
    }

    /**
     * Sets the value of the expiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDt(String value) {
        this.expiryDt = value;
    }

    /**
     * Gets the value of the waiveRegFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveRegFeeInd() {
        return waiveRegFeeInd;
    }

    /**
     * Sets the value of the waiveRegFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveRegFeeInd(String value) {
        this.waiveRegFeeInd = value;
    }

    /**
     * Gets the value of the waiverPenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverPenaltyInd() {
        return waiverPenaltyInd;
    }

    /**
     * Sets the value of the waiverPenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverPenaltyInd(String value) {
        this.waiverPenaltyInd = value;
    }

    /**
     * Gets the value of the elementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMElementInfoDO }
     * 
     * 
     */
    public List<BPMElementInfoDO> getElementInfo() {
        if (elementInfo == null) {
            elementInfo = new ArrayList<BPMElementInfoDO>();
        }
        return this.elementInfo;
    }

    /**
     * Gets the value of the nwPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nwPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNwPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNetworkPdtInfoDO }
     * 
     * 
     */
    public List<BPMNetworkPdtInfoDO> getNwPdtInfo() {
        if (nwPdtInfo == null) {
            nwPdtInfo = new ArrayList<BPMNetworkPdtInfoDO>();
        }
        return this.nwPdtInfo;
    }

    /**
     * Gets the value of the lineTieReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTieReqInd() {
        return lineTieReqInd;
    }

    /**
     * Sets the value of the lineTieReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTieReqInd(String value) {
        this.lineTieReqInd = value;
    }

    /**
     * Gets the value of the txnPdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnPdtInd() {
        return txnPdtInd;
    }

    /**
     * Sets the value of the txnPdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnPdtInd(String value) {
        this.txnPdtInd = value;
    }

}
