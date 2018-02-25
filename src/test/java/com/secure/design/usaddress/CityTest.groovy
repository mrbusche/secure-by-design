package com.secure.design.usaddress

import spock.lang.Specification
import spock.lang.Unroll

class CityTest extends Specification {

    def "check city doesn't allow null"() {
        when:
        City city = new City(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'city cannot be null'
        city == null
    }

    @Unroll
    def "check street address1 isn't blank #input"() {
        when:
        City city = new City(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        city == null
        where:
        input | errorMessage
        ' '   | 'city cannot be blank'
        '   ' | 'city cannot be blank'
        ''    | 'city cannot be blank'
    }

    @Unroll
    def "check city is valid #input"() {
        when:
        City city = new City(input)
        then:
        city.city == input
        where:
        input        | blank
        'ankeny'     | ''
        'des moines' | ''
    }
}
