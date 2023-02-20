import java.util.Scanner;

public class ZAD8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int p1a, p1b, p2a, p2b, p3a, p3b, p4a, p4b;
        System.out.println("podaj powierzchnie pierwszego pomieszcznia :  ");
        p1a = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println(" - ");
        p1b = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("podaj powierzchnie drugiego pomieszcznia :  ");
        p2a = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println(" - ");
        p2b = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("podaj powierzchnie trzeciego pomieszcznia : ");
        p3a = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println(" - ");
        p3b = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("podaj powierzchnie czwartego pomieszcznia :");
        p4a = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println(" - ");
        p4b = klawisz.nextInt();
        klawisz.nextLine();
        int p1 = p1a * p1b;
        int p2 = p2a * p2b;
        int p3 = p3a * p3b;
        int p4 = p4a * p4b;
        int powierzchniaCalkowita = p1 + p2 + p3 + p4;
        int pnajednaosobe = powierzchniaCalkowita/4;
        System.out.println("Powierzchnia pierwszego pomieszcznia wynosi : " + p1 + "m2");
        System.out.println("Powierzchnia drugiego pomieszcznia wynosi : " + p2 + "m2");
        System.out.println("Powierzchnia trzeciego pomieszcznia wynosi : " + p3 + "m2");
        System.out.println("Powierzchnia czwartego pomieszcznia wynosi : " + p4 + "m2");
        System.out.println("Powierzchnia całkowita pomieszczen wynosi : " + powierzchniaCalkowita + "m2");
        System.out.println("Powierzchnia przypadająca na 1 osobe wynosi : " +pnajednaosobe+"m2");
    }
}
