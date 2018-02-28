
import java.util.Scanner;


public class Main {

    public static void menuUI(){
        System.out.println("PILHA DE ARRAY\n====================="
                + "\nEscolha uma opção:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover ultimo elemento\n"
                + "3 - Ver ultimo elemento\n"
                + "4 - Ver número de elementos na pilha\n"
                + "5 - Ver se a pilha está vazia\n"
                + "0 - SAIR\n\n>>> ");
        
    }

    public static void main(String args[]) throws PilhaVazia{
        int tam=1;
        Object elemento;
        PilhaArray minhaPilha = new PilhaArray();
        minhaPilha.construct(tam);
        int resposta=-1;
        while (resposta!=0) {
            menuUI();
            Scanner zoy = new Scanner (System.in);
            resposta=zoy.nextInt();
            switch(resposta){
                case 1:
                    System.out.print("ADICIONAR: ");
                    elemento = zoy.next();
                    minhaPilha.push(elemento);
                
                case 2:
                    minhaPilha.pop();
                    System.out.println("Elemento Removido com sucesso!!");
                    Object topo = minhaPilha.top();
                    System.out.println("\n--->Seu elemento do topo agora é "+topo+"!<---");
                
                case 3:
                    Object topo2 = minhaPilha.top();
                    System.out.println("\n--->Seu elemento do topo é "+topo2+"!<---");
                
                case 4:
                    int qtdElementos = minhaPilha.size();
                    System.out.println("Você tem "+qtdElementos+" na pilha!");
                
                case 5:
                    boolean situacao = minhaPilha.isEmpty();
                    int qtd = minhaPilha.size();
                    if (situacao==true){
                        System.out.println("Sim! Pilha Vazia!");
                    }else{
                        System.out.println("Não! a pilha não está vazia. Contém "+ qtd +" elementos!");
                    }
                
                case 0:
                    System.out.println("FIM DA PILHA\n=======================================");
                
                default:
                    System.out.println("Escolha uma opção válida!");
            }
            
        }
    
    }
}  
