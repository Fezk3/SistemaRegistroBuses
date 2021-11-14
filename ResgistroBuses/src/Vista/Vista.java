package Vista;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    // NECESARIO PARA PODER CONECTAR A LA BASE
    public static final String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String password = /*"MakI-0*1"*/"chismosear";
    PreparedStatement ps;
    ResultSet rs;

    public Vista() {
        initComponents();
        // luego pasar al main
        this.setLocationRelativeTo(null);
    }
    
    public void LlenaComboDestino(){
        
    }

    // METODO PARA CONEXION A LA BASE (SE USA EN TODOS LOS QUERIES)
    public Connection getConnection() {

        Connection conexion = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, usuario, password);

        } catch (ClassNotFoundException | SQLException e) {

            System.err.println("Error," + e);
        }

        return conexion;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsientos = new javax.swing.JTable();
        etiquetaAsientos = new javax.swing.JLabel();
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
        panelCompraTicket = new javax.swing.JPanel();
        btnCompraTicket = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaAsiento = new javax.swing.JLabel();
        comboAsiento = new javax.swing.JComboBox<>();
        panelInfoTickets = new javax.swing.JPanel();
        etiquetaInfoTick = new javax.swing.JLabel();
        btnSig = new javax.swing.JButton();
        etiquetaNTick = new javax.swing.JLabel();
        ticketN = new javax.swing.JLabel();
        etiquetaCedCliente = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        etiquetaGestion = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnInfoEncomi = new javax.swing.JButton();
        btnRetiroEncomi = new javax.swing.JButton();

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
                .addContainerGap(209, Short.MAX_VALUE))
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

        tablaAsientos.setForeground(new java.awt.Color(255, 255, 255));
        tablaAsientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAsientos);

        etiquetaAsientos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaAsientos.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAsientos.setText("Listado de asientos ");

        javax.swing.GroupLayout panelInfoBusLayout = new javax.swing.GroupLayout(panelInfoBus);
        panelInfoBus.setLayout(panelInfoBusLayout);
        panelInfoBusLayout.setHorizontalGroup(
            panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoBusLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaInfoBus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNBus, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaChod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaNombreChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(panelInfoBusLayout.createSequentialGroup()
                .addGroup(panelInfoBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(etiquetaAsientos))
                    .addGroup(panelInfoBusLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
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
                .addGap(31, 31, 31)
                .addComponent(etiquetaAsientos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panelInfoRutas.setBackground(new java.awt.Color(51, 153, 255));
        panelInfoRutas.setForeground(new java.awt.Color(255, 255, 255));

        comboSemana.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" }));

        comboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cartago", "limon" }));

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
                        .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelInfoRutasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnActualizaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfoRutasLayout.createSequentialGroup()
                                .addComponent(comboSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(panelInfoRutasLayout.createSequentialGroup()
                        .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDesti)
                            .addComponent(etiquetaSale))
                        .addGap(27, 27, 27)
                        .addGroup(panelInfoRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(destino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addContainerGap(69, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnActualizaViaje)
                .addGap(23, 23, 23))
        );

        panelEncomiendas.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Realizacion de Encomienda");

        etiquetapeso.setText("Peso :");

        peso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        peso.setForeground(new java.awt.Color(0, 0, 0));

        etiquetade.setText("De :");

        etiquetapara.setText("Para :");

        etiquetasalida.setText("Lugar de salida : ");

        jLabel3.setText("Lugar de destino :");

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Hacer Encomienda");

        javax.swing.GroupLayout panelEncomiendasLayout = new javax.swing.GroupLayout(panelEncomiendas);
        panelEncomiendas.setLayout(panelEncomiendasLayout);
        panelEncomiendasLayout.setHorizontalGroup(
            panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncomiendasLayout.createSequentialGroup()
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncomiendasLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel2))
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
                                    .addComponent(cajadestino))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetade)
                    .addComponent(cajaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetapara)
                    .addComponent(cajaPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetasalida)
                    .addComponent(cajasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEncomiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajadestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        comboAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        etiquetaInfoTick.setText("Info de Tickets por Viaje");

        btnSig.setBackground(new java.awt.Color(153, 204, 255));
        btnSig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSig.setForeground(new java.awt.Color(0, 0, 0));
        btnSig.setText("Siguiente");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        etiquetaNTick.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaNTick.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNTick.setText("Numero de Ticket :");

        ticketN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ticketN.setForeground(new java.awt.Color(255, 255, 255));

        etiquetaCedCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaCedCliente.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCedCliente.setText("Cedula del cliente :");

        javax.swing.GroupLayout panelInfoTicketsLayout = new javax.swing.GroupLayout(panelInfoTickets);
        panelInfoTickets.setLayout(panelInfoTicketsLayout);
        panelInfoTicketsLayout.setHorizontalGroup(
            panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                .addGroup(panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(etiquetaInfoTick))
                    .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                                .addComponent(etiquetaCedCliente)
                                .addGap(18, 18, 18)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                                .addComponent(etiquetaNTick)
                                .addGap(32, 32, 32)
                                .addComponent(ticketN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoTicketsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSig)
                .addGap(36, 36, 36))
        );
        panelInfoTicketsLayout.setVerticalGroup(
            panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInfoTicketsLayout.createSequentialGroup()
                        .addComponent(etiquetaInfoTick, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(ticketN, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaNTick))
                .addGap(39, 39, 39)
                .addGroup(panelInfoTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCedCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54)
                .addComponent(btnSig)
                .addContainerGap(33, Short.MAX_VALUE))
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

        btnInfoEncomi.setBackground(new java.awt.Color(153, 204, 255));
        btnInfoEncomi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInfoEncomi.setForeground(new java.awt.Color(0, 0, 0));
        btnInfoEncomi.setText("Info Encominedas");

        btnRetiroEncomi.setBackground(new java.awt.Color(153, 204, 255));
        btnRetiroEncomi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRetiroEncomi.setForeground(new java.awt.Color(0, 0, 0));
        btnRetiroEncomi.setText("Retiro Encomiendas");

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminLayout.createSequentialGroup()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAdmin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetiroEncomi)
                            .addComponent(btnInfoEncomi))))
                .addGap(30, 30, 30))
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(etiquetaGestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(etiquetaGestion)
                .addGap(48, 48, 48)
                .addComponent(btnInfoEncomi)
                .addGap(4, 4, 4)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnRetiroEncomi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSigActionPerformed

    private void btnActualizaViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaViajeActionPerformed
        Connection conexion = null;

        try {

            conexion = getConnection();

            // indicando que mostrar
            ps = conexion.prepareStatement("select * from viaje where dia=? and destino=?");
            ps.setString(1,comboSemana.getSelectedItem().toString());
            ps.setString(2,comboDestino.getSelectedItem().toString());
            // Obteniendo el resultado del query
            rs = ps.executeQuery();

            // check si rs tiene contenido
            if (rs.next()) {
                sale.setText(rs.getString("sale_de"));
                destino.setText(rs.getString("destino"));
                tiempoE.setText(rs.getString("tiempo_estimado"));
                costo.setText(rs.getString("costo"));
                KM.setText(rs.getString("cantidad_KM"));
                //ps = conexion.prepareStatement("select bus.n_unico from viaje inner join bus on viaje.idViaje=bus.viaje_idViaje");
                bus.setText(String.valueOf(rs.getDate("Bus_numero")));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
                
            }

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.err.println("ERROR, " + e);
        }
    }//GEN-LAST:event_btnActualizaViajeActionPerformed

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
    private javax.swing.JButton btnActualizaViaje;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBus2;
    private javax.swing.JButton btnBus3;
    private javax.swing.JButton btnBus4;
    private javax.swing.JButton btnBus5;
    private javax.swing.JButton btnBus6;
    private javax.swing.JButton btnCompraTicket;
    private javax.swing.JButton btnInfoEncomi;
    private javax.swing.JButton btnRetiroEncomi;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel bus;
    private javax.swing.JTextField cajaDe;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPara;
    private javax.swing.JTextField cajadestino;
    private javax.swing.JTextField cajasalida;
    private javax.swing.JLabel cedula;
    private javax.swing.JComboBox<String> comboAsiento;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboSemana;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel etiquetaAsiento;
    private javax.swing.JLabel etiquetaAsientos;
    private javax.swing.JLabel etiquetaCedCliente;
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
    private javax.swing.JLabel etiquetaNTick;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNombreChofer;
    private javax.swing.JLabel etiquetaSale;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel etiquetabus;
    private javax.swing.JLabel etiquetade;
    private javax.swing.JLabel etiquetadia;
    private javax.swing.JLabel etiquetapara;
    private javax.swing.JLabel etiquetapeso;
    private javax.swing.JLabel etiquetasalida;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel sale;
    private javax.swing.JTable tablaAsientos;
    private javax.swing.JLabel ticketN;
    private javax.swing.JLabel tiempoE;
    // End of variables declaration//GEN-END:variables
}
