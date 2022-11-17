package FundamentosBasicos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {
        String s = "Qualquer coisa";
        s = s.toUpperCase();
        System.out.println(s);

        // Wrappers: são a versão "objeto" dos tipos primitivos.
        int a = 123;
        System.out.println(a);
    }
}
/*
Tudo em Java é objeto, menos os 8 tipos primitivos que temos:
byte, short, int, long, float, double, char e bool.
Quando criamos objetos em determinadas classes, temos possibilidade de atributos em comportamentos do
tipo primitivo.
*/