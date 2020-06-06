package aplicacao;

import java.awt.EventQueue;

public class Aplicacao {

	public static void main(String[] args) {
		
		 EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RamenShop window = new RamenShop();
					window.frmRamenshop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
