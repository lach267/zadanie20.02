import java.util.Scanner;

public class ZAD11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cenaProduktu;
        System.out.println("Podaj cene produktu :");
        cenaProduktu = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Cena produktu po podatku wynosi :"+(cenaProduktu+cenaProduktu*0.02+cenaProduktu*0.04)+" zl");

    }
}
