
package forms;

import abstratas.Listas;
import classes.Credor;
import java.awt.Color;
import javax.swing.JOptionPane;

public class dialogCredor extends javax.swing.JDialog {

    public dialogCredor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelCnpj = new javax.swing.JLabel();
        buttonAdicionar = new javax.swing.JButton();
        buttonListarCredor = new javax.swing.JButton();
        textTelefone = new javax.swing.JFormattedTextField();
        textCnpj = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Credor");
        setBackground(new java.awt.Color(255, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 204, 255));

        panel.setBackground(new java.awt.Color(255, 204, 255));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 0, 153), new java.awt.Color(204, 0, 153)), "Dados do Credor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13))); // NOI18N

        labelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNome.setText("Nome");

        textNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textNome.setSelectionColor(new java.awt.Color(204, 0, 153));

        labelTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefone.setText("Telefone");

        labelCnpj.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCnpj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCnpj.setText("CNPJ");

        buttonAdicionar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 153), new java.awt.Color(204, 0, 153)));
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

        buttonListarCredor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonListarCredor.setText("Listar todos os credores");
        buttonListarCredor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 153), new java.awt.Color(204, 0, 153)));
        buttonListarCredor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonListarCredorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonListarCredorMouseExited(evt);
            }
        });
        buttonListarCredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarCredorActionPerformed(evt);
            }
        });

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            textCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(labelCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonListarCredor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCnpj)
                    .addComponent(textCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonListarCredor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 0, 153), new java.awt.Color(204, 0, 153)));
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
       
        if (textNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo Nome é Obrigatório");
            textNome.requestFocus();
            return;
        }
        
        if(textTelefone.getText().equals("(  )     -    ")){
            JOptionPane.showMessageDialog(null, "O Campo de Telefone é Obrigatório");
            textTelefone.requestFocus();
            return;
        }
        
        if(textCnpj.getText().equals("  .  .   /    -  ")){
            JOptionPane.showMessageDialog(null, "O Campo de CNPJ é Obrigatório");
            textCnpj.requestFocus();
            return;
        }
        
        Credor credor = new Credor(textNome.getText(), textTelefone.getText(), textCnpj.getText());
        
        Listas.getListaCredor().add(credor);
        
        textNome.setText("");
        textTelefone.setText("");
        textCnpj.setText("");
        
        area.setText("Credor adicionado com sucesso");
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonListarCredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarCredorActionPerformed
        
        area.setText("Nome \t\t Telefone \t\t CNPJ \n");
            for(Credor credor : Listas.getListaCredor()){
                area.append(credor.getNome() + "\t" +
                            credor.getTelefone() + "\t" +
                            credor.getCnpj() + "\n");
            }
    }//GEN-LAST:event_buttonListarCredorActionPerformed

    private void buttonAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseEntered
        
        buttonAdicionar.setBackground(new Color(235, 235, 235));
        buttonAdicionar.setForeground(new Color(204, 0, 153));
    }//GEN-LAST:event_buttonAdicionarMouseEntered

    private void buttonAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdicionarMouseExited
        
        buttonAdicionar.setBackground(new Color(255, 255, 255));
        buttonAdicionar.setForeground(Color.BLACK);
    }//GEN-LAST:event_buttonAdicionarMouseExited

//////////////////////
    
    private void buttonListarCredorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarCredorMouseEntered
        
        buttonListarCredor.setBackground(new Color(235, 235, 235));
        buttonListarCredor.setForeground(new Color(204, 0, 153));
    }//GEN-LAST:event_buttonListarCredorMouseEntered

    private void buttonListarCredorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonListarCredorMouseExited
        
        buttonListarCredor.setBackground(new Color(255, 255, 255));
        buttonListarCredor.setForeground(Color.BLACK);
    }//GEN-LAST:event_buttonListarCredorMouseExited

    
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogCredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogCredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogCredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogCredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogCredor dialog = new dialogCredor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonListarCredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panel;
    private javax.swing.JFormattedTextField textCnpj;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
