
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMAccountDtlsDO;


/**
 * <p>Java class for AbstractAccountDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAccountDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO" minOccurs="0"/>
 *         &lt;element name="billPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newBillAddrEffDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardExpDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameOnCreditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secretAcctInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerValueInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastBillPaidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastBillPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcNoType" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcNoTypeDO" minOccurs="0"/>
 *         &lt;element name="lastBillCutoffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowBillValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billMedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceDueDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acctPaymentInfo" type="{http://www.singtel.com/oft/dataobject/xsd/common}AcctPaymentInfoDO" minOccurs="0"/>
 *         &lt;element name="clientRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearingHse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clvValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="writeoffAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unsettledWriteOffAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eServInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billDispatchMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractAccountDtlsDO
    implements Serializable
{

    protected String accountNo;
    protected String accountName;
    protected String salutation;
    protected AddressDO billAddress;
    protected String billPeriod;
    protected String newBillAddrEffDt;
    protected String createDt;
    protected String creditCardExpDt;
    protected String creditCardNo;
    protected String creditCardType;
    protected String nameOnCreditCard;
    protected String paymentMode;
    protected String secretAcctInd;
    protected String status;
    protected String customerValueInd;
    protected String vipcode;
    protected String lastBillPaidDate;
    protected String lastBillPaidAmount;
    protected SvcNoTypeDO svcNoType;
    protected String lastBillCutoffDate;
    protected String lowBillValue;
    protected String billFormat;
    protected String creditTerm;
    protected String billMedia;
    protected String invoiceID;
    protected String invoiceDt;
    protected String invoiceDueDt;
    protected AcctPaymentInfoDO acctPaymentInfo;
    protected String clientRefNo;
    protected String bankAccNo;
    protected String bankAccName;
    protected String custBankName;
    protected String deductLimit;
    protected String clearingHse;
    protected String effectiveDt;
    protected String lastModDt;
    protected String clvValue;
    protected String writeoffAmount;
    protected String unsettledWriteOffAmount;
    protected String eServInd;
    protected String billDispatchMethod;

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
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getBillAddress() {
        return billAddress;
    }

    /**
     * Sets the value of the billAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setBillAddress(AddressDO value) {
        this.billAddress = value;
    }

    /**
     * Gets the value of the billPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPeriod() {
        return billPeriod;
    }

    /**
     * Sets the value of the billPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPeriod(String value) {
        this.billPeriod = value;
    }

    /**
     * Gets the value of the newBillAddrEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBillAddrEffDt() {
        return newBillAddrEffDt;
    }

    /**
     * Sets the value of the newBillAddrEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBillAddrEffDt(String value) {
        this.newBillAddrEffDt = value;
    }

    /**
     * Gets the value of the createDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDt() {
        return createDt;
    }

    /**
     * Sets the value of the createDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDt(String value) {
        this.createDt = value;
    }

    /**
     * Gets the value of the creditCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpDt() {
        return creditCardExpDt;
    }

    /**
     * Sets the value of the creditCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpDt(String value) {
        this.creditCardExpDt = value;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the nameOnCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCreditCard() {
        return nameOnCreditCard;
    }

    /**
     * Sets the value of the nameOnCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCreditCard(String value) {
        this.nameOnCreditCard = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the vipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipcode() {
        return vipcode;
    }

    /**
     * Sets the value of the vipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipcode(String value) {
        this.vipcode = value;
    }

    /**
     * Gets the value of the lastBillPaidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillPaidDate() {
        return lastBillPaidDate;
    }

    /**
     * Sets the value of the lastBillPaidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillPaidDate(String value) {
        this.lastBillPaidDate = value;
    }

    /**
     * Gets the value of the lastBillPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillPaidAmount() {
        return lastBillPaidAmount;
    }

    /**
     * Sets the value of the lastBillPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillPaidAmount(String value) {
        this.lastBillPaidAmount = value;
    }

    /**
     * Gets the value of the svcNoType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcNoTypeDO }
     *     
     */
    public SvcNoTypeDO getSvcNoType() {
        return svcNoType;
    }

    /**
     * Sets the value of the svcNoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcNoTypeDO }
     *     
     */
    public void setSvcNoType(SvcNoTypeDO value) {
        this.svcNoType = value;
    }

    /**
     * Gets the value of the lastBillCutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillCutoffDate() {
        return lastBillCutoffDate;
    }

    /**
     * Sets the value of the lastBillCutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillCutoffDate(String value) {
        this.lastBillCutoffDate = value;
    }

    /**
     * Gets the value of the lowBillValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowBillValue() {
        return lowBillValue;
    }

    /**
     * Sets the value of the lowBillValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowBillValue(String value) {
        this.lowBillValue = value;
    }

    /**
     * Gets the value of the billFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFormat() {
        return billFormat;
    }

    /**
     * Sets the value of the billFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFormat(String value) {
        this.billFormat = value;
    }

    /**
     * Gets the value of the creditTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTerm() {
        return creditTerm;
    }

    /**
     * Sets the value of the creditTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTerm(String value) {
        this.creditTerm = value;
    }

    /**
     * Gets the value of the billMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillMedia() {
        return billMedia;
    }

    /**
     * Sets the value of the billMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillMedia(String value) {
        this.billMedia = value;
    }

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceID(String value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the invoiceDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDt() {
        return invoiceDt;
    }

    /**
     * Sets the value of the invoiceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDt(String value) {
        this.invoiceDt = value;
    }

    /**
     * Gets the value of the invoiceDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDueDt() {
        return invoiceDueDt;
    }

    /**
     * Sets the value of the invoiceDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDueDt(String value) {
        this.invoiceDueDt = value;
    }

    /**
     * Gets the value of the acctPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctPaymentInfoDO }
     *     
     */
    public AcctPaymentInfoDO getAcctPaymentInfo() {
        return acctPaymentInfo;
    }

    /**
     * Sets the value of the acctPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctPaymentInfoDO }
     *     
     */
    public void setAcctPaymentInfo(AcctPaymentInfoDO value) {
        this.acctPaymentInfo = value;
    }

    /**
     * Gets the value of the clientRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRefNo() {
        return clientRefNo;
    }

    /**
     * Sets the value of the clientRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRefNo(String value) {
        this.clientRefNo = value;
    }

    /**
     * Gets the value of the bankAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccNo() {
        return bankAccNo;
    }

    /**
     * Sets the value of the bankAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccNo(String value) {
        this.bankAccNo = value;
    }

    /**
     * Gets the value of the bankAccName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccName() {
        return bankAccName;
    }

    /**
     * Sets the value of the bankAccName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccName(String value) {
        this.bankAccName = value;
    }

    /**
     * Gets the value of the custBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustBankName() {
        return custBankName;
    }

    /**
     * Sets the value of the custBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustBankName(String value) {
        this.custBankName = value;
    }

    /**
     * Gets the value of the deductLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductLimit() {
        return deductLimit;
    }

    /**
     * Sets the value of the deductLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductLimit(String value) {
        this.deductLimit = value;
    }

    /**
     * Gets the value of the clearingHse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingHse() {
        return clearingHse;
    }

    /**
     * Sets the value of the clearingHse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingHse(String value) {
        this.clearingHse = value;
    }

    /**
     * Gets the value of the effectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDt() {
        return effectiveDt;
    }

    /**
     * Sets the value of the effectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDt(String value) {
        this.effectiveDt = value;
    }

    /**
     * Gets the value of the lastModDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModDt() {
        return lastModDt;
    }

    /**
     * Sets the value of the lastModDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModDt(String value) {
        this.lastModDt = value;
    }

    /**
     * Gets the value of the clvValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClvValue() {
        return clvValue;
    }

    /**
     * Sets the value of the clvValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClvValue(String value) {
        this.clvValue = value;
    }

    /**
     * Gets the value of the writeoffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteoffAmount() {
        return writeoffAmount;
    }

    /**
     * Sets the value of the writeoffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteoffAmount(String value) {
        this.writeoffAmount = value;
    }

    /**
     * Gets the value of the unsettledWriteOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsettledWriteOffAmount() {
        return unsettledWriteOffAmount;
    }

    /**
     * Sets the value of the unsettledWriteOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsettledWriteOffAmount(String value) {
        this.unsettledWriteOffAmount = value;
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

    /**
     * Gets the value of the billDispatchMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDispatchMethod() {
        return billDispatchMethod;
    }

    /**
     * Sets the value of the billDispatchMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDispatchMethod(String value) {
        this.billDispatchMethod = value;
    }

}
