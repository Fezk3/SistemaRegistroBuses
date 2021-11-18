package Vista;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class Vista extends javax.swing.JFrame {

    Conexion conectado = new Conexion();
    PreparedStatement ps=conectado.ps;
    ResultSet rs=conectado.rs;
    SimpleDateFormat formato;
    String fecha, hora;
    DefaultTableModel modelo = new DefaultTableModel();

    public Vista() {
        initComponents();
        // luego pasar al main
        this.setLocationRelativeTo(null);
        LlenaComboDestino();
        iniciaModelo();
    }
    
    public void iniciaModelo(){
        
        modelo.addColumn("Numero de asiento");
        modelo.addColumn("Cedula del Cliente");
        tablaAsientos.setModel(modelo);
        
    }

    private void setFechaActual() {

        java.util.Date actual = new java.util.Date();
        formato = new SimpleDateFormat("Y-MM-dd");
        fecha = formato.format(actual);
    }

    private void setHoraActual() {

        LocalDateTime locaDate = LocalDateTime.now();
        int hours = locaDate.getHour();
        int minutes = locaDate.getMinute();
        hora = hours + ":" + minutes;

    }

    public void LlenaComboDestino() {
        com.mysql.jdbc.Connection conexion = null;

        try {

            conexion = conectado.getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select destino from viaje");
            // Obteniendo el resultado del query
            rs = ps.executeQuery();

            // check si rs tiene contenido
            while (rs.next()) {
                comboDestino.addItem(rs.getString("destino"));

            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }



    public void llenarDatosBus(int num) {
        Connection conexion = null;
        try {

            conexion = conectado.getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select n_unico, nombre"
                    + " from bus inner join chofer on bus.chofer_cedula=chofer.cedula"
                    + " where n_unico=?");
            // Obteniendo el resultado del query
            ps.setInt(1, num);
            rs = ps.executeQuery();
            // check si rs tiene contenido
            if (rs.next()) {

                etiquetaNBus.setText(rs.getString("n_unico"));
                etiquetaNombreChofer.setText(rs.getString("nombre"));
                traeViaje(Integer.parseInt(rs.getString("n_unico")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe este bus");
            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }

    public void traeViaje(int numeroBus) {
        Connection conexion = null;
        PreparedStatement ps2;
        int viaje;
        try {

            conexion = conectado.getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select idViaje"
                    + " from viaje where bus_n_unico='" + numeroBus + "'");
            // Obteniendo el resultado del query
            rs = ps.executeQuery();
            // check si rs tiene contenido
            if (rs.next()) {

                viaje = Integer.parseInt(rs.getString("idViaje"));
                ps2 = conexion.prepareStatement("select n_ticket"
                        + " from ticket where viaje_idViaje='" + viaje + "'");
                rs = ps2.executeQuery();
                devolverIconos();
                cambiaIcono(rs);

            } else {
                JOptionPane.showMessageDialog(null, "Este bus no tiene viajes");
            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }

    public void cambiaIcono(ResultSet rs2) throws SQLException {
        Icon a = new ImageIcon("src\\imagenes\\seat - copia.png");
        int contador = 1;
        while (rs2.next()) {

            switch (contador) {
                case 1:
                    asiento1.setIcon(a);
                    break;
                case 2:
                    asiento2.setIcon(a);
                    break;
                case 3:
                    asiento3.setIcon(a);
                    break;
                case 4:
                    asiento4.setIcon(a);
                    break;
                case 5:
                    asiento5.setIcon(a);
                    break;
                case 6:
                    asiento6.setIcon(a);
                    break;

                    
            }
            contador++;
        }
    }
    
    public void devolverIconos(){
        Icon a = new ImageIcon("src\\imagenes\\seat.png");
        asiento1.setIcon(a);
        asiento2.setIcon(a);
        asiento3.setIcon(a);
        asiento4.setIcon(a);
        asiento5.setIcon(a);
        asiento6.setIcon(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelBuses = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnBus1 = new javax.swing.JButton();
        btnBus2 = new javax.swing.JButton();
        btnBus3 = new javax.swing.JButton();
        btnBus4 = new javax.swing.JButton();
        btnBus5 = new javax.swing.JButton();
        btnBus6 = new javax.swing.JButton();
        panelInfoBus = new javax.swing.JPanel();
        etiquetaInfoBus = new javax.swing.JLabel();
        etiquetaNBus = new javax.swing.JLabel();
        etiquetaChod = new javax.swing.JLabel();
        etiquetaNombreChofer = new javax.swing.JLabel();
        etiquetaAsientos = new javax.swing.JLabel();
        asiento1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        asiento3 = new javax.swing.JLabel();
        asiento4 = new javax.swing.JLabel();
        asiento5 = new javax.swing.JLabel();
        asiento6 = new javax.swing.JLabel();
        asiento2 = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        panelInfoRutas = new javax.swing.JPanel();
        comboSemana = new javax.swing.JComboBox<>();
        comboDestino = new javax.swing.JComboBox<>();
        etiquetaConsultas = new javax.swing.JLabel();
        etiquetaInfoViajeSel = new javax.swing.JLabel();
        etiquetadia = new javax.swing.JLabel();
        etiquetaDestino = new javax.swing.JLabel();
        etiquetaSale = new javax.swing.JLabel();
        sale = new javax.swing.JLabel();
        btnActualizaViaje = new javax.swing.JButton();
        etiquetaDesti = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        tiempoE = new javax.swing.JLabel();
        etiquetaCosto = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        etiquetaKM = new javax.swing.JLabel();
        KM = new javax.swing.JLabel();
        etiquetabus = new javax.swing.JLabel();
        bus = new javax.swing.JLabel();
        panelEncomiendas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        etiquetapeso = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        etiquetade = new javax.swing.JLabel();
        cajaDe = new javax.swing.JTextField();
        etiquetapara = new javax.swing.JLabel();
        cajaPara = new javax.swing.JTextField();
        etiquetasalida = new javax.swing.JLabel();
        cajasalida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajadestino = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        etiquetaPrecio = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        etiquetaViaje = new javax.swing.JLabel();
        viajeEspeci = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        horallega = new javax.swing.JTextField();
        panelCompraTicket = new javax.swing.JPanel();
        btnCompraTicket = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaAsiento = new javax.swing.JLabel();
        comboAsiento = new javax.swing.JComboBox<>();
        panelInfoTickets = new javax.swing.JPanel();
        etiquetaInfoTick = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsientos = new javax.swing.JTable();
        panelAdmin = new javax.swing.JPanel();
        etiquetaGestion = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnInfoEncomi = new javax.swing.JButton();
        btnRetiroEncomi = new javax.swing.JButton();
        btnEncomiendaCliente = new javax.swing.JButton();
        btnEncomiendaViaje = new javax.swing.JButton();
        btnEncomiendaBusca = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelBuses.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buses");

        BtnBus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N

        btnBus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N

        btnBus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N

        btnBus4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N

        btnBus5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N

        btnBus6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N

        javax.swing.GroupLayout panelBusesLayout = new javax.swing.GroupLayout(panelBuses);
        panelBuses.setLayout(panelBusesLayout);
        panelBusesLayout.setHorizontalGroup(
            panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusesLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBusesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBus3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBus1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnBus5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBus6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        panelBusesLayout.setVerticalGroup(
            panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBus2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BtnBus1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBus4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnBus3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(panelBusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBus6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnBus5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        panelInfoBus.setBackground(new java.awt.Color(0, 153, 255));

        etiquetaInfoBus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaInfoBus.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaInfoBus.setText("Info del Bus: ");

        etiquetaChod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaChod.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaChod.setText("Chofer:");

        etiquetaAsientos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAsientos.setText("Listado de asientos ");

        asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seat.png"))); // NOI18N

        asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seat.png"))); // NOI18N

        asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seat.png"))); // NOI18N

        asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seat.png"))); // NOI18N

        asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seat.png"))); // NOI18N

        asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seat.png"))); // NOI18N

        uno.setText("1");

        dos.setText("2");

        tres.setText("3");

        cuatro.setText("4");

        cinco.setText("5");

        seis.setText("6");

        javax.swing.GroupLayout panelInfoBusLayout = new javax.swing.GroupLayout(panelInfoBus);
        panelInfoBus.setLayout(panelInfoBusLayout);
        panelInfoBusLayout.setHorizontalGroup(
            panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoBusLayout.createSequentialGroup()
                .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etiquetaInfoBus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaNBus, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelInfoBusLayout.createSequentialGroup()
                                    .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addComponent(asiento1)
                                            .addGap(64, 64, 64)
                                            .addComponent(jLabel5))
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(uno)))
                                    .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(asiento2))
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(dos))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoBusLayout.createSequentialGroup()
                                    .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(asiento4)
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(cuatro)))
                                    .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(asiento5))
                                        .addGroup(panelInfoBusLayout.createSequentialGroup()
                                            .addGap(113, 113, 113)
                                            .addComponent(cinco)
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(panelInfoBusLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(etiquetaAsientos)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoBusLayout.createSequentialGroup()
                        .addComponent(etiquetaChod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaNombreChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoBusLayout.createSequentialGroup()
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(asiento6)
                            .addComponent(asiento3))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoBusLayout.createSequentialGroup()
                        .addComponent(tres)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoBusLayout.createSequentialGroup()
                        .addComponent(seis)
                        .addGap(83, 83, 83))))
        );
        panelInfoBusLayout.setVerticalGroup(
            panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoBusLayout.createSequentialGroup()
                .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaInfoBus)
                            .addComponent(etiquetaNBus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombreChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaChod))))
                .addGap(29, 29, 29)
                .addComponent(etiquetaAsientos)
                .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoBusLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(asiento2)
                            .addComponent(asiento1)
                            .addComponent(asiento3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uno)
                            .addComponent(dos)
                            .addComponent(tres))
                        .addGap(26, 26, 26)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asiento4)
                            .addComponent(asiento5)
                            .addComponent(asiento6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuatro)
                            .addComponent(cinco)
                            .addComponent(seis))
                        .addGap(17, 17, 17))))
        );

        panelInfoRutas.setBackground(new java.awt.Color(51, 153, 255));
        panelInfoRutas.setForeground(new java.awt.Color(255, 255, 255));

        comboSemana.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" }));

        etiquetaConsultas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaConsultas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaConsultas.setText("Consulta de viajes");

        etiquetaInfoViajeSel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaInfoViajeSel.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaInfoViajeSel.setText("Info del viaje Seleccionado");

        etiquetadia.setForeground(new java.awt.Color(255, 255, 255));
        etiquetadia.setText("Dia de la semana");

        etiquetaDestino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaDestino.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDestino.setText("Destino del viaje");

        etiquetaSale.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaSale.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSale.setText("Sale de:");

        sale.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sale.setForeground(new java.awt.Color(255, 255, 255));

        btnActualizaViaje.setBackground(new java.awt.Color(102, 0, 153));
        btnActualizaViaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnActualizaViaje.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizaViaje.setText("Actualizar");
        btnActualizaViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaViajeActionPerformed(evt);
            }
        });

        etiquetaDesti.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaDesti.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDesti.setText("Destino :");

        destino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        destino.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaTiempo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTiempo.setText("Tiempo estimado :");

        tiempoE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tiempoE.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaCosto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaCosto.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCosto.setText("Costo :");

        costo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        costo.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaKM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaKM.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaKM.setText("Cantidad de Km :");

        KM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        KM.setForeground(new java.awt.Color(255, 255, 255));

        etiquetabus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetabus.setForeground(new java.awt.Color(255, 255, 255));
        etiquetabus.setText("Bus asigando:");

        bus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bus.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelInfoRutasLayout = new javax.swing.GroupLayout(panelInfoRutas);
        panelInfoRutas.setLayout(panelInfoRutasLayout);
        panelInfoRutasLayout.setHorizontalGroup(
            panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoRutasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoRutasLayout.createSequentialGroup()
                        .addComponent(comboSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(panelInfoRutasLayout.createSequentialGroup()
                        .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelInfoRutasLayout.createSequentialGroup()
                                    .addComponent(etiquetaKM)
                                    .addGap(18, 18, 18)
                                    .addComponent(KM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelInfoRutasLayout.createSequentialGroup()
                                    .addComponent(etiquetaCosto)
                                    .addGap(18, 18, 18)
                                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInfoRutasLayout.createSequentialGroup()
                                    .addComponent(etiquetaTiempo)
                                    .addGap(18, 18, 18)
                                    .addComponent(tiempoE, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelInfoRutasLayout.createSequentialGroup()
                                .addComponent(etiquetabus)
                                .addGap(18, 18, 18)
                                .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelInfoRutasLayout.createSequentialGroup()
                        .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDesti)
                            .addComponent(etiquetaSale))
                        .addGap(27, 27, 27)
                        .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(destino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelInfoRutasLayout.createSequentialGroup()
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoRutasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(etiquetadia)
                        .addGap(82, 82, 82)
                        .addComponent(etiquetaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(etiquetaDestino))
                    .addGroup(panelInfoRutasLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(etiquetaInfoViajeSel)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoRutasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        panelInfoRutasLayout.setVerticalGroup(
            panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoRutasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetadia)
                    .addComponent(etiquetaDestino))
                .addGap(18, 18, 18)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(etiquetaInfoViajeSel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaSale))
                .addGap(18, 18, 18)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDesti)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tiempoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCosto)
                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaKM)
                    .addComponent(KM, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetabus)
                    .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelEncomiendas.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Realizacion de Encomienda");

        etiquetapeso.setText("Peso :");

        peso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        peso.setForeground(new java.awt.Color(0, 0, 0));

        etiquetade.setText("Ced Emi:");

        etiquetapara.setText("Para :");

        etiquetasalida.setText("Lugar de salida : ");

        jLabel3.setText("Lugar de destino :");

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Hacer Encomienda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        etiquetaPrecio.setText("Precio por Peso:");

        etiquetaViaje.setText("Numero de viaje:");

        jLabel4.setText("Fecha Entrega:");

        jLabel6.setText("Ejp: año-mes-dia");

        jLabel7.setText("Hora de llegada aprox:");

        javax.swing.GroupLayout panelEncomiendasLayout = new javax.swing.GroupLayout(panelEncomiendas);
        panelEncomiendas.setLayout(panelEncomiendasLayout);
        panelEncomiendasLayout.setHorizontalGroup(
            panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncomiendasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncomiendasLayout.createSequentialGroup()
                        .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetapeso)
                            .addComponent(etiquetade)
                            .addComponent(etiquetapara))
                        .addGap(27, 27, 27)
                        .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(cajaPara, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaDe)))
                    .addGroup(panelEncomiendasLayout.createSequentialGroup()
                        .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(etiquetasalida))
                        .addGap(18, 18, 18)
                        .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajasalida, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(cajadestino))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelEncomiendasLayout.createSequentialGroup()
                            .addComponent(etiquetaPrecio)
                            .addGap(18, 18, 18)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelEncomiendasLayout.createSequentialGroup()
                            .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaViaje)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(viajeEspeci)
                                .addComponent(fechaE))))
                    .addGroup(panelEncomiendasLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horallega, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(panelEncomiendasLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncomiendasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(204, 204, 204))
        );
        panelEncomiendasLayout.setVerticalGroup(
            panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncomiendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetapeso)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPrecio)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetade)
                    .addComponent(cajaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaViaje)
                    .addComponent(viajeEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetapara)
                    .addComponent(cajaPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetasalida)
                    .addComponent(cajasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cajadestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(horallega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCompraTicket.setBackground(new java.awt.Color(51, 153, 255));
        panelCompraTicket.setForeground(new java.awt.Color(0, 0, 0));

        btnCompraTicket.setBackground(new java.awt.Color(102, 0, 153));
        btnCompraTicket.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCompraTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnCompraTicket.setText("Comprar Ticket");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("Nombre :");

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cajaNombre.setForeground(new java.awt.Color(0, 0, 0));

        etiquetaAsiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaAsiento.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAsiento.setText("Numero de asiento : ");

        comboAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        javax.swing.GroupLayout panelCompraTicketLayout = new javax.swing.GroupLayout(panelCompraTicket);
        panelCompraTicket.setLayout(panelCompraTicketLayout);
        panelCompraTicketLayout.setHorizontalGroup(
            panelCompraTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraTicketLayout.createSequentialGroup()
                .addGroup(panelCompraTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCompraTicketLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnCompraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCompraTicketLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelCompraTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAsiento)
                            .addGroup(panelCompraTicketLayout.createSequentialGroup()
                                .addComponent(etiquetaNombre)
                                .addGap(27, 27, 27)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCompraTicketLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(comboAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCompraTicketLayout.setVerticalGroup(
            panelCompraTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCompraTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCompraTicket)
                .addGap(34, 34, 34)
                .addGroup(panelCompraTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(etiquetaAsiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        panelInfoTickets.setBackground(new java.awt.Color(0, 153, 153));

        etiquetaInfoTick.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaInfoTick.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaInfoTick.setText("Info de asientos por Viaje");

        tablaAsientos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaAsientos.setForeground(new java.awt.Color(0, 0, 0));
        tablaAsientos.setModel(modelo);
        jScrollPane1.setViewportView(tablaAsientos);

        javax.swing.GroupLayout panelInfoTicketsLayout = new javax.swing.GroupLayout(panelInfoTickets);
        panelInfoTickets.setLayout(panelInfoTicketsLayout);
        panelInfoTicketsLayout.setHorizontalGroup(
            panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoTicketsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(etiquetaInfoTick)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoTicketsLayout.setVerticalGroup(
            panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiquetaInfoTick, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        panelAdmin.setBackground(new java.awt.Color(51, 102, 255));
        panelAdmin.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaGestion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaGestion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGestion.setText("Gestion ");

        btnAdmin.setBackground(new java.awt.Color(153, 204, 255));
        btnAdmin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(0, 0, 0));
        btnAdmin.setText("Administracion");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

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

        btnTicket.setBackground(new java.awt.Color(153, 204, 255));
        btnTicket.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTicket.setForeground(new java.awt.Color(0, 0, 0));
        btnTicket.setText("Ver Tickets viaje ");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(etiquetaGestion)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEncomiendaBusca)
                    .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdmin)
                        .addComponent(btnInfoEncomi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncomiendaViaje)
                    .addComponent(btnRetiroEncomi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncomiendaCliente)
                    .addComponent(btnTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(etiquetaGestion))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAdminLayout.createSequentialGroup()
                                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInfoEncomi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEncomiendaBusca))
                            .addGroup(panelAdminLayout.createSequentialGroup()
                                .addComponent(btnEncomiendaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEncomiendaViaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetiroEncomi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTicket)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBuses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfoBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCompraTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfoTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfoRutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEncomiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelInfoRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEncomiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelCompraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfoTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelBuses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfoBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnActualizaViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaViajeActionPerformed
        Connection conexion = null;

        try {

            conexion = conectado.getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select dia,sale_de, destino, tiempo_estimado, costo, cantidad_KM, n_unico "
                    + "from viaje inner join bus on viaje.bus_n_unico=bus.n_unico"
                    + " where dia=? and destino=?");
            ps.setString(1, comboSemana.getSelectedItem().toString());
            ps.setString(2, comboDestino.getSelectedItem().toString());
            // Obteniendo el resultado del query
            rs = ps.executeQuery();

            // check si rs tiene contenido
            if (rs.next()) {
                sale.setText(rs.getString("sale_de"));
                destino.setText(rs.getString("destino"));
                tiempoE.setText(rs.getString("tiempo_estimado"));
                costo.setText(rs.getString("costo"));
                KM.setText(rs.getString("cantidad_KM"));
                bus.setText(String.valueOf(rs.getString("n_unico")));
                Icon a = new ImageIcon("src\\imagenes\\bus - copia.png");
                switch(rs.getInt("n_unico")){
                    case 1:
                        BtnBus1.setIcon(a);
                        llenarDatosBus(1);
                        break;
                    case 2:
                        btnBus2.setIcon(a);
                        llenarDatosBus(2);
                        break;
                    case 3:
                        btnBus3.setIcon(a);
                        llenarDatosBus(3);
                        break;
                    case 4:
                        btnBus4.setIcon(a);
                        llenarDatosBus(4);
                        break;
                    case 5:
                        btnBus5.setIcon(a);
                        llenarDatosBus(5);
                        break;
                    case 6:
                        btnBus6.setIcon(a);
                        llenarDatosBus(6);
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese viaje");
                sale.setText(null);
                destino.setText(null);
                tiempoE.setText(null);
                costo.setText(null);
                KM.setText(null);
                bus.setText(null);
            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }//GEN-LAST:event_btnActualizaViajeActionPerformed

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

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        VistaAdministrador encoR = new VistaAdministrador();
        encoR.setVisible(true);
        encoR.setLocationRelativeTo(null);
        encoR.validate();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnEncomiendaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncomiendaBuscaActionPerformed
        VistaEncomiendaBuscada encoB = new VistaEncomiendaBuscada();
        encoB.setVisible(true);
        encoB.setLocationRelativeTo(null);
        encoB.validate();
    }//GEN-LAST:event_btnEncomiendaBuscaActionPerformed

    private void btnEncomiendaViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncomiendaViajeActionPerformed
        VistaEncomiendaViaje encoV = new VistaEncomiendaViaje();
        encoV.setVisible(true);
        encoV.setLocationRelativeTo(null);
        encoV.validate();
    }//GEN-LAST:event_btnEncomiendaViajeActionPerformed

    private void btnEncomiendaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncomiendaClienteActionPerformed
        VistaEncomiendaCliente encoC = new VistaEncomiendaCliente();
        encoC.setVisible(true);
        encoC.setLocationRelativeTo(null);
        encoC.validate();
    }//GEN-LAST:event_btnEncomiendaClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (cajaDe.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            return;
        }
        if (cajaPara.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            return;
        }
        if (precio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            return;
        }
        if (cajasalida.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            return;
        }
        if (cajadestino.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            return;
        }
        if (viajeEspeci.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            return;
        }

        Connection conexion = null;

        try {

            conexion = conectado.getConnection();

            // INSERSION
            ps = conexion.prepareStatement("insert into encomienda (Cliente_cedula, Viaje_idViaje, precioXpeso, para, lugar_salida, lugar_destino, fecha_salida, estado, hora_salida, fecha_llegada, hora_llegada) values (?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?)");
            // Indicando datos a insertar (en el orden de las cols)
            ps.setInt(1, Integer.valueOf(cajaDe.getText()));
            ps.setString(2, viajeEspeci.getText());
            ps.setInt(3, Integer.valueOf(precio.getText()));
            ps.setString(4, cajaPara.getText());
            ps.setString(5, cajasalida.getText());
            ps.setString(6, cajadestino.getText());
            setHoraActual();
            setFechaActual();
            ps.setDate(7, Date.valueOf(fecha));
            ps.setString(8, "en espera de salida");
            ps.setString(9, hora);
            ps.setDate(10, Date.valueOf(fechaE.getText()));
            ps.setString(11, horallega.getText());
            // Ejecutando la instruccion de Insercion a la DB
            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Encomienda realizada exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, "Error al ingresar la encomienda");
            }

            // cerrando conexion con la DB
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        VistaTicket encoT = new VistaTicket();
        encoT.setVisible(true);
        encoT.setLocationRelativeTo(null);
        encoT.validate();
    }//GEN-LAST:event_btnTicketActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBus1;
    private javax.swing.JLabel KM;
    private javax.swing.JLabel asiento1;
    private javax.swing.JLabel asiento2;
    private javax.swing.JLabel asiento3;
    private javax.swing.JLabel asiento4;
    private javax.swing.JLabel asiento5;
    private javax.swing.JLabel asiento6;
    private javax.swing.JButton btnActualizaViaje;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBus2;
    private javax.swing.JButton btnBus3;
    private javax.swing.JButton btnBus4;
    private javax.swing.JButton btnBus5;
    private javax.swing.JButton btnBus6;
    private javax.swing.JButton btnCompraTicket;
    private javax.swing.JButton btnEncomiendaBusca;
    private javax.swing.JButton btnEncomiendaCliente;
    private javax.swing.JButton btnEncomiendaViaje;
    private javax.swing.JButton btnInfoEncomi;
    private javax.swing.JButton btnRetiroEncomi;
    private javax.swing.JButton btnTicket;
    private javax.swing.JLabel bus;
    private javax.swing.JTextField cajaDe;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPara;
    private javax.swing.JTextField cajadestino;
    private javax.swing.JTextField cajasalida;
    private javax.swing.JLabel cinco;
    private javax.swing.JComboBox<String> comboAsiento;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboSemana;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel etiquetaAsiento;
    private javax.swing.JLabel etiquetaAsientos;
    private javax.swing.JLabel etiquetaChod;
    private javax.swing.JLabel etiquetaConsultas;
    private javax.swing.JLabel etiquetaCosto;
    private javax.swing.JLabel etiquetaDesti;
    private javax.swing.JLabel etiquetaDestino;
    private javax.swing.JLabel etiquetaGestion;
    private javax.swing.JLabel etiquetaInfoBus;
    private javax.swing.JLabel etiquetaInfoTick;
    private javax.swing.JLabel etiquetaInfoViajeSel;
    private javax.swing.JLabel etiquetaKM;
    private javax.swing.JLabel etiquetaNBus;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNombreChofer;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaSale;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel etiquetaViaje;
    private javax.swing.JLabel etiquetabus;
    private javax.swing.JLabel etiquetade;
    private javax.swing.JLabel etiquetadia;
    private javax.swing.JLabel etiquetapara;
    private javax.swing.JLabel etiquetapeso;
    private javax.swing.JLabel etiquetasalida;
    private javax.swing.JTextField fechaE;
    private javax.swing.JTextField horallega;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelBuses;
    private javax.swing.JPanel panelCompraTicket;
    private javax.swing.JPanel panelEncomiendas;
    private javax.swing.JPanel panelInfoBus;
    private javax.swing.JPanel panelInfoRutas;
    private javax.swing.JPanel panelInfoTickets;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel sale;
    private javax.swing.JLabel seis;
    private javax.swing.JTable tablaAsientos;
    private javax.swing.JLabel tiempoE;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    private javax.swing.JTextField viajeEspeci;
    // End of variables declaration//GEN-END:variables
}
