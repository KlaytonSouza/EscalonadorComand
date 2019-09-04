package br.com.ufpb.APS;

public class FinalizarProcesso implements Comand {

	private String nomeProcesso;
	private FachadaEscalonador fachada;

	public FinalizarProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
	}

	@Override
	public void executar() {
		fachada.getListaProcesso().remove(nomeProcesso);

	}

	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;

	}
}