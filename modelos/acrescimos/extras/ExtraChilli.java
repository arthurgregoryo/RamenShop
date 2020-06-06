package modelos.acrescimos.extras;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class ExtraChilli extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public ExtraChilli(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Chilli ( + 2.50 )";
	}

	@Override
	public String getTipo() {
		return "EXTRA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 2.50;
	}
		
}