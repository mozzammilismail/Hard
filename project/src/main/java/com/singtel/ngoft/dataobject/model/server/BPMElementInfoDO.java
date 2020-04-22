
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMElementInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMElementInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="elemNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elemTy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRCInfoDO" minOccurs="0"/>
 *         &lt;element name="currentMRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MRCAfterContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitsOfRcKeyUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContractDO" minOccurs="0"/>
 *         &lt;element name="txnPdtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMElementInfoDO
    implements Serializable
{

    protected String actionCode;    
    protected Long elemId;   
    protected String elemNm;   
    protected Integer elemTy;    
    protected String startDt;    
    protected String endDt;    
    protected BPMRCInfoDO rcInfo;    
    protected String currentMRC;
    protected String mrcAfterContract;
    protected Long unitsOfRcKeyUnit;    
    protected BPMContractDO contractInfo;
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
     * Gets the value of the elemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElemId() {
        return elemId;
    }

    /**
     * Sets the value of the elemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElemId(Long value) {
        this.elemId = value;
    }

    /**
     * Gets the value of the elemNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElemNm() {
        return elemNm;
    }

    /**
     * Sets the value of the elemNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElemNm(String value) {
        this.elemNm = value;
    }

    /**
     * Gets the value of the elemTy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElemTy() {
        return elemTy;
    }

    /**
     * Sets the value of the elemTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElemTy(Integer value) {
        this.elemTy = value;
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
     * Gets the value of the rcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMRCInfoDO }
     *     
     */
    public BPMRCInfoDO getRcInfo() {
        return rcInfo;
    }

    /**
     * Sets the value of the rcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMRCInfoDO }
     *     
     */
    public void setRcInfo(BPMRCInfoDO value) {
        this.rcInfo = value;
    }

    /**
     * Gets the value of the currentMRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentMRC() {
        return currentMRC;
    }

    /**
     * Sets the value of the currentMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentMRC(String value) {
        this.currentMRC = value;
    }

    /**
     * Gets the value of the mrcAfterContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRCAfterContract() {
        return mrcAfterContract;
    }

    /**
     * Sets the value of the mrcAfterContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRCAfterContract(String value) {
        this.mrcAfterContract = value;
    }

    /**
     * Gets the value of the unitsOfRcKeyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitsOfRcKeyUnit() {
        return unitsOfRcKeyUnit;
    }

    /**
     * Sets the value of the unitsOfRcKeyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitsOfRcKeyUnit(Long value) {
        this.unitsOfRcKeyUnit = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMContractDO }
     *     
     */
    public BPMContractDO getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMContractDO }
     *     
     */
    public void setContractInfo(BPMContractDO value) {
        this.contractInfo = value;
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
