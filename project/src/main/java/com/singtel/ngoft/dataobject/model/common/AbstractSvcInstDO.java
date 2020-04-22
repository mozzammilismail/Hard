
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMSvcInstDO;


/**
 * <p>Java class for AbstractSvcInstDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSvcInstDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSupportingDELNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vasActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pegasusSvcInstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderTxnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retainNumInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcTypeDO"/>
 *         &lt;element name="customerValueInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rentalTariffGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="churnValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STBMaintenance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcInstStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cstnOfferAndMigrationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingOrdInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferToSGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ceaseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ceaseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfSvc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="immediateClosureInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temporaryServiceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tosEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custEnjoyedPack" type="{http://www.singtel.com/oft/dataobject/xsd/common}CustomerEnjoyedPackDO"/>
 *         &lt;element name="updateIndicatorList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="impactServiceOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderNumberToMaintain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SITransferInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salvageInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractSvcInstDO
    implements Serializable
{

    protected String crd;
    protected String originalCRD;
    protected String orderPriority;
    protected String newSupportingDELNo;
    protected String simActivationDate;
    protected String vasActivationDate;
    protected String pegasusSvcInstID;
    protected String customerID;
    protected String customerIDType;
    protected String accountID;
    protected String orderTxnType;
    protected String retainNumInd;
    protected String serviceNumber;
    protected SvcTypeDO serviceType;
    protected String customerValueInd;
    protected String rentalTariffGrp;
    protected String churnValue;
    protected String stbMaintenance;
    protected String svcInstStatus;
    protected String cstnOfferAndMigrationInd;
    protected String simInd;
    protected String pendingOrdInd;
    protected String transferToSGO;
    protected String subRC;
    protected String ceaseCode;
    protected String ceaseReason;
    protected List<String> typeOfSvc;
    protected String immediateClosureInd;
    protected String temporaryServiceEndDate;
    protected String tosEndDate;
    protected CustomerEnjoyedPackDO custEnjoyedPack;
    protected List<String> updateIndicatorList;
    protected String impactServiceOrderNumber;
    protected String workOrderNumberToMaintain;
    protected String reasonCode;
    protected String reasonRemarks;
    protected String accountNm;
    protected String siTransferInd;
    protected String salvageInd;

    /**
     * Gets the value of the crd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRD() {
        return crd;
    }

    /**
     * Sets the value of the crd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRD(String value) {
        this.crd = value;
    }

    /**
     * Gets the value of the originalCRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCRD() {
        return originalCRD;
    }

    /**
     * Sets the value of the originalCRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCRD(String value) {
        this.originalCRD = value;
    }

    /**
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPriority(String value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the newSupportingDELNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSupportingDELNo() {
        return newSupportingDELNo;
    }

    /**
     * Sets the value of the newSupportingDELNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSupportingDELNo(String value) {
        this.newSupportingDELNo = value;
    }

    /**
     * Gets the value of the simActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimActivationDate() {
        return simActivationDate;
    }

    /**
     * Sets the value of the simActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimActivationDate(String value) {
        this.simActivationDate = value;
    }

    /**
     * Gets the value of the vasActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVasActivationDate() {
        return vasActivationDate;
    }

    /**
     * Sets the value of the vasActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVasActivationDate(String value) {
        this.vasActivationDate = value;
    }

    /**
     * Gets the value of the pegasusSvcInstID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusSvcInstID() {
        return pegasusSvcInstID;
    }

    /**
     * Sets the value of the pegasusSvcInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusSvcInstID(String value) {
        this.pegasusSvcInstID = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the customerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIDType() {
        return customerIDType;
    }

    /**
     * Sets the value of the customerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIDType(String value) {
        this.customerIDType = value;
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
     * Gets the value of the orderTxnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTxnType() {
        return orderTxnType;
    }

    /**
     * Sets the value of the orderTxnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTxnType(String value) {
        this.orderTxnType = value;
    }

    /**
     * Gets the value of the retainNumInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainNumInd() {
        return retainNumInd;
    }

    /**
     * Sets the value of the retainNumInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainNumInd(String value) {
        this.retainNumInd = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcTypeDO }
     *     
     */
    public SvcTypeDO getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcTypeDO }
     *     
     */
    public void setServiceType(SvcTypeDO value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the customerValueInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerValueInd() {
        return customerValueInd;
    }

    /**
     * Sets the value of the customerValueInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerValueInd(String value) {
        this.customerValueInd = value;
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
     * Gets the value of the churnValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChurnValue() {
        return churnValue;
    }

    /**
     * Sets the value of the churnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChurnValue(String value) {
        this.churnValue = value;
    }

    /**
     * Gets the value of the stbMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTBMaintenance() {
        return stbMaintenance;
    }

    /**
     * Sets the value of the stbMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTBMaintenance(String value) {
        this.stbMaintenance = value;
    }

    /**
     * Gets the value of the svcInstStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcInstStatus() {
        return svcInstStatus;
    }

    /**
     * Sets the value of the svcInstStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcInstStatus(String value) {
        this.svcInstStatus = value;
    }

    /**
     * Gets the value of the cstnOfferAndMigrationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstnOfferAndMigrationInd() {
        return cstnOfferAndMigrationInd;
    }

    /**
     * Sets the value of the cstnOfferAndMigrationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstnOfferAndMigrationInd(String value) {
        this.cstnOfferAndMigrationInd = value;
    }

    /**
     * Gets the value of the simInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimInd() {
        return simInd;
    }

    /**
     * Sets the value of the simInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimInd(String value) {
        this.simInd = value;
    }

    /**
     * Gets the value of the pendingOrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingOrdInd() {
        return pendingOrdInd;
    }

    /**
     * Sets the value of the pendingOrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingOrdInd(String value) {
        this.pendingOrdInd = value;
    }

    /**
     * Gets the value of the transferToSGO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToSGO() {
        return transferToSGO;
    }

    /**
     * Sets the value of the transferToSGO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToSGO(String value) {
        this.transferToSGO = value;
    }

    /**
     * Gets the value of the subRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRC() {
        return subRC;
    }

    /**
     * Sets the value of the subRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRC(String value) {
        this.subRC = value;
    }

    /**
     * Gets the value of the ceaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeaseCode() {
        return ceaseCode;
    }

    /**
     * Sets the value of the ceaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeaseCode(String value) {
        this.ceaseCode = value;
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
     * Gets the value of the typeOfSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeOfSvc() {
        if (typeOfSvc == null) {
            typeOfSvc = new ArrayList<String>();
        }
        return this.typeOfSvc;
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
     * Gets the value of the temporaryServiceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryServiceEndDate() {
        return temporaryServiceEndDate;
    }

    /**
     * Sets the value of the temporaryServiceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryServiceEndDate(String value) {
        this.temporaryServiceEndDate = value;
    }

    /**
     * Gets the value of the tosEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTosEndDate() {
        return tosEndDate;
    }

    /**
     * Sets the value of the tosEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTosEndDate(String value) {
        this.tosEndDate = value;
    }

    /**
     * Gets the value of the custEnjoyedPack property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEnjoyedPackDO }
     *     
     */
    public CustomerEnjoyedPackDO getCustEnjoyedPack() {
        return custEnjoyedPack;
    }

    /**
     * Sets the value of the custEnjoyedPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEnjoyedPackDO }
     *     
     */
    public void setCustEnjoyedPack(CustomerEnjoyedPackDO value) {
        this.custEnjoyedPack = value;
    }

    /**
     * Gets the value of the updateIndicatorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateIndicatorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateIndicatorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUpdateIndicatorList() {
        if (updateIndicatorList == null) {
            updateIndicatorList = new ArrayList<String>();
        }
        return this.updateIndicatorList;
    }

    /**
     * Gets the value of the impactServiceOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactServiceOrderNumber() {
        return impactServiceOrderNumber;
    }

    /**
     * Sets the value of the impactServiceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactServiceOrderNumber(String value) {
        this.impactServiceOrderNumber = value;
    }

    /**
     * Gets the value of the workOrderNumberToMaintain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderNumberToMaintain() {
        return workOrderNumberToMaintain;
    }

    /**
     * Sets the value of the workOrderNumberToMaintain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderNumberToMaintain(String value) {
        this.workOrderNumberToMaintain = value;
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
     * Gets the value of the accountNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNm() {
        return accountNm;
    }

    /**
     * Sets the value of the accountNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNm(String value) {
        this.accountNm = value;
    }

    /**
     * Gets the value of the siTransferInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITransferInd() {
        return siTransferInd;
    }

    /**
     * Sets the value of the siTransferInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITransferInd(String value) {
        this.siTransferInd = value;
    }

    /**
     * Gets the value of the salvageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalvageInd() {
        return salvageInd;
    }

    /**
     * Sets the value of the salvageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalvageInd(String value) {
        this.salvageInd = value;
    }

}
