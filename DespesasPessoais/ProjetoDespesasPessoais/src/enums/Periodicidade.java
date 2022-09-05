
package enums;

public enum Periodicidade {

    DI("Diária"),
    SE("Semanal"),
    ME("Mensal"),
    QU("Quinzenal"),
    BI("Bimestral"),
    TR("Trímestral"),
    SL("Semestral"),
    AN("Anual"),
    EV("Eventual");
    
    private String descricao;

    private Periodicidade(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
      
}
