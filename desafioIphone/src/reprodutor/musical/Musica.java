package reprodutor.musical;

public class Musica implements ReprodutorMusical{

    protected String nome;

    public Musica(String nome){
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando: " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada!");
    }

    @Override
    public void selecionarMusica(String nome) {
        this.nome = nome;
        System.out.println("Tocando agora: " + nome);
    }

    public String getNome() {
        return nome;
    }
}
