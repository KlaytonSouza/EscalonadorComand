package br.com.ufpb.APS;

public class FinalizarProcesso implements Comand{
	
	private String processo;
	private FachadaEscalonador fachada;
	
	public FinalizarProcesso(String processo) {
		this.processo = processo;
	}

	@Override
	public void executar() {
		fachada.getListaProcesso().remove(processo);

		
		
	}
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;
	}
}
	

	
		
	


	


