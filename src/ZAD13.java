import java.util.Scanner;

public class ZAD13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int ilosc;
        System.out.println("Podaj ilość zjedzonych ciasteczek :");
        ilosc = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Cena produktu po podatku wynosi :"+(ilosc*300/4)+" kcal");

    }
}
