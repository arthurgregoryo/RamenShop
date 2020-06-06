package modelos;

public class RamenMedio extends Ramen{
	//RamenMedio que implementa a InterfaceRamen
	
	@Override
	public String getNome() {
		return "Ramen Medio ( 12.90 )";
	}

	@Override
	public String getTipo() {
		return "TAMANHO";
	}

	@Override
	public Double getPreco() {
		return 12.90;
	}
	
	@Override
	public String toString() {
		return "Ramen Medio ( 12.90 )";
	}
}
