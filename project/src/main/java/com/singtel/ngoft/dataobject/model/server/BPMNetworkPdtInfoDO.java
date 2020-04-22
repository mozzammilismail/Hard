
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMNetworkPdtInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNetworkPdtInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="immediateClosureInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nwPdtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nwPdtDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nwPdtInstId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nwPdtParaDtlsList" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNwPdtParaDtlsDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="txnPdtInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMNetworkPdtInfoDO
    implements Serializable
{

    protected String actionCode;
    protected String immediateClosureInd;
    protected String nwPdtCode;
    protected String nwPdtDescription;
    protected String nwPdtInstId;
    protected List<BPMNwPdtParaDtlsDO> nwPdtParaDtlsList;
    protected String txnPdtInd;

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
     * Gets the value of the nwPdtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwPdtCode() {
        return nwPdtCode;
    }

    /**
     * Sets the value of the nwPdtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwPdtCode(String value) {
        this.nwPdtCode = value;
    }

    /**
     * Gets the value of the nwPdtDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwPdtDescription() {
        return nwPdtDescription;
    }

    /**
     * Sets the value of the nwPdtDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwPdtDescription(String value) {
        this.nwPdtDescription = value;
    }

    /**
     * Gets the value of the nwPdtInstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwPdtInstId() {
        return nwPdtInstId;
    }

    /**
     * Sets the value of the nwPdtInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwPdtInstId(String value) {
        this.nwPdtInstId = value;
    }

    /**
     * Gets the value of the nwPdtParaDtlsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nwPdtParaDtlsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNwPdtParaDtlsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNwPdtParaDtlsDO }
     * 
     * 
     */
    public List<BPMNwPdtParaDtlsDO> getNwPdtParaDtlsList() {
        if (nwPdtParaDtlsList == null) {
            nwPdtParaDtlsList = new ArrayList<BPMNwPdtParaDtlsDO>();
        }
        return this.nwPdtParaDtlsList;
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

}
