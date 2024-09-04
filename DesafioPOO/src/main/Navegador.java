package main;

public interface Navegador {
	public void exibirPagina(String url);
	
	public void adicionarNovaAba();
	
	public void atualizarPagina();
	
	public void alterarAba();
	
	public void voltarPagina();
	
	public void avançarPagina();
	
}
