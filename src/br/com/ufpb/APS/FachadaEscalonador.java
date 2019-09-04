package br.com.ufpb.APS;

import java.util.Stack;

public class FachadaEscalonador {
	public Comand c;

	public void Exercutar(Comand c) {

	};

	private Stack pilhaComandos = new Stack();

	public void executar(Comand c) {

		c.Executar();
	}

}
