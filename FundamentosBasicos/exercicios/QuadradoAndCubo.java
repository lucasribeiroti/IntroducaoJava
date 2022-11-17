package FundamentosBasicos.exercicios;

import java.util.Scanner;

public class QuadradoAndCubo {

    public static void main(String[] args) {
        // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        double valor = entrada.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("O valor em quadrado é: " + quadrado);
        System.out.println("O valor em cubo é: " + cubo);

        entrada.close();
    }
}