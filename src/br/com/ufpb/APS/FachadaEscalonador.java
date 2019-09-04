package br.com.ufpb.APS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class FachadaEscalonador {

	private Queue<String> listaProcesso;
	public ArrayList<String> getListaProcesso() {
		return (ArrayList<String>) listaProcesso;
	}	
	ArrayList<String> processoBloqueado;
	public ArrayList<String> getProcessoBloqueado(){
		return processoBloqueado;
	}
	
	
	
		
	





	private Stack pilhaComandos = new Stack();

	public void Exercutar(Comand c) {

	}

	public void executar(Comand c) {
		c.setFachada(this);
		c.executar();

	}

}
