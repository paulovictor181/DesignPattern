package iterator.implJava.AVL;

public class No<T> {
	
	int chave;
	T dado;
	int alturaNo;
    public No<T> esq;
    public No<T> dir;
	
	public No(int chave, T dado) {
		this.chave = chave;
		this.dado = dado;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public int getAlturaNo() {
		return alturaNo;
	}

	public void setAlturaNo(int alturaNo) {
		this.alturaNo = alturaNo;
	}

	
}
