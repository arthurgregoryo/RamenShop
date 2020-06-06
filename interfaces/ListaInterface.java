package interfaces;

import modelos.Produto;

public interface ListaInterface {
	
	public void adiciona(Produto produto);
	public void remove(Produto produto);
	public Produto retorna(int index);
	public boolean contem(Produto produto);
	
}
