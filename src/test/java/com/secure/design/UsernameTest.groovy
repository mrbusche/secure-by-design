package com.secure.design

import spock.lang.Specification

class UsernameTest extends Specification {

    def "check username doesn't allow null"() {
        when:
        Username username = new Username(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'Username cannot be null'
        username == null
    }

    def "check username less than 20 characters"() {
        when:
        Username username = new Username('abcdefghijklmnopqrstuvwxyz')
        then:
        def e = thrown(IllegalArgumentException)
        e.message == 'Username can only be 20 characters'
        username == null
    }
}
