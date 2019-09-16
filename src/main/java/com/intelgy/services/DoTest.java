
package com.intelgy.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para doTest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="doTest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="testInput" type="{http://services.intelgy.com/}addEmision"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doTest", propOrder = {
    "testInput"
})
public class DoTest {

    @XmlElement(required = true)
    protected AddEmision testInput;

    /**
     * Obtiene el valor de la propiedad testInput.
     * 
     * @return
     *     possible object is
     *     {@link AddEmision }
     *     
     */
    public AddEmision getTestInput() {
        return testInput;
    }

    /**
     * Define el valor de la propiedad testInput.
     * 
     * @param value
     *     allowed object is
     *     {@link AddEmision }
     *     
     */
    public void setTestInput(AddEmision value) {
        this.testInput = value;
    }

}
