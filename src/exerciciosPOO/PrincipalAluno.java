public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Renato";
        aluno1.idade = 21;

        aluno2.nome = "Bia";
        aluno2.idade = 18;

        aluno3.nome = "Hosana";
        aluno3.idade = 40;

        aluno1.informacaoAlunos();
        aluno2.informacaoAlunos();
        aluno3.informacaoAlunos();

    }
}
