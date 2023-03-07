import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int l,k;
        double s=0;
        System.out.println("Podaj liczbe:");
        l = klawisz.nextInt();
        klawisz.nextLine();
        for(int i=0;i<=l;i++){

            s=s+i;
        }
        System.out.println("Suma wynosi :"+s);
    }
}
