/*
Leia:
- Nome do vendedor (String)
- Salário fixo (double)
- Total de vendas no mês (double)

O vendedor recebe 15% de comissão sobre as vendas.

Calcular:
total = salarioFixo + (vendas * 0.15)

Saída:
TOTAL = R$ valor

Com:
- Espaço antes e depois do =
- Duas casas decimais
- Quebra de linha no final
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = totalVendas * 0.15;
        double totalReceber = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", totalReceber);

        sc.close();
    }
}