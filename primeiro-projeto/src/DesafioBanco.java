import java.util.Scanner;

public class DesafioBanco {
    static void main(String[] args) {

        Double saldo = 2500.00;
        Scanner leitura = new Scanner(System.in);


        System.out.printf("""
                ****************************************
                Dados iniciais do cliente:
                
                Nome:              Jhony Bravo
                Tipo de conta:     Corrente
                Saldo inicial:     R$ %.2f
                ****************************************
                
                
                """, saldo);

        System.out.println("""
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """);
        int opcao = leitura.nextInt();

        for (int i = 0; i > -1; i++) {


            if (i > 0) {
                System.out.println("""
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """);
                opcao = leitura.nextInt();
            }


            if (opcao <1 || opcao >4){
                System.out.println("Número inválido!\n\n");
            } else if (opcao == 1) {
                System.out.printf("O saldo atual é: R$ %.2f\n\n" , saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor recebido?\n\n");
                double recebido = leitura.nextDouble();
                saldo = saldo + recebido;
            } else if (opcao == 3) {
                System.out.println("Qual valor gostaria de enviar?\n\n");
                double enviar = leitura.nextDouble();
                if (saldo < enviar) {
                    System.out.println("Saldo insuficiente.\n\n");
                } else {
                    saldo = saldo - enviar;
                }

            } else if (opcao == 4) {
                break;
            }
        }

    }
}
