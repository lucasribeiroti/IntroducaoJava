package FundamentosBasicos;

import javax.swing.*;

public class DesafioCalculadora {

    public static void main(String[] args) {
        /*
        Ler o primeiro número.
        Ler o segundo número.
        Pedir o sinal de operação (+, -, * e /, %)
        Imprimir o resultado
         */

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, - , *, /, %): ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double resultado;
        resultado = "+".equals(operacao) ? num1 + num2: (num1 + num2);
        resultado = "-".equals(operacao) ? num1 - num2: resultado;
        resultado = "*".equals(operacao) ? num1 * num2: resultado;
        resultado = "/".equals(operacao) ? num1 / num2: resultado;
        resultado = "%".equals(operacao) ? num1 % num2: resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
    }
}