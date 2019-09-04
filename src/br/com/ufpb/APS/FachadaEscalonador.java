package br.com.ufpb.APS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class FachadaEscalonador {

	private Queue<String> listaProcesso;
	private Stack pilhaComandos = new Stack();

	public void Exercutar(Comand c) {

	}

	public void executar(Comand c) {
		c.setFachada(this);
		c.executar();

	}

}
