
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMSvcInstHeaderDO;


/**
 * <p>Java class for AbstractSvcInstHeaderDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSvcInstHeaderDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcInstId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcTypeDO"/>
 *         &lt;element name="custID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custIDTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentADSLNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentBA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dummyDelInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cstnOfferAndMigrationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bundleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSimInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeOfSvc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingOrderInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentServiceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secretAcctInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eServInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractSvcInstHeaderDO
    implements Serializable
{

    protected String svcNo;
    protected String svcInstId;
    protected SvcTypeDO svcType;
    protected String custID;
    protected String custIDTy;
    protected String accountNo;
    protected List<String> parentADSLNo;
    protected String parentBA;
    protected String dummyDelInd;
    protected String cstnOfferAndMigrationInd;
    protected String bundleType;
    protected String dataSimInd;
    protected String typeOfSvc;
    protected String pendingOrderInd;
    protected String parentServiceNo;
    protected String secretAcctInd;
    protected String accountNm;
    protected String svcStatus;
    protected String startDate;
    protected String endDate;
    protected String eServInd;

    /**
     * Gets the value of the svcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNo() {
        return svcNo;
    }

    /**
     * Sets the value of the svcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNo(String value) {
        this.svcNo = value;
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
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcTypeDO }
     *     
     */
    public SvcTypeDO getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcTypeDO }
     *     
     */
    public void setSvcType(SvcTypeDO value) {
        this.svcType = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the custIDTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIDTy() {
        return custIDTy;
    }

    /**
     * Sets the value of the custIDTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIDTy(String value) {
        this.custIDTy = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the parentADSLNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentADSLNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentADSLNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParentADSLNo() {
        if (parentADSLNo == null) {
            parentADSLNo = new ArrayList<String>();
        }
        return this.parentADSLNo;
    }

    /**
     * Gets the value of the parentBA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBA() {
        return parentBA;
    }

    /**
     * Sets the value of the parentBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBA(String value) {
        this.parentBA = value;
    }

    /**
     * Gets the value of the dummyDelInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDummyDelInd() {
        return dummyDelInd;
    }

    /**
     * Sets the value of the dummyDelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDummyDelInd(String value) {
        this.dummyDelInd = value;
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
     * Gets the value of the bundleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleType() {
        return bundleType;
    }

    /**
     * Sets the value of the bundleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleType(String value) {
        this.bundleType = value;
    }

    /**
     * Gets the value of the dataSimInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSimInd() {
        return dataSimInd;
    }

    /**
     * Sets the value of the dataSimInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSimInd(String value) {
        this.dataSimInd = value;
    }

    /**
     * Gets the value of the typeOfSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSvc() {
        return typeOfSvc;
    }

    /**
     * Sets the value of the typeOfSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSvc(String value) {
        this.typeOfSvc = value;
    }

    /**
     * Gets the value of the pendingOrderInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingOrderInd() {
        return pendingOrderInd;
    }

    /**
     * Sets the value of the pendingOrderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingOrderInd(String value) {
        this.pendingOrderInd = value;
    }

    /**
     * Gets the value of the parentServiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentServiceNo() {
        return parentServiceNo;
    }

    /**
     * Sets the value of the parentServiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentServiceNo(String value) {
        this.parentServiceNo = value;
    }

    /**
     * Gets the value of the secretAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretAcctInd() {
        return secretAcctInd;
    }

    /**
     * Sets the value of the secretAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretAcctInd(String value) {
        this.secretAcctInd = value;
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
     * Gets the value of the svcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcStatus() {
        return svcStatus;
    }

    /**
     * Sets the value of the svcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcStatus(String value) {
        this.svcStatus = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the eServInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEServInd() {
        return eServInd;
    }

    /**
     * Sets the value of the eServInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEServInd(String value) {
        this.eServInd = value;
    }

}
