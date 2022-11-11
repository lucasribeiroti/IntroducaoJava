package FundamentosBasicos;

public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {
        double d = 1; // implícita
        System.out.println(d);

        float f = (float) 1.12345; // conversão explícita (CAST), é a mesma coisa que float f = 1.0F;
        System.out.println(f);

        int i = 127; // o byte suporta até o valor 127!
        byte b = (byte) i; // conversão explícita (CAST).
        System.out.println(b);

        double e = 1.99980;
        int y = (int) e;
        System.out.println(y); // conversão explícita (CAST), imprime o valor sem casa decimal.
    }
}
/*
Tipos primitivos: byte, short, int, long.
o Java não analisa os valores, só analisa tipos.
 */
