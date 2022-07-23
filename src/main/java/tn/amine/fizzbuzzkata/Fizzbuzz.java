package tn.amine.fizzbuzzkata;

public class Fizzbuzz {

    public static String play(int number1, int number2) {
        if(number1!=number2)
            return number1 + String.valueOf(number2);

        if(number1 % 15 == 0)
            return "FizzBuzz";

        if(number1 % 3 == 0)
            return "Fizz";

        if(number1 % 5 == 0)
            return "Buzz";

        return String.valueOf(number1);
    }
}
