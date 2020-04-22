
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractPricePlanDO;


/**
 * <p>Java class for BPMPricePlanInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMPricePlanInfoDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractPricePlanDO">
 *       &lt;sequence>
 *         &lt;element name="vasInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMVasInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ucInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMUCInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMPricePlanInfoDO
    extends AbstractPricePlanDO
    implements Serializable
{

    protected List<BPMVasInfoDO> vasInfo;
    protected List<BPMUCInfoDO> ucInfo;

    /**
     * Gets the value of the vasInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vasInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVasInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMVasInfoDO }
     * 
     * 
     */
    public List<BPMVasInfoDO> getVasInfo() {
        if (vasInfo == null) {
            vasInfo = new ArrayList<BPMVasInfoDO>();
        }
        return this.vasInfo;
    }

    /**
     * Gets the value of the ucInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMUCInfoDO }
     * 
     * 
     */
    public List<BPMUCInfoDO> getUcInfo() {
        if (ucInfo == null) {
            ucInfo = new ArrayList<BPMUCInfoDO>();
        }
        return this.ucInfo;
    }

}
