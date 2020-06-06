package fila;

import aplicacao.RamenShop;

public class AtualizadorFila implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("Atualizando Lista...");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				System.out.println("Atualizador de Fila foi interrompido inesperadamente!");
			}
			if(FilaDeEspera.contador.retornaContador() > 0)
				RamenShop.textAreaListaDeEspera.setText(FilaDeEspera.toText());
		}
	}
	
}
