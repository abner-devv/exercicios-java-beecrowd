/*
Leia:

Linha 1:
- Código da peça 1 (int)
- Número de peças 1 (int)
- Valor unitário peça 1 (double)

Linha 2:
- Código da peça 2 (int)
- Número de peças 2 (int)
- Valor unitário peça 2 (double)

Calcular:
total = (quant1 * valor1) + (quant2 * valor2)

Saída:
VALOR A PAGAR: R$ valor

Com:
- Espaço após os dois pontos
- Espaço após "R$"
- 2 casas decimais
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}