import java.util.Scanner;

public class ZAD10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String firstName, middleName, lastName;

        System.out.println("Podaj swoje 1. imie :  ");
        firstName = klawisz.nextLine();
//        klawisz.nextLine();
        System.out.println("Podaj swoje 2. imie :  ");
        middleName = klawisz.nextLine();
//        klawisz.nextLine();
        System.out.println("Podaj swoje nazwisko :  ");
        lastName = klawisz.nextLine();
//        klawisz.nextLine();

        System.out.println("pierwsze imie to "+firstName+" a drugie to "+middleName+" a nazwisko "+ lastName);
        System.out.println("pierwsze inicjał imienia to "+firstName.charAt(0)+" a drugi inicjał to "+middleName.charAt(0)+" a nazwiska to "+ lastName.charAt(0));

    }

}
