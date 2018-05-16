
import java.util.Scanner;


public class Main {

    public static void menuUI(){
        System.out.println("PILHA DE ARRAY\n====================="
                + "\nEscolha uma op��o:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover ultimo elemento\n"
                + "3 - Ver ultimo elemento\n"
                + "4 - Ver n�mero de elementos na pilha\n"
                + "5 - Ver se a pilha est� vazia\n"
                + "6 - Ver pilha completa\n"
                + "0 - SAIR\n\n>>> ");
        
    }

    public static void main(String args[]) throws PilhaVazia{
    	
    	Scanner sc = new Scanner(System.in);
    	int tam;
        int fc;
        Object elemento;
        System.out.println("Digite o tamanho da pilha");
        tam = sc.nextInt();
        System.out.println("Digite o fator de crescimento da pilha");
        fc = sc.nextInt();
        PilhaArray minhaPilha = new PilhaArray(tam, fc);
        
        int resposta = -1;
        while (resposta!=0) {
            menuUI();
            Scanner zoy = new Scanner (System.in);
            resposta=zoy.nextInt();
            switch(resposta){
                case 1:
                    System.out.print("ADICIONAR: ");
                    elemento = zoy.next();
                    minhaPilha.push(elemento);
                    minhaPilha.mostrarPilha();
                    break;
                
                case 2:
                	try {
                    minhaPilha.pop();
                    System.out.println("Elemento Removido com sucesso!!");
                    Object topo = minhaPilha.top();
                    System.out.println("\n--->Seu elemento do topo agora � "+topo+"!<---");
                    minhaPilha.mostrarPilha();
                	}catch(PilhaVazia e1){
                		System.out.println("Sua pilha est� vazia, n�o tem o que remover");
                	}
                    break;
                
                case 3:
                	try {
                    Object topo2 = minhaPilha.top();
                    System.out.println("\n--->Seu elemento do topo � "+topo2+"!<---");
                    minhaPilha.mostrarPilha();
                	}catch(PilhaVazia e1){
                		System.out.println("Sua pilha est� vazia, n�o tem o que ver no topo dela");
                	}
                    break;
                
                case 4:
                    int qtdElementos = minhaPilha.size();
                    System.out.println("Voc� tem "+qtdElementos+" na pilha!");
                    minhaPilha.mostrarPilha();
                    break;
                
                case 5:
                    boolean situacao = minhaPilha.isEmpty();
                    int qtd = minhaPilha.size();
                    if (situacao==true){
                        System.out.println("Sim! Pilha Vazia!");
                    }else{
                        System.out.println("N�o! a pilha n�o est� vazia. Cont�m "+ qtd +" elementos!");
                        minhaPilha.mostrarPilha();
                    }
                    break;
                case 6:
                    minhaPilha.mostrarPilha();
                    break;
                case 0:
                    System.out.println("FIM DA PILHA\n=======================================");
                    break;
                default:
                    System.out.println("Escolha uma op��o v�lida!");
            }
            
        }
    
    }
}  
