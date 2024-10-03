import java.util.Scanner;

public class CalculaPorcentagem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();

		if (salario <= 1412.00) {
			double primeiraFaixaIR = 0.05;
			System.out.println("Está é a quantidade descontada na sua faixa: " + salario * primeiraFaixaIR + " Corresponde a " + primeiraFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$: " + (salario - (salario * primeiraFaixaIR)));
		}else if (salario >= 1412.01 && salario <= 2428.00) {
			double segundaFaixaIR = 0.15;
			System.out.println("Esta é a quantidade descontada na sua faixa: " + salario * segundaFaixaIR + " Corresponde a " + segundaFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$: " + (salario - (salario * segundaFaixaIR)));
		} else if (salario >= 2428.01 && salario <= 4856.00) {
			double terceiraFaixaIR = 0.30;
			System.out.println("Esta é a quantidade descontada na sua faixa: " + salario * terceiraFaixaIR + " Corresponde a " + terceiraFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$:" + (salario - (salario * terceiraFaixaIR)));
		}else {
			System.out.println("Digite a faixa correta: 1/2/3!");
		}
	}
}
