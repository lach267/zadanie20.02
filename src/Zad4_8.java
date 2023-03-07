import java.util.Scanner;

public class Zad4_8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int l, m, k;
        double liczbamiesiecy = 0, liczbaopadów = 0;
        do {
            System.out.println("Podaj liczbe lat");
            l = klawisz.nextInt();
            klawisz.nextLine();
        } while (l < 1);
        int[][] temp;
        temp = new int[l][12];
        for (int i = 1; i <= l; i++) {
            for (int q = 1; q <= 12; q++) {
                do {
                    System.out.println("Podaj liczbe opadów w "+q+". miesiacu w "+i+". roku :");
                    temp[i-1][q-1] = klawisz.nextInt();
                    klawisz.nextLine();
                } while (l < 0);
                liczbaopadów=liczbaopadów+temp[i-1][q-1];
            }
            liczbamiesiecy=liczbamiesiecy+12;

        }
        System.out.println("Liczba miesiecy : "+liczbamiesiecy);
        System.out.println("suma opadów z podanego zakresu : "+liczbaopadów);
        for (int i = 1; i <= l; i++) {
            for (int q = 1; q <= 12; q++) {
                System.out.println("W "+i+". roku w "+q+". miesiacu, sredni poziom opadow wyniosł "+ temp[i-1][q-1] );
            }
        }
    }
}
