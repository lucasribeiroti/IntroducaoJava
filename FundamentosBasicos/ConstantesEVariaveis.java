package FundamentosBasicos;

public class ConstantesEVariaveis {

    public static void main(String[] args) {
        double raio = 3.8;
        final double pi = 3.14159;
        double area = pi * (raio * raio);

        System.out.println(area);

        raio = 4.4;
        area = pi * (raio * raio);

        System.out.println(area);
    }
}
/*
final: uma vez que defini o valor ele não poderá ser mudado no algorítmo.
Posso definir outro valor de uma mesma variável se não estiver definido como final, a exemplo de raio acima.
*/