package com.secure.design.usaddress

import spock.lang.Specification

class Zip5Test extends Specification {

    def "check zip5 doesn't allow null"() {
        when:
        Zip5 zip5 = new Zip5(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'zip5 cannot be null'
        zip5 == null
    }
}
