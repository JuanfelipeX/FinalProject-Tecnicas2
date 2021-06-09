package Vista;

import Modelo.Persona;
import java.util.ArrayList;

public class PanelPersona extends javax.swing.JFrame {
    
    static ArrayList<Persona> listaPersona = new ArrayList<>();
    Persona personaAux = new Persona();

    /** Creates new form vista */
    public PanelPersona() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        nombrePanel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        nombreJTextField = new javax.swing.JTextField();
        idPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        pesoPanel = new javax.swing.JPanel();
        pesoLabel = new javax.swing.JLabel();
        pesoJTextField = new javax.swing.JTextField();
        Kglabel = new javax.swing.JLabel();
        EstaturaPanel = new javax.swing.JPanel();
        estauraLabel = new javax.swing.JLabel();
        estauraJTextField = new javax.swing.JTextField();
        metrosLabel = new javax.swing.JLabel();
        edadPanel = new javax.swing.JPanel();
        edadLabel = new javax.swing.JLabel();
        edadJTextField = new javax.swing.JTextField();
        siguienteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPersonasjTextArea = new javax.swing.JTextArea();
        listaPersonasPanel = new javax.swing.JPanel();
        listaPersonasLabel = new javax.swing.JLabel();
        guardarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ArchivojMenu = new javax.swing.JMenu();
        GuardarjMenuItem = new javax.swing.JMenuItem();
        siguientejMenuItem = new javax.swing.JMenuItem();
        regresarjMenuItem = new javax.swing.JMenuItem();
        RegistrosjMenu = new javax.swing.JMenu();
        menuPrincipaljMenuItem = new javax.swing.JMenuItem();
        ingresarPersonajMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(199, 199, 199));
        jPanel1.setForeground(new java.awt.Color(1, 1, 1));

        tituloPanel.setBackground(new java.awt.Color(254, 66, 80));
        tituloPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tituloPanel.setForeground(new java.awt.Color(1, 1, 1));

        tituloLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(1, 1, 1));
        tituloLabel.setText("Ingrese los datos de la persona ");

        javax.swing.GroupLayout tituloPanelLayout = new javax.swing.GroupLayout(tituloPanel);
        tituloPanel.setLayout(tituloPanelLayout);
        tituloPanelLayout.setHorizontalGroup(
            tituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tituloPanelLayout.setVerticalGroup(
            tituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        nombrePanel.setBackground(new java.awt.Color(254, 254, 254));
        nombrePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nombrePanel.setForeground(new java.awt.Color(254, 254, 254));

        nombreLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(1, 1, 1));
        nombreLabel.setText("Nombre completo");

        nombreJTextField.setBackground(new java.awt.Color(237, 235, 235));
        nombreJTextField.setForeground(new java.awt.Color(1, 1, 1));
        nombreJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nombrePanelLayout = new javax.swing.GroupLayout(nombrePanel);
        nombrePanel.setLayout(nombrePanelLayout);
        nombrePanelLayout.setHorizontalGroup(
            nombrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreJTextField)
                .addContainerGap())
        );
        nombrePanelLayout.setVerticalGroup(
            nombrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nombrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        idPanel.setBackground(new java.awt.Color(254, 254, 254));
        idPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        idPanel.setForeground(new java.awt.Color(254, 254, 254));

        idLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(1, 1, 1));
        idLabel.setText("Tarjeta de Indentificacion");

        idJTextField.setBackground(new java.awt.Color(237, 235, 235));
        idJTextField.setForeground(new java.awt.Color(1, 1, 1));
        idJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout idPanelLayout = new javax.swing.GroupLayout(idPanel);
        idPanel.setLayout(idPanelLayout);
        idPanelLayout.setHorizontalGroup(
            idPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(idJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        idPanelLayout.setVerticalGroup(
            idPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, idPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idJTextField)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pesoPanel.setBackground(new java.awt.Color(254, 254, 254));
        pesoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pesoPanel.setForeground(new java.awt.Color(254, 254, 254));

        pesoLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        pesoLabel.setForeground(new java.awt.Color(1, 1, 1));
        pesoLabel.setText(" Peso ");

        pesoJTextField.setBackground(new java.awt.Color(237, 235, 235));
        pesoJTextField.setForeground(new java.awt.Color(1, 1, 1));
        pesoJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoJTextFieldActionPerformed(evt);
            }
        });

        Kglabel.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        Kglabel.setForeground(new java.awt.Color(1, 1, 1));
        Kglabel.setText("Kg ");

        javax.swing.GroupLayout pesoPanelLayout = new javax.swing.GroupLayout(pesoPanel);
        pesoPanel.setLayout(pesoPanelLayout);
        pesoPanelLayout.setHorizontalGroup(
            pesoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pesoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kglabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pesoPanelLayout.setVerticalGroup(
            pesoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesoJTextField)
                    .addComponent(Kglabel))
                .addGap(8, 8, 8))
        );

        EstaturaPanel.setBackground(new java.awt.Color(254, 254, 254));
        EstaturaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        EstaturaPanel.setForeground(new java.awt.Color(254, 254, 254));

        estauraLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        estauraLabel.setForeground(new java.awt.Color(1, 1, 1));
        estauraLabel.setText("Estatura ");

        estauraJTextField.setBackground(new java.awt.Color(237, 235, 235));
        estauraJTextField.setForeground(new java.awt.Color(1, 1, 1));
        estauraJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estauraJTextFieldActionPerformed(evt);
            }
        });

        metrosLabel.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        metrosLabel.setForeground(new java.awt.Color(1, 1, 1));
        metrosLabel.setText("Metros");

        javax.swing.GroupLayout EstaturaPanelLayout = new javax.swing.GroupLayout(EstaturaPanel);
        EstaturaPanel.setLayout(EstaturaPanelLayout);
        EstaturaPanelLayout.setHorizontalGroup(
            EstaturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstaturaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estauraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(estauraJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(metrosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        EstaturaPanelLayout.setVerticalGroup(
            EstaturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstaturaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EstaturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estauraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estauraJTextField)
                    .addComponent(metrosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        edadPanel.setBackground(new java.awt.Color(254, 254, 254));
        edadPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        edadPanel.setForeground(new java.awt.Color(254, 254, 254));

        edadLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(1, 1, 1));
        edadLabel.setText("Edad  ");

        edadJTextField.setBackground(new java.awt.Color(237, 235, 235));
        edadJTextField.setForeground(new java.awt.Color(1, 1, 1));
        edadJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edadPanelLayout = new javax.swing.GroupLayout(edadPanel);
        edadPanel.setLayout(edadPanelLayout);
        edadPanelLayout.setHorizontalGroup(
            edadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edadJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edadPanelLayout.setVerticalGroup(
            edadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edadJTextField))
                .addContainerGap())
        );

        siguienteButton.setBackground(new java.awt.Color(255, 0, 0));
        siguienteButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        siguienteButton.setForeground(new java.awt.Color(1, 1, 1));
        siguienteButton.setText("Siguiente ");
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });

        listaPersonasjTextArea.setBackground(new java.awt.Color(85, 85, 85));
        listaPersonasjTextArea.setColumns(20);
        listaPersonasjTextArea.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        listaPersonasjTextArea.setForeground(new java.awt.Color(254, 254, 254));
        listaPersonasjTextArea.setRows(5);
        jScrollPane1.setViewportView(listaPersonasjTextArea);

        listaPersonasPanel.setBackground(new java.awt.Color(245, 68, 68));
        listaPersonasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaPersonasLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        listaPersonasLabel.setForeground(new java.awt.Color(1, 1, 1));
        listaPersonasLabel.setText("Lista Personas");

        javax.swing.GroupLayout listaPersonasPanelLayout = new javax.swing.GroupLayout(listaPersonasPanel);
        listaPersonasPanel.setLayout(listaPersonasPanelLayout);
        listaPersonasPanelLayout.setHorizontalGroup(
            listaPersonasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaPersonasPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(listaPersonasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        listaPersonasPanelLayout.setVerticalGroup(
            listaPersonasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaPersonasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaPersonasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        guardarButton.setBackground(new java.awt.Color(255, 0, 0));
        guardarButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        guardarButton.setText("Guardar  ");
        guardarButton.setToolTipText("");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(edadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pesoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(EstaturaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaPersonasPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaPersonasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EstaturaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(siguienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        ArchivojMenu.setText("Archivo");

        GuardarjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        GuardarjMenuItem.setText("Guardar");
        ArchivojMenu.add(GuardarjMenuItem);

        siguientejMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        siguientejMenuItem.setText("Siguiente");
        ArchivojMenu.add(siguientejMenuItem);

        regresarjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        regresarjMenuItem.setText("Regresar");
        ArchivojMenu.add(regresarjMenuItem);

        jMenuBar1.add(ArchivojMenu);

        RegistrosjMenu.setText("Registros");

        menuPrincipaljMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuPrincipaljMenuItem.setText("Menu Principal");
        menuPrincipaljMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipaljMenuItemActionPerformed(evt);
            }
        });
        RegistrosjMenu.add(menuPrincipaljMenuItem);

        ingresarPersonajMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        ingresarPersonajMenuItem.setText("Registrar Paciente");
        RegistrosjMenu.add(ingresarPersonajMenuItem);

        jMenuBar1.add(RegistrosjMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>                        

    private void nombreJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void idJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void pesoJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void estauraJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void edadJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        PanelPaciente panelPaciente = new PanelPaciente();
        panelPaciente.setVisible(true);
        this.dispose();
    }                                               

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.personaAux.setNombre(this.nombreJTextField.getText());
        this.personaAux.setId(Integer.parseInt(this.idJTextField.getText()));
        this.personaAux.setEdad(Integer.parseInt(this.edadJTextField.getText()));
        this.personaAux.setPeso(Integer.parseInt(this.edadJTextField.getText()));
        this.personaAux.setEstatura(Float.parseFloat(this.estauraJTextField.getText()));
        listaPersona.add(personaAux);
        this.listaPersonasjTextArea.append(personaAux.toString() + "\n");
    }                                             

    private void menuPrincipaljMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JMenu ArchivojMenu;
    private javax.swing.JPanel EstaturaPanel;
    private javax.swing.JMenuItem GuardarjMenuItem;
    private javax.swing.JLabel Kglabel;
    private javax.swing.JMenu RegistrosjMenu;
    private javax.swing.JTextField edadJTextField;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JPanel edadPanel;
    private javax.swing.JTextField estauraJTextField;
    private javax.swing.JLabel estauraLabel;
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel idPanel;
    private javax.swing.JMenuItem ingresarPersonajMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listaPersonasLabel;
    private javax.swing.JPanel listaPersonasPanel;
    private javax.swing.JTextArea listaPersonasjTextArea;
    private javax.swing.JMenuItem menuPrincipaljMenuItem;
    private javax.swing.JLabel metrosLabel;
    private javax.swing.JTextField nombreJTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel nombrePanel;
    private javax.swing.JTextField pesoJTextField;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JPanel pesoPanel;
    private javax.swing.JMenuItem regresarjMenuItem;
    private javax.swing.JButton siguienteButton;
    private javax.swing.JMenuItem siguientejMenuItem;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JPanel tituloPanel;
    // End of variables declaration                   
}
