
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractContactDO;


/**
 * <p>Java class for BPMContactDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMContactDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractContactDO">
 *       &lt;sequence>
 *         &lt;element name="contactDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContactDtlsDO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMContactDO
    extends AbstractContactDO
    implements Serializable
{

    protected List<BPMContactDtlsDO> contactDtls;

    /**
     * Gets the value of the contactDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMContactDtlsDO }
     * 
     * 
     */
    public List<BPMContactDtlsDO> getContactDtls() {
        if (contactDtls == null) {
            contactDtls = new ArrayList<BPMContactDtlsDO>();
        }
        return this.contactDtls;
    }

}
