public class PrincipalMusica {

    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "The Trooper";
        musica.artista = "Iron Maiden";
        musica.anoLancamento = 1983;

        musica.avalia(10);
        musica.avalia(7.7);
        musica.avalia(5);
        musica.avalia(8.3);
        musica.avalia(9.5);

        double mediaAvaliacoes = musica.calculaMediaAvaliacoes();

        musica.fichaTecnica();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
