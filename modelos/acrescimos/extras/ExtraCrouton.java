package modelos.acrescimos.extras;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class ExtraCrouton extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public ExtraCrouton(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Croutons ( + 2.00 )";
	}

	@Override
	public String getTipo() {
		return "EXTRA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 2.00;
	}
		
}