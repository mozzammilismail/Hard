
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMApptDO;


/**
 * <p>Java class for AbstractApptDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractApptDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apptBookId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apptPrefDtTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extApptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extApptOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extApptSvcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastUpdateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subProductTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrdContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptReqTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptEndDtTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptActionTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptCancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelOrderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newCRD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portInOutInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bomInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mioVoiceToDELInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeSTBInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bundleInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productList" type="{http://www.singtel.com/oft/dataobject/xsd/common}ProductDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractApptDO
    implements Serializable
{

    protected String apptBookId;
    protected String apptPrefDtTime;
    protected String extApptId;
    protected String extApptOrder;
    protected String extApptSvcNo;
    protected String lastUpdateId;
    protected String packageId;
    protected String svcType;
    protected String subProductTy;
    protected String workOrdContactId;
    protected String apptReqTy;
    protected String apptEndDtTime;
    protected String apptActionTy;
    protected String apptCancellationReason;
    protected String customerType;
    protected String cancelOrderType;
    protected String newCRD;
    protected String portInOutInd;
    protected String bomInd;
    protected String mioVoiceToDELInd;
    protected String changeSTBInd;
    protected String networkType;
    protected String bundleInd;
    protected List<ProductDO> productList;

    /**
     * Gets the value of the apptBookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptBookId() {
        return apptBookId;
    }

    /**
     * Sets the value of the apptBookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptBookId(String value) {
        this.apptBookId = value;
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
     * Gets the value of the extApptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtApptId() {
        return extApptId;
    }

    /**
     * Sets the value of the extApptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtApptId(String value) {
        this.extApptId = value;
    }

    /**
     * Gets the value of the extApptOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtApptOrder() {
        return extApptOrder;
    }

    /**
     * Sets the value of the extApptOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtApptOrder(String value) {
        this.extApptOrder = value;
    }

    /**
     * Gets the value of the extApptSvcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtApptSvcNo() {
        return extApptSvcNo;
    }

    /**
     * Sets the value of the extApptSvcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtApptSvcNo(String value) {
        this.extApptSvcNo = value;
    }

    /**
     * Gets the value of the lastUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateId() {
        return lastUpdateId;
    }

    /**
     * Sets the value of the lastUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateId(String value) {
        this.lastUpdateId = value;
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
     * Gets the value of the subProductTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProductTy() {
        return subProductTy;
    }

    /**
     * Sets the value of the subProductTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProductTy(String value) {
        this.subProductTy = value;
    }

    /**
     * Gets the value of the workOrdContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdContactId() {
        return workOrdContactId;
    }

    /**
     * Sets the value of the workOrdContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdContactId(String value) {
        this.workOrdContactId = value;
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
     * Gets the value of the apptActionTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptActionTy() {
        return apptActionTy;
    }

    /**
     * Sets the value of the apptActionTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptActionTy(String value) {
        this.apptActionTy = value;
    }

    /**
     * Gets the value of the apptCancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApptCancellationReason() {
        return apptCancellationReason;
    }

    /**
     * Sets the value of the apptCancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApptCancellationReason(String value) {
        this.apptCancellationReason = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the cancelOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelOrderType() {
        return cancelOrderType;
    }

    /**
     * Sets the value of the cancelOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelOrderType(String value) {
        this.cancelOrderType = value;
    }

    /**
     * Gets the value of the newCRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCRD() {
        return newCRD;
    }

    /**
     * Sets the value of the newCRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCRD(String value) {
        this.newCRD = value;
    }

    /**
     * Gets the value of the portInOutInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortInOutInd() {
        return portInOutInd;
    }

    /**
     * Sets the value of the portInOutInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortInOutInd(String value) {
        this.portInOutInd = value;
    }

    /**
     * Gets the value of the bomInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomInd() {
        return bomInd;
    }

    /**
     * Sets the value of the bomInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomInd(String value) {
        this.bomInd = value;
    }

    /**
     * Gets the value of the mioVoiceToDELInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMioVoiceToDELInd() {
        return mioVoiceToDELInd;
    }

    /**
     * Sets the value of the mioVoiceToDELInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMioVoiceToDELInd(String value) {
        this.mioVoiceToDELInd = value;
    }

    /**
     * Gets the value of the changeSTBInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeSTBInd() {
        return changeSTBInd;
    }

    /**
     * Sets the value of the changeSTBInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeSTBInd(String value) {
        this.changeSTBInd = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the bundleInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleInd() {
        return bundleInd;
    }

    /**
     * Sets the value of the bundleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleInd(String value) {
        this.bundleInd = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDO }
     * 
     * 
     */
    public List<ProductDO> getProductList() {
        if (productList == null) {
            productList = new ArrayList<ProductDO>();
        }
        return this.productList;
    }

}
