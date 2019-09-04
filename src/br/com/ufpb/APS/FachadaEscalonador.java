package br.com.ufpb.APS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class FachadaEscalonador {
	private TipoEscalonador tipoEscalonador;
	private int quantum;
	public TipoEscalonador getTipoEscalonador() {
		return tipoEscalonador;
	}

	public int getQuantum() {
		return quantum;
	}

	public int getTick() {
		return tick;
	}

	public int getControlador() {
		return controlador;
	}

	public String getRodando() {
		return rodando;
	}

	public String getProcessoParaSerFinalizado() {
		return processoParaSerFinalizado;
	}

	public String getProcessoParaSerBloqueado() {
		return processoParaSerBloqueado;
	}

	public String getProcessoParaSerRetomado() {
		return processoParaSerRetomado;
	}

	public Stack getPilhaComandos() {
		return pilhaComandos;
	}


	private int tick;
	private int controlador;
	private Queue<String> listaProcesso;
	private ArrayList<String> processoBloqueado;
//private ArrayList<String> temp;
	private String rodando;
	private String processoParaSerFinalizado;
	private String processoParaSerBloqueado;
	private String processoParaSerRetomado;
	private ArrayList<String> processoRetomados;
	
	public ArrayList<String> getProcessoRetomados() {
		return processoRetomados;
	}

	public ArrayList<String> getListaProcesso() {
		return (ArrayList<String>) listaProcesso;
	}	
	public ArrayList<String> getProcessoBloqueado(){
		return processoBloqueado;
	}
	

	private Stack pilhaComandos = new Stack();

	public void exercutar(Comand c) {

	}

	public void executar(Comand c) {
		c.setFachada(this);
		c.executar();

	}
	public FachadaEscalonador(TipoEscalonador tipoEscalonador) {
		this.quantum = 3;
		this.tick = 0;
// this.rodando = "";
		this.tipoEscalonador = tipoEscalonador;
		this.listaProcesso = new LinkedList<String>();
		this.processoBloqueado = new ArrayList<String>();
//this.temp = new ArrayList<String>();
	}

	public FachadaEscalonador(TipoEscalonador roundrobin, int quantum) {
		this.quantum = quantum;
		this.tick = 0;
		this.tipoEscalonador = roundrobin;
		this.listaProcesso = new LinkedList<String>();
		this.processoBloqueado = new ArrayList<String>();
//this.temp = new ArrayList<String>();

	}


}
