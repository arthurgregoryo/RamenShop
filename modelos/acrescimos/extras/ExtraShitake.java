package modelos.acrescimos.extras;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class ExtraShitake extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public ExtraShitake(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Shitake ( + 6.90 )";
	}

	@Override
	public String getTipo() {
		return "EXTRA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 6.90;
	}
		
}