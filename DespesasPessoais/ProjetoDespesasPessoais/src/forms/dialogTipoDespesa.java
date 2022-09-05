
package forms;

import abstratas.Listas;
import classes.TipoDespesa;
import enums.Periodicidade;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class dialogTipoDespesa extends javax.swing.JDialog {

    private void loadEnumPeriodicidade(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Periodicidade.values());
        comboPeriodicidade.setModel(cbm);
    }
    
    public dialogTipoDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        Painel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelPeriodicidade = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        comboPeriodicidade = new javax.swing.JComboBox<>();
        buttonAdicionar = new javax.swing.JButton();
        buttonListar = new javax.swing.JButton();
        buttonFiltrarNome = new javax.swing.JButton();
        buttonFiltrarPeriodicidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Despesa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painel.setBackground(new java.awt.Color(255, 204, 255));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        jScrollPane1.setViewportView(area);

        Painel2.setBackground(new java.awt.Color(255, 204, 255));
        Painel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)), "Tipo de Despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N

        labelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNome.setText("Nome");
        labelNome.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        labelPeriodicidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelPeriodicidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPeriodicidade.setText("Periodicidade");
        labelPeriodicidade.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        textNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textNome.setSelectionColor(new java.awt.Color(255, 0, 153));

        comboPeriodicidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboPeriodicidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPeriodicidade.setBorder(null);

        buttonAdicionar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        buttonAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAdicionarMouseExited(evt);
            }
        });
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonListar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonListar.setText("Listar");
        buttonListar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        buttonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonListarMouseExited(evt);
            }
        });
        buttonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarActionPerformed(evt);
            }
        });

        buttonFiltrarNome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarNome.setText("Filtrar por Nome");
        buttonFiltrarNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        buttonFiltrarNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarNomeMouseExited(evt);
            }
        });
        buttonFiltrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarNomeActionPerformed(evt);
            }
        });

        buttonFiltrarPeriodicidade.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarPeriodicidade.setText("Filtrar por Período");
        buttonFiltrarPeriodicidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        buttonFiltrarPeriodicidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarPeriodicidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarPeriodicidadeMouseExited(evt);
            }
        });
        buttonFiltrarPeriodicidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarPeriodicidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelPeriodicidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonFiltrarPeriodicidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonFiltrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltrarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeriodicidade)
                    .addComponent(comboPeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltrarPeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        
        if (textNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo de Nome é Obrigatório");
            requestFocus();
            return;
        }
        
        TipoDespesa tipoDespesa = new TipoDespesa(textNome.getText(), (Periodicidade)comboPeriodicidade.getSelectedItem());
        
        Listas.getListaTipoDespesa().add(tipoDespesa);
        
        textNome.setText("");
        comboPeriodicidade.setSelectedIndex(0);
        textNome.requestFocus();
        
        area.setText("Tipo de Despesa Adicionado");
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarActionPerformed
        
        area.setText("Nome \t\t Periodicidade \n");
        
        for (TipoDespesa tipo : Listas.getListaTipoDespesa()) {
            area.append(tipo.getNome() + "\t\t" + 
                        tipo.getPeriodicidade() + "\n");
        }        
    }//GEN-LAST:event_buttonListarActionPerformed

    private void buttonFiltrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeActionPerformed
       
        if (textNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite algo para que possa haver algum filtro");
            textNome.requestFocus();
            return;
        }
        
        area.setText("Nome \t\t Período \n");

        for (TipoDespesa tipo : Listas.getListaTipoDespesa()) { 
            if (tipo.getNome().contains(textNome.getText().toUpperCase())) { 
                area.append(tipo.getNome() + "\t\t" + tipo.getPeriodicidade() + "\n");
            }
        }         
    }//GEN-LAST:event_buttonFiltrarNomeActionPerformed

    private void buttonFiltrarPeriodicidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarPeriodicidadeActionPerformed
      
        area.setText("Nome \t\t Período \n");
        
        Periodicidade perido = (Periodicidade)comboPeriodicidade.getSelectedItem();
        
        for (TipoDespesa tipo : Listas.getListaTipoDespesa()) {
            if (tipo.getPeriodicidade().equals(perido)){
               area.append(tipo.getNome() + "\t\t" + tipo.getPeriodicidade()+ "\n");
            }
        }        
    }//GEN-LAST:event_buttonFiltrarPeriodicidadeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.loadEnumPeriodicidade();
    }//GEN-LAST:event_formWindowOpened

////////////////////////////////
    
    private void buttonAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseEntered
        
        buttonAdicionar.setBackground(new Color(235, 235, 235));
        buttonAdicionar.setForeground(new Color(204, 0, 153));
    }//GEN-LAST:event_buttonAdicionarMouseEntered

    private void buttonAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseExited
  
        buttonAdicionar.setBackground(new Color(255, 255, 255));
        buttonAdicionar.setForeground(Color.BLACK);
    }//GEN-LAST:event_buttonAdicionarMouseExited

////////////////////////////////
    
    private void buttonListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarMouseEntered

        buttonListar.setBackground(new Color(235, 235, 235));
        buttonListar.setForeground(new Color(204, 0, 153));       
    }//GEN-LAST:event_buttonListarMouseEntered

    private void buttonListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarMouseExited

        buttonListar.setBackground(new Color(255, 255, 255));
        buttonListar.setForeground(Color.BLACK);       
    }//GEN-LAST:event_buttonListarMouseExited

////////////////////////////////
    
    private void buttonFiltrarNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeMouseEntered

        buttonFiltrarNome.setBackground(new Color(235, 235, 235));
        buttonFiltrarNome.setForeground(new Color(204, 0, 153));        
    }//GEN-LAST:event_buttonFiltrarNomeMouseEntered

    private void buttonFiltrarNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeMouseExited

        buttonFiltrarNome.setBackground(new Color(255, 255, 255));
        buttonFiltrarNome.setForeground(Color.BLACK);         
    }//GEN-LAST:event_buttonFiltrarNomeMouseExited

////////////////////////////////
    
    private void buttonFiltrarPeriodicidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarPeriodicidadeMouseEntered

        buttonFiltrarPeriodicidade.setBackground(new Color(235, 235, 235));
        buttonFiltrarPeriodicidade.setForeground(new Color(204, 0, 153));        
    }//GEN-LAST:event_buttonFiltrarPeriodicidadeMouseEntered

    private void buttonFiltrarPeriodicidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarPeriodicidadeMouseExited

        buttonFiltrarPeriodicidade.setBackground(new Color(255, 255, 255));
        buttonFiltrarPeriodicidade.setForeground(Color.BLACK);            
    }//GEN-LAST:event_buttonFiltrarPeriodicidadeMouseExited
 
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogTipoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogTipoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogTipoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogTipoDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogTipoDespesa dialog = new dialogTipoDespesa(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Painel2;
    private javax.swing.JTextArea area;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonFiltrarNome;
    private javax.swing.JButton buttonFiltrarPeriodicidade;
    private javax.swing.JButton buttonListar;
    private javax.swing.JComboBox<String> comboPeriodicidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPeriodicidade;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
