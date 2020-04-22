
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractNominationRequestDO;


/**
 * <p>Java class for BPMNominationRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNominationRequestDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractNominationRequestDO">
 *       &lt;sequence>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmNominationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmNominationRequestDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNominationRequestDtlsDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMNominationRequestDO
    extends AbstractNominationRequestDO
    implements Serializable
{

    protected String requestType;
    protected String bpmNominationID;
    protected List<BPMNominationRequestDtlsDO> bpmNominationRequestDtls;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the bpmNominationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmNominationID() {
        return bpmNominationID;
    }

    /**
     * Sets the value of the bpmNominationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmNominationID(String value) {
        this.bpmNominationID = value;
    }

    /**
     * Gets the value of the bpmNominationRequestDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpmNominationRequestDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBpmNominationRequestDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNominationRequestDtlsDO }
     * 
     * 
     */
    public List<BPMNominationRequestDtlsDO> getBpmNominationRequestDtls() {
        if (bpmNominationRequestDtls == null) {
            bpmNominationRequestDtls = new ArrayList<BPMNominationRequestDtlsDO>();
        }
        return this.bpmNominationRequestDtls;
    }

}
