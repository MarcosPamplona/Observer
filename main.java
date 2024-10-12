package TrabalhoObserver;
import java.io.OptionalDataException;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);

        EditoraConcretaTrabalho editora = new EditoraConcretaTrabalho();

        int op = 0;

        while (op != 4) {


            System.out.println("______________Cadastrar Assinante____________");
            System.out.println("__________________Categorias_________________");
            System.out.println("| 1 - Esportes                               |");
            System.out.println("| 2 - Economia                               |");
            System.out.println("| 3 - Culinária                              |");
            System.out.println("| 4 - Cancelar                               |");
            System.out.println("| 5 - Todos Assinantes                       |");
            System.out.println("| 6 - Publicar                               |");
            System.out.println("| 7 - Sair                                   |");
            System.out.println("|____________________________________________|");
            System.out.print("Informe aqui a opção escolhida:");
            op = lerValor.nextInt();


            if (op == 1) {

                System.out.print("Nome:");
                String nome = lerValor.next();

                AssinanteConcreto assinante = new AssinanteConcreto(nome);
                editora.assinarEditoraEsporte(assinante);


            } else if (op == 2) {

                System.out.print("Nome:");
                String nome = lerValor.next();

                AssinanteConcreto assinante = new AssinanteConcreto(nome);
                editora.assinarEditoraEconomia(assinante);


            } else if (op == 3) {

                System.out.print("Nome:");
                String nome = lerValor.next();

                AssinanteConcreto assinante = new AssinanteConcreto(nome);
                editora.assinarEditoraCulinaria(assinante);


            } else if (op == 4) {

                System.out.print("Informe o cód da categoria:");
                int categoria = lerValor.nextInt();

                System.out.print("Informe o Nome do assinante:");
                String nome = lerValor.next();

                if (categoria == 1) {

                    AssinanteConcreto assinante = new AssinanteConcreto(nome);
                    editora.cancelarEditoraEsporte(assinante);

                } else if (categoria == 2) {

                    AssinanteConcreto assinante = new AssinanteConcreto(nome);
                    editora.cancelarEditoraEconomia(assinante);

                } else if (categoria == 3) {

                    AssinanteConcreto assinante = new AssinanteConcreto(nome);
                    editora.cancelarEditoraCulinaria(assinante);


            }else if (categoria == 5) {

                    System.out.print("____________Assinantes Economia________________");
                    //editora.mostrarAssinantesEconomia();
                    System.out.println("__________Assinantes Esportes________________");
                    //editora.mostrarAssinantesEscportes(assinante);
                    System.out.print("____________Assinantes Culinaria_______________");
                    //editora.mostrarAssinantesCulinaria();
                    }
            } else if (op == 6) {

                int opcaoPublicacao = 0;
                System.out.println("--------Informe a Categoria p/ Publicar-------");
                System.out.println("| 1 - Esportes                               |");
                System.out.println("| 2 - Economia                               |");
                System.out.println("| 3 - Culinária                              |");
                System.out.println("----------------------------------------------");
                System.out.println("Informe a categoria:");
                opcaoPublicacao = lerValor.nextInt();

                if (opcaoPublicacao == 1) {

                    String conteudo;
                    System.out.println("Escreva a publicação:");
                    conteudo = lerValor.next();
                    editora.setEstadoEsporte(conteudo);

                }
                if (opcaoPublicacao == 2) {

                    String conteudo;
                    System.out.println("Escreva a publicação:");
                    conteudo = lerValor.next();
                    editora.setEstadoEconomia(conteudo);

                }
                if (opcaoPublicacao == 3) {

                    String conteudo;
                    System.out.println("Escreva a publicação:");
                    conteudo = lerValor.next();
                    editora.setEstadoCulinaria(conteudo);

                }
            } else if (op == 7) {

                break;

            }

            lerValor.nextLine();
        }
    }
}