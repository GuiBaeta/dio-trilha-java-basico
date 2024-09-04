package main;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador{

	public Iphone() { 
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando a Música");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a Música");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a Música");
	}

	@Override
	public void voltarMusica() {
		System.out.println("Voltar para a música anterior");
	}

	@Override
	public void avançarMusica() {
		System.out.println("Avançar para a próxima música");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentar Volume da Música");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuir Volume da Música");
	}

	@Override
	public void iniciarChamada() {
		System.out.println("Iniciar Chamada telefonica");
	}

	@Override
	public void finalizarChamada() {
		System.out.println("Finalizar Chamada telefonica");
	}

	@Override
	public void sileciarMicrofone() {
		System.out.println("Sileciar Microfone durante a Chamada telefonica");
	}

	@Override
	public void vivaVoz() {
		System.out.println("Colocar Chamada telefonica no Viva-Voz");
	}

	@Override
	public void adicionarOutraPessoaAChamada() {
		System.out.println("Adicionar outra pessoa Chamada telefonica");
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atender Chamada telefonica recebida");
	}

	@Override
	public void rejeitarLigacao() {
		System.out.println("Rejeitar Chamada telefonica recebida");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessar página" + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova Aba");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página atual");
	}

	@Override
	public void alterarAba() {
		System.out.println("Alterar Aba");
	}

	@Override
	public void voltarPagina() {
		System.out.println("Voltar a página anterior");
	}

	@Override
	public void avançarPagina() {
		System.out.println("Avançar para a próxima página");
	}
	
	

}
