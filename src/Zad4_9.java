import java.util.Scanner;

public class Zad4_9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double najmniejsza_liczba, najwieksza_liczba;
        System.out.println("Podaj liczbe :");
        int l = klawisz.nextInt();
        najmniejsza_liczba=l;
        najwieksza_liczba=l;
        for(;;){
            System.out.println("Podaj liczbe :");
            l = klawisz.nextInt();
            klawisz.nextLine();
            if(l==-99){
                break;
            }
            if(l<najmniejsza_liczba) {
                najmniejsza_liczba = l;
            }
            if(l>najwieksza_liczba) {
                najwieksza_liczba = l;
            }

        }
        System.out.println("Najmniejsza liczba to: "+ najmniejsza_liczba);
        System.out.println("Najwieksza liczba to: "+najwieksza_liczba);
    }
}

