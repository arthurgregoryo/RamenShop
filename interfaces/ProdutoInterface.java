package interfaces;

public interface ProdutoInterface {
	
	// "obriga" o desenvolvedor a definir as variaveis, caso queira implementar um novo produto
	public String getNome();
	public String getTipo();
	public Double getPreco();
	public String toString();
	
}

