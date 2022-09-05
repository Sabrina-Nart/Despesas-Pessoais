
package abstratas;

abstract public class Base {
  
    private String nome;

    public Base(){
        this.setNome("noname");
    }
    
    public Base(String nome) {
        this.setNome(nome);
    }
    
////////////
    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "NONAME" : nome.toUpperCase();
    }

    public String getNome() {
        return this.nome;
    }
    
////////////
    
    @Override
    public String toString() {
        return nome;
    }  
    
}

