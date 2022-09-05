
package forms;

public class framePrincipal extends javax.swing.JFrame {

    public framePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCredor = new javax.swing.JMenuItem();
        itemTipoDespesa = new javax.swing.JMenuItem();
        itemDespesa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 204, 255));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        panel.setBackground(new java.awt.Color(255, 228, 255));
        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 228, 255), new java.awt.Color(255, 228, 255)));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 228, 255));
        jMenuBar1.setBorder(null);

        jMenu1.setText("Arquivos");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        itemCredor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemCredor.setText("Credor");
        itemCredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCredorActionPerformed(evt);
            }
        });
        jMenu1.add(itemCredor);

        itemTipoDespesa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemTipoDespesa.setText("Tipo de Despesa");
        itemTipoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTipoDespesaActionPerformed(evt);
            }
        });
        jMenu1.add(itemTipoDespesa);

        itemDespesa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        itemDespesa.setText("Despesa");
        itemDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDespesaActionPerformed(evt);
            }
        });
        jMenu1.add(itemDespesa);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemTipoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTipoDespesaActionPerformed
        
        new dialogTipoDespesa(this, true).setVisible(true);
    }//GEN-LAST:event_itemTipoDespesaActionPerformed

    private void itemDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDespesaActionPerformed
        
        new dialogDespesa(this, true).setVisible(true);
    }//GEN-LAST:event_itemDespesaActionPerformed

    private void itemCredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCredorActionPerformed
        
        new dialogCredor(this, true).setVisible(true);
    }//GEN-LAST:event_itemCredorActionPerformed


    
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCredor;
    private javax.swing.JMenuItem itemDespesa;
    private javax.swing.JMenuItem itemTipoDespesa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
