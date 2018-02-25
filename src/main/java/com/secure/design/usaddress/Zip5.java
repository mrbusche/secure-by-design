package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class Zip5 {
    private final String zip5;

    public Zip5(final String zip5) {
        notNull(zip5, "zip5 cannot be null");
        isTrue(zip5.length() == 5, "zip5 must be 5 digits");
        isTrue(zip5.matches("\\d+"), "zip5 must be 5 digits");
        this.zip5 = zip5;
    }
}
