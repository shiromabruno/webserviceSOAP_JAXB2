//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.04 at 11:02:23 PM BRT 
//


package service._do.info.para.namespace._do.url;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resumoDoVenc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resumoDoVenc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codVenci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valVenci" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resumoDoVenc", propOrder = {
    "codVenci",
    "valVenci"
})
public class ResumoDoVenc {

    protected String codVenci;
    protected BigDecimal valVenci;

    /**
     * Gets the value of the codVenci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVenci() {
        return codVenci;
    }

    /**
     * Sets the value of the codVenci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVenci(String value) {
        this.codVenci = value;
    }

    /**
     * Gets the value of the valVenci property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValVenci() {
        return valVenci;
    }

    /**
     * Sets the value of the valVenci property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValVenci(BigDecimal value) {
        this.valVenci = value;
    }

}
