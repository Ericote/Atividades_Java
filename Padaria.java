import java.util.ArrayList;
public class Padaria {
    int id;
    String nome;
    String dataDeAbertura;
    Endereco endereco;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(
    int id,
    String nome, 
    String dataDeAbertura,
    int Id,
    int cep,
    String rua, 
    int numero, 
    String bairro,  
    String cidade
    )  
    
    {
    this.id = id;
    this.nome = nome;
    this.dataDeAbertura = dataDeAbertura; 
    this.endereco = new Endereco(
        Id,
        cep,
        rua,
        numero,
        bairro,
        cidade,
        this   
        );   
    }

    public static void main(String[] args) {
        Padaria padaria01 = new Padaria(1,"Pão do Jão", "12/08/2006", 1, 17350875,"Rua São vidente, 625", 890, "Floresta", "Joinville");
        Padaria padaria02 = new Padaria(2, "Alfa Pães", "24/05/1990", 2, 69264014, "Rua dos bois, 433", 1920, "Itaum", "Joinville");
        Padaria padaria03 = new Padaria(3, "Pão que o Diabo Amassou", "15/03/2010", 3, 59023645, "Rua dos cães, 666", 566, "Aventureiro", "Joinville");
        
/* ============================ CRIAÇÃO DAS PADARIAS ================================= */

        System.out.println("\n =========== PADARIAS =========");
        System.out.println(" Padaria 1 - " + padaria01.nome);
        System.out.println("  Rua: " + padaria01.endereco.rua
                         + ", Número: "+ padaria01.endereco.numero
                         + ", Bairro: "+ padaria01.endereco.bairro
                         + ", Cidade: "+ padaria01.endereco.cidade
                         + ", CEP: "+padaria01.endereco.cep + "\n");
        System.out.println("=====================================");
        System.out.println(" Padaria 2 - " + padaria02.nome);
        System.out.println("  Rua: " + padaria02.endereco.rua
                         + ", Número: "+ padaria02.endereco.numero
                         + ", Bairro: "+ padaria02.endereco.bairro
                         + ", Cidade: "+ padaria02.endereco.cidade
                         + ", CEP: "+padaria02.endereco.cep + "\n");
        System.out.println("=====================================");
        System.out.println(" Padaria 3 - " + padaria03.nome);
        System.out.println("  Rua: " + padaria03.endereco.rua
                         + ", Número: "+ padaria03.endereco.numero
                         + ", Bairro: "+ padaria03.endereco.bairro
                         + ", Cidade: "+ padaria03.endereco.cidade
                         + ", CEP: "+padaria03.endereco.cep + "\n");

      /* ============================ CRIAÇÃO DOS CHEFS ================================= */

        System.out.println("\n ========= OS PODEROSOS CHEFS =========");
        Chef chef01 = new Chef(2, "Jaqueline", 221450, "10/3/1990");
        Chef chef02 = new Chef(5, "Sebastian", 734200, "24/6/1980");
        Chef chef03 = new Chef(7, "Douglas", 155352, "5/4/2006");

        System.out.println(" Nome: " +chef01.nome
                         +", CPF: " +chef01.cpf
                         +", Data de Nascimento: "+chef01.dataNasc + "\n");
        System.out.println("============================================");
        System.out.println(" Nome: " +chef02.nome
                         +", CPF: " +chef02.cpf
                         +", Data de Nascimento: "+chef02.dataNasc + "\n");
        System.out.println("============================================");      
        System.out.println(" Nome: " +chef03.nome
                         +", CPF: " +chef03.cpf
                         +", Data de Nascimento: "+chef03.dataNasc + "\n");

       /* ============================ CRIAÇÃO DAS RECEITAS ================================= */

        /* RECEITAS DO CHEF 1 */
        Receita receita01 = new Receita(1, "Bolo de Cenoura", "assar", 4, chef01, padaria01);
        Receita receita02 = new Receita(2, "Pastel", "Fazer massa", 2, chef01, padaria01);
        Receita receita03 = new Receita(3, "Brigadeiro", "colocar granulado", 6, chef01, padaria01);
        Receita receita04 = new Receita(4, "Coxinha", "rechear", 3, chef01, padaria01);
        Receita receita05 = new Receita(5, "Pão", "preparar Massa", 5, chef01, padaria01);
        /* RECEITAS DO CHEF 2 */
        Receita receita06 = new Receita(6, "Pão de Queijo", "assar", 6, chef02, padaria02);
        Receita receita07 = new Receita(7, "Rocambole", "enrolar", 5, chef02, padaria02);
        Receita receita08 = new Receita(8, "Kibe", "fritar", 7, chef02, padaria02);
        Receita receita09 = new Receita(9, "Mini Pizza", "colocar ingredientes", 1, chef02, padaria02);
        Receita receita10 = new Receita(10, "Pão Doce", "rechear", 3, chef02, padaria02);
        /* RECEOTAS DO CHEF 3 */
        Receita receita11 = new Receita(11, "Donuts", "fritar", 7, chef03, padaria03);
        Receita receita12 = new Receita(12, "Pastel Assado", "rechear", 3, chef03, padaria03);
        Receita receita13 = new Receita(13, "Empada", "assar", 4, chef03, padaria03);
        Receita receita14 = new Receita(14, "Brownie", "colocar ingredientes", 1, chef03, padaria03);
        Receita receita15 = new Receita(15, "Bolinha de Queijo", "fritar", 7, chef03, padaria03);

        System.out.println("============ RECEITA DO CHEF 1 ============");
        for (Receita receitas : chef01.receitas)
        {
            System.out.println("Nome da Receita: "+ receitas.nome
                            + ", Etapa da Receita: "+ receitas.etapa
                           + ", Número da Etapa: "+ receitas.numEtapa);
        }

        System.out.println("============ RECEITA DO CHEF 2 ============");
        for (Receita receitas : chef02.receitas)
        {
            System.out.println("Nome da Receita: "+ receitas.nome
                            + ", Etapa da Receita: "+ receitas.etapa
                           + ", Número da Etapa: "+ receitas.numEtapa);
        }

        System.out.println("============ RECEITA DO CHEF 3 ============");
        for (Receita receitas : chef03.receitas)
        {
            System.out.println("Nome da Receita: "+ receitas.nome
                            + ", Etapa da Receita: "+ receitas.etapa
                           + ", Número da Etapa: "+ receitas.numEtapa);
        }
        System.out.println("\n\n");
        System.out.println("\n =========== RECEITAS DA PADARIA 1 ===========");
        for (Receita receita : padaria01.receitaS) {
            System.out.println("Nome da receita: " + receitas.nome);
        }
        System.out.println("\n =========== RECEITAS DA PADARIA 2 ===========");
        for (Receita receita : padaria02.receitas) {
            System.out.println("Nome da receita: " + receitas.nome);
        }
        System.out.println("\n =========== RECEITAS DA PADARIA 3 ===========");
        for (Receita receita : padaria03.receitas) {
            System.out.println("Nome da receita: " + receitas.nome);
        }
        System.out.println("\n\n");
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
    }

    

    
    
}
