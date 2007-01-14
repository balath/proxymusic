
package proxymusic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>Comments from original DTD:
 * <pre>
 * Notations are musical notations, not XML notations.
 * Multiple notations are allowed in order to represent
 * multiple editorial levels. The set of notations will be
 * refined and expanded over time, especially to handle
 * more instrument-specific technical notations.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}footnote" minOccurs="0"/>
 *           &lt;element ref="{}level" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}tied"/>
 *           &lt;element ref="{}slur"/>
 *           &lt;element ref="{}tuplet"/>
 *           &lt;element ref="{}glissando"/>
 *           &lt;element ref="{}slide"/>
 *           &lt;element ref="{}ornaments"/>
 *           &lt;element ref="{}technical"/>
 *           &lt;element ref="{}articulations"/>
 *           &lt;element ref="{}dynamics"/>
 *           &lt;element ref="{}fermata"/>
 *           &lt;element ref="{}arpeggiate"/>
 *           &lt;element ref="{}non-arpeggiate"/>
 *           &lt;element ref="{}accidental-mark"/>
 *           &lt;element ref="{}other-notation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "footnote",
    "level",
    "tiedOrSlurOrTuplet"
})
@XmlRootElement(name = "notations")
public class Notations {

    protected Footnote footnote;
    protected Level level;
    @XmlElements({
        @XmlElement(name = "tied", type = Tied.class),
        @XmlElement(name = "non-arpeggiate", type = NonArpeggiate.class),
        @XmlElement(name = "ornaments", type = Ornaments.class),
        @XmlElement(name = "glissando", type = Glissando.class),
        @XmlElement(name = "articulations", type = Articulations.class),
        @XmlElement(name = "slur", type = Slur.class),
        @XmlElement(name = "dynamics", type = Dynamics.class),
        @XmlElement(name = "tuplet", type = Tuplet.class),
        @XmlElement(name = "fermata", type = Fermata.class),
        @XmlElement(name = "other-notation", type = OtherNotation.class),
        @XmlElement(name = "accidental-mark", type = AccidentalMark.class),
        @XmlElement(name = "slide", type = Slide.class),
        @XmlElement(name = "technical", type = Technical.class),
        @XmlElement(name = "arpeggiate", type = Arpeggiate.class)
    })
    protected List<Object> tiedOrSlurOrTuplet;

    /**
     * Gets the value of the footnote property.
     * 
     * @return
     *     possible object is
     *     {@link Footnote }
     *     
     */
    public Footnote getFootnote() {
        return footnote;
    }

    /**
     * Sets the value of the footnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Footnote }
     *     
     */
    public void setFootnote(Footnote value) {
        this.footnote = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Gets the value of the tiedOrSlurOrTuplet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiedOrSlurOrTuplet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiedOrSlurOrTuplet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tied }
     * {@link NonArpeggiate }
     * {@link Ornaments }
     * {@link Glissando }
     * {@link Articulations }
     * {@link Slur }
     * {@link Dynamics }
     * {@link Tuplet }
     * {@link Fermata }
     * {@link OtherNotation }
     * {@link AccidentalMark }
     * {@link Slide }
     * {@link Technical }
     * {@link Arpeggiate }
     * 
     * 
     */
    public List<Object> getTiedOrSlurOrTuplet() {
        if (tiedOrSlurOrTuplet == null) {
            tiedOrSlurOrTuplet = new ArrayList<Object>();
        }
        return this.tiedOrSlurOrTuplet;
    }

}
