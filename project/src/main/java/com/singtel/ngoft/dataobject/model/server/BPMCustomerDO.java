
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractCustomerDO;


/**
 * <p>Java class for BPMCustomerDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMCustomerDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractCustomerDO">
 *       &lt;sequence>
 *         &lt;element name="customerDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustomerDtlsDO"/>
 *         &lt;element name="internalTxnType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineCount" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMLineCountDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class BPMCustomerDO
    extends AbstractCustomerDO
    implements Serializable
{

    protected BPMCustomerDtlsDO customerDtls;
    protected List<String> internalTxnType;
    protected List<BPMLineCountDO> lineCount;

    /**
     * Gets the value of the customerDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustomerDtlsDO }
     *     
     */
    public BPMCustomerDtlsDO getCustomerDtls() {
        return customerDtls;
    }

    /**
     * Sets the value of the customerDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustomerDtlsDO }
     *     
     */
    public void setCustomerDtls(BPMCustomerDtlsDO value) {
        this.customerDtls = value;
    }

    /**
     * Gets the value of the internalTxnType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalTxnType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalTxnType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternalTxnType() {
        if (internalTxnType == null) {
            internalTxnType = new ArrayList<String>();
        }
        return this.internalTxnType;
    }

    /**
     * Gets the value of the lineCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMLineCountDO }
     * 
     * 
     */
    public List<BPMLineCountDO> getLineCount() {
        if (lineCount == null) {
            lineCount = new ArrayList<BPMLineCountDO>();
        }
        return this.lineCount;
    }

}
