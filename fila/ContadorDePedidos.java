package fila;

import interfaces.ContadorInterface;

public class ContadorDePedidos implements ContadorInterface{
	private static int contadorDePedidos = 0;

	@Override
	public long retornaContador() {
		return (int) contadorDePedidos;
	}

	@Override
	public void aumentaContador() {
		contadorDePedidos++;
		
	}

	@Override
	public void reduzContador() {
		contadorDePedidos--;
		
	}

	@Override
	public void zeraContador() {
		contadorDePedidos = 0;
		
	}
}
