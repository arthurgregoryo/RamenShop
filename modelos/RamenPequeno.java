package modelos;

public class RamenPequeno extends Ramen{
	//RamenPequeno que implementa a InterfaceRamen

	@Override
	public String getNome() {
		return "Ramen Pequeno ( 9.90 )";
	}

	@Override
	public String getTipo() {
		return "TAMANHO";
	}

	@Override
	public Double getPreco() {
		return 9.90;
	}

	@Override
	public String toString() {
		return "Ramen Pequeno ( 9.90 )";
	}
}
