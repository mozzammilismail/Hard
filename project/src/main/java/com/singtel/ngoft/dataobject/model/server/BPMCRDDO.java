
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractCRDDO;


/**
 * <p>Java class for BPMCRDDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMCRDDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractCRDDO">
 *       &lt;sequence>
 *         &lt;element name="crdDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCRDDtlsDO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMCRDDO
    extends AbstractCRDDO
    implements Serializable
{

    protected List<BPMCRDDtlsDO> crdDtls;

    /**
     * Gets the value of the crdDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crdDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMCRDDtlsDO }
     * 
     * 
     */
    public List<BPMCRDDtlsDO> getCrdDtls() {
        if (crdDtls == null) {
            crdDtls = new ArrayList<BPMCRDDtlsDO>();
        }
        return this.crdDtls;
    }

}
