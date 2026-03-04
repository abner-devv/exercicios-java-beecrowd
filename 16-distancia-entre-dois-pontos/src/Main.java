import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Leitura dos valores
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Cálculo da distância
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));

        // Impressão com 4 casas decimais
        System.out.printf("%.4f%n", distancia);

        sc.close();
    }
}