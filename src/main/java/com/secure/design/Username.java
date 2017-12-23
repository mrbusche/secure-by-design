package com.secure.design;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class Username {
    private final String username;

    Username(final String username) {
        notNull(username, "Username cannot be null");
        isTrue(username.length() < 20, "Username can only be 20 characters");
        this.username = username;
    }
}
