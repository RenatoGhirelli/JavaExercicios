package APIs;

public class SenhaInvalidaException extends RuntimeException {

  private String msg;

  public SenhaInvalidaException(String mensagem) {

    super(mensagem);
  }

}
