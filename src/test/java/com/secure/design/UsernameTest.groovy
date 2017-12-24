package com.secure.design

import spock.lang.Specification
import spock.lang.Unroll

class UsernameTest extends Specification {

    def "check username doesn't allow null"() {
        when:
        Username username = new Username(null)
        then:
        def e = thrown(NullPointerException)
        e.message == 'Username cannot be null'
        username == null
    }

    @Unroll
    def "check username between 3 and 20 characters throws Exception #input"() {
        when:
        Username username = new Username(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        username == null
        where:
        input                        | errorMessage
        'a'                          | 'username must be between 3 and 20 characters'
        'ab'                         | 'username must be between 3 and 20 characters'
        'abcdefghijklmnopqrstu'      | 'username must be between 3 and 20 characters'
        'abcdefghijklmnopqrstuvwxyz' | 'username must be between 3 and 20 characters'
    }

    @Unroll
    def "check username between 3 and 20 characters #input"() {
        when:
        Username username = new Username(input)
        then:
        username.username == input
        where:
        input                  | blank
        'abc'                  | ''
        'abcd'                 | ''
        'abcde'                | ''
        'abcdef'               | ''
        'abcdefg'              | ''
        'abcdefgh'             | ''
        'abcdefghi'            | ''
        'abcdefghij'           | ''
        'abcdefghijk'          | ''
        'abcdefghijkl'         | ''
        'abcdefghijklm'        | ''
        'abcdefghijklmn'       | ''
        'abcdefghijklmno'      | ''
        'abcdefghijklmnop'     | ''
        'abcdefghijklmnopq'    | ''
        'abcdefghijklmnopqr'   | ''
        'abcdefghijklmnopqrs'  | ''
        'abcdefghijklmnopqrst' | ''
    }

    @Unroll
    def "check username format valid #input"() {
        when:
        Username username = new Username(input)
        then:
        username.username == input
        where:
        input         | blank
        'abc'         | ''
        'abc_'        | ''
        'abc_aa'      | ''
        'abc123'      | ''
        'abc123_'     | ''
        'abc_123'     | ''
        'abc__def'    | ''
        'abc_d-e.f'   | ''
        'abc1de.f'    | ''
        'abc_d-22ef'  | ''
        'abc_def.ghi' | ''
    }

    @Unroll
    def "check username alphanumeric or _ throws Exception #input"() {
        when:
        Username username = new Username(input)
        then:
        IllegalArgumentException e = thrown(IllegalArgumentException)
        e.message == errorMessage
        username == null
        where:
        input        | errorMessage
        'ab@'        | 'username can only contain letters, numbers, -, _ and .'
        'ab#'        | 'username can only contain letters, numbers, -, _ and .'
        'a1$'        | 'username can only contain letters, numbers, -, _ and .'
        'a2%'        | 'username can only contain letters, numbers, -, _ and .'
        'a4('        | 'username can only contain letters, numbers, -, _ and .'
        'a5)'        | 'username can only contain letters, numbers, -, _ and .'
        'a6!'        | 'username can only contain letters, numbers, -, _ and .'
        'a123#'      | 'username can only contain letters, numbers, -, _ and .'
        'akljdad&'   | 'username can only contain letters, numbers, -, _ and .'
        'a7^'        | 'username can only contain letters, numbers, -, _ and .'
    }

}
