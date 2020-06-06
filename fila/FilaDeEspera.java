package fila;

import java.text.DecimalFormat;

import java.util.TreeMap;

import modelos.Pedido;

public class FilaDeEspera {

	private static TreeMap<Integer,Pedido> pedidos = new TreeMap<Integer,Pedido>();
	public static ContadorDePedidos contador = new ContadorDePedidos();

	// Muda status do pedido para ANDAMENTO e adiciona a fila
	public static void adiciona(Pedido pedido) {
		pedido.setStatus(Status.ANDAMENTO);
		contador.aumentaContador();
		pedido.setID((int) contador.retornaContador());
		pedidos.put((int) contador.retornaContador(),pedido);
		System.out.println("Iniciado preparo.");
		new Thread(new ContadorRunnable(pedido)).start();
	}

	// Muda status do pedido para FINALIZADO
	public static void finaliza(Pedido pedido) {
		pedidos.get(pedido.getID()).setStatus(Status.FINALIZADO);
		System.out.println("Pedido finalizado.");
	}

	// Retira o pedido caso tenha sido FINALIZADO
	public static void retirada(int numPedido) throws Exception {
		if (pedidos.containsKey(numPedido)) {
			if (pedidos.get(numPedido).getStatus() == Status.FINALIZADO) {
				pedidos.get(numPedido).finalize();
				pedidos.remove(numPedido);
				System.out.println("Pedido retirado!");
			} else if (pedidos.get(numPedido).getStatus() == Status.ANDAMENTO) {
				System.out.println("Pedido em andamento!");
			}
		} else {
			System.out.println("Pedido inexistente!");
		}
	}

	// Retorna qual o primeiro pedido
	public static Pedido retornaPrimeiro() {
		return pedidos.get(pedidos.firstKey());
	}
	
	public static Pedido retornaKey(int key) {
		return pedidos.get(key);
	}

	public static String toText() {
		String content = "";
		DecimalFormat format = new DecimalFormat("#.##");
		if(!pedidos.isEmpty())
		for (int i = pedidos.firstKey();i <= pedidos.lastKey(); i++)
			if(pedidos.containsKey(i)) {
			content += "ID do Pedido: " + pedidos.get(i).getID() + " ( \n" + "(\nStatus: "
					+ Status.toString(pedidos.get(i).getStatus()) + "\n" + "Total a pagar: R$"
					+ format.format(pedidos.get(i).getPreco()) + "\n" + pedidos.get(i) + "\n)\n";
			}
		return content;
	}

}
