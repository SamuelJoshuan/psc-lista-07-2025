import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respostasSim = 0;

        System.out.println("Responda as perguntas a seguir com Sim (S) ou Não (N):");

        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            String resposta = entrada.next();

            if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
                respostasSim++;
            }
        }

        System.out.print("Você foi considerado: ");
        if (respostasSim == 2) {
            System.out.println("Suspeita");
        } else if (respostasSim == 3 || respostasSim == 4) {
            System.out.println("Cúmplice");
        } else if (respostasSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        entrada.close();
    }
}
