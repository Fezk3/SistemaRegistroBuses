package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class VistaEncomiendaViaje extends javax.swing.JFrame {

    Conexion conectado = new Conexion();
    PreparedStatement ps=conectado.ps;
    ResultSet rs=conectado.rs;
    DefaultTableModel modelo = new DefaultTableModel();

    public VistaEncomiendaViaje() {
        initComponents();
        inciamodelotabla();
    }

    public void inciamodelotabla() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Ced Emisor");
        modelo.addColumn("Receptor");
        modelo.addColumn("PrecioXPeso");
        modelo.addColumn("Lugar salida");
        modelo.addColumn("Lugar destino");
        tablaenco.setModel(modelo);

    }

     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrin = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        viaje = new javax.swing.JTextField();
        etiquetaced = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaenco = new javax.swing.JTable();

        panelPrin.setBackground(new java.awt.Color(204, 204, 204));

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        viaje.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        etiquetaced.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaced.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaced.setText("Digite el id del viaje a consular: ");

        tablaenco.setModel(modelo);
        jScrollPane1.setViewportView(tablaenco);

        javax.swing.GroupLayout panelPrinLayout = new javax.swing.GroupLayout(panelPrin);
        panelPrin.setLayout(panelPrinLayout);
        panelPrinLayout.setHorizontalGroup(
            panelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrinLayout.createSequentialGroup()
                .addGroup(panelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrinLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(etiquetaced)
                        .addGap(18, 18, 18)
                        .addComponent(viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrinLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        panelPrinLayout.setVerticalGroup(
            panelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrinLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaced, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Connection conexion = null;

        while (modelo.getRowCount() != 0) {

            modelo.removeRow(0);

        }

        try {

            conexion = conectado.getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select codigo,Cliente_cedula,para,precioXpeso,lugar_salida,lugar_destino  from encomienda where Viaje_idViaje=?");
            ps.setString(1, viaje.getText());

            // Obteniendo el resultado del query
            rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No existe un viaje con esa id");
                viaje.setText(null);
            }
            
            rs = ps.executeQuery();
            // check si rs tiene contenido
            while (rs.next()) {

                modelo.addRow(new Object[]{rs.getInt("codigo"), rs.getInt("Cliente_cedula"), rs.getString("para"), rs.getInt("precioXpeso"), rs.getString("lugar_salida"), rs.getString("lugar_destino")});

            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEncomiendaViaje.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaViaje.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaViaje.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaViaje.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEncomiendaViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel etiquetaced;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrin;
    private javax.swing.JTable tablaenco;
    private javax.swing.JTextField viaje;
    // End of variables declaration//GEN-END:variables
}
