import java.util.Scanner;

public class Zad4_12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int[] tb = new int[5];
        for (int i = 0; i <= 5; i++){
            System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr "+(i+1)+" :");
            tb[i] = klawisz.nextInt();
        }
        for (int i = 0; i <= 5; i++){
            System.out.println("Sklep nr "+(i+1)+" : ");
            for (int b = 0; b <= (tb[i]/100); b++){
                System.out.print("*");
            }
        }
    }
}
