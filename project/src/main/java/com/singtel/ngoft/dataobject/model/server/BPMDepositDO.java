
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractDepositDO;


/**
 * <p>Java class for BPMDepositDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMDepositDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractDepositDO">
 *       &lt;sequence>
 *         &lt;element name="pegasusSvcInstIDRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMDepositDO
    extends AbstractDepositDO
    implements Serializable
{

    protected String pegasusSvcInstIDRef;

    /**
     * Gets the value of the pegasusSvcInstIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusSvcInstIDRef() {
        return pegasusSvcInstIDRef;
    }

    /**
     * Sets the value of the pegasusSvcInstIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusSvcInstIDRef(String value) {
        this.pegasusSvcInstIDRef = value;
    }

}
