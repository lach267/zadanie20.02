import java.util.Scanner;

public class ZAD12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double kilometry, paliwo;
        System.out.println("Podaj przejechane kilometry :");
        kilometry = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podaj zuzyte paliwo :");
        paliwo = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Spalanie w trasie wyniosło"+kilometry/paliwo+" co oznacza że na 1 litrze zrobimy "+kilometry/paliwo+ " km");
    }
}
