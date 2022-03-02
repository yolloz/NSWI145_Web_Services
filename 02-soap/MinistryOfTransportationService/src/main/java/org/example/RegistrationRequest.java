package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class RegistrationRequest implements Serializable {
    @XmlElement
    private String VIN;
    @XmlElement
    private String color;
    @XmlElement
    private int engineDisplacement;
    @XmlElement
    private int fuelCode;

    public String getVIN() {
        return VIN;
    }

    public String getColor() {
        return color;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public int getFuelCode() {
        return fuelCode;
    }
}
