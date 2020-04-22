
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractMNPTicketQueueQuotaDO;


/**
 * <p>Java class for BPMMNPTicketQueueQuotaDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMMNPTicketQueueQuotaDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractMNPTicketQueueQuotaDO">
 *       &lt;sequence>
 *         &lt;element name="workingDayQuotaList" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMMNPTicketQueueQuotaDtlsDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMMNPTicketQueueQuotaDO
    extends AbstractMNPTicketQueueQuotaDO
    implements Serializable
{

    protected List<BPMMNPTicketQueueQuotaDtlsDO> workingDayQuotaList;

    /**
     * Gets the value of the workingDayQuotaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingDayQuotaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingDayQuotaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMMNPTicketQueueQuotaDtlsDO }
     * 
     * 
     */
    public List<BPMMNPTicketQueueQuotaDtlsDO> getWorkingDayQuotaList() {
        if (workingDayQuotaList == null) {
            workingDayQuotaList = new ArrayList<BPMMNPTicketQueueQuotaDtlsDO>();
        }
        return this.workingDayQuotaList;
    }

}
