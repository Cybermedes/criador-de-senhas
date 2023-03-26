package criadorsenhas;

public class Senhas implements Constantes{
    private final int tamanhoSenha, quantidadeSenha;

    protected Senhas(int tamanhoSenha, int quantidadeSenha) {
        this.tamanhoSenha = tamanhoSenha;
        this.quantidadeSenha = quantidadeSenha;
    }

    @Override
    public void gerarSenha() {

    }
}