package fila;

import java.util.Calendar;
import java.util.Random;

import modelos.Pedido;

public class ContadorRunnable implements Runnable {

	static Random random = new Random();
	private static int contador = Calendar.getInstance().get(Calendar.MINUTE);
	private final static int TEMPO_DE_ESPERA = random.nextInt(2)+1;
	private Pedido pedido;
	
	public ContadorRunnable(Pedido pedido) {
		this.pedido = pedido;
		//run();
	}

	@Override
	public void run() {
		int contante = contador;
		System.out.println("Executou o contador do pedido!");
		while (contador + TEMPO_DE_ESPERA > contante) {
			contante = Calendar.getInstance().get(Calendar.MINUTE);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		FilaDeEspera.finaliza(pedido);
	}

}
