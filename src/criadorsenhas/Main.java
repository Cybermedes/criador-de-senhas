package criadorsenhas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pergunta1 = "Qual o tamanho da sua senha?";
        String pergunta2 = "Quantas senhas?";
        int tamanhoSenha = validarEntrada(pergunta1);
        int quantidadeSenha = validarEntrada(pergunta2);

        Senhas senha = new Senhas(tamanhoSenha, quantidadeSenha);
        senha.gerarSenha();
    }

    static int validarEntrada(String pergunta) {
        boolean signal = true;
        int input = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(pergunta);
                input = scanner.nextInt();
                if (input <= 0) {
                    throw new IllegalArgumentException();
                }
                signal = false;
            } catch (InputMismatchException ime) {
                System.out.println("Digite um número inteiro!");
            } catch (IllegalArgumentException iae) {
                System.out.println("A entrada deve ser positivo e maior do que zero!");
            }
        } while (signal);
        return input;
    }
}