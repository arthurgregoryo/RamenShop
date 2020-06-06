package modelos.acrescimos.carnes;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class CarneBoi extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public CarneBoi(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Boi ( + 7.90)";
	}
	
	@Override
	public String getTipo() {
		return "CARNE";
	}
	
	@Override
	public Double getPreco() {
		return ramen.getPreco() + 7.90;
	}
	
	
}