
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMMessageDtlsDO;


/**
 * <p>Java class for AbstractMessageDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMessageDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custIDTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraNmVal" type="{http://www.singtel.com/oft/dataobject/xsd/common}ParaDtlsDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractMessageDtlsDO
    implements Serializable
{

    protected String custAcctNo;
    protected String custIDTy;
    protected String custName;
    protected String svcNo;
    protected String svcTy;
    protected String productId;
    protected List<ParaDtlsDO> paraNmVal;

    /**
     * Gets the value of the custAcctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctNo() {
        return custAcctNo;
    }

    /**
     * Sets the value of the custAcctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctNo(String value) {
        this.custAcctNo = value;
    }

    /**
     * Gets the value of the custIDTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIDTy() {
        return custIDTy;
    }

    /**
     * Sets the value of the custIDTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIDTy(String value) {
        this.custIDTy = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
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
     * Gets the value of the svcTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTy() {
        return svcTy;
    }

    /**
     * Sets the value of the svcTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcTy(String value) {
        this.svcTy = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the paraNmVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraNmVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaNmVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParaDtlsDO }
     * 
     * 
     */
    public List<ParaDtlsDO> getParaNmVal() {
        if (paraNmVal == null) {
            paraNmVal = new ArrayList<ParaDtlsDO>();
        }
        return this.paraNmVal;
    }

}
