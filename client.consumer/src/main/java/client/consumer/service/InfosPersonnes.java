
package client.consumer.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour infosPersonnes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="infosPersonnes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paiement" type="{http://services.service.web.hotel/}paiement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infosPersonnes", namespace = "http://services.service.web.hotel/", propOrder = {
    "nom",
    "paiement"
})
public class InfosPersonnes {

    protected String nom;
    protected Paiement paiement;

    public InfosPersonnes() {
    	
    }
    
    public InfosPersonnes(String trim, Paiement paiement2) {
		nom = trim;
		paiement = paiement2;
	}

	/**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété paiement.
     * 
     * @return
     *     possible object is
     *     {@link Paiement }
     *     
     */
    public Paiement getPaiement() {
        return paiement;
    }

    /**
     * Définit la valeur de la propriété paiement.
     * 
     * @param value
     *     allowed object is
     *     {@link Paiement }
     *     
     */
    public void setPaiement(Paiement value) {
        this.paiement = value;
    }

}
