
public class PilhaArray implements Pilha {
	
	private Object arrayPilha[];
	private int t = -1;
	
	public PilhaArray (int tam) {
		arrayPilha = new Object[tam];
	}
	
	public boolean isEmpty() {
		return t == -1;
	}
}
