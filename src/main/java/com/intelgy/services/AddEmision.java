
package com.intelgy.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addEmision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addEmision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensajefusesoap"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
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
@XmlType(name = "addEmision", propOrder = {
    "mensajefusesoap"
})
public class AddEmision {

    @XmlElement(required = true)
    protected String mensajefusesoap;

    /**
     * Obtiene el valor de la propiedad mensajefusesoap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajefusesoap() {
        return mensajefusesoap;
    }

    /**
     * Define el valor de la propiedad mensajefusesoap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajefusesoap(String value) {
        this.mensajefusesoap = value;
    }

}
