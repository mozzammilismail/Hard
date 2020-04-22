
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractCustomerDtlsDO;


/**
 * <p>Java class for BPMCustomerDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMCustomerDtlsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractCustomerDtlsDO">
 *       &lt;sequence>
 *         &lt;element name="pegasusCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institution" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMInstitutionDO" minOccurs="0"/>
 *         &lt;element name="custContact" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContactDO" minOccurs="0"/>
 *         &lt;element name="bearerInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMBearerInfo" minOccurs="0"/>
 *         &lt;element name="UENNRIC" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMUENNRICDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transferCustInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPA_Ind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMCustomerDtlsDO
    extends AbstractCustomerDtlsDO
    implements Serializable
{

    protected String pegasusCustomerID;
    protected BPMInstitutionDO institution;
    protected BPMContactDO custContact;
    protected BPMBearerInfo bearerInfo;
    protected List<BPMUENNRICDO> uennric;
    protected String transferCustInd;
    protected String ipaInd;

    /**
     * Gets the value of the pegasusCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusCustomerID() {
        return pegasusCustomerID;
    }

    /**
     * Sets the value of the pegasusCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusCustomerID(String value) {
        this.pegasusCustomerID = value;
    }

    /**
     * Gets the value of the institution property.
     * 
     * @return
     *     possible object is
     *     {@link BPMInstitutionDO }
     *     
     */
    public BPMInstitutionDO getInstitution() {
        return institution;
    }

    /**
     * Sets the value of the institution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMInstitutionDO }
     *     
     */
    public void setInstitution(BPMInstitutionDO value) {
        this.institution = value;
    }

    /**
     * Gets the value of the custContact property.
     * 
     * @return
     *     possible object is
     *     {@link BPMContactDO }
     *     
     */
    public BPMContactDO getCustContact() {
        return custContact;
    }

    /**
     * Sets the value of the custContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMContactDO }
     *     
     */
    public void setCustContact(BPMContactDO value) {
        this.custContact = value;
    }

    /**
     * Gets the value of the bearerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMBearerInfo }
     *     
     */
    public BPMBearerInfo getBearerInfo() {
        return bearerInfo;
    }

    /**
     * Sets the value of the bearerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMBearerInfo }
     *     
     */
    public void setBearerInfo(BPMBearerInfo value) {
        this.bearerInfo = value;
    }

    /**
     * Gets the value of the uennric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uennric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUENNRIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMUENNRICDO }
     * 
     * 
     */
    public List<BPMUENNRICDO> getUENNRIC() {
        if (uennric == null) {
            uennric = new ArrayList<BPMUENNRICDO>();
        }
        return this.uennric;
    }

    /**
     * Gets the value of the transferCustInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferCustInd() {
        return transferCustInd;
    }

    /**
     * Sets the value of the transferCustInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferCustInd(String value) {
        this.transferCustInd = value;
    }

    /**
     * Gets the value of the ipaInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAInd() {
        return ipaInd;
    }

    /**
     * Sets the value of the ipaInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAInd(String value) {
        this.ipaInd = value;
    }

}
