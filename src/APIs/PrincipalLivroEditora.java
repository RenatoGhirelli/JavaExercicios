package APIs;

import com.google.gson.Gson;

public class PrincipalLivroEditora {
    public static void main(String[] args) {

        String livroJson = "{\"titulo\":\"O Silmarillion\",\"autor\":\"J.R.R.Tolkien\",\"editora\":{\"nome\":\"Harpercollins\",\"cidade\":\"Londres\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(livroJson, Livro.class);
        System.out.println(livro);

    }
}
