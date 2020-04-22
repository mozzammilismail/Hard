
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractTransferSIRequestDO;


/**
 * <p>Java class for BPMTransferSIRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMTransferSIRequestDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractTransferSIRequestDO">
 *       &lt;sequence>
 *         &lt;element name="bpmTransferSIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmTransferSIRequestDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMTransferSIRequestDtlsDO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMTransferSIRequestDO
    extends AbstractTransferSIRequestDO
    implements Serializable
{

    protected String bpmTransferSIID;
    protected List<BPMTransferSIRequestDtlsDO> bpmTransferSIRequestDtls;

    /**
     * Gets the value of the bpmTransferSIID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmTransferSIID() {
        return bpmTransferSIID;
    }

    /**
     * Sets the value of the bpmTransferSIID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmTransferSIID(String value) {
        this.bpmTransferSIID = value;
    }

    /**
     * Gets the value of the bpmTransferSIRequestDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpmTransferSIRequestDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBpmTransferSIRequestDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMTransferSIRequestDtlsDO }
     * 
     * 
     */
    public List<BPMTransferSIRequestDtlsDO> getBpmTransferSIRequestDtls() {
        if (bpmTransferSIRequestDtls == null) {
            bpmTransferSIRequestDtls = new ArrayList<BPMTransferSIRequestDtlsDO>();
        }
        return this.bpmTransferSIRequestDtls;
    }

}
