public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double somaDasAvaliacoes;

    void fichaTecnica() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("AnoLancamento: " + anoLancamento);
        System.out.println("Num Avaliacoes: " + numAvaliacoes);
    }

    void avalia(double avaliacao) {

        somaDasAvaliacoes += avaliacao;
        numAvaliacoes++;
    }

    double calculaMediaAvaliacoes(){

        return somaDasAvaliacoes / numAvaliacoes;
    }

}
