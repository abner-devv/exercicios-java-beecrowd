/*
Leia 2 valores de ponto flutuante de dupla precisão A e B,
que correspondem a 2 notas de um aluno.

Calcule a média sabendo que:
A tem peso 3.5
B tem peso 7.5

A soma dos pesos é 11.

Entrada:
Dois valores double com uma casa decimal.

Saída:
Imprimir:
MEDIA = resultado

Com 5 casas decimais.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}