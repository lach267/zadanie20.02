import java.util.Scanner;

public class ZAD18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cena, ilosc;
        System.out.println("Podaj cene akcji :");
        cena = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Cena posiłku wynosi "+cena+"zl wartość podatku równa "+cena*0.0675+"zl ,proponowana wartosc napiwku "+(cena*1.0675)*0.2+"zl , laczna wartosc wynosi "+(((cena*1.0675)*0.2)+cena*1.0675)+" zl");

    }
}
