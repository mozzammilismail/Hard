
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractProdParameterDO;


/**
 * <p>Java class for BPMProdParameterDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMProdParameterDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractProdParameterDO">
 *       &lt;sequence>
 *         &lt;element name="immediateClosureInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public abstract class BPMProdParameterDO
    extends AbstractProdParameterDO
    implements Serializable
{

    protected String immediateClosureInd;
    protected String paraDesc;

    /**
     * Gets the value of the immediateClosureInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediateClosureInd() {
        return immediateClosureInd;
    }

    /**
     * Sets the value of the immediateClosureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmediateClosureInd(String value) {
        this.immediateClosureInd = value;
    }

    /**
     * Gets the value of the paraDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaDesc() {
        return paraDesc;
    }

    /**
     * Sets the value of the paraDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaDesc(String value) {
        this.paraDesc = value;
    }

}
