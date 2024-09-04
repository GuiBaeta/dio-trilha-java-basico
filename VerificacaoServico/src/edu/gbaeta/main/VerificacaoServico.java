package edu.gbaeta.main;

import java.util.Scanner;

public class VerificacaoServico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        int i = 1;
        while (i < partes.length) {
        	if(partes[i].equalsIgnoreCase(servico)) {
        		contratado = true;        		
        	}
        	i++;
        }
        
        //Gerando a Saída
        if (contratado == false) {
        	System.out.println("Nao");
        } else {
        	System.out.println("Sim");
        }
               
        scanner.close();
	}

}
