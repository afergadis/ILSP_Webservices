
package gr.ilsp.nlp.webservices.ilsp_chunker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunAndWaitForResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RunAndWaitForResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soaplab.org/ilsp_chunker}appResults">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunAndWaitForResponse", namespace = "http://soaplab.org/ilsp_chunker")
public class RunAndWaitForResponse
        extends AppResults {


}
