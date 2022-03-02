package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class CocResponse implements Serializable {
    @XmlElement
    public String VIN;
    @XmlElement
    public String color;
}
