package TrabalhoObserver;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcretaTrabalho implements Editora {


    private final List<Assinante> listaAssinantesEsportes = new ArrayList<Assinante>();
    private final List<Assinante> listaAssinantesEconomia = new ArrayList<Assinante>();
    private final List<Assinante> listaAssinantesCulinaria = new ArrayList<Assinante>();

    private String estado;

    public void assinarEditoraEsporte(Assinante assinante) {
        listaAssinantesEsportes.add(assinante);
    }
    public void assinarEditoraEconomia(Assinante assinante) {
        listaAssinantesEconomia.add(assinante);
    }
    public void assinarEditoraCulinaria(Assinante assinante) {
        listaAssinantesCulinaria.add(assinante);
    }




    public void cancelarEditoraEsporte(Assinante assinante) {
        listaAssinantesEsportes.remove(assinante);
    }
    public void cancelarEditoraEconomia(Assinante assinante) {
        listaAssinantesEconomia.remove(assinante);
    }
    public void cancelarEditoraCulinaria(Assinante assinante) {
        listaAssinantesCulinaria.remove(assinante);
    }



    public void notificarEditoraEsporte(String mensagem){
        for(Assinante assinante : listaAssinantesEsportes){
            assinante.publicar(mensagem);
        }
    }

    public void notificarEditoraEconomia(String mensagem){
        for(Assinante assinante : listaAssinantesEconomia){
            assinante.publicar(mensagem);
        }
    }

    public void notificarEditoraCulinaria(String mensagem){
        for(Assinante assinante : listaAssinantesCulinaria){
            assinante.publicar(mensagem);
        }
    }


    public void setEstadoEsporte(String estado) {
        this.estado = estado;
        notificarEditoraEsporte("Nova publicação:"+estado);
    }


    public void setEstadoEconomia(String estado) {
        this.estado = estado;
        notificarEditoraEconomia("Nova publicação:"+estado);
    }

    public void setEstadoCulinaria(String estado) {
        this.estado = estado;
        notificarEditoraCulinaria("Nova publicação:"+estado);
    }



   /* public void mostrarAssinantesEscportes(Assinante assinante){
        for(Assinante assinante : listaAssinantesEsportes){
            System.out.println(assinante);
        }
    }

    public void mostrarAssinantesEconomia() {
        for(Assinante assinante : listaAssinantesEconomia){
            System.out.println(assinante);
        }
    }
    public void mostrarAssinantesCulinaria() {
        for(Assinante assinante : listaAssinantesCulinaria){
            System.out.println(assinante);
        }
    }*/
}
