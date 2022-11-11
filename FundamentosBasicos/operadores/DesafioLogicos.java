package FundamentosBasicos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        if (trabalhoTerca && trabalhoQuinta) {
            System.out.println("Comprei a televisão de 50 polegadas e vamos tomar sorvete!!");
        } else if (trabalhoTerca ^ trabalhoQuinta) {
            System.out.println("Comprei a televisão de 32 polegadas e vamos tomar sorvete!!!");
        }else{
            System.out.println("Não comprei a televisão e não vou tomar sorvete...");
        }
    }
}