package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.notNull;

public class State {
    private final String state;

    State(final String state) {
        notNull(state, "state cannot be null");
        this.state = state;
    }
}
