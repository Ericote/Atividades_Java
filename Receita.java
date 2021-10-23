import java.util.ArrayList;
public class Receita {
    int id;
    String nome;
    String etapa;
    int numEtapa;
    Chef chef;
    ArrayList<Padaria> padarias = new ArrayList<>();

    public Receita( 
    int id,  
    String nome,    
    String etapa,   
    int numEtapa,
    Chef chef,
    Padaria padarias    
    )

    {
    this.id = id;
    this.nome = nome;
    this.etapa = etapa;
    this.numEtapa = numEtapa;
    this.chef = chef;
    chef.adicionarReceita(this);
    this.padarias = padarias;
    padarias.adicionarReceita(this);

    }


    public void adicionarReceita(Padaria padarias) {
        this.padarias.add(padarias);
        chef.adicionarReceita(this);
        padaria.adicionarReceita(this);
    }
        
}
