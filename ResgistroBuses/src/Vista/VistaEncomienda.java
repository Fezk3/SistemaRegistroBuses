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
public class VistaEncomienda extends javax.swing.JFrame {

    /**
     * Creates new form VistaEncomienda
     */
    public VistaEncomienda() {
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

        jPanel1 = new javax.swing.JPanel();
        etiquetaInformacionEncomienda = new javax.swing.JLabel();
        etiqutaNumeroEncomienda = new javax.swing.JLabel();
        etiquetaPrecioEncomienda = new javax.swing.JLabel();
        etiquetaCedulaEmisor = new javax.swing.JLabel();
        etiquetaNombreReceptor = new javax.swing.JLabel();
        etiquetaLugarLlegada = new javax.swing.JLabel();
        etiquetaHoraSalida = new javax.swing.JLabel();
        etiquetaHoraLlegada = new javax.swing.JLabel();
        etiquetaHoraEntrega = new javax.swing.JLabel();
        etiquetaNumeroViaje = new javax.swing.JLabel();
        etiquetaEstado = new javax.swing.JLabel();
        etiquetaLugarSalida = new javax.swing.JLabel();
        espacioNumeroEncomiento = new javax.swing.JTextField();
        espacioEstado = new javax.swing.JTextField();
        espacioLugarSalida = new javax.swing.JTextField();
        espacioCedulaEmisor = new javax.swing.JTextField();
        espacioPrecio = new javax.swing.JTextField();
        EspacioNombreReceptor = new javax.swing.JTextField();
        espacioLugarLLegada = new javax.swing.JTextField();
        espacioHoraSAlida = new javax.swing.JTextField();
        espacioHoraLlegada = new javax.swing.JTextField();
        espacioHoraEntrega = new javax.swing.JTextField();
        espacioNumeroViaje = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        etiquetaInformacionEncomienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaInformacionEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaInformacionEncomienda.setText("Informacion de Encomiendas");

        etiqutaNumeroEncomienda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiqutaNumeroEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiqutaNumeroEncomienda.setText("numero de encomienda:");

        etiquetaPrecioEncomienda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPrecioEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaPrecioEncomienda.setText("precio de la encomienda:");

        etiquetaCedulaEmisor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaCedulaEmisor.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaCedulaEmisor.setText("cedula del emisor:");

        etiquetaNombreReceptor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNombreReceptor.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombreReceptor.setText("nombre cliente receptor:");

        etiquetaLugarLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaLugarLlegada.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaLugarLlegada.setText("lugar de llegada:");

        etiquetaHoraSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraSalida.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraSalida.setText("fecha de hora de salida:");

        etiquetaHoraLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraLlegada.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraLlegada.setText("fecha de hora de llegada:");

        etiquetaHoraEntrega.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraEntrega.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraEntrega.setText("fecha hora de entrega:");

        etiquetaNumeroViaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNumeroViaje.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNumeroViaje.setText("numero de viaje:");

        etiquetaEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaEstado.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaEstado.setText("estado del paquete:");

        etiquetaLugarSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaLugarSalida.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaLugarSalida.setText("lugar de salida:");

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Siguiente Encomienda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqutaNumeroEncomienda)
                            .addComponent(etiquetaLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(espacioNumeroEncomiento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(etiquetaNumeroViaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(espacioNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(etiquetaCedulaEmisor)
                                        .addGap(18, 18, 18)
                                        .addComponent(espacioCedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaPrecioEncomienda)
                                        .addGap(43, 43, 43)
                                        .addComponent(espacioPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(etiquetaNombreReceptor)
                                        .addGap(34, 34, 34)
                                        .addComponent(EspacioNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(149, 149, 149))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(espacioLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(124, 124, 124)
                                        .addComponent(etiquetaLugarLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(espacioLugarLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(etiquetaInformacionEncomienda)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(espacioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaHoraSalida))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(espacioHoraSAlida)
                    .addComponent(espacioHoraLlegada)
                    .addComponent(espacioHoraEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etiquetaInformacionEncomienda)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqutaNumeroEncomienda)
                    .addComponent(etiquetaNumeroViaje)
                    .addComponent(etiquetaPrecioEncomienda)
                    .addComponent(espacioNumeroEncomiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacioPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacioNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espacioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEstado)
                    .addComponent(etiquetaCedulaEmisor)
                    .addComponent(espacioCedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombreReceptor)
                    .addComponent(EspacioNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLugarSalida)
                    .addComponent(espacioLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaLugarLlegada)
                    .addComponent(espacioLugarLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaHoraSalida)
                    .addComponent(espacioHoraSAlida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaHoraLlegada)
                    .addComponent(espacioHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaHoraEntrega)
                    .addComponent(espacioHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEncomienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EspacioNombreReceptor;
    private javax.swing.JTextField espacioCedulaEmisor;
    private javax.swing.JTextField espacioEstado;
    private javax.swing.JTextField espacioHoraEntrega;
    private javax.swing.JTextField espacioHoraLlegada;
    private javax.swing.JTextField espacioHoraSAlida;
    private javax.swing.JTextField espacioLugarLLegada;
    private javax.swing.JTextField espacioLugarSalida;
    private javax.swing.JTextField espacioNumeroEncomiento;
    private javax.swing.JTextField espacioNumeroViaje;
    private javax.swing.JTextField espacioPrecio;
    private javax.swing.JLabel etiquetaCedulaEmisor;
    private javax.swing.JLabel etiquetaEstado;
    private javax.swing.JLabel etiquetaHoraEntrega;
    private javax.swing.JLabel etiquetaHoraLlegada;
    private javax.swing.JLabel etiquetaHoraSalida;
    private javax.swing.JLabel etiquetaInformacionEncomienda;
    private javax.swing.JLabel etiquetaLugarLlegada;
    private javax.swing.JLabel etiquetaLugarSalida;
    private javax.swing.JLabel etiquetaNombreReceptor;
    private javax.swing.JLabel etiquetaNumeroViaje;
    private javax.swing.JLabel etiquetaPrecioEncomienda;
    private javax.swing.JLabel etiqutaNumeroEncomienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
