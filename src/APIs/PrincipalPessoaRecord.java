package APIs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalPessoaRecord {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\",\"altura\":\"160\"}";

        Gson gson = new GsonBuilder().setLenient().create();

        PessoaRecord pessoaRecord = gson.fromJson(jsonPessoa, PessoaRecord.class);

        System.out.println(pessoaRecord);

    }
}
