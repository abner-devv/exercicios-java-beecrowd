import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();      // distância em Km
        double Y = sc.nextDouble(); // combustível gasto

        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l\n", consumoMedio);

        sc.close();
    }
}