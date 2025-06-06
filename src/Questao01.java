import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] temperaturas = new double[12];
        double soma = 0;

        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês de " + meses[i] + ": ");
            temperaturas[i] = entrada.nextDouble();
        }

        for (int i = 0; i < 12; i++) {
            soma += temperaturas[i];
        }

        double mediaAnual = soma / 12;
        System.out.println("\nA média anual foi: " + mediaAnual + "°C");

        System.out.println("\nTemperaturas acima da média anual:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.println(meses[i] + ": " + temperaturas[i] + "°C");
            }
        }

        entrada.close();
    }
}
