package FundamentosBasicos.exercicios;

import java.util.Scanner;

public class BaseAlturaTriangulo {

    public static void main(String[] args) {
        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a altura do triângulo: ");
        double altura = entrada.nextDouble();

        System.out.print("Informe a base do triângulo: ");
        double base = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + area);

        entrada.close();
    }
}