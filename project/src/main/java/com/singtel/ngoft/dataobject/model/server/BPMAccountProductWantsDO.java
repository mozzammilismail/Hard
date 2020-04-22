
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMAccountProductWantsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMAccountProductWantsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAccountProductDO">
 *       &lt;sequence>
 *         &lt;element name="acctPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAcctPdtWantsDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMAccountProductWantsDO
    extends BPMAccountProductDO
    implements Serializable
{

    protected List<BPMAcctPdtWantsDO> acctPdtInfo;

    /**
     * Gets the value of the acctPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMAcctPdtWantsDO }
     * s
     * 
     */
    public List<BPMAcctPdtWantsDO> getAcctPdtInfo() {
        if (acctPdtInfo == null) {
            acctPdtInfo = new ArrayList<BPMAcctPdtWantsDO>();
        }
        return this.acctPdtInfo;
    }

}
