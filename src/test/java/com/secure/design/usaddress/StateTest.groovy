package com.secure.design.usaddress

import spock.lang.Specification

class StateTest extends Specification {

    def "check state doesn't allow null"() {
        when:
        State state = new State(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'state cannot be null'
        state == null
    }
}
