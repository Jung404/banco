public class HabilitarInternet {
    private String nome;
    private String endereço;
    private String CPF;
    private int numeroConta;
    private int numeroAgencia;

    public HabilitarInternet() {

    }

    public HabilitarInternet(String nome, String endereço, String CPF, int numeroConta, int numeroAgencia) {
        this.nome = nome;
        this.endereço = endereço;
        this.CPF = CPF;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    @Override
    public String toString() {
        return "Habilitar Internet{" + "Nome = " + nome + ", endere\u00e7o = " + endereço + ", CPF = " + CPF + ", número da conta = " + numeroConta + ", número da agência = " + numeroAgencia + '}';
    }
}
