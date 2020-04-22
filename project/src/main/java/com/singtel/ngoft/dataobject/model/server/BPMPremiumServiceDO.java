
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractPremiumServiceDO;


/**
 * <p>Java class for BPMPremiumServiceDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMPremiumServiceDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractPremiumServiceDO">
 *       &lt;sequence>
 *         &lt;element name="premiumPackage" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMPremiumPackageDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMPremiumServiceDO
    extends AbstractPremiumServiceDO
    implements Serializable
{

    protected List<BPMPremiumPackageDO> premiumPackage;

    /**
     * Gets the value of the premiumPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMPremiumPackageDO }
     * 
     * 
     */
    public List<BPMPremiumPackageDO> getPremiumPackage() {
        if (premiumPackage == null) {
            premiumPackage = new ArrayList<BPMPremiumPackageDO>();
        }
        return this.premiumPackage;
    }

}
