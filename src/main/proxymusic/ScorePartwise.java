
package proxymusic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}work" minOccurs="0"/>
 *           &lt;element ref="{}movement-number" minOccurs="0"/>
 *           &lt;element ref="{}movement-title" minOccurs="0"/>
 *           &lt;element ref="{}identification" minOccurs="0"/>
 *           &lt;element ref="{}defaults" minOccurs="0"/>
 *           &lt;element ref="{}credit" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}part-list"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}part" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "work",
    "movementNumber",
    "movementTitle",
    "identification",
    "defaults",
    "credit",
    "partList",
    "part"
})
@XmlRootElement(name = "score-partwise")
public class ScorePartwise {

    protected Work work;
    @XmlElement(name = "movement-number")
    protected MovementNumber movementNumber;
    @XmlElement(name = "movement-title")
    protected MovementTitle movementTitle;
    protected Identification identification;
    protected Defaults defaults;
    protected List<Credit> credit;
    @XmlElement(name = "part-list", required = true)
    protected PartList partList;
    @XmlElement(required = true)
    protected List<Part> part;
    @XmlAttribute
    protected java.lang.String version;

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWork(Work value) {
        this.work = value;
    }

    /**
     * Gets the value of the movementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MovementNumber }
     *     
     */
    public MovementNumber getMovementNumber() {
        return movementNumber;
    }

    /**
     * Sets the value of the movementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementNumber }
     *     
     */
    public void setMovementNumber(MovementNumber value) {
        this.movementNumber = value;
    }

    /**
     * Gets the value of the movementTitle property.
     * 
     * @return
     *     possible object is
     *     {@link MovementTitle }
     *     
     */
    public MovementTitle getMovementTitle() {
        return movementTitle;
    }

    /**
     * Sets the value of the movementTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementTitle }
     *     
     */
    public void setMovementTitle(MovementTitle value) {
        this.movementTitle = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link Defaults }
     *     
     */
    public Defaults getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Defaults }
     *     
     */
    public void setDefaults(Defaults value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credit }
     * 
     * 
     */
    public List<Credit> getCredit() {
        if (credit == null) {
            credit = new ArrayList<Credit>();
        }
        return this.credit;
    }

    /**
     * Gets the value of the partList property.
     * 
     * @return
     *     possible object is
     *     {@link PartList }
     *     
     */
    public PartList getPartList() {
        return partList;
    }

    /**
     * Sets the value of the partList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartList }
     *     
     */
    public void setPartList(PartList value) {
        this.partList = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }

}
