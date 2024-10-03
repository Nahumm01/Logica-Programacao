import java.util.Scanner;

public class CalculaPorcentagem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();

		if (salario <= 1412.00) {
			System.out.println("Você está isento!");
		}
		if (salario >= 1412.01 && salario <= 2428.00) {
			double primeiraFaixaIR = 0.075;
			System.out.println("Está é a quantidade descontada na sua faixa: " + Math.round( salario * primeiraFaixaIR) + " Corresponde a " + primeiraFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$: " + (salario - (salario * primeiraFaixaIR)));
		}else if (salario >= 2428.01 && salario <= 4856.00) {
			double segundaFaixaIR = 0.15;
			System.out.println("Esta é a quantidade descontada na sua faixa: " + Math.round(salario * segundaFaixaIR) + " Corresponde a " + segundaFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$: " + (salario - (salario * segundaFaixaIR)));
		} else if (salario >= 4856.01 && salario <= 9712.02) {
			double terceiraFaixaIR = 0.225;
			System.out.println("Esta é a quantidade descontada na sua faixa: " + Math.round(salario * terceiraFaixaIR) + " Corresponde a " + terceiraFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$:" + (salario - (salario * terceiraFaixaIR)));
		}else if (salario >= 9712.03) {
			double quartaFaixaIR = 0.33;
			System.out.println("Esta é a quantidade descontada na sua faixa: " + Math.round(salario * quartaFaixaIR)  + " Corresponde a " + quartaFaixaIR*100 + "%");
			System.out.println("Seu salário líquido R$:" + (salario - (salario * quartaFaixaIR)));
		}
	}
}
