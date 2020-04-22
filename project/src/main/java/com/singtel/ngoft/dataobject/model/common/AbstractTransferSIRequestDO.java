
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMTransferSIRequestDO;


/**
 * <p>Java class for AbstractTransferSIRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractTransferSIRequestDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferEftDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetAcctId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetSvcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetSvcNoType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractTransferSIRequestDO
    implements Serializable
{

    protected String applyDate;
    protected String transferEftDt;
    protected String targetAcctId;
    protected String targetSvcNo;
    protected String targetSvcNoType;

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDate(String value) {
        this.applyDate = value;
    }

    /**
     * Gets the value of the transferEftDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEftDt() {
        return transferEftDt;
    }

    /**
     * Sets the value of the transferEftDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferEftDt(String value) {
        this.transferEftDt = value;
    }

    /**
     * Gets the value of the targetAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAcctId() {
        return targetAcctId;
    }

    /**
     * Sets the value of the targetAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAcctId(String value) {
        this.targetAcctId = value;
    }

    /**
     * Gets the value of the targetSvcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSvcNo() {
        return targetSvcNo;
    }

    /**
     * Sets the value of the targetSvcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSvcNo(String value) {
        this.targetSvcNo = value;
    }

    /**
     * Gets the value of the targetSvcNoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSvcNoType() {
        return targetSvcNoType;
    }

    /**
     * Sets the value of the targetSvcNoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSvcNoType(String value) {
        this.targetSvcNoType = value;
    }

}
