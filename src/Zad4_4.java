import java.util.Scanner;

public class Zad4_4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int l;
        double b=1,s=0;
        do {
            System.out.println("Podaj liczbe przepracowanych dni");
            l = klawisz.nextInt();
            klawisz.nextLine();
        } while (l <= 1);
        System.out.println("1. dnia zarobiono 1 gr");
        for(int i=2;i<=l;i++) {
            b=(b*2);
            System.out.println(i+". dnia zarobiono "+b+" gr");
            s=s+b;
        }
        System.out.println("Za "+l+" dni wypłata bedie równa "+((s+1)/100)+" zl");
        }
    }

