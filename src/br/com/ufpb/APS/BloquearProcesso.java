package br.com.ufpb.APS;

public class BloquearProcesso implements Comand {
	private String nomeProcesso;
	private FachadaEscalonador fachada;

	public BloquearProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;

	}

	@Override
	public void executar() {
		fachada.getProcessoBloqueado().add(nomeProcesso);
		fachada.getListaProcesso().remove(nomeProcesso);

	}

	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;

	}
}
