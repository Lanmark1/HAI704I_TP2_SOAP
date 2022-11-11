
package client.consumer.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour agence complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="agence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motdepasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotelsPartenaires" type="{http://services.service.web.hotel/}hotel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agence", namespace = "http://services.service.web.hotel/", propOrder = {
    "identifiant",
    "login",
    "motdepasse",
    "hotelsPartenaires"
})
public class Agence {

    protected int identifiant;
    protected String login;
    protected String motdepasse;
    @XmlElement(nillable = true)
    protected List<Hotel> hotelsPartenaires;

    /**
     * Obtient la valeur de la propriété identifiant.
     * 
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * Définit la valeur de la propriété identifiant.
     * 
     */
    public void setIdentifiant(int value) {
        this.identifiant = value;
    }

    /**
     * Obtient la valeur de la propriété login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Définit la valeur de la propriété login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtient la valeur de la propriété motdepasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotdepasse() {
        return motdepasse;
    }

    /**
     * Définit la valeur de la propriété motdepasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotdepasse(String value) {
        this.motdepasse = value;
    }

    /**
     * Gets the value of the hotelsPartenaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelsPartenaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelsPartenaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hotel }
     * 
     * 
     */
    public List<Hotel> getHotelsPartenaires() {
        if (hotelsPartenaires == null) {
            hotelsPartenaires = new ArrayList<Hotel>();
        }
        return this.hotelsPartenaires;
    }

}
