package desafioBanco;

public class contaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
