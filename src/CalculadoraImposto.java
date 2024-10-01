import java.util.Scanner;

public class CalculadoraImposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, insira seu salário atual!");
		double salario = sc.nextDouble();
		double porcentagem = 0.1544;
		double imposto = salario * porcentagem;

		System.out.println(imposto);
	}
}
