import java.util.Scanner;

public class CalculaPorcentagem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite sua faixa do Imposto de Renda: (1/2/3)");
		int faixa = sc2.nextInt();

		double primeiraFaixaIR = 0.05;
		double segundaFaixaIR = 0.15;
		double terceiraFaixaIR = 0.30;

		if (faixa == 1) {
			System.out.println("Está é a quantidade descontada na sua faixa: " + salario * primeiraFaixaIR);
			System.out.println("Seu salário líquido: " + (salario - (salario * primeiraFaixaIR)));
		}else if (faixa == 2) {
			System.out.println("Esta é a quantidade descontada na sua faixa: " + salario * segundaFaixaIR);
			System.out.println("Seu salário líquido: " + (salario - (salario * segundaFaixaIR)));
		} else if (faixa == 3) {
			System.out.println("Esta é a quantidade descontada na sua faixa: " + salario * terceiraFaixaIR);
			System.out.println("Seu salário líquido " + (salario - (salario * terceiraFaixaIR)));
		}else {
			System.out.println("Digite a faixa correta: 1/2/3!");
		}
	}
}
