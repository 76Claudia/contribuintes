import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes voce vai digitar? ");
		int N = sc.nextInt();
		System.out.println();
		
		for(int i=0; i<N; i++) {
			System.out.println("Digite os dados do " + (i+1) + "o" +" contribuinte: ");
			System.out.print("Renda anual com salario: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestacao de servico: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			
			TaxPayer tax =  new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			
			list.add(tax);
			
			
		}

		
		sc.close();
	}

}
