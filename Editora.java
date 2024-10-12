package TrabalhoObserver;

import java.util.ArrayList;

public interface Editora {

    void assinarEditoraEsporte(Assinante assinante);
    void assinarEditoraEconomia(Assinante assinante);
    void assinarEditoraCulinaria(Assinante assinante);

    void cancelarEditoraEsporte(Assinante assinante);
    void cancelarEditoraEconomia(Assinante assinante);
    void cancelarEditoraCulinaria(Assinante assinante);

    void notificarEditoraEsporte(String mensagem);
    void notificarEditoraEconomia(String mensagem);
    void notificarEditoraCulinaria(String mensagem);

    /*void mostrarAssinantesEscportes(Assinante assinante);
    void mostrarAssinantesEconomia(Assinante assinante);
    void mostrarAssinantesCulinaria(Assinante assinante);*/

}

