package salaaula;


public class Funcionario extends Pessoa {
	public Funcionario(String nome, String cpf, String data) {
		super(nome, cpf, data);
	}
	public double salario;
	public String data_admissao;
	public String cargo;
        
}