package modelos.acrescimos.carnes;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class CarnePorco extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public CarnePorco(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Porco( + 5.90)";
	}
	
	@Override
	public String getTipo() {
		return "CARNE";
	}
	
	@Override
	public Double getPreco() {
		return ramen.getPreco() + 5.90;
	}
	
	
}
