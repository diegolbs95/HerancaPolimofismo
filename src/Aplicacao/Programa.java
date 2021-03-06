package Aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List <Funcionario> list = new ArrayList<>();
			
				
		
		System.out.print("Entre com numero de funcionario: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionario # "+(i+1));
			System.out.print("Funcionario tercerizado (y / n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Total de horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor da hora: ");
			double valorHoras = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Taxa adicional: ");
				double taxaAdicional = sc.nextDouble();
				
				list.add(new FuncionarioTercerizado(nome, horas, valorHoras, taxaAdicional));
			}
			else {
				
				list.add(new Funcionario(nome, horas, valorHoras));
			}		
		
		}	
			System.out.println();
			System.out.println("Pagamento: ");
			for (Funcionario fun : list) {
				System.out.println(fun.getNome() + " - $" + String.format("%.2f",  fun.Pagamento()));
				
			}
		
			
		}
		
		
	}


