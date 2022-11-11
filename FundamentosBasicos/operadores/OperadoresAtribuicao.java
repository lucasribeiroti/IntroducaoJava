package FundamentosBasicos.operadores;

public class OperadoresAtribuicao {

    public static void main(String[] args) {
        int a = 3; // a vale 3
        int b = a; // b vale 3
        int c = a + b; // c vale 6

        c++; // 6 + 3 (+ 1)
        System.out.println(c);
    }
}

/*
c++ significa c = c + 1
c+= b significa c = c + b
c-= a significa c = c - a
c*= b significa c = c * b
c/= a significa c = c / a
c %= 2 significa c = c % 2 (par ou ímpar)
 */