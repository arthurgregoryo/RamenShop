package modelos.acrescimos.extras;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class ExtraCremeAlho extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public ExtraCremeAlho(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Creme de Alho ( + 1.50 )";
	}

	@Override
	public String getTipo() {
		return "EXTRA";
	}

	@Override
	public Double getPreco() {
		return ramen.getPreco() + 1.50;
	}
		
}