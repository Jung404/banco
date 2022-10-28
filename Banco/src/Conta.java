public class Conta {
    private String tipoConta;
    private String tipoTranferencia;
    private double valorTranferencia;
    private String dataTranferencia;
    private double saldoConta;
    private double saldoContaAnterior;

    public Conta(String tipoConta, String tipoTranferencia, double valorTranferencia, String dataTranferencia) {
        this.tipoConta = tipoConta;
        this.tipoTranferencia = tipoTranferencia;
        this.valorTranferencia = valorTranferencia;
        this.dataTranferencia = dataTranferencia;
    }

    public Conta( double saldoConta, double saldoContaAnterior) {
         this.saldoConta = saldoConta;
         this.saldoContaAnterior = saldoContaAnterior;
    }
    
     public Conta() {
        
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoTranferencia() {
        return tipoTranferencia;
    }

    public void setTipoTranferencia(String tipoTranferencia) {
        this.tipoTranferencia = tipoTranferencia;
    }

    public double getValorTranferencia() {
        return valorTranferencia;
    }

    public void setValorTranferencia(double valorTranferencia) {
        this.valorTranferencia = valorTranferencia;
    }

    public String getDataTranferencia() {
        return dataTranferencia;
    }

    public void setDataTranferencia(String dataTranferencia) {
        this.dataTranferencia = dataTranferencia;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoContaAnterior() {
        return saldoContaAnterior;
    }

    public void setSaldoContaAnterior(double saldoContaAnterior) {
        this.saldoContaAnterior = saldoContaAnterior;
    }

    @Override
    public String toString() {
        return "Conta{" + "Tipo de conta = " + tipoConta + ", tipo de tranferência = " + tipoTranferencia + ", valor de tranferência = " + valorTranferencia + ", data da tranferência = " + dataTranferencia + '}';
    }
}
