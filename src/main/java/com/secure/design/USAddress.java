package com.secure.design;

import com.secure.design.usaddress.*;

public class USAddress {
    private StreetAddress1 streetAddress1;
    private StreetAddress2 streetAddress2;
    private City city;
    private State state;
    private Zip5 zip5;
    private Zip4 zip4;

    USAddress(final StreetAddress1 streetAddress1, final StreetAddress2 streetAddress2, final City city, final State state, Zip5 zip5, Zip4 zip4) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zip5 = zip5;
        this.zip4 = zip4;
    }
}
