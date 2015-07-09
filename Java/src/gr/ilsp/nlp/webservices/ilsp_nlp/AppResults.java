
package gr.ilsp.nlp.webservices.ilsp_nlp;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for appResults complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="appResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailed_status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="output_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="output_list" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="output_list_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="output_archive" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="output_archive_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appResults", namespace = "http://soaplab.org/ilsp_nlp", propOrder = {
        "report",
        "detailedStatus",
        "output",
        "outputUrl",
        "outputList",
        "outputListUrl",
        "outputArchive",
        "outputArchiveUrl"
})
@XmlSeeAlso({
        RunAndWaitForResponse.class
})
public class AppResults {

    protected String report;
    @XmlElement(name = "detailed_status")
    protected Long detailedStatus;
    protected String output;
    @XmlElement(name = "output_url")
    protected String outputUrl;
    @XmlElement(name = "output_list")
    protected String outputList;
    @XmlElement(name = "output_list_url")
    protected String outputListUrl;
    @XmlElement(name = "output_archive")
    protected byte[] outputArchive;
    @XmlElement(name = "output_archive_url")
    protected String outputArchiveUrl;

    /**
     * Gets the value of the report property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the detailedStatus property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * Sets the value of the detailedStatus property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDetailedStatus(Long value) {
        this.detailedStatus = value;
    }

    /**
     * Gets the value of the output property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutput(String value) {
        this.output = value;
    }

    /**
     * Gets the value of the outputUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutputUrl() {
        return outputUrl;
    }

    /**
     * Sets the value of the outputUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutputUrl(String value) {
        this.outputUrl = value;
    }

    /**
     * Gets the value of the outputList property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutputList() {
        return outputList;
    }

    /**
     * Sets the value of the outputList property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutputList(String value) {
        this.outputList = value;
    }

    /**
     * Gets the value of the outputListUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutputListUrl() {
        return outputListUrl;
    }

    /**
     * Sets the value of the outputListUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutputListUrl(String value) {
        this.outputListUrl = value;
    }

    /**
     * Gets the value of the outputArchive property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getOutputArchive() {
        return outputArchive;
    }

    /**
     * Sets the value of the outputArchive property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setOutputArchive(byte[] value) {
        this.outputArchive = value;
    }

    /**
     * Gets the value of the outputArchiveUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutputArchiveUrl() {
        return outputArchiveUrl;
    }

    /**
     * Sets the value of the outputArchiveUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutputArchiveUrl(String value) {
        this.outputArchiveUrl = value;
    }

}
