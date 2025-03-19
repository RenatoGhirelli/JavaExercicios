package APIs;

public record Livro(String titulo, String autor, Editora editora) {

    @Override
    public String toString() {
        return "Livro: " + titulo + "\nAutor: " + autor + "\n" + editora;
    }
}

