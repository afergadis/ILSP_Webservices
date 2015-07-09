
package gr.ilsp.nlp.webservices.ilsp_nlp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getSomeResultsRequest complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="getSomeResultsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://soaplab.org/typedws}jobId"/>
 *         &lt;element name="resultName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSomeResultsRequest", propOrder = {
        "jobId",
        "resultName"
})
public class GetSomeResultsRequest {

    @XmlElement(required = true)
    protected JobId jobId;
    @XmlElement(required = true)
    protected List<String> resultName;

    /**
     * Gets the value of the jobId property.
     *
     * @return possible object is
     * {@link JobId }
     */
    public JobId getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     *
     * @param value allowed object is
     *              {@link JobId }
     */
    public void setJobId(JobId value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the resultName property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultName property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultName().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getResultName() {
        if (resultName == null) {
            resultName = new ArrayList<String>();
        }
        return this.resultName;
    }

}
