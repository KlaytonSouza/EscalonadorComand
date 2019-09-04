package br.com.ufpb.APS;

public class RetomarProcesso implements Comand {
	private String nomeProcesso;
	private FachadaEscalonador fachada;

	public RetomarProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;

	}

	@Override
	public void executar() {
		fachada.getProcessoRetomados().add(nomeProcesso);

	}

	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;

	}
}
