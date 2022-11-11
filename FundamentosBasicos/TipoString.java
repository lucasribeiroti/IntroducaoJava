package FundamentosBasicos;
public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá, pessoal!".charAt(8));

        String s = "Boa tarde!";
        s = s.toUpperCase();

        System.out.println(s.charAt(7));

        String l = "Mocorongo";
        System.out.println(l.concat("!!!"));

        l = l.toUpperCase();
        System.out.println(l + "!!!");

        String u = "Boa tarde";
        System.out.println(u.startsWith("Boa"));
        System.out.println(u.startsWith("boa"));
        System.out.println(u.toLowerCase().startsWith("boa"));
        System.out.println(u.toUpperCase().endsWith("tarde"));
        System.out.println(u.toLowerCase().endsWith("tarde"));
        System.out.println(u.length());
        System.out.println(u.equals("boa tarde"));
        System.out.println(u.equalsIgnoreCase("boa tarde"));

        var nome = "Lucas";
        var sobrenome = "Ribeiro";
        var idade = 23;
        var salario = 12698.9888;
        System.out.println("Nome: " + nome + " " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);

        nome = "Ana Clara";
        sobrenome = "Fonseca";
        idade = 20;
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade);

        String teste = "Teste";
        System.out.println(teste.contains("este"));
        System.out.println(teste.contains("Este"));
    }
}
/*
".charAt()" imprime na tela o caractere na posição indicada.
".startsWith()" significa "começa com" e avalia true or false.
".endsWith()" significa "termina com" e avalia true or false.
".length()" conta quantos caracteres a string possui.
".equals()" comparação de igualdade.
".equalsIgnoreCase" ignora caracteres maiúsculos e minúsculos.
O Java é case-sensitive, então ele diferencia de maiúsculo de minúsculo nos caracteres.
".contains" verifica se a string de determinada variável possui caracteres que foi testado no parênteses.
 */