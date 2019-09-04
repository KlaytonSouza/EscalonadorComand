package br.com.ufpb.APS;

import java.util.Stack;

public class FachadaEscalonador {

	public Comand c;
	private Stack pilhaComandos = new Stack();
	

	public void Exercutar(Comand c) {

	}

	public void executar(Comand c) {
		c.setFachada(this);
		c.executar();
	}
	
	

}
