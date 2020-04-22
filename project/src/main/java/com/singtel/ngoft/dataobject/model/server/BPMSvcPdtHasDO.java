
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMSvcPdtHasDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSvcPdtHasDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtDO">
 *       &lt;sequence>
 *         &lt;element name="prodParameter" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMProdParameterHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="svcPdtChildInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtChildHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMSvcPdtHasDO
    extends BPMSvcPdtDO
    implements Serializable
{

    protected List<BPMProdParameterHasDO> prodParameter;
    protected List<BPMSvcPdtChildHasDO> svcPdtChildInfo;

    /**
     * Gets the value of the prodParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMProdParameterHasDO }
     * 
     * 
     */
    public List<BPMProdParameterHasDO> getProdParameter() {
        if (prodParameter == null) {
            prodParameter = new ArrayList<BPMProdParameterHasDO>();
        }
        return this.prodParameter;
    }

    /**
     * Gets the value of the svcPdtChildInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcPdtChildInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPdtChildInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMSvcPdtChildHasDO }
     * 
     * 
     */
    public List<BPMSvcPdtChildHasDO> getSvcPdtChildInfo() {
        if (svcPdtChildInfo == null) {
            svcPdtChildInfo = new ArrayList<BPMSvcPdtChildHasDO>();
        }
        return this.svcPdtChildInfo;
    }

}
