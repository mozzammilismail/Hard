
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractRelocationRequestDtlsDO;


/**
 * <p>Java class for BPMRelocationRequestDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMRelocationRequestDtlsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractRelocationRequestDtlsDO">
 *       &lt;sequence>
 *         &lt;element name="bpmRelocationDtlsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcInst" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcInstHasDO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMRelocationRequestDtlsDO
    extends AbstractRelocationRequestDtlsDO
    implements Serializable
{

    protected String bpmRelocationDtlsID;
    protected BPMSvcInstHasDO svcInst;

    /**
     * Gets the value of the bpmRelocationDtlsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmRelocationDtlsID() {
        return bpmRelocationDtlsID;
    }

    /**
     * Sets the value of the bpmRelocationDtlsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmRelocationDtlsID(String value) {
        this.bpmRelocationDtlsID = value;
    }

    /**
     * Gets the value of the svcInst property.
     * 
     * @return
     *     possible object is
     *     {@link BPMSvcInstHasDO }
     *     
     */
    public BPMSvcInstHasDO getSvcInst() {
        return svcInst;
    }

    /**
     * Sets the value of the svcInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMSvcInstHasDO }
     *     
     */
    public void setSvcInst(BPMSvcInstHasDO value) {
        this.svcInst = value;
    }

}
