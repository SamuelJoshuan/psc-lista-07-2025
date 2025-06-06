import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Array para armazenar as quantidades em cada faixa salarial
        // Índices: 0 -> $200-$299, 1 -> $300-$399, ..., 7 -> $900-$999, 8 -> $1000 ou mais
        int[] faixaSalarios = new int[9];

        System.out.print("Digite a quantidade de vendedores: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor das vendas brutas do vendedor " + (i + 1) + ": ");
            double vendas = entrada.nextDouble();

            // Calcula salário: 200 + 9% das vendas brutas
            double salario = 200 + 0.09 * vendas;

            // Define a faixa salarial e incrementa o contador correspondente
            if (salario >= 200 && salario <= 299.99) {
                faixaSalarios[0]++;
            } else if (salario >= 300 && salario <= 399.99) {
                faixaSalarios[1]++;
            } else if (salario >= 400 && salario <= 499.99) {
                faixaSalarios[2]++;
            } else if (salario >= 500 && salario <= 599.99) {
                faixaSalarios[3]++;
            } else if (salario >= 600 && salario <= 699.99) {
                faixaSalarios[4]++;
            } else if (salario >= 700 && salario <= 799.99) {
                faixaSalarios[5]++;
            } else if (salario >= 800 && salario <= 899.99) {
                faixaSalarios[6]++;
            } else if (salario >= 900 && salario <= 999.99) {
                faixaSalarios[7]++;
            } else if (salario >= 1000) {
                faixaSalarios[8]++;
            }
        }

        // Exibe os resultados
        System.out.println("\nQuantidade de vendedores em cada faixa salarial:");
        System.out.println("$200 - $299: " + faixaSalarios[0]);
        System.out.println("$300 - $399: " + faixaSalarios[1]);
        System.out.println("$400 - $499: " + faixaSalarios[2]);
        System.out.println("$500 - $599: " + faixaSalarios[3]);
        System.out.println("$600 - $699: " + faixaSalarios[4]);
        System.out.println("$700 - $799: " + faixaSalarios[5]);
        System.out.println("$800 - $899: " + faixaSalarios[6]);
        System.out.println("$900 - $999: " + faixaSalarios[7]);
        System.out.println("$1000 em diante: " + faixaSalarios[8]);

        entrada.close();
    }
}
