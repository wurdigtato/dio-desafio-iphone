package aparelho.telefonico;

public class Contato implements AparelhoTelefonico {
    private String nome;


    @Override
    public void ligarParaNumero(int numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void ligarParaContato(String nome) {
        System.out.println("Ligando para " + nome);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void desligarLigacao() {
        System.out.println("Desligando a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz!");
    }
}
