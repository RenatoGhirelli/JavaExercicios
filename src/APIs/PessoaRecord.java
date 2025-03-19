package APIs;

public record PessoaRecord(String nome, int idade, String cidade, int altura) {

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade + "\nAltura: " + altura;
    }
}
