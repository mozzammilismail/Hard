
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPdtDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPdtDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleEngineInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spcInternalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodPackageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busPrdtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalBusPdtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productShortDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waiveRegInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waivePenaltyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialPrdtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oneTimeChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="immediateClosureInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentMRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MRCAfterContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractPdtDO
    implements Serializable
{

    protected String actionCode;
    protected String levelInd;
    protected String enableInd;
    protected String ruleEngineInd;
    protected String spcInternalID;
    protected String schemeId;
    protected String schemeGrpId;
    protected String prodPackageId;
    protected String productId;
    protected String productType;
    protected String createdSystem;
    protected String schemeDesc;
    protected String schemeCategory;
    protected String busPrdtType;
    protected String originalBusPdtType;
    protected String productShortDesc;
    protected String productDesc;
    protected String productFamily;
    protected String startDt;
    protected String endDt;
    protected String expiryDt;
    protected String waiveRegInd;
    protected String waivePenaltyInd;
    protected String penaltyInd;
    protected String amount;
    protected String specialPrdtType;
    protected String oneTimeChargeAmount;
    protected String immediateClosureInd;
    protected String currentMRC;
    protected String mrcAfterContract;
    protected String systemInd;

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
     * Gets the value of the levelInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelInd() {
        return levelInd;
    }

    /**
     * Sets the value of the levelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelInd(String value) {
        this.levelInd = value;
    }

    /**
     * Gets the value of the enableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableInd() {
        return enableInd;
    }

    /**
     * Sets the value of the enableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableInd(String value) {
        this.enableInd = value;
    }

    /**
     * Gets the value of the ruleEngineInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleEngineInd() {
        return ruleEngineInd;
    }

    /**
     * Sets the value of the ruleEngineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleEngineInd(String value) {
        this.ruleEngineInd = value;
    }

    /**
     * Gets the value of the spcInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpcInternalID() {
        return spcInternalID;
    }

    /**
     * Sets the value of the spcInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpcInternalID(String value) {
        this.spcInternalID = value;
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
     * Gets the value of the prodPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPackageId() {
        return prodPackageId;
    }

    /**
     * Sets the value of the prodPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPackageId(String value) {
        this.prodPackageId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the createdSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedSystem() {
        return createdSystem;
    }

    /**
     * Sets the value of the createdSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedSystem(String value) {
        this.createdSystem = value;
    }

    /**
     * Gets the value of the schemeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeDesc() {
        return schemeDesc;
    }

    /**
     * Sets the value of the schemeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeDesc(String value) {
        this.schemeDesc = value;
    }

    /**
     * Gets the value of the schemeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeCategory() {
        return schemeCategory;
    }

    /**
     * Sets the value of the schemeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeCategory(String value) {
        this.schemeCategory = value;
    }

    /**
     * Gets the value of the busPrdtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusPrdtType() {
        return busPrdtType;
    }

    /**
     * Sets the value of the busPrdtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusPrdtType(String value) {
        this.busPrdtType = value;
    }

    /**
     * Gets the value of the originalBusPdtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBusPdtType() {
        return originalBusPdtType;
    }

    /**
     * Sets the value of the originalBusPdtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBusPdtType(String value) {
        this.originalBusPdtType = value;
    }

    /**
     * Gets the value of the productShortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductShortDesc() {
        return productShortDesc;
    }

    /**
     * Sets the value of the productShortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductShortDesc(String value) {
        this.productShortDesc = value;
    }

    /**
     * Gets the value of the productDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the value of the productDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDesc(String value) {
        this.productDesc = value;
    }

    /**
     * Gets the value of the productFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFamily() {
        return productFamily;
    }

    /**
     * Sets the value of the productFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFamily(String value) {
        this.productFamily = value;
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
     * Gets the value of the waiveRegInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveRegInd() {
        return waiveRegInd;
    }

    /**
     * Sets the value of the waiveRegInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveRegInd(String value) {
        this.waiveRegInd = value;
    }

    /**
     * Gets the value of the waivePenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaivePenaltyInd() {
        return waivePenaltyInd;
    }

    /**
     * Sets the value of the waivePenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaivePenaltyInd(String value) {
        this.waivePenaltyInd = value;
    }

    /**
     * Gets the value of the penaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyInd() {
        return penaltyInd;
    }

    /**
     * Sets the value of the penaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyInd(String value) {
        this.penaltyInd = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the specialPrdtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPrdtType() {
        return specialPrdtType;
    }

    /**
     * Sets the value of the specialPrdtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPrdtType(String value) {
        this.specialPrdtType = value;
    }

    /**
     * Gets the value of the oneTimeChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneTimeChargeAmount() {
        return oneTimeChargeAmount;
    }

    /**
     * Sets the value of the oneTimeChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneTimeChargeAmount(String value) {
        this.oneTimeChargeAmount = value;
    }

    /**
     * Gets the value of the immediateClosureInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediateClosureInd() {
        return immediateClosureInd;
    }

    /**
     * Sets the value of the immediateClosureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmediateClosureInd(String value) {
        this.immediateClosureInd = value;
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
     * Gets the value of the systemInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemInd() {
        return systemInd;
    }

    /**
     * Sets the value of the systemInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemInd(String value) {
        this.systemInd = value;
    }

}
