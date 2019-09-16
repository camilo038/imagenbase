
package com.intelgy.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getaddEmision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getaddEmision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="testId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="mypattern"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getaddEmision", propOrder = {
    "testId"
})
public class GetaddEmision {

    @XmlElement(required = true)
    protected String testId;

    /**
     * Obtiene el valor de la propiedad testId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestId() {
        return testId;
    }

    /**
     * Define el valor de la propiedad testId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestId(String value) {
        this.testId = value;
    }

}
