public class Reduce {
    public static void main(String[] args) {
        int steps = 0; // create variable that tracks steps
        int n = 100; // variable n
        while (n > 0) { // while loop for as long as n does not reach 0
            if (n % 2 == 0) { // if n is even
                n = n / 2; // divide by 2
            } else if (n % 2 == 1) { // if n is odd
                n = n - 1; // subtract 1
            }
            steps++; // add 1 to steps counter
        }
        System.out.println(steps); // print number of steps
    }
}
