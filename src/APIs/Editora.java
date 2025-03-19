package APIs;

public record Editora(String nome, String cidade) {
    @Override
    public String toString() {
        return "Editora: " + this.nome
                + "\nCidade: " + this.cidade;
    }
}
