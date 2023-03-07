
import java.util.Scanner;

public class Zad4_7 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int l, m,k;
        double liczbapustych =0, liczbapełnych =0, liczbapokoi=0;
        do {
            System.out.println("Podaj liczbe pieter");
            l = klawisz.nextInt();
            klawisz.nextLine();
        } while (l <= 1);
        for(int i=0;i<l;i++){
            do{
                System.out.println("Podaj liczbe pokoji");
                m = klawisz.nextInt();
            } while (m <= 10);
            do{
                System.out.println("Podaj liczbe pełnych pokoji");
                k = klawisz.nextInt();
            } while (k > m);
            liczbapokoi=liczbapokoi+m;
            liczbapełnych=liczbapełnych+k;
            liczbapustych=liczbapustych+(m-k);

        }
        System.out.println("Liczba pokoi : "+liczbapokoi);
        System.out.println("Liczba pustych pokoi : "+liczbapustych);
        System.out.println("Podaj pełnych pokoi : "+liczbapełnych);
        System.out.println("Poziom obłożenia jest równy : "+(liczbapełnych/liczbapokoi));
    }
}
