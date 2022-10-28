import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Cadastro cadastro = null;
        HabilitarInternet habilitarInternet = null;
        ViaInternet internet = null;
        Conta conta1 = null;
        Conta conta2 = null;
        Conta conta3 = null;
        Conta conta4 = null;

        ArrayList<Cadastro> arrayListCadastroClientes = new ArrayList<>();
        ArrayList<HabilitarInternet> arrayListInternetCliente = new ArrayList<>();
        ArrayList<ViaInternet> arrayListViaInternet = new ArrayList<>();
        ArrayList<Conta> arrayListConta = new ArrayList<>();

        int opcao = 0;

        while (opcao <= 3) {
            System.out.println("");
            System.out.println("DIGITE UMA OPÇÃO");
            System.out.println("1 - Acesso ao Sistema");
            System.out.println("2 - Habilitar acesso a internet");
            System.out.println("3 - Acessar  via internet");

            opcao = ler.nextInt();

            switch (opcao) {

                case 1:

                    cadastro = new Cadastro("Luana", "123");

                    arrayListCadastroClientes.add(cadastro);

                    System.out.println(arrayListCadastroClientes);

                    break;

                case 2:

                    System.out.println("Habilitar Internet? s/n");
                    String resposta = ler.next();

                    if (resposta.equals("s")) {

                        habilitarInternet = new HabilitarInternet("Luana", "Rua das dores", "12452123", 21, 12);

                        arrayListInternetCliente.add(habilitarInternet);

                        System.out.println(arrayListInternetCliente);
                        System.out.println("Acesso habilitado");

                    } else {

                        System.out.println("");
                    }

                    break;

                case 3:

                  
                    internet = new ViaInternet(21, 12, "Luana", "123");

                    arrayListViaInternet.add(internet);

                    System.out.println(arrayListViaInternet);

                    if (arrayListCadastroClientes.contains(cadastro) && arrayListInternetCliente.contains(habilitarInternet)) {

                        while (opcao <= 3) {

                            System.out.println("");
                            System.out.println("DIGITE UMA OPÇÃO");
                            System.out.println("1 - Fazer Transferencia");
                            System.out.println("2 - Tirar Extrato");
                            System.out.println("3 - Consulta do Cartao");

                            opcao = ler.nextInt();

                            switch (opcao) {
                                case 1:

                                    
                                    conta1 = new Conta("conta corrente", "deposito", 4000.0, "14/09/2022");
                                    conta2 = new Conta("conta corrente", "saque", 2000.0, "20/10/2022");
                                    conta3 = new Conta("conta corrente", "deposito", 2000.0, "27/10/2022");
                                    conta4 = new Conta("conta poupança", "deposito", 2000.0, "27/09/2022");
                                   
                                    arrayListConta.add(conta1);
                                    arrayListConta.add(conta2);
                                    arrayListConta.add(conta3);
                                    arrayListConta.add(conta4);

                                    System.out.println(arrayListConta);

                                    break;

                                case 2:

                                    System.out.println("Sua conta é poupança ou corrente?");
                                    String tipoDaConta =ler.next();

                                    if (tipoDaConta.equals("poupança")) {
                                        
                                          System.out.println("Saldo Anterior: " + conta4.getValorTranferencia());

                                    } else if (tipoDaConta.equals("corrente")) {

                                        for (Conta c : arrayListConta) {

                                            System.out.println(c);
                                        }

                                        double valorTotal = conta3.getValorTranferencia() + 1000.0;

                                        System.out.println("Saldo Anterior: " + conta1.getValorTranferencia());
                                        System.out.println("Valor limite do cheque especial: R$ 1.000 ");
                                        System.out.println("Valor Total: " + valorTotal);
                                        System.out.println("Valor CPMF: " + conta3.getSaldoConta() * 0.25);
                                        System.out.println("Data de vencimento do cheque especial: 30/11/2022");

                                    } else {

                                    }

                                    break;

                                case 3:

                            }

                        }

                    } else {

                        System.out.println("Erro");
                    }

                    break;

            }

        }
    }
}
