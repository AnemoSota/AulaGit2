package AulaGit2.AulaGit2;

import java.util.Scanner;

public class pessoa {
    private String nome;
    private int idade;
    private String email;

    pessoa(){}

    pessoa(String n, String e, int i){
        this.setEmail(e);
        this.setIdade(i);
        this.setNome(n);
    }

    public void setNome(String n){this.nome = n;}
    public void setIdade(int i){this.idade = i;}
    public void setEmail(String e){this.email = e;}

    public String getNome(){return this.nome;}
    public String getEmail(){return this.email;}
    public int getIdade(){return this.idade;}

    public void print()
    {
        System.out.println("nome: "+this.getNome());
        System.out.println("idade: "+this.getIdade());
        System.out.println("email: "+this.getEmail());
    }
}

class jsl extends pessoa{
    
    jsl()
    {
        this.setEmail("jdsl@icomp.ufam.edu.br");
        this.setIdade(22);
        this.setNome("jonathan Lima");
    }   
}

class abo extends pessoa{
    
    abo(){
        this.setEmail("atos.omena@icomp.ufam.edu.br");
        this.setIdade(19);
        this.setNome("Atos Omena");
    }

    abo(Scanner s){
        this.setEmail(s.next());
        this.setIdade(s.nextInt());
        this.setNome(s.nextLine());
    }

    abo(int cordas){
        int cont;
        this.setEmail("atos.omena@icomp.ufam.edu.br");
        this.setIdade(19);
        this.setNome("Atos Omena");

        for(cont = 1 ; cont <= cordas ; cont++){
            System.out.printf( "%s pulou %d cordas!" , this.getNome(), cont );
        }
    }
}
