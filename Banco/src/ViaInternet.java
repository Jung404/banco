public class ViaInternet {
    private int numeroAgencia;
    private int numeroConta;
    private String login;
    private String senha;

    public ViaInternet() {

    }

    public ViaInternet(int numeroAgencia, int numeroConta, String login, String senha) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.login = login;
        this.senha = senha;
    }
    
    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Via Internet{" + "Número da agência = " + numeroAgencia + ", número da conta = " + numeroConta + ", login = " + login + ", senha = " + senha + '}';
    }
}