package com.secure.design.usaddress

import spock.lang.Specification

class Zip4Test extends Specification {

    def "check zip4 doesn't allow null"() {
        when:
        Zip4 zip4 = new Zip4(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'zip4 cannot be null'
        zip4 == null
    }
}
