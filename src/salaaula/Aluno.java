
package salaaula;


public class Aluno extends Pessoa {
    
        public String RA;
    
    	public Aluno(String nome, String cpf, String data) {
		super(nome, cpf, data);
	}
	
        @Override
        public double tirarCopias(int qtd) {
		return (0.08 * (double) qtd);
	}

       
        
}
