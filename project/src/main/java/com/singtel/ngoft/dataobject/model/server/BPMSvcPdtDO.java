
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractSvcPdtDO;


/**
 * <p>Java class for BPMSvcPdtDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSvcPdtDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractSvcPdtDO">
 *       &lt;sequence>
 *         &lt;element name="suppCompId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcActionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="schemeContractMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemeGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContractDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rcInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRCInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ucInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMUCInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isolatedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isObsolete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineTieReqInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prdtRelation" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMPrdtRelationDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="txnPdtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedChannelList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billingFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */



public abstract class BPMSvcPdtDO
    extends AbstractSvcPdtDO
    implements Serializable
{

    protected String suppCompId;
    protected String svcNo;
    protected List<String> svcActionType;
    protected String schemeContractMonth;
    protected String schemeFamily;
    protected String schemeGroupId;
    protected List<BPMContractDO> contractInfo;
    protected List<BPMRCInfoDO> rcInfo;
    protected List<BPMUCInfoDO> ucInfo;
    protected String isolatedInd;
    protected String isObsolete;
    protected String lineTieReqInd;
    protected List<BPMPrdtRelationDO> prdtRelation;
    protected String txnPdtInd;
    protected String channelType;
    protected List<String> associatedChannelList;
    protected String billingFrequency;
    protected String custGrp;

    /**
     * Gets the value of the suppCompId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppCompId() {
        return suppCompId;
    }

    /**
     * Sets the value of the suppCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppCompId(String value) {
        this.suppCompId = value;
    }

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
     * Gets the value of the svcActionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcActionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcActionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSvcActionType() {
        if (svcActionType == null) {
            svcActionType = new ArrayList<String>();
        }
        return this.svcActionType;
    }

    /**
     * Gets the value of the schemeContractMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeContractMonth() {
        return schemeContractMonth;
    }

    /**
     * Sets the value of the schemeContractMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeContractMonth(String value) {
        this.schemeContractMonth = value;
    }

    /**
     * Gets the value of the schemeFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeFamily() {
        return schemeFamily;
    }

    /**
     * Sets the value of the schemeFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeFamily(String value) {
        this.schemeFamily = value;
    }

    /**
     * Gets the value of the schemeGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeGroupId() {
        return schemeGroupId;
    }

    /**
     * Sets the value of the schemeGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeGroupId(String value) {
        this.schemeGroupId = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMContractDO }
     * 
     * 
     */
    public List<BPMContractDO> getContractInfo() {
        if (contractInfo == null) {
            contractInfo = new ArrayList<BPMContractDO>();
        }
        return this.contractInfo;
    }

    /**
     * Gets the value of the rcInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMRCInfoDO }
     * 
     * 
     */
    public List<BPMRCInfoDO> getRcInfo() {
        if (rcInfo == null) {
            rcInfo = new ArrayList<BPMRCInfoDO>();
        }
        return this.rcInfo;
    }

    /**
     * Gets the value of the ucInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMUCInfoDO }
     * 
     * 
     */
    public List<BPMUCInfoDO> getUcInfo() {
        if (ucInfo == null) {
            ucInfo = new ArrayList<BPMUCInfoDO>();
        }
        return this.ucInfo;
    }

    /**
     * Gets the value of the isolatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsolatedInd() {
        return isolatedInd;
    }

    /**
     * Sets the value of the isolatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsolatedInd(String value) {
        this.isolatedInd = value;
    }

    /**
     * Gets the value of the isObsolete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsObsolete() {
        return isObsolete;
    }

    /**
     * Sets the value of the isObsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsObsolete(String value) {
        this.isObsolete = value;
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
     * Gets the value of the prdtRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdtRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdtRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMPrdtRelationDO }
     * 
     * 
     */
    public List<BPMPrdtRelationDO> getPrdtRelation() {
        if (prdtRelation == null) {
            prdtRelation = new ArrayList<BPMPrdtRelationDO>();
        }
        return this.prdtRelation;
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

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the associatedChannelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedChannelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedChannelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssociatedChannelList() {
        if (associatedChannelList == null) {
            associatedChannelList = new ArrayList<String>();
        }
        return this.associatedChannelList;
    }

    /**
     * Gets the value of the billingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Sets the value of the billingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFrequency(String value) {
        this.billingFrequency = value;
    }

    /**
     * Gets the value of the custGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGrp() {
        return custGrp;
    }

    /**
     * Sets the value of the custGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGrp(String value) {
        this.custGrp = value;
    }

}
