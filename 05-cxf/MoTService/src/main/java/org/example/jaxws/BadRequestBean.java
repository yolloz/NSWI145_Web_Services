
package org.example.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.1
 * Wed Mar 23 20:19:38 CET 2022
 * Generated source version: 3.5.1
 */

@XmlRootElement(name = "BadRequest", namespace = "http://example.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BadRequest", namespace = "http://example.org/")

public class BadRequestBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}
