package desafioBanco;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.nome = "Caixa";

        Cliente matheus = new Cliente();
        matheus.nome = "Matheus";

        Conta cc = new contaCorrente(matheus);
        Conta poupanca = new contaPoupanca(matheus);
        banco.adicionaConta(poupanca);
        banco.adicionaConta(cc);
        System.out.println(banco);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println(banco);

    }

}
