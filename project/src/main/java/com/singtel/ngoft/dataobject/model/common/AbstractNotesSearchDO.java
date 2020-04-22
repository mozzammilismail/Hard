
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractNotesSearchDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNotesSearchDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needOPNotesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needABNotesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needTMNotesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysdateOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractNotesSearchDO
    implements Serializable
{

    protected String acctId;
    protected String svcNo;
    protected String workOrdNo;
    protected String needOPNotesInd;
    protected String needABNotesInd;
    protected String needTMNotesInd;
    protected String sysdateOffset;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
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
     * Gets the value of the workOrdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdNo() {
        return workOrdNo;
    }

    /**
     * Sets the value of the workOrdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdNo(String value) {
        this.workOrdNo = value;
    }

    /**
     * Gets the value of the needOPNotesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedOPNotesInd() {
        return needOPNotesInd;
    }

    /**
     * Sets the value of the needOPNotesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedOPNotesInd(String value) {
        this.needOPNotesInd = value;
    }

    /**
     * Gets the value of the needABNotesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedABNotesInd() {
        return needABNotesInd;
    }

    /**
     * Sets the value of the needABNotesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedABNotesInd(String value) {
        this.needABNotesInd = value;
    }

    /**
     * Gets the value of the needTMNotesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedTMNotesInd() {
        return needTMNotesInd;
    }

    /**
     * Sets the value of the needTMNotesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedTMNotesInd(String value) {
        this.needTMNotesInd = value;
    }

    /**
     * Gets the value of the sysdateOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysdateOffset() {
        return sysdateOffset;
    }

    /**
     * Sets the value of the sysdateOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysdateOffset(String value) {
        this.sysdateOffset = value;
    }

}
