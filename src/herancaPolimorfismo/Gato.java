package herancaPolimorfismo;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("MIAU");
    }

    public void arranharMoveis(){
        System.out.println("*arranhando*");
    }
}
