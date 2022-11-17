package FundamentosBasicos.exercicios;

import java.util.Scanner;

public class Temperatura3 {

    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner entrada = new Scanner(System.in);

        final double fator = 1.8;
        final double ajuste = 32.0;

        System.out.print("Digite a temperatura em Celsius: ");
        double cels = entrada.nextDouble();

        double fahr = (cels * fator) + ajuste;

        System.out.printf("%.1f°F = %.1f°C", cels, fahr);
        entrada.close();
    }
}