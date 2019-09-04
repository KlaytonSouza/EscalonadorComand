package br.com.ufpb.APS;

public class FinalizarProcesso implements Comand{
	
	private String processo;
	
	public FinalizarProcesso(String processo) {
		this.processo = processo;
	}

	@Override
	public void executar() {
		int nomeProcessoEncontrado = -1;

		for(int k = 0; k<listaProcesso.size(); k++) {
			if(listaProcesso.get(k).equals(processo)) {
				nomeProcessoEncontrado = k;				
			}
		}if(nomeProcessoEncontrado >= 0) {
			listaProcesso.remove(nomeProcessoEncontrado);
		}

		// TODO Stub de método gerado automaticamente
		
	}

	
	

	
		
	


	

}
