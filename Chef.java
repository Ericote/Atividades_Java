import java.util.ArrayList;
public class Chef {
    int id;
    String nome;
    int cpf;
    String dataNasc;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(
        int id, 
        String nome, 
        int cpf, 
        String dataNasc
    )

    {
     this.id = id;
     this.nome = nome;
     this.cpf = cpf;
     this.dataNasc = dataNasc;   
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
    }

    
        
    
    
}
