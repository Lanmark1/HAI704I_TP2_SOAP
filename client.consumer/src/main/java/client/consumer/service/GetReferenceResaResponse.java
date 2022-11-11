
package client.consumer.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getReferenceResaResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getReferenceResaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReferenceResaResponse", propOrder = {
    "_return"
})
public class GetReferenceResaResponse {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     */
    public int getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     */
    public void setReturn(int value) {
        this._return = value;
    }

}
