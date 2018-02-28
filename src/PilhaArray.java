
public class PilhaArray implements Pilha {
	
	private Object arrayPilha[];
	private int t = -1;
	
        
        //CONSTRUTOR DO OBJETO
	public PilhaArray (int tam) {
		arrayPilha = new Object[tam];
	}
	
        //ADCIONA ELEMENTO NO ARRAY
        public void push(Object o){
            
        };
        
         //MOSTRA O ULTIMO ELEMENTO INSERIDO, SEM REMOVER
	public Object top() throws PilhaVazia{
		if (isEmpty())
			throw new PilhaVazia();
		else
			return arrayPilha[t];
		
	}
	
        //RETORNA SE ESTÁ VAZIO OU NÃO
	public boolean isEmpty() {
		return t == -1;
	}
	
        //RETORNA O TAMANHO DO ARRAY
	public int size() {
		return t+1;
	}
	
       
        //REMOVE UM ELEMENTO E RETORNA O ULTIMO ELEMENTO INSERIDO
	public Object pop() throws PilhaVazia{
		if (isEmpty())
			throw new PilhaVazia();
		else
			return arrayPilha[t--];
	}
        

}
