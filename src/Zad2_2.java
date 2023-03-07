import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int d ,m, r;
        System.out.println("Podaj liczbe DNI :");
        d = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj liczbe misiaca :");
        m = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj dwie ostatnie cyfry roku :");
        r = klawisz.nextInt();
        klawisz.nextLine();
        if((m*d)==r){
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
