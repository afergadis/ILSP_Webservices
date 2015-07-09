
package gr.ilsp.nlp.webservices.ilsp_nlp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLastEventRequest complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="getLastEventRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://soaplab.org/typedws}jobId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLastEventRequest", propOrder = {
        "jobId"
})
public class GetLastEventRequest {

    @XmlElement(required = true)
    protected JobId jobId;

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

}
