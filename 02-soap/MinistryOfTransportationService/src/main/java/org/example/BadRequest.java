package org.example;

public class BadRequest extends  Exception {
    public BadRequest() {
        super("Bad request.");
    }
}
