package com.secure.design.usaddress;

import static org.apache.commons.lang3.Validate.notNull;

public class City {
    private final String city;

    public City(final String city) {
        notNull(city, "city cannot be null");
        this.city = city;
    }
}
