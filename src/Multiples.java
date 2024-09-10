public class Multiples {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 0; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                c++;
            } else if (divisibleBy3) {
                c++;
            } else if (divisibleBy5) {
                c++;
            }
        }
        System.out.println(c);
    }
}
