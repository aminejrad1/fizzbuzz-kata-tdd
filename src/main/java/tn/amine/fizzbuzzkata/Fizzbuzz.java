package tn.amine.fizzbuzzkata;

public class Fizzbuzz {

    public static String play(int number1, int number2) {

        StringBuilder value = new StringBuilder();

        while (number1 <= number2) {
            value.append(getStringFromNumber(number1));
            number1++;
        }

        return value.toString();
    }

    public static String getStringFromNumber(int number) {
        if(number % 15 == 0)
            return  "FizzBuzz";
        else
        if(number % 3 == 0)
            return  "Fizz";
        else
        if(number % 5 == 0)
            return  "Buzz";

        return String.valueOf(number);
    }
}
