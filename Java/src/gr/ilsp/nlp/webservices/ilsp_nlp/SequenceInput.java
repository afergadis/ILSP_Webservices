
package gr.ilsp.nlp.webservices.ilsp_nlp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Common sequence input type for EMBOSS
 * <p/>
 * <p/>
 * <p>Java class for sequenceInput complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="sequenceInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="direct_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="usa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="sformat" type="{http://emboss.org/common}SequenceFormat" minOccurs="0"/>
 *         &lt;element name="sbegin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="send" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sprotein" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="snucleotide" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sreverse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="slower" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sequenceInput", namespace = "http://emboss.org/common", propOrder = {
        "directData",
        "usa",
        "sformat",
        "sbegin",
        "send",
        "sprotein",
        "snucleotide",
        "sreverse",
        "slower",
        "supper"
})
public class SequenceInput {

    @XmlElement(name = "direct_data")
    protected String directData;
    protected String usa;
    protected SequenceFormat sformat;
    protected Integer sbegin;
    protected Integer send;
    protected Boolean sprotein;
    protected Boolean snucleotide;
    protected Boolean sreverse;
    protected Boolean slower;
    protected Boolean supper;

    /**
     * Gets the value of the directData property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDirectData() {
        return directData;
    }

    /**
     * Sets the value of the directData property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDirectData(String value) {
        this.directData = value;
    }

    /**
     * Gets the value of the usa property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsa() {
        return usa;
    }

    /**
     * Sets the value of the usa property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsa(String value) {
        this.usa = value;
    }

    /**
     * Gets the value of the sformat property.
     *
     * @return possible object is
     * {@link SequenceFormat }
     */
    public SequenceFormat getSformat() {
        return sformat;
    }

    /**
     * Sets the value of the sformat property.
     *
     * @param value allowed object is
     *              {@link SequenceFormat }
     */
    public void setSformat(SequenceFormat value) {
        this.sformat = value;
    }

    /**
     * Gets the value of the sbegin property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSbegin() {
        return sbegin;
    }

    /**
     * Sets the value of the sbegin property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setSbegin(Integer value) {
        this.sbegin = value;
    }

    /**
     * Gets the value of the send property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSend() {
        return send;
    }

    /**
     * Sets the value of the send property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setSend(Integer value) {
        this.send = value;
    }

    /**
     * Gets the value of the sprotein property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSprotein() {
        return sprotein;
    }

    /**
     * Sets the value of the sprotein property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSprotein(Boolean value) {
        this.sprotein = value;
    }

    /**
     * Gets the value of the snucleotide property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSnucleotide() {
        return snucleotide;
    }

    /**
     * Sets the value of the snucleotide property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSnucleotide(Boolean value) {
        this.snucleotide = value;
    }

    /**
     * Gets the value of the sreverse property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSreverse() {
        return sreverse;
    }

    /**
     * Sets the value of the sreverse property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSreverse(Boolean value) {
        this.sreverse = value;
    }

    /**
     * Gets the value of the slower property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSlower() {
        return slower;
    }

    /**
     * Sets the value of the slower property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSlower(Boolean value) {
        this.slower = value;
    }

    /**
     * Gets the value of the supper property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSupper() {
        return supper;
    }

    /**
     * Sets the value of the supper property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSupper(Boolean value) {
        this.supper = value;
    }

}
