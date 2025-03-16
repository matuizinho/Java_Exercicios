package POO;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {

    public static void main(String[] args) {
        Numero n = new Numero();
        boolean continuar = true;
        Scanner scan = new Scanner(System.in);

        while (continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("Digite a operação que deseja realizar: "
                    + "\n 1 para soma "
                    + "\n 2 para subtracao "
                    + "\n 3 para multiplicacao "
                    + "\n 4 para divisao "
                    + "\n ou 0 para finalizar o programa");

            operacao = scan.nextInt();

            if (operacao == 0) {
                continuar = false;
                System.out.println("Programa finalizado.");
                break; // Usamos break para sair do loop, não return
            }

            System.out.println("Informe o valor do primeiro número:");
            x = scan.nextDouble();

            System.out.println("Informe o valor do segundo número:");
            y = scan.nextDouble(); // Faltava um ponto e vírgula aqui

            switch (operacao) {
                case 1:
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;
                case 2:
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;
                case 3:
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                    break;
                case 4:
                    imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
        }

        scan.close();
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, "Somado");
        mapOperacao.put(2, "Subtraido");
        mapOperacao.put(3, "Multiplicado");
        mapOperacao.put(4, "Dividido");

        System.out.println("\nO resultado de " + x + " " + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado + "\n");
    }
}