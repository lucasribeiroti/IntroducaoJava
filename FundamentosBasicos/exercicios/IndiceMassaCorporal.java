package FundamentosBasicos.exercicios;

import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args) {

        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        double peso = entrada.nextInt();

        System.out.print("Informe a altura em cm: ");
        double altura = entrada.nextInt();

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("O índice de massa corporal é de: %f", imc);

        entrada.close();
    }
}