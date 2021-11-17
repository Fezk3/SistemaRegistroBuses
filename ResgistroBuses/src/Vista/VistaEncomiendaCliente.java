/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class VistaEncomiendaCliente extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = "MakI-0*1";
    PreparedStatement ps;
    ResultSet rs;

    public VistaEncomiendaCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        espacioFechaEntrega = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();
        espacioLugarSalida = new javax.swing.JTextField();
        etiquetaInformacionEncomienda = new javax.swing.JLabel();
        espacioNumeroViaje = new javax.swing.JTextField();
        etiqutaNumeroEncomienda = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaPrecioEncomienda = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        etiquetaCedulaEmisor = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        etiquetaNombreReceptor = new javax.swing.JLabel();
        espacioNombreReceptor = new javax.swing.JTextField();
        etiquetaLugarLlegada = new javax.swing.JLabel();
        horaSalida = new javax.swing.JLabel();
        etiquetaHoraSalida = new javax.swing.JLabel();
        labelLlegada = new javax.swing.JLabel();
        etiquetaHoraLlegada = new javax.swing.JLabel();
        etiquetaHoraEntrega = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        espacioHoraSalida = new javax.swing.JTextField();
        etiquetaNumeroViaje = new javax.swing.JLabel();
        espacioHoraLlegada = new javax.swing.JTextField();
        etiquetaEstado = new javax.swing.JLabel();
        espacioHoraEntrega = new javax.swing.JTextField();
        etiquetaLugarSalida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        espacioNumeroEncomiento = new javax.swing.JTextField();
        numBus = new javax.swing.JTextField();
        espacioEstado = new javax.swing.JTextField();
        espacioCedulaEmisor = new javax.swing.JTextField();
        espacioPrecio = new javax.swing.JTextField();
        espacioLugarLLegada = new javax.swing.JTextField();
        espacioFechaSalida = new javax.swing.JTextField();
        espacioFechaLlegada = new javax.swing.JTextField();
        etiquetaced = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1009, 612));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        botonSiguiente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSiguiente.setText("Siguiente Encomienda");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        etiquetaInformacionEncomienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaInformacionEncomienda.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaInformacionEncomienda.setText("Informacion de Encomiendas del Cliente");

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

        horaSalida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        horaSalida.setForeground(new java.awt.Color(51, 51, 51));
        horaSalida.setText("Hora de Salida:");

        etiquetaHoraSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHoraSalida.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaHoraSalida.setText("fecha de salida:");

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

        etiquetaLugarSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaLugarSalida.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaLugarSalida.setText("lugar de salida:");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Num Bus:");

        etiquetaced.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaced.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaced.setText("Digite la Cedula del cliente a consular: ");

        cedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaHoraLlegada)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHoraEntrega)
                            .addComponent(etiquetaHoraSalida))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(espacioFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(espacioFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(horaSalida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(espacioHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelLlegada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(espacioHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(espacioHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(espacioFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSiguiente)
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(etiquetaLugarSalida)
                                .addGap(18, 18, 18)
                                .addComponent(espacioLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(etiquetaLugarLlegada)
                                .addGap(18, 18, 18)
                                .addComponent(espacioLugarLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(etiquetaced)
                                        .addGap(18, 18, 18)
                                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(etiquetaInformacionEncomienda)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaced, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(etiquetaInformacionEncomienda)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstado)
                    .addComponent(espacioEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCedulaEmisor)
                    .addComponent(espacioCedulaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombreReceptor)
                    .addComponent(espacioNombreReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaLugarSalida)
                    .addComponent(espacioLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaLugarLlegada)
                    .addComponent(espacioLugarLLegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacioHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaHoraSalida)
                    .addComponent(espacioFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLlegada)
                    .addComponent(espacioHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaHoraLlegada)
                    .addComponent(espacioFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaHoraEntrega)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(espacioFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(espacioHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSiguiente)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed

        if (espacioNumeroEncomiento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente antes de avanzar");
            return;
        }

        Connection conexion = null;

        try {

            conexion = getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select codigo,Viaje_idViaje,precioXpeso,estado,Cliente_cedula,para,lugar_salida,lugar_destino, fecha_salida,fecha_llegada, fecha_entrega,"
                    + "hora_salida,hora_llegada, hora_entrega, n_unico from encomienda inner join viaje on viaje.idViaje=encomienda.Viaje_idViaje inner join bus on viaje.bus_n_unico=bus.n_unico"
                    + " where Cliente_cedula=?");
            ps.setInt(1, Integer.parseInt(cedula.getText()));

            // Obteniendo el resultado del query
            rs = ps.executeQuery();

            // check si rs tiene contenido
            rs.next();
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
                JOptionPane.showMessageDialog(null, "No hay mas encomiendas");
                limpiar();
            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Connection conexion = null;

        try {

            conexion = getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select * from encomienda where Cliente_cedula=?");
            ps.setString(1, cedula.getText());

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
                cedula.setText(null);
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
            java.util.logging.Logger.getLogger(VistaEncomiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEncomiendaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEncomiendaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField cedula;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelLlegada;
    private javax.swing.JTextField numBus;
    // End of variables declaration//GEN-END:variables
}
