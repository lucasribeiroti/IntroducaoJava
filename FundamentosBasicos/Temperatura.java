package FundamentosBasicos;

public class Temperatura {

    public static void main(String[] args) {
        double tempFahr = 57.0;
        double tempCels = ((tempFahr - 32) * 5) / 9;

        System.out.println(tempCels);
    }
}
/**
 * jshell no powershell ou cmd para utilizar o interpretador Java.
 * tempCels também pode ter a seguinte operação: (tempFahr - 32) * (5.0/9.0);
 */