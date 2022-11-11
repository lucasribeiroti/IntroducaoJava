package FundamentosBasicos.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = 1 < 2;
        boolean condicao2 = 3 > 7;
        boolean condicao3 = true;

        System.out.println(condicao1 && condicao2); // e
        System.out.println(condicao1 || condicao2); // ou
        System.out.println(condicao1 ^ condicao3); // ou exclusivo
        System.out.println(!condicao1 ^ condicao3); // ou exclusivo

        // Tabela verdade &&
        System.out.println("Tabela verdade do E:");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // Tabela verdade ||
        System.out.println("Tabela verdade do OU:");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Tabela verdade ^
        System.out.println("Tabela verdade do OU EXCLUSIVO:");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}