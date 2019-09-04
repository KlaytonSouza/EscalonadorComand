package br.com.ufpb.APS;

public class FinalizarProcesso implements Comand {

	private String Processo;
	private FachadaEscalonador fachada;

	public FinalizarProcesso(String Processo) {
		this.Processo = Processo;

	}

	@Override
	public void executar() {
		fachada.getListaProcesso().remove(Processo);

	}

	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;

	}

}

