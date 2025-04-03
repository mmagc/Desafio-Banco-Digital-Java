package desafioBanco;

public class Main {

    public static void main(String[] args) {

        Conta cc = new contaCorrente();
        Conta cp = new contaPoupanca();

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();



    }

}
