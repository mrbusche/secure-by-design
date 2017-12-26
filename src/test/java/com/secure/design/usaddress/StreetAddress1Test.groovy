package com.secure.design.usaddress

import spock.lang.Specification

class StreetAddress1Test extends Specification {

    def "check Street Address 1 doesn't allow null"() {
        when:
        StreetAddress1 address1 = new StreetAddress1(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'streetAddress1 cannot be null'
        address1 == null
    }
}
