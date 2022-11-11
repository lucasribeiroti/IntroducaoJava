package FundamentosBasicos;

import java.util.Scanner;

public class DesafioConversao {
    /*
    Usar três valores de entrada para um salário de um funcionário em forma de String, após isso
    somar os três salários e imprimir a média (double), funcionando com a separação de casas
    decimais com vírgula ou ponto flutuante.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String valor1 = entrada.next().replace("," , ".");

        System.out.print("Digite o segundo salário: ");
        String valor2 = entrada.next().replace("," , ".");

        System.out.print("Digite o terceiro salário: ");
        String valor3 = entrada.next().replace("," , ".");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média é de: " + media);

        entrada.close();
    }
}
/*
entrada.next().replace("," , ".") substitui na string qualquer vírgula por ponto, caso o usuário desejar
separar as casas decimais por vírgula e não por ponto, dessa forma não atrapalhará o resultado final.
 */