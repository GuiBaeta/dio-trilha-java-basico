package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipaisMetodos {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 1 - Lista em ordem numérica:
		List<Integer> ordemNumerica = numeros.stream().sorted().collect(Collectors.toList());

		System.out.println("Desafio 1 - Ordem numérica: " + ordemNumerica);

		// Desafio 2 - Imprimir soma números pares
		int somaPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);

		System.out.println("Soma dos números pares: " + somaPares);

		// Desafio 3 - Verifique se todos os números da lista são positivos:

		boolean positivo = numeros.stream().allMatch(n -> n > 0);

		System.out.println("Todos os números são positivos: " + positivo);

		// Desafio 4 - Imprimir somente números pares

		List<Integer> NumerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
		
		System.out.println("Removendo números ímpares: " + NumerosPares);
		
		// Desafio 5 - Calcular a médica dos números maiores que 5
		
		double mediaMaior5 = numeros.stream().filter( n -> n > 5).mapToInt(Integer::intValue).average().orElse(0);
		
		System.out.println("Media dos numeros maiores que 5: " + mediaMaior5);
		
		
		// Desafio 6 - Verificar se a lista contém algum número maior que 10
		
		boolean maiorQue10 = numeros.stream().allMatch(n -> n > 10);

		System.out.println("Tem número maior que 10: " + maiorQue10);

	}

}
