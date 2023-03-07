import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double l, m;
        System.out.println("Podaj wzrost w metrach:");
        l = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podaj  swoja wage w kilogramach:");
        m = klawisz.nextDouble();
        klawisz.nextLine();
        if(25<(m/l*2)){
            System.out.println("Jesteś gruby");
        } else if ((18.5>(m/l*2))) {
            System.out.println("Zjedz coś wkoońcu");
        } else {
            System.out.println("Jeste dobrze nie zmieniaj sie");
        }

    }
}
