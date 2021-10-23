public class Endereco {
    int Id;
    int cep;
    String rua;
    int numero;
    String bairro;
    String cidade;
    Padaria padarias;
    

    public Endereco(
    int Id,
    int cep,
    String rua, 
    int numero, 
    String bairro,  
    String cidade,
    Padaria padarias
       
    )

    {
        this.Id = Id;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.padaria = padaria;
        
    }
    
}
