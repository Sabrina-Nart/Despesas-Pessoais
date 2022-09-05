
package forms;

import abstratas.Listas;
import classes.Credor;
import classes.Despesa;
import classes.TipoDespesa;
import enums.FormaPagamento;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class dialogDespesa extends javax.swing.JDialog {

    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    
    private void loadComboFormaPagemento(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(FormaPagamento.values());
        comboFormaPagamento.setModel(cbm);
    }
    
    private void loadComboCredor(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Listas.getListaCredor().toArray());
        comboCredor.setModel(cbm);
    }
    
    private void loadComboTipoDespesa(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Listas.getListaTipoDespesa().toArray());
        comboTipoDespesa.setModel(cbm);
    }
    
    public dialogDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        painel2 = new javax.swing.JPanel();
        labelCredor = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelVencimento = new javax.swing.JLabel();
        labelPagamento = new javax.swing.JLabel();
        labelValorPago = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelTipoDespesa = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        textValorPago = new javax.swing.JTextField();
        textVencimento = new javax.swing.JFormattedTextField();
        textPagamento = new javax.swing.JFormattedTextField();
        comboCredor = new javax.swing.JComboBox<>();
        comboFormaPagamento = new javax.swing.JComboBox<>();
        comboTipoDespesa = new javax.swing.JComboBox<>();
        buttonAddDespesa = new javax.swing.JButton();
        buttonListDespesa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painel1.setBackground(new java.awt.Color(255, 204, 255));

        painel2.setBackground(new java.awt.Color(255, 204, 255));
        painel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)), "Dados da Despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N

        labelCredor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCredor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCredor.setText("Credor");

        labelValor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelValor.setText("Valor");

        labelVencimento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelVencimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelVencimento.setText("Vencimento");

        labelPagamento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelPagamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPagamento.setText("Pagamento");

        labelValorPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelValorPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelValorPago.setText("Valor Pago");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Forma de Pagamento");

        labelTipoDespesa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTipoDespesa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTipoDespesa.setText("Tipo de Despesa");

        textValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorActionPerformed(evt);
            }
        });

        textValorPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            textVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textVencimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            textPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textPagamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        comboCredor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboCredor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboFormaPagamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboTipoDespesa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboTipoDespesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonAddDespesa.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonAddDespesa.setText("Adicionar Despesa");
        buttonAddDespesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        buttonAddDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddDespesaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddDespesaMouseExited(evt);
            }
        });
        buttonAddDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddDespesaActionPerformed(evt);
            }
        });

        buttonListDespesa.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonListDespesa.setText("Mostrar Todas as Despesas");
        buttonListDespesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        buttonListDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonListDespesaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonListDespesaMouseExited(evt);
            }
        });
        buttonListDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTipoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCredor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textValorPago)
                                .addComponent(textValor)
                                .addComponent(textVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(textPagamento))
                            .addComponent(comboCredor, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboTipoDespesa, javax.swing.GroupLayout.Alignment.LEADING, 0, 249, Short.MAX_VALUE)
                                .addComponent(comboFormaPagamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonAddDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonListDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCredor)
                    .addComponent(comboCredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValor)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVencimento)
                    .addComponent(textVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagamento)
                    .addComponent(textPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorPago)
                    .addComponent(textValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoDespesa)
                    .addComponent(comboTipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonListDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddDespesaActionPerformed

        double valor = 0;
        try { 
            valor = Double.parseDouble(textValor.getText());
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O Campo de Valor é Obrigatório");
            textValor.requestFocus(); 
            return;
        }
        
        if (textVencimento.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "O Campo de Vencimento é Obrigatório");
            textVencimento.requestFocus();
            return;
        }   
        
        Credor credor = (Credor)comboCredor.getSelectedItem();
        
        LocalDate vencimento = LocalDate.parse(textVencimento.getText(), formato); 
        
        LocalDate pagamento = textPagamento.getText().equals("  /  /    ") ? null : LocalDate.parse(textPagamento.getText(), formato);
       
        double valorPago = textValorPago.getText().isEmpty() ? 0 : Double.parseDouble(textValorPago.getText());
        
        FormaPagamento forma = (FormaPagamento)comboFormaPagamento.getSelectedItem();
        
        TipoDespesa tipo = (TipoDespesa)comboTipoDespesa.getSelectedItem();
        
        Despesa despesa = new Despesa (
                credor,
                valor,
                vencimento,
                pagamento,
                valorPago,
                forma,
                tipo);
        
        Listas.getListaDespesa().add(despesa);
        
        area.setText(("Despesa Adicionada \n"));
        comboCredor.setSelectedIndex(0);
        textValor.setText("");
        textVencimento.setText("");
        textPagamento.setText("");
        textValorPago.setText("");
        comboFormaPagamento.setSelectedIndex(0);
        comboTipoDespesa.setSelectedIndex(0);
    }//GEN-LAST:event_buttonAddDespesaActionPerformed

    private void buttonListDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListDespesaActionPerformed

        area.setText("");
        
        for (Despesa despesa : Listas.getListaDespesa()) {
            area.append(despesa.getCredor() + "\t" +
                        despesa.getValor() + "\t" +
                        despesa.getVencimento().format(formato) + "\t" + 
                        (despesa.getPagamento() == null ? "Não Pago" : despesa.getPagamento().format(formato)) + "\t" + 
                        despesa.getValorPago() + "\t" +
                        despesa.getFormaPagamento() + "\t" +
                        despesa.getTipoDespesa() + "\n"); 
        }        
    }//GEN-LAST:event_buttonListDespesaActionPerformed

    private void buttonAddDespesaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddDespesaMouseEntered

        buttonAddDespesa.setBackground(new Color(235, 235, 235));
        buttonAddDespesa.setForeground(new Color(204, 0, 153));       
    }//GEN-LAST:event_buttonAddDespesaMouseEntered

    private void buttonAddDespesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddDespesaMouseExited

        buttonAddDespesa.setBackground(new Color(255, 255, 255));
        buttonAddDespesa.setForeground(Color.BLACK);        
    }//GEN-LAST:event_buttonAddDespesaMouseExited

//////////////////////
    
    private void buttonListDespesaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListDespesaMouseEntered

        buttonListDespesa.setBackground(new Color(235, 235, 235));
        buttonListDespesa.setForeground(new Color(204, 0, 153));        
    }//GEN-LAST:event_buttonListDespesaMouseEntered

    private void buttonListDespesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListDespesaMouseExited

        buttonListDespesa.setBackground(new Color(255, 255, 255));
        buttonListDespesa.setForeground(Color.BLACK);         
    }//GEN-LAST:event_buttonListDespesaMouseExited

/////////////////////
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.loadComboCredor();
        this.loadComboFormaPagemento();
        this.loadComboTipoDespesa();
    }//GEN-LAST:event_formWindowOpened

    private void textValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorActionPerformed

    }//GEN-LAST:event_textValorActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogDespesa dialog = new dialogDespesa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton buttonAddDespesa;
    private javax.swing.JButton buttonListDespesa;
    private javax.swing.JComboBox<String> comboCredor;
    private javax.swing.JComboBox<String> comboFormaPagamento;
    private javax.swing.JComboBox<String> comboTipoDespesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCredor;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JLabel labelTipoDespesa;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelValorPago;
    private javax.swing.JLabel labelVencimento;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JFormattedTextField textPagamento;
    private javax.swing.JTextField textValor;
    private javax.swing.JTextField textValorPago;
    private javax.swing.JFormattedTextField textVencimento;
    // End of variables declaration//GEN-END:variables
}
