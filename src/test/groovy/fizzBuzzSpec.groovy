
import spock.lang.Specification


class fizzBuzzSpec extends Specification {

    def  fizzBuzz = new FizzBuzz()

    def "should fizz and buzz and fizzbuzz accurately" (){
        expect:
        fizzBuzz.eval(input) == output

        where:
        input | output
        1   |   "1"
        2   |   "2"
        3   |   "fizz"
        6   |   "fizz"
        5   |   "buzz"
        10  |   "buzz"
        15  |   "fizzBuzz"

    }

}