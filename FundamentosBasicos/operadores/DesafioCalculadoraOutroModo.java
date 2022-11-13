package FundamentosBasicos.operadores;

import java.util.Scanner;

public class DesafioCalculadoraOutroModo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String operacao = entrada.next();

        double resultado = "=".equals(operacao) ? num1 + num2 : (num2 + num1);
        resultado = "-".equals(operacao) ? num1 - num2: resultado;
        resultado = "*".equals(operacao) ? num1 * num2: resultado;
        resultado = "/".equals(operacao) ? num1 / num2: resultado;
        resultado = "%".equals(operacao) ? num1 % num2: resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        entrada.close();
    }
}