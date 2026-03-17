import java.util.Random;
import java.util.Scanner;

public class exercicioFinal {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int tentativas = 5;

        int chute = 0;


        System.out.println("""
                Bem-vindo(a) ao jogo de adivinhação!!
                Você terá 5 tentativas para adivinhar um número de 0 a  100
                a cada tentativa errada você será informado se o chute foi maior ou menor que o número secreto
                digite o seu chute na linha abaixo:
                """);
        chute = leitura.nextInt();
        while (chute > 100 || chute < 0) {
            System.out.println("Digite um número valido de 0 a 100!");
            chute = leitura.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (chute > 101 || chute < 0) {
                System.out.println("Digite um número valido de 0 a 100!! Você ainda possui " + tentativas + " tentativas. Digite o novo chute: ");
                chute = leitura.nextInt();
            } else if (chute > aleatorio && chute < 101) {
                System.out.println("Você digitou um número maior que o número secreto, tente novamente você ainda tem " + tentativas + " tentativas. digite o novo chute:");
                chute = leitura.nextInt();

            } else if (chute < aleatorio && chute > 0) {
                System.out.println("Você digitou um número menor do que o número secreto, tente novamente, você ainda tem " + tentativas + " tentativas. digite o novo chute:");
                chute = leitura.nextInt();

            }

            if (chute == aleatorio) {
                System.out.println("Parabéns! Você acertou o número secreto!!!");
                break;
            }

            if (i == 4) {
                System.out.println("Infelizmente você chegou ao limite de tentativas sem acertar :(");
                System.out.println("O número secreto era " + aleatorio);
                break;
            }
            tentativas = tentativas - 1;
        }
    }
}