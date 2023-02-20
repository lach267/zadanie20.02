import java.util.Scanner;

public class ZAD14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int ocena1,ocena2,ocena3,ocena4;
        double sr;
        System.out.println("Podaj cocene 1. :");
        ocena1 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj cocene 2. :");
        ocena2 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj cocene 3. :");
        ocena3 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj cocene 4. :");
        ocena4 = klawisz.nextInt();
        klawisz.nextLine();
        sr= (ocena1+ocena2+ocena3+ocena4)/4;
        System.out.println("Srednia wynosi :"+sr);

    }
}
