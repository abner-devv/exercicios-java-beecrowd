/*
Leia quatro valores inteiros A, B, C e D.

Calcule a diferença do produto de A e B pelo produto de C e D:

DIFERENCA = (A * B - C * D)

Entrada:
4 valores inteiros.

Saída:
Imprimir:
DIFERENCA = resultado

Com espaço antes e depois do =
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}