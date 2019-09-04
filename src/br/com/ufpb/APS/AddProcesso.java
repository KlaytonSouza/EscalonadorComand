package br.com.ufpb.APS;

import java.util.ArrayList;

public class AddProcesso implements Comand {
	private String nomeProcesso;
	
	
	
	public AddProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
		
	}
	public void Executar() {
		this.listaProcesso.add(nomeProcesso);
	}
}

