package aparelho.telefonico;

public interface AparelhoTelefonico {
    void ligarParaNumero(int numero);
    void ligarParaContato(String nome);
    void atenderLigacao();
    void desligarLigacao();
    void iniciarCorreioVoz();
}
