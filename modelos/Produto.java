package modelos;

import interfaces.ProdutoInterface;

public class Produto implements ProdutoInterface {
	
	//Permite criar classes com metodos que usam um objeto "Produto" generico ( Ramen ou Acrescimo por exemplo)

	@Override
	public String getNome() {
		return null;
	}

	@Override
	public String getTipo() {
		return null;
	}

	@Override
	public Double getPreco() {
		return null;
	}

}
