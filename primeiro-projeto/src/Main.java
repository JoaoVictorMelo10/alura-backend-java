public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Fulano
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com aviões e muita explosão
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

//        System.out.println("Bem vindo(a) ao conversor de Celsius para Fahrenheit!!");
//        double celcius = 24.4;
//        double fahrenheit = (celcius * 1.8) + 32;
//        System.out.println(String.format("A temperatura de %.2f° graus Celcius convertida para Fahrenheit é igual a %.2f°", celcius, fahrenheit));
//        int fahrenheitInteiro = (int) fahrenheit;
//        System.out.println("o número inteiro da temperatura em Fahrenheit é " + fahrenheitInteiro + "°");
//
//        double varios = 12.43;
//        int inteiros = (int) varios;
//        System.out.println(inteiros);
//
//        double precoProduto = 5.99;
//        int quantidade = 543;
//        double valorTotal = precoProduto * quantidade;
//        System.out.println(String.format("valor total é %.2f", valorTotal));
//
//        double valorEmDolares = 1274.74;
//        System.out.println("você possui " + valorEmDolares + " dolares");
//        double valorEmReais = valorEmDolares * 4.94;
//        System.out.println("convertido para reais, você possui " + valorEmReais + " reais");
//
//        double precoOriginal = 93.99;
//        double precoComDesconto = precoOriginal - (precoOriginal * 0.10);
//        System.out.println(String.format("o preço original do produto é %.2f", precoOriginal));
//        System.out.println(String.format("com 10%% de desconto o produto fica %.2f", precoComDesconto));


    }
}