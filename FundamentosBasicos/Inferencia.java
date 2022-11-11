package FundamentosBasicos;

public class Inferencia {

    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        a = 12; // vai imprimir como 12.0 pois já defini a como double.
        System.out.println(a);

        var b = 5.5;
        System.out.println(b);

        var c = "Lucas";
        System.out.println(c);

        c = "Ana Clara";
        System.out.println(c);

        double d; // variável foi declarada.
        d = 6.6; // variável foi inicializada.
        System.out.println(d); // variável foi usada!

        double e = 22;
        System.out.println(e);
    }
}

/*
var e;
e = 123.45; NÃO FUNCIONA!
Posso atribuir um número inteiro (sem ponto flutuante) em uma variável do tipo double.
Não posso atribuir um double (com ponto flutuante) em uma variável do tipo int de forma direta.
*/