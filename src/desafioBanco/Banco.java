package desafioBanco;

import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Banco {

    protected String nome;
    protected List<Conta> contas = new ArrayList<>();

    public void adicionaConta(Conta conta){
        this.contas.add(conta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Banco: " + nome + "\nContas:\n");
        for (Conta conta : contas) {
            sb.append(conta.toString()).append("\n");
        }
        return sb.toString();
    }
}
