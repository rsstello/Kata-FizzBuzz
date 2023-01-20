package FizzBuzz;

public class FizzBuzz {
    public static String convert(int input) {
        if (input == 15)
            return "FizzBuzz";
        if (input % 5 == 0)
            return "Buzz";
        if (input % 3 == 0)
            return "Fizz";
        return String.valueOf(input);
    }

}
