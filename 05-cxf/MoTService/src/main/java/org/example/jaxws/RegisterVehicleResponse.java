
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

@XmlRootElement(name = "registerVehicleResponse", namespace = "http://example.org")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerVehicleResponse", namespace = "http://example.org")

public class RegisterVehicleResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

