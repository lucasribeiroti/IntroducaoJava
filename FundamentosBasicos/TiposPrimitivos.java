package FundamentosBasicos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 56;
        int id = 223;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true;

        // Tipo char
        char status = 'A'; // Ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        // ID
        System.out.println("Id " + id + " ganha R$ " + salario);

        // Férias
        System.out.println("Férias: " + estaDeFerias);

        // Status
        System.out.println("Status: " + status);
    }
}