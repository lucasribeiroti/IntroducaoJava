package FundamentosBasicos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.concat("!!!");
        s = s.toUpperCase();

        System.out.println(s);
        System.out.println("Lucas".toUpperCase());

        String x = "Ana Clara".toLowerCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "mãe")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

    }
}
/*
String não é tipo primitivo nem é palavra reservada pelo Java.
"toUpperCase()" deixa todos os caracteres em maiúsculo.
".toLowerCase()" deixa todos os caracteres em minúsculo.
".replace()" substitui uma string por outra que definirmos.
".concat()" concatena outra string em uma já existente.
Tipos primitivos não tem o operador "."
*/
