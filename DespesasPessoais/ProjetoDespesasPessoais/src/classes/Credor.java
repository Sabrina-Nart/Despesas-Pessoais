
package classes;

import abstratas.Base;

public class Credor extends Base{

    private String telefone;
    private String cnpj;

    public Credor() {
        super();
        this.setTelefone("(00) 00000-0000");
        this.setCNPJ("  ");
    }
    
    public Credor(String nome, String telefone, String cnpj){
        super(nome);
        this.setTelefone(telefone);
        this.setCNPJ(cnpj);
    }
    
////////////
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
////////////
    
    public String getTelefone() {
        return this.telefone;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    
////////////

    @Override
    public String toString() {
        return super.toString() + " - " + this.cnpj;
    }
  
}
