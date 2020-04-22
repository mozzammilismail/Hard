
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMOrderRequestHasDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMOrderRequestHasDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/server}BPMOrderRequestDO">
 *       &lt;sequence>
 *         &lt;element name="serviceDtlsInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcInstHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountProductDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAccountProductHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMOrderRequestHasDO
    extends BPMOrderRequestDO
    implements Serializable
{

    protected List<BPMSvcInstHasDO> serviceDtlsInfo;
    protected List<BPMAccountProductHasDO> accountProductDtls;

    /**
     * Gets the value of the serviceDtlsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDtlsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDtlsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMSvcInstHasDO }
     * 
     * 
     */
    public List<BPMSvcInstHasDO> getServiceDtlsInfo() {
        if (serviceDtlsInfo == null) {
            serviceDtlsInfo = new ArrayList<BPMSvcInstHasDO>();
        }
        return this.serviceDtlsInfo;
    }

    /**
     * Gets the value of the accountProductDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountProductDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountProductDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMAccountProductHasDO }
     * 
     * 
     */
    public List<BPMAccountProductHasDO> getAccountProductDtls() {
        if (accountProductDtls == null) {
            accountProductDtls = new ArrayList<BPMAccountProductHasDO>();
        }
        return this.accountProductDtls;
    }

}
