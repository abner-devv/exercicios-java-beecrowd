/*
Escreva um programa que leia:

- Número do funcionário (int)
- Quantidade de horas trabalhadas (int)
- Valor recebido por hora (double)

Calcule o salário:
salario = horas * valorHora

Saída:
NUMBER = numeroFuncionario
SALARY = $ salario

Com:
- Espaço antes e depois do =
- Espaço após o $
- Salário com 2 casas decimais
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}