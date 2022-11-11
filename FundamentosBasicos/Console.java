package FundamentosBasicos;

import java.util.Scanner;
public class Console {
    public static void main(String[] args) {
        System.out.print("Lucas ");
        System.out.println("Ribeiro");
        System.out.printf("Megasena: %d, %d, %d, %d, %d, %d%n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.2f%n", 1234.5678);

        Scanner entrada = new Scanner(System.in); // monitora o que vou digitar.
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite o sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos de idade.%n", nome, sobrenome, idade);

        entrada.close();
    }
}
/*
ln é pra quebrar linha do print.
%n é pra quebrar a linha dentro da string.
%d na String é pra classificar como número inteiro, depois do vírgula definir os valores.
\n também quebra linha.
O Scanner é necessário importar.
"System.in" é pra receber alguma informaçao de entrada (mouse, teclado, câmera, etc).
"System.out" é pra transmitir alguma informação de saída (impressora, monitor, etc).
".nextLine()" para string, salvar dentro de uma variável pra usar posteriormente.
".nextInt()" para inteiro, salvar dentro de uma variável pra usar posteriormente.
"entrada.close(); é pra fechar o Scanner
 */
