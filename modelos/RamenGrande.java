package modelos;

public class RamenGrande extends Ramen{
	//RamenGrande que implementa a InterfaceRamen
	
	@Override
	public String getNome() {
		return "Ramen Grande ( 15.90 )";
	}

	@Override
	public String getTipo() {
		return "TAMANHO";
	}

	@Override
	public Double getPreco() {
		return 15.90;
	}

	@Override
	public String toString() {
		return "Ramen Grande ( 15.90 )";
	}
	
		
}
