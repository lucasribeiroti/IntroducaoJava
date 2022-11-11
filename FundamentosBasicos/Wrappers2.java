package FundamentosBasicos;

public class Wrappers2 {

    public static void main(String[] args) {
        Float f = 123.0F; // float
        Double d = 125.58; // double
        Boolean bo = Boolean.parseBoolean("true"); // boolean
        Character c = 'a'; // char

        System.out.println(f.byteValue());
        System.out.println(f.toString().toUpperCase());

        System.out.println(d.byteValue());
        System.out.println(d.toString().toUpperCase());

        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        System.out.println(c.toString());
        System.out.println(c.toString().toUpperCase() + "...");
    }
}
