package com.secure.design

import spock.lang.Specification
import spock.lang.Unroll

class SSNTest extends Specification {

    def "check SSN doesn't allow null"() {
        when:
        SSN ssn = new SSN(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'ssn cannot be null'
        ssn == null
    }

    @Unroll
    def "check ssn exactly 9 characters #input"() {
        when:
        SSN ssn = new SSN(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        ssn == null
        where:
        input        | errorMessage
        '12345678'   | 'ssn must be 9 numeric characters'
        '1234567890' | 'ssn must be 9 numeric characters'
        'abcdefgh'   | 'ssn must be 9 numeric characters'
        'abcdefghij' | 'ssn must be 9 numeric characters'
    }

    @Unroll
    def "check ssn exactly 9 numeric characters #input"() {
        when:
        SSN ssn = new SSN(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        ssn == null
        where:
        input       | errorMessage
        '12345678a' | 'ssn must be 9 numeric characters'
        '12345678b' | 'ssn must be 9 numeric characters'
        'abcdefgh0' | 'ssn must be 9 numeric characters'
        'abcdefghi' | 'ssn must be 9 numeric characters'
    }

    @Unroll
    def "check ssn 9 numeric characters #input"() {
        when:
        SSN ssn = new SSN(input)
        then:
        ssn.ssn == input
        where:
        input       | blank
        '123456789' | ''
        '234567890' | ''
        '859024854' | ''
    }
}
