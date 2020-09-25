package org.example.pitest.services

import org.example.pitest.services.FakeService
import spock.lang.Specification
import spock.lang.Subject

class FakeServiceSpec extends Specification {

    @Subject
    FakeService fakeService = new FakeService()

    def 'it should be ok'() {
        given:

        when:
        def result = fakeService.fakeMethod()

        then:
        println("**************TEST**************")
        assert result == 2
    }
}
