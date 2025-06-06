import java.util.ArrayList;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        System.out.println("Digite as notas (digite -1 para encerrar):");
        while (true) {
            double nota = entrada.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
            soma += nota;
        }

        int quantidade = notas.size();

        System.out.println("\nQuantidade de notas lidas: " + quantidade);

        System.out.print("Notas na ordem em que foram informadas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\n\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        System.out.println("\nSoma das notas: " + soma);

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Média das notas: " + media);

            int acimaDaMedia = 0;
            int abaixoDeSete = 0;

            for (double nota : notas) {
                if (nota > media) {
                    acimaDaMedia++;
                }
                if (nota < 7) {
                    abaixoDeSete++;
                }
            }

            System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
            System.out.println("Quantidade de notas abaixo de sete: " + abaixoDeSete);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }

        System.out.println("\nPrograma encerrado. Obrigado!");
        entrada.close();
    }
}
