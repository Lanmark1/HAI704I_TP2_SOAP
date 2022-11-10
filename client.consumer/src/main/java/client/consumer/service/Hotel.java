
package client.consumer.service;

import java.util.ArrayList; 
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Classe Java pour hotel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencePartenaires" type="{http://services.service.web.hotel/}agence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="etoiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lieudit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="listeChambres" type="{http://services.service.web.hotel/}offre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", namespace = "http://services.service.web.hotel/", propOrder = {
    "agencePartenaires",
    "etoiles",
    "latitude",
    "lieudit",
    "listeChambres",
    "longitude",
    "numero",
    "pays",
    "rue",
    "ville"
})
public class Hotel {

    @XmlElement(nillable = true)
    protected List<Agence> agencePartenaires;
    protected int etoiles;
    protected int latitude;
    protected int lieudit;
    @XmlElement(nillable = true)
    protected List<Offre> listeChambres;
    protected int longitude;
    protected int numero;
    protected String pays;
    protected String rue;
    protected String ville;

    
    public Hotel() {}
	
	public Hotel(String pays, String ville, String rue, int numero, int lieudit, int longitude, int latitude, int etoiles, ArrayList<Offre> listeChambres) {
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.numero = numero;
		this.lieudit = lieudit;
		this.longitude = longitude;
		this.latitude = latitude;
		this.etoiles = etoiles;
//		for (Offre o : listeChambres) {
////			System.out.println(o);
////			o.setHotel(this);
//		}
		
		this.listeChambres = listeChambres;
		this.agencePartenaires = new ArrayList<Agence>();
		
	}
    /**
     * Gets the value of the agencePartenaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencePartenaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencePartenaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agence }
     * 
     * 
     */
    public List<Agence> getAgencePartenaires() {
        if (agencePartenaires == null) {
            agencePartenaires = new ArrayList<Agence>();
        }
        return this.agencePartenaires;
    }

    /**
     * Obtient la valeur de la propriété etoiles.
     * 
     */
    public int getEtoiles() {
        return etoiles;
    }

    /**
     * Définit la valeur de la propriété etoiles.
     * 
     */
    public void setEtoiles(int value) {
        this.etoiles = value;
    }

    /**
     * Obtient la valeur de la propriété latitude.
     * 
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * Définit la valeur de la propriété latitude.
     * 
     */
    public void setLatitude(int value) {
        this.latitude = value;
    }

    /**
     * Obtient la valeur de la propriété lieudit.
     * 
     */
    public int getLieudit() {
        return lieudit;
    }

    /**
     * Définit la valeur de la propriété lieudit.
     * 
     */
    public void setLieudit(int value) {
        this.lieudit = value;
    }

    /**
     * Gets the value of the listeChambres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeChambres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeChambres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offre }
     * 
     * 
     */
    public List<Offre> getListeChambres() {
        if (listeChambres == null) {
            listeChambres = new ArrayList<Offre>();
        }
        return this.listeChambres;
    }

    /**
     * Obtient la valeur de la propriété longitude.
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Définit la valeur de la propriété longitude.
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
    }

    /**
     * Obtient la valeur de la propriété numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Définit la valeur de la propriété numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Définit la valeur de la propriété rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
