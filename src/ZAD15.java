import java.util.Scanner;

public class ZAD15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int cena;
        System.out.println("Podaj cene detaliczna plytki :");
        cena = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Zysk na 1 płytce wynosi "+(cena*0.4)+" zl");

    }
}
