package desafioBanco;

public class contaPoupanca extends Conta {

    public contaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}
