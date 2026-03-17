import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        int cedulaCem = valor / 100;
        valor -= cedulaCem * 100;

        int cedulaCiquenta = valor / 50;
        valor -= cedulaCiquenta * 50;

        int cedulaVinte = valor / 20;
        valor -= cedulaCiquenta * 20;

        int cedulaDez = valor / 10;
        valor -= cedulaDez * 10;

        int cedulaCinco = valor / 5;
        valor -= cedulaCinco * 5;

        int cedulaDois = valor / 2;
        valor -= cedulaDois * 2;

        int cedulaUm = valor / 1;
        valor -= cedulaUm * 1;

        System.out.println(
            cedulaCem + " nota(s) de R$ 100,00\n" +
                    cedulaCiquenta + " nota(s) de R$ 50,00\n" +
                        cedulaVinte + " nota(s) de R$ 20,00\n" +
                            cedulaDez + " nota(s) de R$ 10,00\n" +
                                cedulaCinco + " nota(s) de R$ 5,00\n" +
                                    cedulaDois + " nota(s) de R$ 2,00\n" +
                                        cedulaUm + " nota(s) de R$ 1,00"
        );

        sc.close();
    }
}