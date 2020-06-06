package modelos.acrescimos.bebidas;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class BebidaOCha extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public BebidaOCha(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", O-Cha ( + 3.90 )";
	}

	@Override
	public String getTipo() {
		return "BEBIDA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 3.90;
	}
		
}