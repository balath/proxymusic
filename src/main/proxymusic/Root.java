
package proxymusic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>Comments from original DTD:
 * <pre>
 * A root is a pitch name like C, D, E, where a function is
 * an indication like I, II, III. Root is generally used
 * with pop chord symbols, function with classical
 * functional harmony. It is an either/or choice to avoid
 * data inconsistency. Function requires that the key be
 * specified in the encoding. The root element has a
 * root-step and optional root-alter similar to the step
 * and alter elements in a pitch, but renamed to
 * distinguish the different musical meanings.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}root-step"/>
 *         &lt;element ref="{}root-alter" minOccurs="0"/>
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
    "rootStep",
    "rootAlter"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(name = "root-step", required = true)
    protected RootStep rootStep;
    @XmlElement(name = "root-alter")
    protected RootAlter rootAlter;

    /**
     * Gets the value of the rootStep property.
     * 
     * @return
     *     possible object is
     *     {@link RootStep }
     *     
     */
    public RootStep getRootStep() {
        return rootStep;
    }

    /**
     * Sets the value of the rootStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootStep }
     *     
     */
    public void setRootStep(RootStep value) {
        this.rootStep = value;
    }

    /**
     * Gets the value of the rootAlter property.
     * 
     * @return
     *     possible object is
     *     {@link RootAlter }
     *     
     */
    public RootAlter getRootAlter() {
        return rootAlter;
    }

    /**
     * Sets the value of the rootAlter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootAlter }
     *     
     */
    public void setRootAlter(RootAlter value) {
        this.rootAlter = value;
    }

}
