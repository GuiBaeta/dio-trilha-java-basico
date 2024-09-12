package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		this.alunoSet.add(new Aluno(nome, matricula, media));
	}

	public void removerAlunoPorMatricula(long matricula) {
		Aluno alunoParaRemover = null;
		if (!alunoSet.isEmpty()) {
			for (Aluno a : alunoSet) {
				if (a.getMatricula() == matricula) {
					alunoParaRemover = a;
					break;
				}
			}
			alunoSet.remove(alunoParaRemover);
			if (alunoParaRemover == null) {
				System.out.println("Aluno não foi encontrado!");
			}
		} else {
			System.out.println("A lista está vazia");
		}
	}

	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
		return alunoPorNome;
	}

	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunoPorNome = new TreeSet<>(new ComparatorPorNota());
		alunoPorNome.addAll(alunoSet);
		return alunoPorNome;
	}

	public void exibirAlunos() {
		if (!alunoSet.isEmpty()) {
			System.out.println(this.alunoSet);
		} else {
			throw new RuntimeException("A Lista está vazia!");
		}
	}

	public static void main(String[] args) {
		// Criando uma instância do GerenciadorAlunos
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

		// Adicionando alunos ao gerenciador
		gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
		gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
		gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
		gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

		// Exibindo todos os alunos no gerenciador
		System.out.println("Alunos no gerenciador:");
		gerenciadorAlunos.exibirAlunos();

		// Removendo um aluno com matrícula inválida e outro pelo número de matrícula
		gerenciadorAlunos.removerAlunoPorMatricula(000L);
		gerenciadorAlunos.removerAlunoPorMatricula(123457L);
		gerenciadorAlunos.exibirAlunos();

		// Exibindo alunos ordenados por nome
		System.out.println("Alunos por nome:");
		System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

		// Exibindo alunos ordenados por nota
		System.out.println("Alunos por nota:");
		System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
	}

}
