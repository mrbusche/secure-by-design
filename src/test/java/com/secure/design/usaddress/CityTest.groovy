package com.secure.design.usaddress

import spock.lang.Specification

class CityTest extends Specification {

    def "check city doesn't allow null"() {
        when:
        City city = new City(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'city cannot be null'
        city == null
    }
}
