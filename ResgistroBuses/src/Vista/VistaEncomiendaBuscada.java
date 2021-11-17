package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VistaEncomiendaBuscada extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "MakI-0*1";
    PreparedStatement ps;
    ResultSet rs;
    
    public VistaEncomiendaBuscada() {
        initComponents();
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
    
    public void limpiar() {
        
        espacioNumeroEncomiento.setText(null);
        espacioNumeroViaje.setText(null);
        espacioPrecio.setText(null);
        espacioEstado.setText(null);
        espacioCedulaEmisor.setText(null);
        espacioNombreReceptor.setText(null);
        espacioLugarSalida.setText(null);
        espacioLugarLLegada.setText(null);
        espacioFechaSalida.setText(null);
        espacioFechaLlegada.setText(null);
        espacioFechaEntrega.setText(null);
        espacioHoraSalida.setText(null);
        espacioHoraLlegada.setText(null);
        espacioHoraEntrega.setText(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        espacioNumeroEncomiento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        numBus = new javax.swing.JTextField();
        etiquetaPrecioEncomienda = new javax.swing.JLabel();
        espacioEstado = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        espacioCedulaEmisor = new javax.swing.JTextField();
        etiquetaCedulaEmisor = new javax.swing.JLabel();
        espacioPrecio = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        espacioLugarLLegada = new javax.swing.JTextField();
        etiquetaNombreReceptor = new javax.swing.JLabel();
        espacioFechaSalida = new javax.swing.JTextField();
        espacioNombreReceptor = new javax.swing.JTextField();
        espacioFechaLlegada = new javax.swing.JTextField();
        etiquetaLugarLlegada = new javax.swing.JLabel();
        etiquetaced = new javax.swing.JLabel();
        horaSalida = new javax.swing.JLabel();
        etiquetaHoraSalida = new javax.swing.JLabel();
        idEnco = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labelLlegada = new javax.swing.JLabel();
        etiquetaHoraLlegada = new javax.swing.JLabel();
        etiquetaHoraEntrega = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        espacioHoraSalida = new javax.swing.JTextField();
        etiquetaNumeroViaje = new javax.swing.JLabel();
        espacioFechaEntrega = new javax.swing.JTextField();
        espacioHoraLlegada = new javax.swing.JTextField();
        etiquetaEstado = new javax.swing.JLabel();
        espacioLugarSalida = new javax.swing.JTextField();
        espacioHoraEntrega = new javax.swing.JTextField();
        etiquetaInformacionEncomienda = new javax.swing.JLabel();
        etiquetaLugarSalida = new javax.swing.JLabel();
        espacioNumeroViaje = new javax.swing.JTextField();
        etiqutaNumeroEncomienda = new javax.swing.JLabel();

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Num Bus:");

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

        etiquetaced.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaced.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaced.setText("Digite el id de la encomienda: ");

        horaSalida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        horaSalida.setForeground(new java.awt.Color(51, 51, 51));
        horaSalida.setText("Hora de Salida:");

        etiquetaHoraSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraSalida.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraSalida.setText("fecha de salida:");

        idEnco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelLlegada.setForeground(new java.awt.Color(51, 51, 51));
        labelLlegada.setText("Hora de llegada:");

        etiquetaHoraLlegada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraLlegada.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraLlegada.setText("fecha de llegada:");

        etiquetaHoraEntrega.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraEntrega.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraEntrega.setText("fecha de entrega:");

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Hora de entrega:");

        etiquetaNumeroViaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNumeroViaje.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNumeroViaje.setText("numero de viaje:");

        etiquetaEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaEstado.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaEstado.setText("estado del paquete:");

        etiquetaInformacionEncomienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaInformacionEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaInformacionEncomienda.setText("Informacion de Encomiendas del Cliente");

        etiquetaLugarSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaLugarSalida.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaLugarSalida.setText("lugar de salida:");

        etiqutaNumeroEncomienda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiqutaNumeroEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiqutaNumeroEncomienda.setText("numero de encomienda:");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaHoraLlegada)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHoraEntrega)
                            .addComponent(etiquetaHoraSalida))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espacioFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(espacioFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(espacioFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(horaSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(espacioHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelLlegada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(espacioHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(espacioHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(etiquetaLugarSalida)
                                .addGap(18, 18, 18)
                                .addComponent(espacioLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(etiquetaLugarLlegada)
                                .addGap(18, 18, 18)
                                .addComponent(espacioLugarLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(etiquetaEstado)
                                .addGap(18, 18, 18)
                                .addComponent(espacioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(etiquetaCedulaEmisor)
                                .addGap(18, 18, 18)
                                .addComponent(espacioCedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(etiquetaNombreReceptor)
                                .addGap(18, 18, 18)
                                .addComponent(espacioNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(etiquetaced)
                                        .addGap(18, 18, 18)
                                        .addComponent(idEnco, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(etiqutaNumeroEncomienda)
                                        .addGap(18, 18, 18)
                                        .addComponent(espacioNumeroEncomiento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(etiquetaNumeroViaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(espacioNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(etiquetaPrecioEncomienda)
                                        .addGap(18, 18, 18)
                                        .addComponent(espacioPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(numBus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(etiquetaInformacionEncomienda)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaced, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idEnco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(etiquetaInformacionEncomienda)
                .addGap(41, 41, 41)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqutaNumeroEncomienda)
                    .addComponent(espacioNumeroEncomiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNumeroViaje)
                    .addComponent(espacioNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPrecioEncomienda)
                    .addComponent(espacioPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(numBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstado)
                    .addComponent(espacioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCedulaEmisor)
                    .addComponent(espacioCedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombreReceptor)
                    .addComponent(espacioNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLugarSalida)
                    .addComponent(espacioLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaLugarLlegada)
                    .addComponent(espacioLugarLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHoraSalida)
                            .addComponent(espacioFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHoraLlegada)
                            .addComponent(espacioFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHoraEntrega)
                            .addComponent(espacioFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(espacioHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLlegada)
                            .addComponent(espacioHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(espacioHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        Connection conexion = null;
        
        try {
            
            conexion = getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select codigo,Viaje_idViaje,precioXpeso,estado,Cliente_cedula,para,lugar_salida,lugar_destino, fecha_salida,fecha_llegada, fecha_entrega,"
                    + "hora_salida,hora_llegada, hora_entrega, n_unico from encomienda inner join viaje on viaje.idViaje=encomienda.Viaje_idViaje inner join bus on viaje.bus_n_unico=bus.n_unico"
                    + " where codigo=?");;
            ps.setInt(1, Integer.valueOf(idEnco.getText()));

            // Obteniendo el resultado del query
            rs = ps.executeQuery();

            // check si rs tiene contenido
            if (rs.next()) {
                espacioNumeroEncomiento.setText(String.valueOf(rs.getInt("codigo")));
                espacioNumeroViaje.setText(rs.getString("Viaje_idViaje"));
                espacioPrecio.setText(rs.getString("precioXpeso"));
                espacioEstado.setText(rs.getString("estado"));
                espacioCedulaEmisor.setText(rs.getString("Cliente_cedula"));
                espacioNombreReceptor.setText(rs.getString("para"));
                espacioLugarSalida.setText(rs.getString("lugar_salida"));
                espacioLugarLLegada.setText(rs.getString("lugar_destino"));
                espacioFechaSalida.setText(String.valueOf(rs.getDate("fecha_salida")));
                espacioFechaLlegada.setText(String.valueOf(rs.getDate("fecha_llegada")));
                espacioFechaEntrega.setText(String.valueOf(rs.getDate("fecha_entrega")));
                espacioHoraSalida.setText(rs.getString("hora_salida"));
                espacioHoraLlegada.setText(rs.getString("hora_llegada"));
                espacioHoraEntrega.setText(rs.getString("hora_entrega"));
                numBus.setText(String.valueOf(rs.getInt("n_unico")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
                idEnco.setText(null);
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
            java.util.logging.Logger.getLogger(VistaEncomiendaBuscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaBuscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaBuscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaBuscada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEncomiendaBuscada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField espacioCedulaEmisor;
    private javax.swing.JTextField espacioEstado;
    private javax.swing.JTextField espacioFechaEntrega;
    private javax.swing.JTextField espacioFechaLlegada;
    private javax.swing.JTextField espacioFechaSalida;
    private javax.swing.JTextField espacioHoraEntrega;
    private javax.swing.JTextField espacioHoraLlegada;
    private javax.swing.JTextField espacioHoraSalida;
    private javax.swing.JTextField espacioLugarLLegada;
    private javax.swing.JTextField espacioLugarSalida;
    private javax.swing.JTextField espacioNombreReceptor;
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
    private javax.swing.JLabel etiquetaced;
    private javax.swing.JLabel etiqutaNumeroEncomienda;
    private javax.swing.JLabel horaSalida;
    private javax.swing.JTextField idEnco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelLlegada;
    private javax.swing.JTextField numBus;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
