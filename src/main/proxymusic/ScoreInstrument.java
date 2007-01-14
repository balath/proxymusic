
package proxymusic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>Comments from original DTD:
 * <pre>
 * The score-instrument element allows for multiple
 * instruments per score-part. As with the score-part
 * element, each score-instrument has a required ID
 * attribute, a name, and an optional abbreviation.
 * A score-instrument element is also required if the
 * score specifies MIDI channels, banks, or programs.
 * An initial midi-instrument assignment can also
 * be made here. MusicXML software should be able to
 * automatically assign reasonable channels and
 * instruments without these elements in simple cases,
 * such as where part names match General MIDI
 * instrument names.
 * 
 * The midi-instrument element is defined in common.dtd,
 * as it can be used within both the score-part and
 * sound elements.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}instrument-name"/>
 *         &lt;element ref="{}instrument-abbreviation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "instrumentName",
    "instrumentAbbreviation"
})
@XmlRootElement(name = "score-instrument")
public class ScoreInstrument {

    @XmlElement(name = "instrument-name", required = true)
    protected InstrumentName instrumentName;
    @XmlElement(name = "instrument-abbreviation")
    protected InstrumentAbbreviation instrumentAbbreviation;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected java.lang.String id;

    /**
     * Gets the value of the instrumentName property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentName }
     *     
     */
    public InstrumentName getInstrumentName() {
        return instrumentName;
    }

    /**
     * Sets the value of the instrumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentName }
     *     
     */
    public void setInstrumentName(InstrumentName value) {
        this.instrumentName = value;
    }

    /**
     * Gets the value of the instrumentAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentAbbreviation }
     *     
     */
    public InstrumentAbbreviation getInstrumentAbbreviation() {
        return instrumentAbbreviation;
    }

    /**
     * Sets the value of the instrumentAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentAbbreviation }
     *     
     */
    public void setInstrumentAbbreviation(InstrumentAbbreviation value) {
        this.instrumentAbbreviation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
