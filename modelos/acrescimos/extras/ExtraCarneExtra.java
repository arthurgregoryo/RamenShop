package modelos.acrescimos.extras;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class ExtraCarneExtra extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public ExtraCarneExtra(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Carne Extra ( + 4.00 )";
	}

	@Override
	public String getTipo() {
		return "EXTRA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 4.00;
	}
		
}
