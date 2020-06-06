package modelos.acrescimos.bebidas;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class BebidaKoCha extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public BebidaKoCha(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Ko-Cha ( + 0.00 )";
	}

	@Override
	public String getTipo() {
		return "BEBIDA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 0.00;
	}
		
}