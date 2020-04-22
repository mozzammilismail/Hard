
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMMNPTicketQueueQuotaDO;


/**
 * <p>Java class for AbstractMNPTicketQueueQuotaDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMNPTicketQueueQuotaDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotaListDonor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractMNPTicketQueueQuotaDO
    implements Serializable
{

    protected String quotaListDonor;

    /**
     * Gets the value of the quotaListDonor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaListDonor() {
        return quotaListDonor;
    }

    /**
     * Sets the value of the quotaListDonor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaListDonor(String value) {
        this.quotaListDonor = value;
    }

}
