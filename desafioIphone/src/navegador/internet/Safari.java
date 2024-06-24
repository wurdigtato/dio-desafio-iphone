package navegador.internet;

public class Safari implements Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atulizando Página");
    }
}
