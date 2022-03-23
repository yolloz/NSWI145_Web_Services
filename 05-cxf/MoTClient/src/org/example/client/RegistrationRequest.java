
package org.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineDisplacement" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fuelCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationRequest", propOrder = {
    "vin",
    "color",
    "engineDisplacement",
    "fuelCode"
})
public class RegistrationRequest {

    @XmlElement(name = "VIN")
    protected String vin;
    protected String color;
    protected int engineDisplacement;
    protected int fuelCode;

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the engineDisplacement property.
     * 
     */
    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    /**
     * Sets the value of the engineDisplacement property.
     * 
     */
    public void setEngineDisplacement(int value) {
        this.engineDisplacement = value;
    }

    /**
     * Gets the value of the fuelCode property.
     * 
     */
    public int getFuelCode() {
        return fuelCode;
    }

    /**
     * Sets the value of the fuelCode property.
     * 
     */
    public void setFuelCode(int value) {
        this.fuelCode = value;
    }

}
