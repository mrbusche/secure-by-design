package com.secure.design.usaddress;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.apache.commons.lang3.Validate.isTrue;
import static org.apache.commons.lang3.Validate.notNull;

public class State {
    private static final Set<String> stateList = new HashSet<>(Arrays.asList(
        "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"));
    private final String state;

    public State(final String state) {
        notNull(state, "state cannot be null");
        isTrue(state.length() == 2, "state must be a valid state abbreviation");
        isTrue(stateList.contains(state), "state must be a valid state abbreviation");
        this.state = state;
    }
}
