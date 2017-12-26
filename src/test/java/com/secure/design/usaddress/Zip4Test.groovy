package com.secure.design.usaddress

import spock.lang.Specification
import spock.lang.Unroll

class Zip4Test extends Specification {

    def "check zip4 doesn't allow null"() {
        when:
        Zip4 zip4 = new Zip4(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'zip4 cannot be null'
        zip4 == null
    }

    @Unroll
    def "check zip4 exactly 4 numeric characters #input"() {
        when:
        Zip4 zip4
        zip4 = new Zip4(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        zip4 == null
        where:
        input   | errorMessage
        '123'   | 'zip4 must be 4 digits'
        '12345' | 'zip4 must be 4 digits'
        'abc'   | 'zip4 must be 4 digits'
        'abcd'  | 'zip4 must be 4 digits'
        'abcde' | 'zip4 must be 4 digits'
    }

    @Unroll
    def "check can set zip4 #input"() {
        when:
        Zip4 zip4 = new Zip4(input)
        then:
        zip4.zip4 == input
        where:
        input  | blank
        '1234' | ''
        '2345' | ''
        '8590' | ''
    }
}
