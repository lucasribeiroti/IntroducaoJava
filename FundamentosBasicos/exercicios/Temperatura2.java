package FundamentosBasicos.exercicios;

import java.util.Scanner;

public class Temperatura2 {

    public static void main(String[] args) {
        /*
        Criar um programa que leia a temperatura em Fahrenheit
        e converta para Celsius.
         */
        Scanner entrada = new Scanner(System.in);

        final double fator = 5.0 / 9.0;
        final double ajuste = 32.0;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahr = entrada.nextDouble();

        double cels = (fahr - ajuste) * fator;

        System.out.printf("%.1f°F = %.1f°C", fahr, cels);
        entrada.close();
    }
}