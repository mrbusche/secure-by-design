package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.notNull;

public class Zip4 {
    private final String zip4;

    Zip4(final String zip4) {
        notNull(zip4, "zip4 cannot be null");
        this.zip4 = zip4;
    }
}
