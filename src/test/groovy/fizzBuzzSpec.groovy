
import spock.lang.Specification


class fizzBuzzSpec extends Specification {

    def  fizzBuzz = new FizzBuzz()

    def "should return 1 when one is evaluated" (){
        expect:
        fizzBuzz.eval(1) == 1
    }

    def "should evaluate to 2 when input is 2" () {
        expect
        fizzBuzz.eval(2) == 2
    }
}