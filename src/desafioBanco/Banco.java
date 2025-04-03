package desafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private List<Conta> contas;


    public Banco(){

        this.contas = new ArrayList<>();

    }

    public void adicionaConta(Conta conta){
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
