package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class StreetAddress1 {
    private final String streetAddress1;

    public StreetAddress1(final String streetAddress1) {
        notNull(streetAddress1, "streetAddress1 cannot be null");
        isTrue(streetAddress1.trim().length() != 0, "streetAddress1 cannot be blank");
        this.streetAddress1 = streetAddress1;
    }
}
