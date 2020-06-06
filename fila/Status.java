package fila;

import interfaces.StatusInterface;

public class Status implements StatusInterface{
	
	public static String toString(int status) {
		switch(status) {
		case 1: return "RECEBIDO";
		case 2: return "ANDAMENTO";
		case 3: return "FINALIZADO";
		default: return "STATUS INVALIDO";
		}
	}
	
}
