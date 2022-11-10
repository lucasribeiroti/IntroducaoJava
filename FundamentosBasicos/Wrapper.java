package FundamentosBasicos;

import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Byte a = 100; // byte
        Short b = 1000; // short
        Integer c = Integer.parseInt(entrada.next()); // int
        Long d = 100000L; // long

        System.out.println(a.byteValue());
        System.out.println(b);
        System.out.println(c * 2);
        System.out.println(d);

        entrada.close();

    }
}