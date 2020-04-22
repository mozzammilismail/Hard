
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMCustWantsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMCustWantsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustomerWantsDO"/>
 *         &lt;element name="account" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAccountWantsDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderRequest" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMOrderRequestWantsDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMCustWantsDO
    implements Serializable
{

    protected BPMCustomerWantsDO customer;
    protected List<BPMAccountWantsDO> account;
    protected List<BPMOrderRequestWantsDO> orderRequest;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustomerWantsDO }
     *     
     */
    public BPMCustomerWantsDO getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustomerWantsDO }
     *     
     */
    public void setCustomer(BPMCustomerWantsDO value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMAccountWantsDO }
     * 
     * 
     */
    public List<BPMAccountWantsDO> getAccount() {
        if (account == null) {
            account = new ArrayList<BPMAccountWantsDO>();
        }
        return this.account;
    }

    /**
     * Gets the value of the orderRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMOrderRequestWantsDO }
     * 
     * 
     */
    public List<BPMOrderRequestWantsDO> getOrderRequest() {
        if (orderRequest == null) {
            orderRequest = new ArrayList<BPMOrderRequestWantsDO>();
        }
        return this.orderRequest;
    }
    
    
    public void setAccount(List<BPMAccountWantsDO> account) {
		this.account = account;
	}


}
