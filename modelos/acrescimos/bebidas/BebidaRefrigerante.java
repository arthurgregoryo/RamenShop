package modelos.acrescimos.bebidas;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class BebidaRefrigerante extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public BebidaRefrigerante(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Refrigerante ( 5.90 )";
	}

	@Override
	public String getTipo() {
		return "BEBIDA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 5.90;
	}
		
}