import java.util.Scanner;

public class NumbersFrom0To3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Liczby z przedziału [0,3] z pętli while");

        double i = 0;
        while (i <= 3) {
            System.out.println(i);
            i += 0.1;
        }
        System.out.println("Liczby z przedziału [0,3] z pętli do...while");

        double k = 0;
        do {
            System.out.println(k);
            k = k + 0.1;
        } while (k <= 3);
        System.out.println("Koniec programu");
    }
}
