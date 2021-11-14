package Vista;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class VistaRetiroEncomienda extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "MakI-0*1";
    PreparedStatement ps;
    ResultSet rs;

    public VistaRetiroEncomienda() {
        initComponents();
        setFechaActual();
        setHoraActual();
    }

    public Connection getConnection() throws SQLException {

        Connection conexion = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, usuario, password);

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println("Error," + e);
        }

        return conexion;

    }

    private void setFechaActual() {

        java.util.Date actual = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat("Y-MM-dd");
        fecha.setText(formato.format(actual));

    }

    private void setHoraActual() {

        LocalDateTime locaDate = LocalDateTime.now();
        int hours = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        hora.setText("" + hours + ":" + minutes);

    }

    public void limpiar() {

        espacioNumeroEncomiento.setText(null);
        cajaNombreReceptor.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaInformacionEncomienda = new javax.swing.JLabel();
        etiqutaNumeroEncomienda = new javax.swing.JLabel();
        espacioNumeroEncomiento = new javax.swing.JTextField();
        botonRetirar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombreReceptor = new javax.swing.JTextField();
        etiquetaFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        etiquetaInformacionEncomienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaInformacionEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaInformacionEncomienda.setText("Retirar Encomienta");

        etiqutaNumeroEncomienda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqutaNumeroEncomienda.setForeground(new java.awt.Color(51, 51, 51));
        etiqutaNumeroEncomienda.setText("Digite numero de encomienda:");

        botonRetirar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRetirar.setText("Retirar Encomienda");
        botonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetirarActionPerformed(evt);
            }
        });

        etiquetaNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaNombre.setText("Digite el nombre su nombre:");

        etiquetaFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaFecha.setText("Fecha:");

        fecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));

        etiquetaHora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaHora.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaHora.setText("Hora:");

        hora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(botonRetirar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(etiquetaInformacionEncomienda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(etiquetaHora)
                                .addGap(18, 18, 18)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiqutaNumeroEncomienda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaNombre)
                                        .addGap(28, 28, 28)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(espacioNumeroEncomiento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaInformacionEncomienda)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espacioNumeroEncomiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqutaNumeroEncomienda))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(cajaNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHora)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(botonRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetirarActionPerformed

        Connection conexion = null;

        try {

            conexion = getConnection();

            // INSERSION
            ps = conexion.prepareStatement("update encomienda set estado=?, fecha_entrega=?, hora_entrega=? where codigo=? and para=?");
            // Indicando datos a modificar (en el orden de las cols)
            ps.setString(1, "Entregado");
            ps.setDate(2, Date.valueOf(fecha.getText()));
            ps.setString(3, hora.getText());

            // seleccionando persona a modificar
            ps.setInt(4, Integer.parseInt(espacioNumeroEncomiento.getText()));
            ps.setString(5, cajaNombreReceptor.getText());

            // Ejecutando la modificacion a la DB
            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Encomienda entregada con exito!");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error credenciales invalidas");
                limpiar();
            }

            // cerrando conexion con la DB
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }

    }//GEN-LAST:event_botonRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaRetiroEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRetiroEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRetiroEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRetiroEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRetiroEncomienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRetirar;
    private javax.swing.JTextField cajaNombreReceptor;
    private javax.swing.JTextField espacioNumeroEncomiento;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaInformacionEncomienda;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiqutaNumeroEncomienda;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
