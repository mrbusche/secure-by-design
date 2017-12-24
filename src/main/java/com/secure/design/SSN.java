package com.secure.design;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class SSN {
    private final String ssn;

    SSN(final String ssn) {
        notNull(ssn, "ssn cannot be null");
        isTrue(ssn.length() == 9, "ssn must be 9 numeric characters");
        isTrue(ssn.matches("\\d+"), "ssn must be 9 numeric characters");
        this.ssn = ssn;
    }
}
