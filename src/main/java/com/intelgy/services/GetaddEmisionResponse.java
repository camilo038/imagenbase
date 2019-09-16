
package com.intelgy.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getaddEmisionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getaddEmisionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fueprocesado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="msjerror" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getaddEmisionResponse", propOrder = {
    "fueprocesado",
    "msjerror"
})
public class GetaddEmisionResponse {

    protected Boolean fueprocesado;
    protected String msjerror;

    /**
     * Obtiene el valor de la propiedad fueprocesado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFueprocesado() {
        return fueprocesado;
    }

    /**
     * Define el valor de la propiedad fueprocesado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFueprocesado(Boolean value) {
        this.fueprocesado = value;
    }

    /**
     * Obtiene el valor de la propiedad msjerror.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjerror() {
        return msjerror;
    }

    /**
     * Define el valor de la propiedad msjerror.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjerror(String value) {
        this.msjerror = value;
    }

}
