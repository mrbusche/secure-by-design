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
    def "check changes button access #userType #change #producerType"() {
        when:
        State state = new State(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        state == null
        where:
        userType | changes | producerType | showButton
        'INQ'    | true    | 'EAFSS'      | false
        'INQ'    | true    | 'something'  | false
        'INQ'    | false   | 'EAFSS'      | false
        'INQ'    | false   | 'something'  | false
        'GLB'    | true    | 'EAFSS'      | false
        'GLB'    | true    | 'something'  | false
        'GLB'    | false   | 'EAFSS'      | false
        'GLB'    | false   | 'something'  | false

        'CMG'    | true    | 'EAFSS'      | true //which one should be true?
        'CMG'    | false   | 'EAFSS'      | false //which one should be true?
        'CMG'    | true    | 'something'  | true
        'CMG'    | false   | 'something'  | true

        'ADM'    | true    | 'EAFSS'      | true
        'ADM'    | true    | 'something'  | true
        'ADM'    | false   | 'EAFSS'      | true
        'ADM'    | false   | 'something'  | true
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
