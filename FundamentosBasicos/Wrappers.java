package FundamentosBasicos;

import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Byte a = Byte.parseByte("10"); // byte
        Short b = Short.parseShort("100"); // converter um valor em String para short
        Integer c = Integer.parseInt("1000"); // converter um valor em String para int
        Long d = 10005L; // long

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(a.byteValue());
        System.out.println((b.shortValue()));
        System.out.println(c.intValue());
        System.out.println(d.longValue());

        a = Byte.parseByte(entrada.next());
        b = Short.parseShort(entrada.next());
        c = Integer.parseInt(entrada.next());
        d = Long.parseLong(entrada.next());


        System.out.println(a * 2);
        System.out.println(b * 2);
        System.out.println(c * 2);
        System.out.println(d / 3.0);

        entrada.close();
    }
}