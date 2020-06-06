package modelos.acrescimos.carnes;

import modelos.Ramen;
import modelos.acrescimos.Acrescimo;

public class CarneVegano extends Acrescimo{

	@SuppressWarnings("unused")
	private final Ramen ramen;
	
	public CarneVegano(Ramen ramen) {
		this.ramen = ramen;
	}
	
	@Override
	public String getNome() {
		return ramen.getNome() + ", Vegano ( + 3.90)";
	}
	
	@Override
	public String getTipo() {
		return "CARNE";
	}
	
	@Override
	public Double getPreco() {
		return ramen.getPreco() + 3.90;
	}
	
	
}
