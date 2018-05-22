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

    public double tirarCopias(int qtd, boolean frente_verso) {
        if (frente_verso) {
            return (0.07 * (double) qtd);
        } else {
            return (0.08 * (double) qtd);
        }
    }

   
    public double tirarCopias(int qtd, boolean frente_verso, String capa) {
        if (frente_verso) {
            return (0.07 * (double) qtd) + 10.0;
        } else {
            return (0.09 * (double) qtd) + 10.0;
        }
    }

    /* POLIMORFISMO
        
            SOBREPOSIÇÃO    (Mesma assinatura e classes diferentes)
        
            SOBRECARGA      (Assinatura diferente e mesma classe)
        
     */
}
