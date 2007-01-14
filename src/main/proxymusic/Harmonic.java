
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
 * The harmonic element indicates natural and artificial
 * harmonics. Natural harmonics usually notate the
 * base pitch rather than the sounding pitch. Allowing
 * the type of pitch to be specified, combined with
 * MusicXML's controls for appearance/playback
 * differences, allows both the notation and the sound
 * to be represented. Artificial harmonics can add a
 * notated touching-pitch; the pitch or fret at which
 * the string is touched lightly to produce the harmonic.
 * Artificial pinch harmonics will usually not notate
 * a touching pitch.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}natural"/>
 *           &lt;element ref="{}artificial"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}base-pitch"/>
 *           &lt;element ref="{}touching-pitch"/>
 *           &lt;element ref="{}sounding-pitch"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}placement"/>
 *       &lt;attGroup ref="{}print-style"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "natural",
    "artificial",
    "basePitch",
    "touchingPitch",
    "soundingPitch"
})
@XmlRootElement(name = "harmonic")
public class Harmonic {

    protected Natural natural;
    protected Artificial artificial;
    @XmlElement(name = "base-pitch")
    protected BasePitch basePitch;
    @XmlElement(name = "touching-pitch")
    protected TouchingPitch touchingPitch;
    @XmlElement(name = "sounding-pitch")
    protected SoundingPitch soundingPitch;
    @XmlAttribute
    protected java.lang.String placement;
    @XmlAttribute(name = "default-x")
    protected java.lang.String defaultX;
    @XmlAttribute(name = "default-y")
    protected java.lang.String defaultY;
    @XmlAttribute(name = "relative-x")
    protected java.lang.String relativeX;
    @XmlAttribute(name = "relative-y")
    protected java.lang.String relativeY;
    @XmlAttribute(name = "font-family")
    protected java.lang.String fontFamily;
    @XmlAttribute(name = "font-size")
    protected java.lang.String fontSize;
    @XmlAttribute(name = "font-style")
    protected java.lang.String fontStyle;
    @XmlAttribute(name = "font-weight")
    protected java.lang.String fontWeight;
    @XmlAttribute
    protected java.lang.String color;

    /**
     * Gets the value of the natural property.
     * 
     * @return
     *     possible object is
     *     {@link Natural }
     *     
     */
    public Natural getNatural() {
        return natural;
    }

    /**
     * Sets the value of the natural property.
     * 
     * @param value
     *     allowed object is
     *     {@link Natural }
     *     
     */
    public void setNatural(Natural value) {
        this.natural = value;
    }

    /**
     * Gets the value of the artificial property.
     * 
     * @return
     *     possible object is
     *     {@link Artificial }
     *     
     */
    public Artificial getArtificial() {
        return artificial;
    }

    /**
     * Sets the value of the artificial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Artificial }
     *     
     */
    public void setArtificial(Artificial value) {
        this.artificial = value;
    }

    /**
     * Gets the value of the basePitch property.
     * 
     * @return
     *     possible object is
     *     {@link BasePitch }
     *     
     */
    public BasePitch getBasePitch() {
        return basePitch;
    }

    /**
     * Sets the value of the basePitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePitch }
     *     
     */
    public void setBasePitch(BasePitch value) {
        this.basePitch = value;
    }

    /**
     * Gets the value of the touchingPitch property.
     * 
     * @return
     *     possible object is
     *     {@link TouchingPitch }
     *     
     */
    public TouchingPitch getTouchingPitch() {
        return touchingPitch;
    }

    /**
     * Sets the value of the touchingPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchingPitch }
     *     
     */
    public void setTouchingPitch(TouchingPitch value) {
        this.touchingPitch = value;
    }

    /**
     * Gets the value of the soundingPitch property.
     * 
     * @return
     *     possible object is
     *     {@link SoundingPitch }
     *     
     */
    public SoundingPitch getSoundingPitch() {
        return soundingPitch;
    }

    /**
     * Sets the value of the soundingPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundingPitch }
     *     
     */
    public void setSoundingPitch(SoundingPitch value) {
        this.soundingPitch = value;
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

}
