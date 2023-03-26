package criadorsenhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho da sua senha?");
        final int tamanhoSenha = scanner.nextInt();
        System.out.println("Quantas senhas você quer criar?");
        final int quantidadeSenha = scanner.nextInt();
    }
}