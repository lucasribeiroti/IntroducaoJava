package FundamentosBasicos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2"); // true, pois compara dois valores dentro de uma mesma String!

        String s1 = new String ("2");
        System.out.println("2" == s1); // false, pois ele não compara valores e sim alocação na memória!
        System.out.println("2".equals(s1)); // true, pois compara o conteúdo e não a alocação da memória!

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String s2 = entrada.nextLine();
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
/*
.trim retira todos os espaços em branco que eu digitar no input.
o .next() já tira os espaços em branco
o .nextLine() não tira.
 */