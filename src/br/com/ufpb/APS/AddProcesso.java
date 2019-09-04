package br.com.ufpb.APS;

import java.util.ArrayList;


public class AddProcesso implements Comand {
	private String nomeProcesso;
	private FachadaEscalonador fachada;
	
	
	
	
	public AddProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
		
	}

	@Override
	public void executar() {
		fachada.getListaProcesso().add(nomeProcesso);
		
	}
	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;
		
		
	}
}

