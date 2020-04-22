
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMDepositDO;


/**
 * <p>Java class for AbstractDepositDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractDepositDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymtAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymtDtls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AbstractDepositDO
    implements Serializable
{

    protected String billNo;
    protected String paymtAmt;
    protected String paymtDtls;
    protected String paymtDt;

    /**
     * Gets the value of the billNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * Sets the value of the billNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * Gets the value of the paymtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymtAmt() {
        return paymtAmt;
    }

    /**
     * Sets the value of the paymtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymtAmt(String value) {
        this.paymtAmt = value;
    }

    /**
     * Gets the value of the paymtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymtDtls() {
        return paymtDtls;
    }

    /**
     * Sets the value of the paymtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymtDtls(String value) {
        this.paymtDtls = value;
    }

    /**
     * Gets the value of the paymtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymtDt() {
        return paymtDt;
    }

    /**
     * Sets the value of the paymtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymtDt(String value) {
        this.paymtDt = value;
    }

}
