package desafioBanco;

public class Main {

    public static void main(String[] args) {

        Cliente matheus = new Cliente();
        matheus.nome = "Matheus";

        Conta cc = new contaCorrente(matheus);
        Conta poupanca = new contaPoupanca(matheus);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }

}
