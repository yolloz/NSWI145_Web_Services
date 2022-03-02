package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class TechnicalDataResponse implements Serializable {
    @XmlElement
    public String VIN;
    @XmlElement
    public int engineDisplacement;
    @XmlElement
    public int fuelCode;
}
