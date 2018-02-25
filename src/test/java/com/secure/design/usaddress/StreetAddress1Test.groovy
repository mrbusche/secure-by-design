package com.secure.design.usaddress

import spock.lang.Specification
import spock.lang.Unroll

class StreetAddress1Test extends Specification {

    def "check Street Address 1 doesn't allow null"() {
        when:
        StreetAddress1 address1 = new StreetAddress1(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'streetAddress1 cannot be null'
        address1 == null
    }

    @Unroll
    def "check street address1 isn't blank #input"() {
        when:
        StreetAddress1 streetAddress1 = new StreetAddress1(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        streetAddress1 == null
        where:
        input | errorMessage
        ' '   | 'streetAddress1 cannot be blank'
        '   ' | 'streetAddress1 cannot be blank'
        ''    | 'streetAddress1 cannot be blank'
    }
}
