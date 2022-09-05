
package classes;

import enums.FormaPagamento;
import java.time.LocalDate;

public class Despesa {
    
    private Credor credor;
    private double valor;
    private LocalDate vencimento;
    private LocalDate pagamento;
    private double valorPago;
    private FormaPagamento formaPagamento;
    private TipoDespesa tipoDespesa;
    
////////////// 
    
   public Despesa() {
        this.setCredor(null);
        this.setValor(0);
        this.setVencimento(null);
        this.setPagamento(null);
        this.setValorPago(0);
        this.setFormaPagamento(formaPagamento.BL);
        this.setTipoDespesa(tipoDespesa);       
   }

    public Despesa(Credor credor, double valor, LocalDate vencimento, LocalDate pagamento, double valorPago, FormaPagamento formaPagamento, TipoDespesa tipoDespesa) {
        this.setCredor(credor);
        this.setValor(valor);
        this.setVencimento(vencimento);
        this.setPagamento(pagamento);
        this.setValorPago(valorPago);
        this.setFormaPagamento(formaPagamento);
        this.setTipoDespesa(tipoDespesa);  
    }
    
////////////// 
    
    public void setCredor(Credor credor) {
        this.credor = credor == null ? new Credor() : credor;
    }

    public void setValor(double valor) {
        this.valor = valor <= 0 ? 0.01 : valor;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento == null ? LocalDate.now() : vencimento;
    }

    public void setPagamento(LocalDate pagamento) {
        this.pagamento = pagamento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago < 0 ? 0.01 : valorPago;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa == null ? new TipoDespesa() : tipoDespesa;
    }
 
////////////// 

    public Credor getCredor() {
        return this.credor;
    }

    public double getValor() {
        return this.valor;
    }

    public LocalDate getVencimento() {
        return this.vencimento;
    }

    public LocalDate getPagamento() {
        return this.pagamento;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }

    public TipoDespesa getTipoDespesa() {
        return this.tipoDespesa;
    }
//////////////
    
    @Override
    public String toString() {
        return this.credor + "-" + this.valor + "-" + this.vencimento;
    }
    
//////////////    
    
}
