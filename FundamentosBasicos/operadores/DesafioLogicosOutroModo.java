package FundamentosBasicos.operadores;

public class DesafioLogicosOutroModo {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
        System.out.println("Comprou tv de 50 polegadas e tomou sorvete: " + comprouTv50);

        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
        System.out.println("Comprou tv de 32 polegadas e tomou sorvete: " + comprouTv32);

        boolean naoComprouNada = !trabalhoTerca && !trabalhoQuinta;
        System.out.println("Não comprou nada: " + naoComprouNada);
    }
}
