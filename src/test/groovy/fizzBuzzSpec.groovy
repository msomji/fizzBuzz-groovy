
import spock.lang.Specification


class fizzBuzzSpec extends Specification {

    def  fizzBuzz = new FizzBuzz()

    def "should return 1 when one is evaluated" (){
        expect:
        fizzBuzz.eval(1) == "1"
    }

    def "should evaluate to 2 when input is 2" () {
        expect:
        fizzBuzz.eval(2) == "2"
    }

    def "should return fizz when input is 3"() {
        expect:
        fizzBuzz.eval(3) == "fizz"
    }

    def "should return fizz when input is 6"() {
        expect:
        fizzBuzz.eval(6) == "fizz"
    }

    def "should return buzz when input is 5"() {
        expect:
        fizzBuzz.eval(5) == "buzz"
    }

    def "should return buzz when input is 10"() {
        expect:
        fizzBuzz.eval(10) == "buzz"
    }

    def "should return fizzBuzz when input is 15"() {
        expect:
        fizzBuzz.eval(15) == "fizzBuzz"
    }
}