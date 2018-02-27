
public class PilhaArray implements Pilha {
	
	private Object arrayPilha[];
	private int t = -1;
	
	public PilhaArray (int tam) {
		arrayPilha = new Object[tam];
	}
	
	public boolean isEmpty() {
		return t == -1;
	}
	
	public int size() {
		return t+1;
	}
	
	public Object top() throws PilhaVazia{
		if (isEmpty())
			throw new PilhaVazia();
		else
			return arrayPilha[t];
		
	}
	
	public Object pop() throws PilhaVazia{
		if (isEmpty())
			throw new PilhaVazia();
		else
			return arrayPilha[t--];
	}
}
