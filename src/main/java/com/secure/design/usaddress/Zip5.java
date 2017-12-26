package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.notNull;

public class Zip5 {
    private final String zip5;

    Zip5(final String zip5) {
        notNull(zip5, "zip5 cannot be null");
        this.zip5 = zip5;
    }
}
