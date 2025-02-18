package herancaPolimorfismo;

public class PrincipalAnimal {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();

    }
}
