
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractMessageDO;


/**
 * <p>Java class for BPMMessageDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMMessageDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractMessageDO">
 *       &lt;sequence>
 *         &lt;element name="internalAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMMessageDtlsDO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMMessageDO
    extends AbstractMessageDO
    implements Serializable
{

    protected String internalAction;
    protected String messageId;
    protected List<BPMMessageDtlsDO> messageDtls;

    /**
     * Gets the value of the internalAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalAction() {
        return internalAction;
    }

    /**
     * Sets the value of the internalAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalAction(String value) {
        this.internalAction = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMMessageDtlsDO }
     * 
     * 
     */
    public List<BPMMessageDtlsDO> getMessageDtls() {
        if (messageDtls == null) {
            messageDtls = new ArrayList<BPMMessageDtlsDO>();
        }
        return this.messageDtls;
    }

}
