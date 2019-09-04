package br.com.ufpb.APS;

<<<<<<< HEAD
public class FinalizarProcesso implements Comand {

	private String nomeProcesso;
	private FachadaEscalonador fachada;

	public FinalizarProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
=======
public class FinalizarProcesso implements Comand{
	
	private String processo;
	private FachadaEscalonador fachada;
	
	public FinalizarProcesso(String processo) {
		this.processo = processo;
>>>>>>> 62db27b95e8cc64e738dcea1338e3052dc1cc86b
	}

	@Override
	public void executar() {
<<<<<<< HEAD
		fachada.getListaProcesso().remove(nomeProcesso);

	}

	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;

	}
}
=======
		fachada.getListaProcesso().remove(processo);

		
		
	}
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;
	}
}
	

	
		
	


	


>>>>>>> 62db27b95e8cc64e738dcea1338e3052dc1cc86b
