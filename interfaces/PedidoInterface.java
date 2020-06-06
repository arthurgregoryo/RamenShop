package interfaces;

import modelos.Produto;

public interface PedidoInterface {
	
	public double getPreco();
	public void setPreco(double preco);
	
	public int getStatus();
	public void setStatus(int status);
	
	public int getNumero();
	public void setNumero(int numero);

	public Produto getProduto(); 
	public void setProduto(Produto produto);
	
	public String toString();
	public void finalize();
}
