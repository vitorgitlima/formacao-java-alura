public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match ");
        System.out.println("Filme Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme top Gun
                Filme de aventura com Tom Cruise
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        int temperatura = 23;
        int converforFahenreit = (int) (temperatura * 1.8) + 32;
        System.out.println(converforFahenreit);


    }
}