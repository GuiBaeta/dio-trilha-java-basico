package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> agenda;

	public AgendaContatos() {
		this.agenda = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		this.agenda.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		if (!agenda.isEmpty()) {
			System.out.println(this.agenda);
		} else {
			System.out.println("O carrinho está vazio!");
		}
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> palavrasParaExibir = new HashSet<>();
		if (!agenda.isEmpty()) {
			for (Contato c : agenda) {
				if (c.getNome().startsWith(nome)) {
					palavrasParaExibir.add(c);
				}
			}
			return palavrasParaExibir;
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if (!agenda.isEmpty()) {
			for (Contato c : agenda) {
				if (c.getNome().equalsIgnoreCase(nome)) {
					c.setNumeroTelefone(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}

	public static void main(String[] args) {
		// Criando uma instância da classe AgendaContatos
		AgendaContatos agendaContatos = new AgendaContatos();

		// Exibindo os contatos no conjunto (deve estar vazio)
		agendaContatos.exibirContatos();

		// Adicionando contatos à agenda
		agendaContatos.adicionarContato("João", 123456789);
		agendaContatos.adicionarContato("Maria", 987654321);
		agendaContatos.adicionarContato("Maria Fernandes", 55555555);
		agendaContatos.adicionarContato("Ana", 88889999);
		agendaContatos.adicionarContato("Fernando", 77778888);
		agendaContatos.adicionarContato("Carolina", 55555555);

		// Exibindo os contatos na agenda
		agendaContatos.exibirContatos();

		// Pesquisando contatos pelo nome
		System.out.println(agendaContatos.pesquisarPorNome("Maria"));

		// Atualizando o número de um contato
		Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
		System.out.println("Contato atualizado: " + contatoAtualizado);

		// Exibindo os contatos atualizados na agenda
		System.out.println("Contatos na agenda após atualização:");
		agendaContatos.exibirContatos();
	}

}
