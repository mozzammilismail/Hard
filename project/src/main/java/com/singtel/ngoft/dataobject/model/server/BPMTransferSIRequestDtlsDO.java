
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractTransferSIRequestDtlsDO;


/**
 * <p>Java class for BPMTransferSIRequestDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMTransferSIRequestDtlsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractTransferSIRequestDtlsDO">
 *       &lt;sequence>
 *         &lt;element name="bpmInternalTransferSIDtlsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="srcCustomer" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustomerHasDO"/>
 *         &lt;element name="srcSvcInst" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcInstHasDO"/>
 *         &lt;element name="siTransferResult" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMTransferSIResultDO" minOccurs="0"/>
 *         &lt;element name="nftIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcAccount" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAccountHasDO" minOccurs="0"/>
 *         &lt;element name="depositInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMDepositDO" minOccurs="0"/>
 *         &lt;element name="notesDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNotesDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMTransferSIRequestDtlsDO
    extends AbstractTransferSIRequestDtlsDO
    implements Serializable
{

    protected String bpmInternalTransferSIDtlsID;
    protected BPMCustomerHasDO srcCustomer;
    protected BPMSvcInstHasDO srcSvcInst;
    protected BPMTransferSIResultDO siTransferResult;
    protected String nftIndicator;
    protected String targetCustomerID;
    protected BPMAccountHasDO srcAccount;
    protected BPMDepositDO depositInfo;
    protected List<BPMNotesDO> notesDtls;

    /**
     * Gets the value of the bpmInternalTransferSIDtlsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmInternalTransferSIDtlsID() {
        return bpmInternalTransferSIDtlsID;
    }

    /**
     * Sets the value of the bpmInternalTransferSIDtlsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmInternalTransferSIDtlsID(String value) {
        this.bpmInternalTransferSIDtlsID = value;
    }

    /**
     * Gets the value of the srcCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustomerHasDO }
     *     
     */
    public BPMCustomerHasDO getSrcCustomer() {
        return srcCustomer;
    }

    /**
     * Sets the value of the srcCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustomerHasDO }
     *     
     */
    public void setSrcCustomer(BPMCustomerHasDO value) {
        this.srcCustomer = value;
    }

    /**
     * Gets the value of the srcSvcInst property.
     * 
     * @return
     *     possible object is
     *     {@link BPMSvcInstHasDO }
     *     
     */
    public BPMSvcInstHasDO getSrcSvcInst() {
        return srcSvcInst;
    }

    /**
     * Sets the value of the srcSvcInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMSvcInstHasDO }
     *     
     */
    public void setSrcSvcInst(BPMSvcInstHasDO value) {
        this.srcSvcInst = value;
    }

    /**
     * Gets the value of the siTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link BPMTransferSIResultDO }
     *     
     */
    public BPMTransferSIResultDO getSiTransferResult() {
        return siTransferResult;
    }

    /**
     * Sets the value of the siTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMTransferSIResultDO }
     *     
     */
    public void setSiTransferResult(BPMTransferSIResultDO value) {
        this.siTransferResult = value;
    }

    /**
     * Gets the value of the nftIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNftIndicator() {
        return nftIndicator;
    }

    /**
     * Sets the value of the nftIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNftIndicator(String value) {
        this.nftIndicator = value;
    }

    /**
     * Gets the value of the targetCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCustomerID() {
        return targetCustomerID;
    }

    /**
     * Sets the value of the targetCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCustomerID(String value) {
        this.targetCustomerID = value;
    }

    /**
     * Gets the value of the srcAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BPMAccountHasDO }
     *     
     */
    public BPMAccountHasDO getSrcAccount() {
        return srcAccount;
    }

    /**
     * Sets the value of the srcAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMAccountHasDO }
     *     
     */
    public void setSrcAccount(BPMAccountHasDO value) {
        this.srcAccount = value;
    }

    /**
     * Gets the value of the depositInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMDepositDO }
     *     
     */
    public BPMDepositDO getDepositInfo() {
        return depositInfo;
    }

    /**
     * Sets the value of the depositInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMDepositDO }
     *     
     */
    public void setDepositInfo(BPMDepositDO value) {
        this.depositInfo = value;
    }

    /**
     * Gets the value of the notesDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNotesDO }
     * 
     * 
     */
    public List<BPMNotesDO> getNotesDtls() {
        if (notesDtls == null) {
            notesDtls = new ArrayList<BPMNotesDO>();
        }
        return this.notesDtls;
    }

}
