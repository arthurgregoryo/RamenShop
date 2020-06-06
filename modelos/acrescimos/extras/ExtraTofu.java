package modelos.acrescimos.extras;

import modelos.Ramen;
import modelos.acrescimos.*;;

public class ExtraTofu extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public ExtraTofu(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Tofu ( + 2.70 )";
	}

	@Override
	public String getTipo() {
		return "EXTRA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 2.70;
	}
		
}