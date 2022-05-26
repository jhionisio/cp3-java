package ex41;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);
		int id;
		int quantidade;
		String nome;
		int opcao;
		String numero;
		String possuiEmail;
		String email;
		quantidade = 0;
		ArrayList <Contato> listaContato = new  ArrayList<>();
		
		do {
			System.out.println("\n -----> Lista Telefônica <----\n ");
			System.out.println("Escolha um opção: ");
			System.out.printf(" 1 - Criar Contato \n 2 - Alterar Contato \n 3 - Excluir Contato \n 4 - Lista de Contatos \n 5 - Sair \n");
			System.out.printf("\n Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				Contato contato = new Contato();
				
				id = listaContato.size ()+ 1;
				contato.setId(id);
				 	
				
				System.out.println("Digite o nome do contato: ");
				nome = ler.next();
				contato.setNome(nome);
				
				System.out.println(" Digite o número do contato: ");
				numero = ler.next();
				contato.setNumero(numero);
				
				System.out.println("O contato possui email? (S/N)");
				possuiEmail = ler.next().toUpperCase();
				
				if (possuiEmail.equals("S")) {
					System.out.println("Digite o email do contato: ");
					email = ler.next();
					contato.setEmail(email);
				}else {
					email = null;
				}
				
				listaContato.add(contato);
				quantidade+=1;
				System.out.println(" \n Cadastrado com sucesso!");
				System.in.read();
			}else if (opcao == 2) {
				for(Contato c : listaContato) {
					System.out.printf("ID: %d Nome do Contato: %s Email: %s Número : %s \n", c.getId(),c.getNome(), c.getEmail(), c.getNumero() );
				}
				System.out.printf("\n Digite o id que deseja atualizar: ");
				id = ler.nextInt();
				
				System.out.printf("\n Digite o novo número do contato: ");
				numero = ler.next();

				System.out.printf("\n Digite o novo email: ");
				email = ler.next();
				Contato contato  = listaContato.get(id- 1);
				
				contato.setNumero(numero);
				contato.setEmail(email);
				
				System.out.println("Contato atualizado com sucesso!");
				System.in.read();
			}else if (opcao == 3) {
				for(Contato c : listaContato) {
					System.out.printf("ID: %d Nome do Contato: %s Email: %s Número : %s \n", c.getId(),c.getNome(), c.getEmail(), c.getNumero() );
				}
				
				System.out.printf("\n Digite o id do contato que deseja excluir: ");
				id = ler.nextInt();
				
				listaContato.remove(id-1);
				quantidade -=1;
			}else if (opcao == 4) {
				System.out.printf("//////////////// Lista de Contatos (%d)//////////////// \n", quantidade);
				for(Contato c : listaContato) {
					System.out.printf("ID: %d Nome do Contato: %s Email: %s Número : %s \n", c.getId(),c.getNome(), c.getEmail(), c.getNumero() );
				}
			}
		}while(opcao != 5);
	}
}
