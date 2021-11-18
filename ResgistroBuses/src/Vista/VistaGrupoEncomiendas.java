/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author manus
 */
public class VistaGrupoEncomiendas extends javax.swing.JFrame {

    /**
     * Creates new form VistaGrupoEncomiendas
     */
    public VistaGrupoEncomiendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdmin = new javax.swing.JPanel();
        etiquetaGestion = new javax.swing.JLabel();
        btnInfoEncomi = new javax.swing.JButton();
        btnRetiroEncomi = new javax.swing.JButton();
        btnEncomiendaCliente = new javax.swing.JButton();
        btnEncomiendaViaje = new javax.swing.JButton();
        btnEncomiendaBusca = new javax.swing.JButton();

        panelAdmin.setBackground(new java.awt.Color(51, 102, 255));
        panelAdmin.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaGestion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaGestion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGestion.setText("Gestion de Encomienda");

        btnInfoEncomi.setBackground(new java.awt.Color(153, 204, 255));
        btnInfoEncomi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInfoEncomi.setForeground(new java.awt.Color(0, 0, 0));
        btnInfoEncomi.setText("Info Encominedas");
        btnInfoEncomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEncomiActionPerformed(evt);
            }
        });

        btnRetiroEncomi.setBackground(new java.awt.Color(153, 204, 255));
        btnRetiroEncomi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetiroEncomi.setForeground(new java.awt.Color(0, 0, 0));
        btnRetiroEncomi.setText("Retiro Encomiendas");
        btnRetiroEncomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroEncomiActionPerformed(evt);
            }
        });

        btnEncomiendaCliente.setBackground(new java.awt.Color(153, 204, 255));
        btnEncomiendaCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEncomiendaCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnEncomiendaCliente.setText("Encomienda Cliente");
        btnEncomiendaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncomiendaClienteActionPerformed(evt);
            }
        });

        btnEncomiendaViaje.setBackground(new java.awt.Color(153, 204, 255));
        btnEncomiendaViaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEncomiendaViaje.setForeground(new java.awt.Color(0, 0, 0));
        btnEncomiendaViaje.setText("Encomienda Viaje");
        btnEncomiendaViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncomiendaViajeActionPerformed(evt);
            }
        });

        btnEncomiendaBusca.setBackground(new java.awt.Color(153, 204, 255));
        btnEncomiendaBusca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEncomiendaBusca.setForeground(new java.awt.Color(0, 0, 0));
        btnEncomiendaBusca.setText("Buscar Encomienda");
        btnEncomiendaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncomiendaBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetiroEncomi)
                    .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnInfoEncomi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEncomiendaBusca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncomiendaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncomiendaViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaGestion)
                .addGap(91, 91, 91))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(etiquetaGestion)
                .addGap(34, 34, 34)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoEncomi)
                    .addComponent(btnEncomiendaCliente))
                .addGap(33, 33, 33)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncomiendaBusca)
                    .addComponent(btnEncomiendaViaje))
                .addGap(33, 33, 33)
                .addComponent(btnRetiroEncomi)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoEncomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEncomiActionPerformed

        VistaEncomienda enco = new VistaEncomienda();
        enco.setVisible(true);
        enco.setLocationRelativeTo(null);
        enco.validate();
    }//GEN-LAST:event_btnInfoEncomiActionPerformed

    private void btnRetiroEncomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroEncomiActionPerformed

        VistaRetiroEncomienda encoR = new VistaRetiroEncomienda();
        encoR.setVisible(true);
        encoR.setLocationRelativeTo(null);
        encoR.validate();
    }//GEN-LAST:event_btnRetiroEncomiActionPerformed

    private void btnEncomiendaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncomiendaClienteActionPerformed
        VistaEncomiendaCliente encoC = new VistaEncomiendaCliente();
        encoC.setVisible(true);
        encoC.setLocationRelativeTo(null);
        encoC.validate();
    }//GEN-LAST:event_btnEncomiendaClienteActionPerformed

    private void btnEncomiendaViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncomiendaViajeActionPerformed
        VistaEncomiendaViaje encoV = new VistaEncomiendaViaje();
        encoV.setVisible(true);
        encoV.setLocationRelativeTo(null);
        encoV.validate();
    }//GEN-LAST:event_btnEncomiendaViajeActionPerformed

    private void btnEncomiendaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncomiendaBuscaActionPerformed
        VistaEncomiendaBuscada encoB = new VistaEncomiendaBuscada();
        encoB.setVisible(true);
        encoB.setLocationRelativeTo(null);
        encoB.validate();
    }//GEN-LAST:event_btnEncomiendaBuscaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaGrupoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGrupoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGrupoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGrupoEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGrupoEncomiendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncomiendaBusca;
    private javax.swing.JButton btnEncomiendaCliente;
    private javax.swing.JButton btnEncomiendaViaje;
    private javax.swing.JButton btnInfoEncomi;
    private javax.swing.JButton btnRetiroEncomi;
    private javax.swing.JLabel etiquetaGestion;
    private javax.swing.JPanel panelAdmin;
    // End of variables declaration//GEN-END:variables
}
