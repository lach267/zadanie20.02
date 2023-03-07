import java.util.Scanner;

public class Zad4_20 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj liczbe : ");
        int l = klawisz.nextInt();
        for (int i = 1; i <= l; i++) {
            for (int q = 1; q <= l; q++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
