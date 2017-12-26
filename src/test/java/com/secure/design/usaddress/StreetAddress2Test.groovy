package com.secure.design.usaddress

import spock.lang.Specification
import spock.lang.Unroll

class StreetAddress2Test extends Specification {

    @Unroll
    def "check street address 2 is set #input"() {
        when:
        StreetAddress2 streetAddress2 = new StreetAddress2(input)
        then:
        streetAddress2.streetAddress2 == input
        where:
        input     | blank
        null      | ''
        ''        | ''
        'apt 250' | ''
    }
}
