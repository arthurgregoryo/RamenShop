package modelos;

import fila.Status;
import interfaces.PedidoInterface;

public class Pedido implements PedidoInterface {
	
	private double precoTotal;
	private int numeroPedido;
	private int status;
	private int id;
	Produto produto;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		precoTotal = produto.getPreco();
		setStatus(Status.RECEBIDO);
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	@Override
	public double getPreco() {
		return precoTotal;
	}

	@Override
	public void setPreco(double preco) {
		precoTotal = preco;
	}

	@Override
	public int getStatus() {
		return status;
	}

	@Override
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public int getNumero() {
		return numeroPedido;
	}

	@Override
	public void setNumero(int numero) {
		this.numeroPedido = numero;
	}

	@Override
	public Produto getProduto() {
		return this.produto;
	}

	@Override
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return this.produto.getNome();	
	}
	
	@Override
	public void finalize() {
		System.gc();
		System.out.println("Pedido finalizado!");
	}

}
