
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractSvcInstPrdtDO;


/**
 * <p>Java class for BPMSvcInstPrdtDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSvcInstPrdtDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractSvcInstPrdtDO">
 *       &lt;sequence>
 *         &lt;element name="svcPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtWantsDO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMSvcInstPrdtDO
    extends AbstractSvcInstPrdtDO
    implements Serializable
{

    protected BPMSvcPdtWantsDO svcPdtInfo;

    /**
     * Gets the value of the svcPdtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMSvcPdtWantsDO }
     *     
     */
    public BPMSvcPdtWantsDO getSvcPdtInfo() {
        return svcPdtInfo;
    }

    /**
     * Sets the value of the svcPdtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMSvcPdtWantsDO }
     *     
     */
    public void setSvcPdtInfo(BPMSvcPdtWantsDO value) {
        this.svcPdtInfo = value;
    }

}
