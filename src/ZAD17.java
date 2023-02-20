import java.util.Scanner;

public class ZAD17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int cena;
        System.out.println("Podaj cene poiłku :");
        cena = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Cena posiłku wynosi "+cena+"zl wartość podatku równa "+cena*0.0675+"zl ,proponowana wartosc napiwku "+(cena*1.0675)*0.2+"zl , laczna wartosc wynosi "+(((cena*1.0675)*0.2)+cena*1.0675)+" zl");

    }
}
