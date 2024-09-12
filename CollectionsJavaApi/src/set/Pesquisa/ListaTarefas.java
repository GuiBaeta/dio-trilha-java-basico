package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		this.tarefaSet.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaARemover = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa f : tarefaSet) {
				if (f.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaARemover = f;
					break;
				}
			}
			tarefaSet.remove(tarefaARemover);
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public void exibirTarefas() {
		if (!tarefaSet.isEmpty()) {
			System.out.println(this.tarefaSet);
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public int contarTarefas() {
		return tarefaSet.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		if (!tarefaSet.isEmpty()) {
			for (Tarefa f : tarefaSet) {
				if (f.isConcluida()) {
					tarefasConcluidas.add(f);
				}
			}
			return tarefasConcluidas;
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if (!tarefaSet.isEmpty()) {
			for (Tarefa f : tarefaSet) {
				if (!f.isConcluida()) {
					tarefasPendentes.add(f);
				}
			}
			return tarefasPendentes;
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public Tarefa marcarTarefaConcluida(String descricao) {
		Tarefa marcarTarefa = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa f : tarefaSet) {
				if (f.getDescricao().equalsIgnoreCase(descricao)) {
					f.setConcluida(true);
					break;
				}
			}
			return marcarTarefa;
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public Tarefa marcarTarefaPendente(String descricao) {
		Tarefa marcarTarefa = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa f : tarefaSet) {
				if (f.getDescricao().equalsIgnoreCase(descricao)) {
					f.setConcluida(false);
					break;
				}
			}
			return marcarTarefa;
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public void limparListaTarefas() {
		if (!tarefaSet.isEmpty()) {
			tarefaSet.clear();
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    //Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");
	   
	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }

}
