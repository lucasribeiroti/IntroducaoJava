package FundamentosBasicos;

public class ConversaoNumeroString {

    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString());
        System.out.println("A quantidade de caracteres é de: " + num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2));
        System.out.println("A quantidade de caracteres é de: " + Integer.toString(num2).length());

        System.out.println(("" + num2).length()); // também funciona, mas é menos usual.

        Float num3 = 125.568F;
        System.out.println(Float.toString(num3));
        System.out.println("A quantidade de caracteres é de: " + Float.toString(num3).length());

        float num4 = 126.5695F;
        System.out.println(Float.toString(num4));
        System.out.println("A quantidade de caracteres é de: " + Float.toString(num4).length());

        Double num5 = 123.45678;
        System.out.println(num5.toString());
        System.out.println("A quantidade de caracteres é de: " + Double.toString(num5).length());

        double num6 = 123.456789;
        System.out.println(Double.toString(num6));
        System.out.println("A quantidade de caracteres é de: " + Double.toString(num6).length());
    }
}
/*
.length() = número de caracteres!
 */