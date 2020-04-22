
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractApptOrderDetailsDO;


/**
 * <p>Java class for BPMApptOrderDetailsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMApptOrderDetailsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractApptOrderDetailsDO">
 *       &lt;sequence>
 *         &lt;element name="premiumService" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMPremiumServiceDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMApptOrderDetailsDO
    extends AbstractApptOrderDetailsDO
    implements Serializable
{

    protected List<BPMPremiumServiceDO> premiumService;

    /**
     * Gets the value of the premiumService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMPremiumServiceDO }
     * 
     * 
     */
    public List<BPMPremiumServiceDO> getPremiumService() {
        if (premiumService == null) {
            premiumService = new ArrayList<BPMPremiumServiceDO>();
        }
        return this.premiumService;
    }

}
