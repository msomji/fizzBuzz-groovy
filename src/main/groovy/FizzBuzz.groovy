class FizzBuzz {
     String eval(int number) {
        if(number % 15 == 0)
            return "fizzBuzz"
         if (number % 3 == 0)
            return "fizz"
         if (number % 5 == 0)
             return "buzz"
        return number.toString()
    }
}
