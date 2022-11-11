package FundamentosBasicos.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        int b1 = 2;
        int b2 = 2;

        a1++; // a = a + 1
        System.out.println(a1);

        a2--; // a = a - 1
        System.out.println(a2);

        ++b1; // b = b + 1
        System.out.println(b1);

        --b2; // b = b - 1
        System.out.println(b2);

        System.out.println("Observe que...");
        System.out.println(++a1 == b1--); // true!!
        System.out.println(a1++ == b1--); // false!!
        System.out.println(a1 == b1); // false!!
        /*
        Da true por conta da precedência, o ++ antes do a significa que ele tem maior precedência com relação
        a comparação, ele incrementa o valor da variável antes de comparar.
        O -- depois do operando, tem uma precedência menor do que a comparação, só vai decrementar o valor de b
        depois de executar a comparação entre a e b -> (++a1 == b1) --
         */
    }
}
