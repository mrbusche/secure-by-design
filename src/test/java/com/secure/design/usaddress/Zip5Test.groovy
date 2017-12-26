package com.secure.design.usaddress

import spock.lang.Specification
import spock.lang.Unroll

class Zip5Test extends Specification {

    def "check zip5 doesn't allow null"() {
        when:
        Zip5 zip5 = new Zip5(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'zip5 cannot be null'
        zip5 == null
    }

    @Unroll
    def "check zip5 exactly 5 numeric characters #input"() {
        when:
        Zip5 zip5
        zip5 = new Zip5(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        zip5 == null
        where:
        input    | errorMessage
        '1234'   | 'zip5 must be 5 digits'
        '123456' | 'zip5 must be 5 digits'
        'abcd'   | 'zip5 must be 5 digits'
        'abcde'  | 'zip5 must be 5 digits'
        'abcdef' | 'zip5 must be 5 digits'
    }

    @Unroll
    def "check can set zip5 #input"() {
        when:
        Zip5 zip5 = new Zip5(input)
        then:
        zip5.zip5 == input
        where:
        input   | blank
        '12345' | ''
        '23456' | ''
        '85902' | ''
    }
}
