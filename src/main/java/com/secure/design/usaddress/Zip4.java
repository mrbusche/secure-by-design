package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class Zip4 {
    private final String zip4;

    public Zip4(final String zip4) {
        notNull(zip4, "zip4 cannot be null");
        isTrue(zip4.length() == 4, "zip4 must be 4 digits");
        isTrue(zip4.matches("\\d+"), "zip4 must be 4 digits");
        this.zip4 = zip4;
    }
}
