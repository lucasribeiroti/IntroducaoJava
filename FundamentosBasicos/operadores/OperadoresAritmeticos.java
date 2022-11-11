package FundamentosBasicos.operadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        System.out.println(2 + 3);

        var x = 123.456;
        double y = 115.232;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int z = 8;
        int k = 3;

        System.out.println(z + k);
        System.out.println(z - k);
        System.out.println(z * k);
        System.out.println(z / k);

        System.out.println(z / (double) k); // CAST
        System.out.println(z / (float) k); // CAST

        System.out.println(z % k); // resto da divisão
        System.out.println(8 % k); // resto da divisão
        System.out.println(z % 3); // resto da divisão

        System.out.println((x + y) - (z * k));
        System.out.println(x + y - z * k);
    }
}
/*
A inferência de tipo é usada na palavra-chave "var" na qual ela detecta automaticamente o tipo de
dados de uma variável com base no contexto circundante.
 */