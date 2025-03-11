package arrayCollection;


public class PrincipalAnimalCahorroArray {
    public static void main(String[] args) {

        AnimalArray animal = new CachorroArray();

        if (animal instanceof CachorroArray) {
            CachorroArray cachorro = (CachorroArray) animal;
            System.out.println("O objeto é um cachorro");
        } else {
            System.out.println("O objeto não é um cachorro");
        }


    }
}
