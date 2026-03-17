public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("pode assistir o filme meu patrão");
        } else {
            System.out.println("faz o plano mais completo pra assistir o filme seu mão de vaca");
        }
    }
}
