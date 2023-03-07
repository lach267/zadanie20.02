import java.util.Scanner;

public class Zad4_5 {
    public static void main(String[] args) {

        System.out.println("Dzisiaj jest piękny dzień.".length());
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String l = klawisz.nextLine();
        klawisz.nextLine();
        System.out.println("Podaj litere ktorą chcesz zliczyć :");
        char s = klawisz.nextLine().charAt(0);
        int suma=0;
        for(int i=0;i<l.length();i++){
            if(l.charAt(i)==s){
                suma++;
            }

        }
        System.out.println("Znaleziono " +suma+" podobnych liter");
    }
}
