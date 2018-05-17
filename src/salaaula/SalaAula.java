package salaaula;

public class SalaAula {

    public static void main(String[] args) {

        Aluno a = new Aluno("Maria da Graça", "123.456.789-00", "01/05/1999");
        System.out.println("\nNome: " + a.nome);
        System.out.println("CPF: " + a.cpf);
        System.out.println("Data de nascimento: " + a.data_nascimento);
    
        System.out.println("Total de cópias = R$ " + a.tirarCopias(100));
    
        System.out.println("----------------------");
        Professor p = new Professor("Neymar", "123.654.987-11", "02/06/1950");
        System.out.println("\nProfessor: " + p.nome);
        System.out.println("Total de cópias = R$ " + p.tirarCopias(100));
    
        
        
        
    }

}
