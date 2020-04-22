
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractAccountDtlsDO;


/**
 * <p>Java class for BPMAccountDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMAccountDtlsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractAccountDtlsDO">
 *       &lt;sequence>
 *         &lt;element name="pegasusAccountID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relationShip" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRelationshipDO" minOccurs="0"/>
 *         &lt;element name="copyBill" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCopyBillDO" minOccurs="0"/>
 *         &lt;element name="outstandingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billFormatOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */



public class BPMAccountDtlsDO
    extends AbstractAccountDtlsDO
    implements Serializable
{

 
    protected String pegasusAccountID;
    protected BPMRelationshipDO relationShip;
    protected BPMCopyBillDO copyBill;
    protected String outstandingBalance;
    protected String billFormatOption;

    /**
     * Gets the value of the pegasusAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusAccountID() {
        return pegasusAccountID;
    }

    /**
     * Sets the value of the pegasusAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusAccountID(String value) {
        this.pegasusAccountID = value;
    }

    /**
     * Gets the value of the relationShip property.
     * 
     * @return
     *     possible object is
     *     {@link BPMRelationshipDO }
     *     
     */
    public BPMRelationshipDO getRelationShip() {
        return relationShip;
    }

    /**
     * Sets the value of the relationShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMRelationshipDO }
     *     
     */
    public void setRelationShip(BPMRelationshipDO value) {
        this.relationShip = value;
    }

    /**
     * Gets the value of the copyBill property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCopyBillDO }
     *     
     */
    public BPMCopyBillDO getCopyBill() {
        return copyBill;
    }

    /**
     * Sets the value of the copyBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCopyBillDO }
     *     
     */
    public void setCopyBill(BPMCopyBillDO value) {
        this.copyBill = value;
    }

    /**
     * Gets the value of the outstandingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Sets the value of the outstandingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutstandingBalance(String value) {
        this.outstandingBalance = value;
    }

    /**
     * Gets the value of the billFormatOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFormatOption() {
        return billFormatOption;
    }

    /**
     * Sets the value of the billFormatOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFormatOption(String value) {
        this.billFormatOption = value;
    }

}
