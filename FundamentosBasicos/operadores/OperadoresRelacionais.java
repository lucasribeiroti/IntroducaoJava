package FundamentosBasicos.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        int a = 97; // 97 é a posição da letra a na tabela unicode
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);
        System.out.println(30 != 30);

        double nota = 7.1;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto: " + temDesconto);

    }
}
/*
== igual
> maior que
< menor que
>= maior igual
<= menor igual
!= diferente
 */