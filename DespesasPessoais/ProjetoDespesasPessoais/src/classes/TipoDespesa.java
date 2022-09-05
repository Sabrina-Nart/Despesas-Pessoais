
package classes;

import abstratas.Base;
import enums.Periodicidade;

public class TipoDespesa extends Base{
    
    private Periodicidade periodicidade;
    
////////////// 
    
    public TipoDespesa(){
        super();
        this.setPeriodicidade(periodicidade.AN);
    }
    
    public TipoDespesa(String nome, Periodicidade periodicidade) {
        super(nome);
        this.setPeriodicidade(periodicidade);
    }
    
//////////////  
    
    public void setPeriodicidade(Periodicidade periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Periodicidade getPeriodicidade() {
        return this.periodicidade;
    }   
    
}
