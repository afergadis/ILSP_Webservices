
package gr.ilsp.nlp.webservices.ilsp_chunker;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for appInputs complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="appInputs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="input_direct_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="input_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="language">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="el"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InputType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="xmicas"/>
 *               &lt;enumeration value="xceslemma"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutputType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="xmicas"/>
 *               &lt;enumeration value="gatexml"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="inputIsURLlist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appInputs", namespace = "http://soaplab.org/ilsp_chunker", propOrder = {
        "inputDirectData",
        "inputUrl",
        "language",
        "inputType",
        "outputType",
        "inputIsURLlist"
})
@XmlSeeAlso({
        RunAndWaitFor.class
})
public class AppInputs {

    @XmlElement(name = "input_direct_data")
    protected String inputDirectData;
    @XmlElement(name = "input_url")
    protected String inputUrl;
    @XmlElement(required = true)
    protected String language;
    @XmlElement(name = "InputType", defaultValue = "xmicas")
    protected String inputType;
    @XmlElement(name = "OutputType", defaultValue = "xmicas")
    protected String outputType;
    @XmlElement(defaultValue = "false")
    protected Boolean inputIsURLlist;

    /**
     * Gets the value of the inputDirectData property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInputDirectData() {
        return inputDirectData;
    }

    /**
     * Sets the value of the inputDirectData property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInputDirectData(String value) {
        this.inputDirectData = value;
    }

    /**
     * Gets the value of the inputUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInputUrl() {
        return inputUrl;
    }

    /**
     * Sets the value of the inputUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInputUrl(String value) {
        this.inputUrl = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the inputType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * Sets the value of the inputType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInputType(String value) {
        this.inputType = value;
    }

    /**
     * Gets the value of the outputType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOutputType(String value) {
        this.outputType = value;
    }

    /**
     * Gets the value of the inputIsURLlist property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isInputIsURLlist() {
        return inputIsURLlist;
    }

    /**
     * Sets the value of the inputIsURLlist property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setInputIsURLlist(Boolean value) {
        this.inputIsURLlist = value;
    }

}
