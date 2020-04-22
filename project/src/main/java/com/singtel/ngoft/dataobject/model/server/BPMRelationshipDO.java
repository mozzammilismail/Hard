
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractRelationshipDO;


/**
 * <p>Java class for BPMRelationshipDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMRelationshipDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractRelationshipDO">
 *       &lt;sequence>
 *         &lt;element name="blackListInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blackListReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustomerWantsDO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMRelationshipDO
    extends AbstractRelationshipDO
    implements Serializable
{

    protected String blackListInd;
    protected String blackListReason;
    protected String actionCode;
    protected BPMCustomerWantsDO customerInfo;

    /**
     * Gets the value of the blackListInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackListInd() {
        return blackListInd;
    }

    /**
     * Sets the value of the blackListInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackListInd(String value) {
        this.blackListInd = value;
    }

    /**
     * Gets the value of the blackListReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackListReason() {
        return blackListReason;
    }

    /**
     * Sets the value of the blackListReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackListReason(String value) {
        this.blackListReason = value;
    }

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
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustomerWantsDO }
     *     
     */
    public BPMCustomerWantsDO getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustomerWantsDO }
     *     
     */
    public void setCustomerInfo(BPMCustomerWantsDO value) {
        this.customerInfo = value;
    }

}
