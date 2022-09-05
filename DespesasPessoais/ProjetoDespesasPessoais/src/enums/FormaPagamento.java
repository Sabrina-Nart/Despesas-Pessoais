
package enums;

public enum FormaPagamento {
   
    DI("Dinheiro"),
    CC("Cartão de Crédito"),
    CD("Cartão de Débido"),
    PX("Pix"),
    BL("Boleto"),
    CH("Cheque");
    
    private String descricao;

    private FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    } 
    
}
