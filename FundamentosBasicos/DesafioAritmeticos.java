package FundamentosBasicos;

public class DesafioAritmeticos {

    public static void main(String[] args) {
        int primeiraExpressao = (6 * (3 + 2));
        int segundaExpressao = (int) Math.pow(primeiraExpressao, 2);
        int terceiraExpressao = 3 * 2;
        int resultado1 = segundaExpressao / terceiraExpressao;
        System.out.println("Resultado parcial 1: " + resultado1);

        int quartaExpressao = ((1 - 5) * (2 - 7));
        int quintaExpressao = quartaExpressao / 2;
        int resultado2 = (int) Math.pow(quintaExpressao, 2);
        System.out.println("Resultado parcial 2: " + resultado2);

        int setimaExpressao = (resultado1 - resultado2);
        int resultado3 = (int) Math.pow(setimaExpressao, 3);
        System.out.println("Resultado parcial 3: " + resultado3);

        int resultado4 = (int) Math.pow(10, 3);
        System.out.println("Resultado parcial de 10 elevado a 3: " + resultado4);

        int resultadoFinal = resultado3 / resultado4;
        System.out.println("O resultado final do desafio é de: " + resultadoFinal);
    }
}