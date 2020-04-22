
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractAccountDO;


/**
 * <p>Java class for BPMAccountDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMAccountDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractAccountDO">
 *       &lt;sequence>
 *         &lt;element name="bpmInternalAccountID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalTxnType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAccountDtlsDO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMAccountDO
    extends AbstractAccountDO
    implements Serializable
{

    protected String bpmInternalAccountID;
    protected List<String> internalTxnType;
    protected BPMAccountDtlsDO accountDtls;

    /**
     * Gets the value of the bpmInternalAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmInternalAccountID() {
        return bpmInternalAccountID;
    }

    /**
     * Sets the value of the bpmInternalAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmInternalAccountID(String value) {
        this.bpmInternalAccountID = value;
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
     * Gets the value of the accountDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BPMAccountDtlsDO }
     *     
     */
    public BPMAccountDtlsDO getAccountDtls() {
        return accountDtls;
    }

    /**
     * Sets the value of the accountDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMAccountDtlsDO }
     *     
     */
    public void setAccountDtls(BPMAccountDtlsDO value) {
        this.accountDtls = value;
    }

}
