package salaaula;

public class Pessoa {

    public String nome;
    public String cpf;
    public String data_nascimento;

    public Pessoa(String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data;
    }

    public double tirarCopias(int qtd) {
        return 0.10 * (double) qtd;
    }

}
