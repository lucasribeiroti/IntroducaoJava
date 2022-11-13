package FundamentosBasicos;

public class Temperatura {

    public static void main(String[] args) {
        final double fator = 5.0 / 9.0;
        final double ajuste = 32.0;

        double tempFahr = 57.0;
        double tempCels = (tempFahr - ajuste) * fator;

        System.out.println("O resultado é de: "+ tempCels +"ºC");

        tempFahr = 86;
        tempCels = (tempFahr - ajuste) * fator;

        System.out.println("O resultado é de: "+ tempCels +"ºC");

    }
}

/*
jshell no powershell ou cmd para utilizar o interpretador Java.
*/