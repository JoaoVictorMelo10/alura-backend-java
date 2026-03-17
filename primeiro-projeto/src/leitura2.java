import java.util.Scanner;

public class leitura2 {
    static void main(String[] args) {
        Scanner leitura2 = new Scanner(System.in);

        System.out.println("""
                Bem vindo ao cardapio da espetaria!
                nossas opções:
                1- cafta
                2-carne
                3-misto
                """);
        int escolha = leitura2.nextInt();

        if (escolha == 1){
            System.out.println("Ja vamos trazer a sua cafta");
        } else if (escolha == 2) {
            System.out.println("ja vamos trazer a sua carne");
        } else if (escolha == 3){
            System.out.println("ja vamos trazer o seu misto");
        }
    }
}
