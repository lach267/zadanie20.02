import java.util.Scanner;

public class Zad3_2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int l, m;
        double ol;
        System.out.println("Podaj predość w km/h:");
        l = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj  czas przejazdu w h:");
        m = klawisz.nextInt();
        klawisz.nextLine();
        ol=l*m;

        for(int i=1;i<=m;i++) {
            System.out.println(i+" "+(l*i));
        }

    }
}
