
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
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}tuning-step"/>
 *         &lt;element ref="{}tuning-alter" minOccurs="0"/>
 *         &lt;element ref="{}tuning-octave"/>
 *       &lt;/sequence>
 *       &lt;attribute name="string" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tuningStep",
    "tuningAlter",
    "tuningOctave"
})
@XmlRootElement(name = "accord")
public class Accord {

    @XmlElement(name = "tuning-step", required = true)
    protected TuningStep tuningStep;
    @XmlElement(name = "tuning-alter")
    protected TuningAlter tuningAlter;
    @XmlElement(name = "tuning-octave", required = true)
    protected TuningOctave tuningOctave;
    @XmlAttribute(required = true)
    protected java.lang.String string;

    /**
     * Gets the value of the tuningStep property.
     * 
     * @return
     *     possible object is
     *     {@link TuningStep }
     *     
     */
    public TuningStep getTuningStep() {
        return tuningStep;
    }

    /**
     * Sets the value of the tuningStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TuningStep }
     *     
     */
    public void setTuningStep(TuningStep value) {
        this.tuningStep = value;
    }

    /**
     * Gets the value of the tuningAlter property.
     * 
     * @return
     *     possible object is
     *     {@link TuningAlter }
     *     
     */
    public TuningAlter getTuningAlter() {
        return tuningAlter;
    }

    /**
     * Sets the value of the tuningAlter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TuningAlter }
     *     
     */
    public void setTuningAlter(TuningAlter value) {
        this.tuningAlter = value;
    }

    /**
     * Gets the value of the tuningOctave property.
     * 
     * @return
     *     possible object is
     *     {@link TuningOctave }
     *     
     */
    public TuningOctave getTuningOctave() {
        return tuningOctave;
    }

    /**
     * Sets the value of the tuningOctave property.
     * 
     * @param value
     *     allowed object is
     *     {@link TuningOctave }
     *     
     */
    public void setTuningOctave(TuningOctave value) {
        this.tuningOctave = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setString(java.lang.String value) {
        this.string = value;
    }

}
