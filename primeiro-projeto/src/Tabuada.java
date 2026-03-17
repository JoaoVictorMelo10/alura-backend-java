import java.util.Scanner;
import java.util.Locale;

public class Tabuada {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Double n = leitura.nextDouble();
        System.out.printf(Locale.US, """
                Tabuada do %.2f:
                %.2f x 1 = %.2f
                %.2f x 2 = %.2f
                %.2f x 3 = %.2f
                %.2f x 4 = %.2f
                %.2f x 5 = %.2f
                %.2f x 6 = %.2f
                %.2f x 7 = %.2f
                %.2f x 8 = %.2f
                %.2f x 9 = %.2f
                %.2f x 10 = %.2f
                
                """, n, n, n, n, n*2, n, n*3, n, n*4, n, n*5, n, n*6, n, n*7, n, n*8, n, n*9, n, n*10);

    }
}
