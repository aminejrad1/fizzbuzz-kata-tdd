package tn.amine.fizzbuzzkata;

public class Fizzbuzz {

    public static String play(int number) {
        if(number==3 || number==6)
            return "Fizz";

        return String.valueOf(number);
    }
}
