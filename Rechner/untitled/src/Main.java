import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe die erste Zahl ein");
        float a = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Bitte gebe den Operator ein");
        String b = scanner.nextLine();
        System.out.println("Bitte gebe die Zweite Zahl ein");
        float c = scanner.nextFloat();
            switch (b) {
                case "+":
                    System.out.println(a + c);
                    break;
                case "-":
                    System.out.println(a - c);
                    break;
                case "*":
                    System.out.println(a * c);
                    break;
                case "/":
                    System.out.println(a / c);
                    break;
                default:
                    System.out.println("Rechnung nicht möglich");
                    break;
                }
            }
    }