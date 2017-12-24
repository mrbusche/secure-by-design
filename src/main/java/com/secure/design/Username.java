package com.secure.design;

import static org.apache.commons.lang3.Validate.inclusiveBetween;
import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class Username {
    private final String username;
    private final int minLength = 3;
    private final int maxLength = 20;
    private final String regEx = "^[a-zA-Z0-9._-]{3,}$";

    Username(final String username) {
        notNull(username, "Username cannot be null");
        inclusiveBetween(minLength, maxLength, username.length(), "username must be between 3 and 20 characters");
        isTrue(username.matches(regEx), "username can only contain letters, numbers, -, _ and .");
        this.username = username;
    }
}
