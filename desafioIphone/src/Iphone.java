import navegador.internet.Navegador;
import reprodutor.musical.ReprodutorMusical;
import aparelho.telefonico.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico {


    @Override
    public void tocar() {
        System.out.println("Ouvindo a música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionando: " + nome);
    }

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
        System.out.println("Atendendo ligação");
    }

    @Override
    public void desligarLigacao() {
        System.out.println("Desligando a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a Página");
    }
}
