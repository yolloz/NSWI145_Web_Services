
package org.example.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.1
 * Wed Mar 23 19:58:11 CET 2022
 * Generated source version: 3.5.1
 */

@XmlRootElement(name = "updateVehicle", namespace = "http://example.org")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateVehicle", namespace = "http://example.org")

public class UpdateVehicle {

    @XmlElement(name = "arg0")
    private org.example.RegistrationRequest arg0;

    public org.example.RegistrationRequest getArg0() {
        return this.arg0;
    }

    public void setArg0(org.example.RegistrationRequest newArg0)  {
        this.arg0 = newArg0;
    }

}

