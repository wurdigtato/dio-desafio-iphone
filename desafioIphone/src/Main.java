public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("#####  M Ú S I C A #####");
        iphone.selecionarMusica("The Weeknd - The Morning");
        iphone.tocar();
        iphone.pausar();
        System.out.println("########################");

        System.out.println();

        System.out.println("##### T E L E F O N E #####");
        iphone.ligarParaContato("Mãe");
        iphone.desligarLigacao();
        iphone.atenderLigacao();
        iphone.desligarLigacao();
        iphone.iniciarCorreioVoz();
        iphone.ligarParaNumero(55446315);
        iphone.desligarLigacao();
        System.out.println("###########################");

        System.out.println();

        System.out.println("##### N A V E G A D O R #####");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        System.out.println("#############################");
    }
}
