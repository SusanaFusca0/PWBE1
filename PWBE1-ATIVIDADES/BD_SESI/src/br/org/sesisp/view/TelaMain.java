package br.org.sesisp.view;

import java.util.Scanner;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) {
		/*
		//instanciar um obj da class CrudDAO
		CrudDAO inserir_aluno = new CrudDAO();
		//instanciar um obj aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Antonio");
		aluno1.setIdade(23);
		inserir_aluno.create(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println( "Idade: " + aluno1.getIdade());
		//************************************************
		//Atualizar valores
		aluno1.setNome("Marcelo Vieira");
		aluno1.setIdade(18);
		aluno1.setRa(1);
		inserir_aluno.update(aluno1);
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println( "Idade: " + aluno1.getIdade());
		//************************************************
		//varrendo a lista
		System.out.println("Lendo a lista..");
		for(Aluno olho : inserir_aluno.read()){
			System.out.println("Dados do aluno: " + olho.getRa() + olho.getNome() + olho.getIdade());
		}
		//************************************************
		//excluindo 
		CrudDAO remover_aluno = new CrudDAO();
		remover_aluno.delete(1);
		*/
//ALTER TABLE alunos AUTO_INCREMENT = 1;	
//**********************************************CRIANDO MENU COM AS COISAS APRENDIDAS*********************************************
		
		
		//scanner
		Scanner entrada = new Scanner(System.in);
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno1 = new Aluno();
		int i = 0;
		while(i < 5) {
			System.out.println("Escolha o que voce deseja fazer: ");
			System.out.println("1 - Adicionar aluno");
			System.out.println("2 - Atualizar aluno");
			System.out.println("3 - Ver lista aluno");
			System.out.println("4 - Excluir aluno");
			System.out.println("5 - Parar o programa");
			i = entrada.nextInt();
			switch(i){
				case(1):
					System.out.println("Digite o nome do aluno:");
					aluno1.setNome(entrada.next());
					System.out.println("Digite a idade do aluno:");
					aluno1.setIdade(entrada.nextInt());
					inserir_aluno.create(aluno1);
					System.out.println("Nome: " + aluno1.getNome());
					System.out.println( "Idade: " + aluno1.getIdade());
					break;
				case(2):
					System.out.println("Digite o nome do aluno:");
					aluno1.setNome(entrada.next());
					System.out.println("Digite a idade do aluno:");
					aluno1.setIdade(entrada.nextInt());
					System.out.println("Digite o ra do aluno:");
					aluno1.setRa(entrada.nextInt());
					inserir_aluno.update(aluno1);
					System.out.println("Nome: " + aluno1.getNome());
					System.out.println( "Idade: " + aluno1.getIdade());
					System.out.println( "Ra: " + aluno1.getRa());
					break;
				case(3):
					for(Aluno olho : inserir_aluno.read()){
						System.out.println("Dados de aluno: ra: " + olho.getRa() + "/ nome: " + olho.getNome() + "/ idade: " +  olho.getIdade());
					}
					break;
				case(4):
					System.out.println("Qual o ra do aluno que voce deseja excluir:");
					int a = 0;
					a =entrada.nextInt();
					CrudDAO remover_aluno = new CrudDAO();
					remover_aluno.delete(a);
					break;
			}//fim switch
		}//fim while
	}//fim main
}//fim class