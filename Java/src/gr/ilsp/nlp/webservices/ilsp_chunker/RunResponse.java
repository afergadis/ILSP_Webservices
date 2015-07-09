
package gr.ilsp.nlp.webservices.ilsp_chunker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="runResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runResponse", propOrder = {
        "jobId"
})
public class RunResponse {

    @XmlElement(required = true)
    protected String jobId;

    /**
     * Gets the value of the jobId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

}
