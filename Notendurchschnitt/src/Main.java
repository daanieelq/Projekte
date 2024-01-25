import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe die Anzahl der Noten ein: ");
        int Notenanzahl = sc.nextInt();

        int[] Note = new int[Notenanzahl + 1];
        for(int i = 1; i <= Notenanzahl; i++) {
            System.out.print("Wie oft kam die Note " + i + " vor?: ");
            Note[i - 1] = sc.nextInt();
        }
        double Summe = 0;
        for(int i = 0; i < Notenanzahl; i++) {
            Summe += Note[i];
        }

        double Durchschnitt = Summe / Notenanzahl;
        System.out.println("Die Durchschnittsnote beträgt: " + Durchschnitt);

    }
}