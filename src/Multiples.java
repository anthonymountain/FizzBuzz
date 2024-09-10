public class Multiples {
    public static void main(String[] args) {
        int c = 0; // create initial count
        for (int i = 0; i < 1000; i++) { // for loop to check all positive numbers below 1000
            boolean divisibleBy3 = i % 3 == 0; // if i is divisible by 3
            boolean divisibleBy5 = i % 5 == 0; // if i is divisible by 5
            if (divisibleBy3 && divisibleBy5) { // using divisible by both as if to avoid double counting
                c++; // if divisible by both add 1 to count
            } else if (divisibleBy3) {
                c++; // if divisible by 3 add 1 to count
            } else if (divisibleBy5) {
                c++; // if divisible by 5 add 1 to count
            }
        }
        System.out.println(c); // print final count of numbers below 1000 divisible by 3 or 5
    }
}
