
public interface Pilha {
	public int size();
	public boolean isEmpty();
	public void push(Object o);
	public Object pop() throws PilhaVazia;
	public Object top() throws PilhaVazia;
	
}