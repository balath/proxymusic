
package proxymusic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>Comments from original DTD:
 * <pre>
 * A tuplet element is present when a tuplet is to be
 * displayed graphically, in addition to the sound data
 * provided by the time-modification elements. The number
 * attribute is used to distinguish nested tuplets. The
 * bracket attribute is used to indicate the presence of a
 * bracket. If unspecified, the results are implementation-
 * dependent. The line-shape attribute is used to specify
 * whether the bracket is straight or in the older curved
 * or slurred style. It is straight by default.
 * 
 * Whereas a time-modification element shows how the
 * cumulative, sounding effect of tuplets compare to
 * the written note type, the tuplet element describes
 * how this is displayed. The tuplet-actual and
 * tuplet-normal elements provide optional full control
 * over tuplet specifications. Each allows the number
 * and note type (including dots) describing a single
 * tuplet. If any of these elements are absent, their
 * values are based on the time-modification element.
 * 
 * The show-number attribute is used to display either
 * the number of actual notes, the number of both actual
 * and normal notes, or neither. It is actual by default.
 * The show-type attribute is used to display either the
 * actual type, both the actual and normal types, or
 * neither. It is none by default.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}tuplet-actual" minOccurs="0"/>
 *         &lt;element ref="{}tuplet-normal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}position"/>
 *       &lt;attGroup ref="{}line-shape"/>
 *       &lt;attGroup ref="{}placement"/>
 *       &lt;attribute name="bracket">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="number">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="6"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="show-number">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="actual"/>
 *             &lt;enumeration value="both"/>
 *             &lt;enumeration value="none"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="show-type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="actual"/>
 *             &lt;enumeration value="both"/>
 *             &lt;enumeration value="none"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="start"/>
 *             &lt;enumeration value="stop"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tupletActual",
    "tupletNormal"
})
@XmlRootElement(name = "tuplet")
public class Tuplet {

    @XmlElement(name = "tuplet-actual")
    protected TupletActual tupletActual;
    @XmlElement(name = "tuplet-normal")
    protected TupletNormal tupletNormal;
    @XmlAttribute
    protected java.lang.String bracket;
    @XmlAttribute
    protected java.lang.String number;
    @XmlAttribute(name = "show-number")
    protected java.lang.String showNumber;
    @XmlAttribute(name = "show-type")
    protected java.lang.String showType;
    @XmlAttribute(required = true)
    protected java.lang.String type;
    @XmlAttribute(name = "default-x")
    protected java.lang.String defaultX;
    @XmlAttribute(name = "default-y")
    protected java.lang.String defaultY;
    @XmlAttribute(name = "relative-x")
    protected java.lang.String relativeX;
    @XmlAttribute(name = "relative-y")
    protected java.lang.String relativeY;
    @XmlAttribute(name = "line-shape")
    protected java.lang.String lineShape;
    @XmlAttribute
    protected java.lang.String placement;

    /**
     * Gets the value of the tupletActual property.
     * 
     * @return
     *     possible object is
     *     {@link TupletActual }
     *     
     */
    public TupletActual getTupletActual() {
        return tupletActual;
    }

    /**
     * Sets the value of the tupletActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletActual }
     *     
     */
    public void setTupletActual(TupletActual value) {
        this.tupletActual = value;
    }

    /**
     * Gets the value of the tupletNormal property.
     * 
     * @return
     *     possible object is
     *     {@link TupletNormal }
     *     
     */
    public TupletNormal getTupletNormal() {
        return tupletNormal;
    }

    /**
     * Sets the value of the tupletNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletNormal }
     *     
     */
    public void setTupletNormal(TupletNormal value) {
        this.tupletNormal = value;
    }

    /**
     * Gets the value of the bracket property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBracket() {
        return bracket;
    }

    /**
     * Sets the value of the bracket property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBracket(java.lang.String value) {
        this.bracket = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNumber(java.lang.String value) {
        this.number = value;
    }

    /**
     * Gets the value of the showNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getShowNumber() {
        return showNumber;
    }

    /**
     * Sets the value of the showNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setShowNumber(java.lang.String value) {
        this.showNumber = value;
    }

    /**
     * Gets the value of the showType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getShowType() {
        return showType;
    }

    /**
     * Sets the value of the showType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setShowType(java.lang.String value) {
        this.showType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

    /**
     * Gets the value of the defaultX property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDefaultX() {
        return defaultX;
    }

    /**
     * Sets the value of the defaultX property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDefaultX(java.lang.String value) {
        this.defaultX = value;
    }

    /**
     * Gets the value of the defaultY property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDefaultY() {
        return defaultY;
    }

    /**
     * Sets the value of the defaultY property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDefaultY(java.lang.String value) {
        this.defaultY = value;
    }

    /**
     * Gets the value of the relativeX property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRelativeX() {
        return relativeX;
    }

    /**
     * Sets the value of the relativeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRelativeX(java.lang.String value) {
        this.relativeX = value;
    }

    /**
     * Gets the value of the relativeY property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRelativeY() {
        return relativeY;
    }

    /**
     * Sets the value of the relativeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRelativeY(java.lang.String value) {
        this.relativeY = value;
    }

    /**
     * Gets the value of the lineShape property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLineShape() {
        return lineShape;
    }

    /**
     * Sets the value of the lineShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLineShape(java.lang.String value) {
        this.lineShape = value;
    }

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPlacement(java.lang.String value) {
        this.placement = value;
    }

}
