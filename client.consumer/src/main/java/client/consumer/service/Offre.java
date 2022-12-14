
package client.consumer.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chambreImageNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateDispo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://services.service.web.hotel/}hotel" minOccurs="0"/&gt;
 *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="identifiantOffre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nbrLits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", namespace = "http://services.service.web.hotel/", propOrder = {
    "chambreImageNum",
    "dateDispo",
    "hotel",
    "identifiant",
    "identifiantOffre",
    "nbrLits",
    "prix"
})
public class Offre {

    protected int chambreImageNum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDispo;
    protected Hotel hotel;
    protected int identifiant;
    protected int identifiantOffre;
    protected int nbrLits;
    protected int prix;

    /**
     * Obtient la valeur de la propriété chambreImageNum.
     * 
     */
    public int getChambreImageNum() {
        return chambreImageNum;
    }

    /**
     * Définit la valeur de la propriété chambreImageNum.
     * 
     */
    public void setChambreImageNum(int value) {
        this.chambreImageNum = value;
    }

    /**
     * Obtient la valeur de la propriété dateDispo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDispo() {
        return dateDispo;
    }

    /**
     * Définit la valeur de la propriété dateDispo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDispo(XMLGregorianCalendar value) {
        this.dateDispo = value;
    }

    /**
     * Obtient la valeur de la propriété hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Définit la valeur de la propriété hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
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
     * Obtient la valeur de la propriété identifiantOffre.
     * 
     */
    public int getIdentifiantOffre() {
        return identifiantOffre;
    }

    /**
     * Définit la valeur de la propriété identifiantOffre.
     * 
     */
    public void setIdentifiantOffre(int value) {
        this.identifiantOffre = value;
    }

    /**
     * Obtient la valeur de la propriété nbrLits.
     * 
     */
    public int getNbrLits() {
        return nbrLits;
    }

    /**
     * Définit la valeur de la propriété nbrLits.
     * 
     */
    public void setNbrLits(int value) {
        this.nbrLits = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(int value) {
        this.prix = value;
    }

}
