package TrabalhoObserver;

public class AssinanteConcreto implements Assinante {

    private String nome;

    public AssinanteConcreto(String nome) {
        this.nome = nome;
    }

    public void publicar(String mensagem) {

        System.out.println("Assinante " + this.nome + ": " + mensagem);

    }

}
