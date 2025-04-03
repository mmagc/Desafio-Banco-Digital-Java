package desafioBanco;

public class contaPoupanca extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}
