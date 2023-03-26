package criadorsenhas;

import java.util.Random;

public class Senhas implements Constantes{
    private final int tamanhoSenha, quantidadeSenha;

    protected Senhas(int tamanhoSenha, int quantidadeSenha) {
        this.tamanhoSenha = tamanhoSenha;
        this.quantidadeSenha = quantidadeSenha;
    }

    @Override
    public void gerarSenha() {
        StringBuilder passwordBuilder = new StringBuilder();
        Random rand = new Random();
        int numberRandom, letterRandom, numberOptions, characterRandom;

        System.out.println("===================================");
        for (int j = 0; j <= quantidadeSenha; j++) {
            for (int i = 0; i < tamanhoSenha; i++) {
                numberOptions = rand.nextInt(4);
                letterRandom = rand.nextInt(26);
                numberRandom = rand.nextInt(10);
                characterRandom = rand.nextInt(22);
                if (numberOptions == 0) {
                    passwordBuilder.append(letrasMinusculas.charAt(letterRandom));
                } else if (numberOptions == 1){
                    passwordBuilder.append(letrasMaiusculas.charAt(letterRandom));
                } else if (numberOptions == 2) {
                    passwordBuilder.append(caracteres.charAt(characterRandom));
                } else {
                    passwordBuilder.append(numeros.charAt(numberRandom));
                }
            }
            System.out.printf("[%d] >> %s\n", j, passwordBuilder);
            passwordBuilder.delete(0, tamanhoSenha);
        }
    }
}