package com.secure.design.usaddress

import spock.lang.Specification
import spock.lang.Unroll

class StateTest extends Specification {

    def "check state doesn't allow null"() {
        when:
        State state = new State(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'state cannot be null'
        state == null
    }

    @Unroll
    def "check state exactly 2 alpha characters #input"() {
        when:
        State state = new State(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        state == null
        where:
        input       | errorMessage
        '12345678a' | 'state must be a valid state abbreviation'
        '12345678b' | 'state must be a valid state abbreviation'
        'abcdefgh0' | 'state must be a valid state abbreviation'
        'abcdefghi' | 'state must be a valid state abbreviation'
        'aa'        | 'state must be a valid state abbreviation'
        'AA'        | 'state must be a valid state abbreviation'
        'Bc'        | 'state must be a valid state abbreviation'
        'ar'        | 'state must be a valid state abbreviation'
        'wy'        | 'state must be a valid state abbreviation'
    }

    @Unroll
    def "check state is valid abbreviation #input"() {
        when:
        State state = new State(input)
        then:
        state.state == input
        where:
        input | blank
        'AL'  | ''
        'AK'  | ''
        'AZ'  | ''
        'AR'  | ''
        'CA'  | ''
        'CO'  | ''
        'CT'  | ''
        'DE'  | ''
        'FL'  | ''
        'GA'  | ''
        'HI'  | ''
        'ID'  | ''
        'IL'  | ''
        'IN'  | ''
        'IA'  | ''
        'KS'  | ''
        'KY'  | ''
        'LA'  | ''
        'ME'  | ''
        'MD'  | ''
        'MA'  | ''
        'MI'  | ''
        'MN'  | ''
        'MS'  | ''
        'MO'  | ''
        'MT'  | ''
        'NE'  | ''
        'NV'  | ''
        'NH'  | ''
        'NJ'  | ''
        'NM'  | ''
        'NY'  | ''
        'NC'  | ''
        'ND'  | ''
        'OH'  | ''
        'OK'  | ''
        'OR'  | ''
        'PA'  | ''
        'RI'  | ''
        'SC'  | ''
        'SD'  | ''
        'TN'  | ''
        'TX'  | ''
        'UT'  | ''
        'VT'  | ''
        'VA'  | ''
        'WA'  | ''
        'WV'  | ''
        'WI'  | ''
        'WY'  | ''
    }
}