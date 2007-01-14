
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
 * A measure-style indicates a special way to print
 * partial to multiple measures within a part. This
 * includes multiple rests over several measures,
 * repeats of betas, single, or multiple measures,
 * and use of slash notation.
 * 
 * The multiple-rest and measure-repeat symbols
 * indicate the number of measures covered in the
 * element content. The beat-repeat and slash
 * elements can cover partial measures. All but the
 * multiple-rest element use a type attribute to
 * indicate starting and stopping the use of the
 * style. The optional number attribute specifies
 * the staff number from top to bottom on the system,
 * as with clef.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}multiple-rest"/>
 *         &lt;element ref="{}measure-repeat"/>
 *         &lt;element ref="{}beat-repeat"/>
 *         &lt;element ref="{}slash"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attGroup ref="{}font"/>
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multipleRest",
    "measureRepeat",
    "beatRepeat",
    "slash"
})
@XmlRootElement(name = "measure-style")
public class MeasureStyle {

    @XmlElement(name = "multiple-rest")
    protected MultipleRest multipleRest;
    @XmlElement(name = "measure-repeat")
    protected MeasureRepeat measureRepeat;
    @XmlElement(name = "beat-repeat")
    protected BeatRepeat beatRepeat;
    protected Slash slash;
    @XmlAttribute
    protected java.lang.String number;
    @XmlAttribute
    protected java.lang.String color;
    @XmlAttribute(name = "font-family")
    protected java.lang.String fontFamily;
    @XmlAttribute(name = "font-size")
    protected java.lang.String fontSize;
    @XmlAttribute(name = "font-style")
    protected java.lang.String fontStyle;
    @XmlAttribute(name = "font-weight")
    protected java.lang.String fontWeight;

    /**
     * Gets the value of the multipleRest property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleRest }
     *     
     */
    public MultipleRest getMultipleRest() {
        return multipleRest;
    }

    /**
     * Sets the value of the multipleRest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleRest }
     *     
     */
    public void setMultipleRest(MultipleRest value) {
        this.multipleRest = value;
    }

    /**
     * Gets the value of the measureRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureRepeat }
     *     
     */
    public MeasureRepeat getMeasureRepeat() {
        return measureRepeat;
    }

    /**
     * Sets the value of the measureRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureRepeat }
     *     
     */
    public void setMeasureRepeat(MeasureRepeat value) {
        this.measureRepeat = value;
    }

    /**
     * Gets the value of the beatRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link BeatRepeat }
     *     
     */
    public BeatRepeat getBeatRepeat() {
        return beatRepeat;
    }

    /**
     * Sets the value of the beatRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeatRepeat }
     *     
     */
    public void setBeatRepeat(BeatRepeat value) {
        this.beatRepeat = value;
    }

    /**
     * Gets the value of the slash property.
     * 
     * @return
     *     possible object is
     *     {@link Slash }
     *     
     */
    public Slash getSlash() {
        return slash;
    }

    /**
     * Sets the value of the slash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slash }
     *     
     */
    public void setSlash(Slash value) {
        this.slash = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setColor(java.lang.String value) {
        this.color = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontFamily(java.lang.String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontSize(java.lang.String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontStyle(java.lang.String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontWeight(java.lang.String value) {
        this.fontWeight = value;
    }

}
