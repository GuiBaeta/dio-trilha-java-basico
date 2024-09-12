package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasUnicasSet;

	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicasSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		this.palavrasUnicasSet.add(new String(palavra));
	}

	public void removerPalavra(String palavra) {
		String palavraParaRemover = null;
		if (!palavrasUnicasSet.isEmpty()) {
			for (String p : palavrasUnicasSet) {
				if (p.equalsIgnoreCase(palavra)) {
					palavraParaRemover = p;
					break;
				}
			}
			palavrasUnicasSet.remove(palavraParaRemover);
		} else {
			System.out.println("O conjunto está vazio");
		}
	}

	public Boolean verificarPalavra(String palavra) {
		return palavrasUnicasSet.contains(palavra);
	}

	public void exibirPalavrasUnicas() {
		if (!palavrasUnicasSet.isEmpty()) {
			System.out.println(this.palavrasUnicasSet);
		} else {
			System.out.println("O carrinho está vazio!");
		}
	}

	public static void main(String[] args) {
		// Criando uma instância da classe ConjuntoPalavrasUnicas
		ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		// Adicionando linguagens únicas ao conjunto
		conjuntoLinguagens.adicionarPalavra("Java");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("JavaScript");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("C++");
		conjuntoLinguagens.adicionarPalavra("Ruby");

		// Exibindo as linguagens únicas no conjunto
		conjuntoLinguagens.exibirPalavrasUnicas();

		// Removendo uma linguagem do conjunto
		conjuntoLinguagens.removerPalavra("Python");
		conjuntoLinguagens.exibirPalavrasUnicas();

		// Removendo uma linguagem inexistente
		conjuntoLinguagens.removerPalavra("Swift");

		// Verificando se uma linguagem está no conjunto
		System.out.println("A linguagem 'Java' está no conjunto? " +
		conjuntoLinguagens.verificarPalavra("Java"));
		System.out.println("A linguagem 'Python' está no conjunto? " +
		conjuntoLinguagens.verificarPalavra("Python"));

		//Exibindo as linguagens únicas atualizadas no conjunto
		conjuntoLinguagens.exibirPalavrasUnicas();
	}

}
