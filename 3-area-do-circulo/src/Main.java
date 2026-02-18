import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double N = 3.14159;

        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double a = N * Math.pow(r, 2);
        System.out.printf("A=%.4f%n", a);

        scanner.close();
    }
}