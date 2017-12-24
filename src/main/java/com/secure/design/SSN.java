package com.secure.design;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class SSN {
    private final String ssn;
    private final int minLength = 3;
    private final int maxLength = 20;
    private final String regEx = "^[a-zA-Z0-9._-]{3,}$";

    SSN(final String ssn) {
        notNull(ssn, "ssn cannot be null");
        isTrue(ssn.length() == 9, "ssn must be 9 numeric characters");
        isTrue(ssn.matches("\\d+"), "ssn must be 9 numeric characters");
        this.ssn = ssn;
    }
}
