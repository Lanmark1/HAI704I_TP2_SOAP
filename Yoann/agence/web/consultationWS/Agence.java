
package agence.web.consultationWS;

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
 * &lt;complexType name="agence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelpartenaires" type="{http://services.service.web.hotel/}hotel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motdepasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agence", propOrder = {
    "hotelpartenaires",
    "identifiant",
    "login",
    "motdepasse"
})
public class Agence {

    @XmlElement(nillable = true)
    protected List<Hotel> hotelpartenaires;
    protected int identifiant;
    protected String login;
    protected String motdepasse;

    /**
     * Gets the value of the hotelpartenaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelpartenaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelpartenaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hotel }
     * 
     * 
     */
    public List<Hotel> getHotelpartenaires() {
        if (hotelpartenaires == null) {
            hotelpartenaires = new ArrayList<Hotel>();
        }
        return this.hotelpartenaires;
    }

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

}
