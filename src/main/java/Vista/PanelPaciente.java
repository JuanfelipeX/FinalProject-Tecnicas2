package Vista;

import Modelo.Paciente;
import Modelo.PacienteFatal;
import Modelo.Persona;
import static Vista.Panelpersona.listaPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PanelPaciente extends javax.swing.JFrame {

    ArrayList<Paciente> listaPaciente = new ArrayList<>();
    Paciente pacienteAux = new Paciente();
    PacienteFatal pacienteFAux = new PacienteFatal();

    public PanelPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tituloPanel = new javax.swing.JPanel();
        textoTituloLabel = new javax.swing.JLabel();
        enfermedadPrincipalPanel = new javax.swing.JPanel();
        enfermedadPrinLabel = new javax.swing.JLabel();
        nombreEnfermedadjTextField = new javax.swing.JTextField();
        temperaturaPanel = new javax.swing.JPanel();
        temperaturaLabel = new javax.swing.JLabel();
        temperaturajTextField = new javax.swing.JTextField();
        sintomasPanel = new javax.swing.JPanel();
        sintomasLabel = new javax.swing.JLabel();
        sintomasJtextFIeld = new javax.swing.JTextField();
        PreguntajLabel = new javax.swing.JLabel();
        FatalSijRadioButton = new javax.swing.JRadioButton();
        fatalNojRadioButton = new javax.swing.JRadioButton();
        SIllaRuedasjPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sillaRuedasSijRadioButton = new javax.swing.JRadioButton();
        sillaRuedasNoRadioButton = new javax.swing.JRadioButton();
        OxigenojPanel = new javax.swing.JPanel();
        OxigenojLabel = new javax.swing.JLabel();
        OxigenoSIjRadioButton = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        CovidjPanel = new javax.swing.JPanel();
        CovidjLabel = new javax.swing.JLabel();
        OxigenoSijRadioButton = new javax.swing.JRadioButton();
        OxigenoNojRadioButton = new javax.swing.JRadioButton();
        GuardarjButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        BuscaIDjPanel = new javax.swing.JPanel();
        BuscaIdjLabel = new javax.swing.JLabel();
        BuscarIdjTextField = new javax.swing.JTextField();
        listaPacientesjPanel = new javax.swing.JPanel();
        ListaPacientesjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPacientesjTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivojMenu = new javax.swing.JMenu();
        guardarjMenuItem = new javax.swing.JMenuItem();
        regresarjMenuItem = new javax.swing.JMenuItem();
        registrosjMenu = new javax.swing.JMenu();
        menuPrincipaljMenuItem = new javax.swing.JMenuItem();
        ingresarPersonaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(213, 210, 210));

        tituloPanel.setBackground(new java.awt.Color(254, 46, 46));
        tituloPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 1), 2));

        textoTituloLabel.setBackground(new java.awt.Color(1, 1, 1));
        textoTituloLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        textoTituloLabel.setForeground(new java.awt.Color(1, 1, 1));
        textoTituloLabel.setText("Ingrese los datos del paciente");

        javax.swing.GroupLayout tituloPanelLayout = new javax.swing.GroupLayout(tituloPanel);
        tituloPanel.setLayout(tituloPanelLayout);
        tituloPanelLayout.setHorizontalGroup(
                tituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloPanelLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(textoTituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );
        tituloPanelLayout.setVerticalGroup(
                tituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoTituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        enfermedadPrincipalPanel.setBackground(new java.awt.Color(254, 254, 254));
        enfermedadPrincipalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        enfermedadPrinLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        enfermedadPrinLabel.setForeground(new java.awt.Color(1, 1, 1));
        enfermedadPrinLabel.setText("Nombre de la enfermad ");

        nombreEnfermedadjTextField.setBackground(new java.awt.Color(203, 203, 203));
        nombreEnfermedadjTextField.setForeground(new java.awt.Color(1, 1, 1));
        nombreEnfermedadjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEnfermedadjTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enfermedadPrincipalPanelLayout = new javax.swing.GroupLayout(enfermedadPrincipalPanel);
        enfermedadPrincipalPanel.setLayout(enfermedadPrincipalPanelLayout);
        enfermedadPrincipalPanelLayout.setHorizontalGroup(
                enfermedadPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enfermedadPrincipalPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enfermedadPrinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(nombreEnfermedadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
        );
        enfermedadPrincipalPanelLayout.setVerticalGroup(
                enfermedadPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enfermedadPrincipalPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(enfermedadPrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(enfermedadPrinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreEnfermedadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        temperaturaPanel.setBackground(new java.awt.Color(254, 254, 254));
        temperaturaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        temperaturaPanel.setForeground(new java.awt.Color(254, 254, 254));

        temperaturaLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        temperaturaLabel.setForeground(new java.awt.Color(1, 1, 1));
        temperaturaLabel.setText("Temperatura ");

        temperaturajTextField.setBackground(new java.awt.Color(226, 226, 226));

        javax.swing.GroupLayout temperaturaPanelLayout = new javax.swing.GroupLayout(temperaturaPanel);
        temperaturaPanel.setLayout(temperaturaPanelLayout);
        temperaturaPanelLayout.setHorizontalGroup(
                temperaturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(temperaturaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(temperaturaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(temperaturajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        temperaturaPanelLayout.setVerticalGroup(
                temperaturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(temperaturaPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(temperaturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(temperaturajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(temperaturaLabel))
                                .addGap(16, 16, 16))
        );

        sintomasPanel.setBackground(new java.awt.Color(254, 254, 254));
        sintomasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        sintomasLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        sintomasLabel.setForeground(new java.awt.Color(1, 1, 1));
        sintomasLabel.setText("Sintomas");

        sintomasJtextFIeld.setBackground(new java.awt.Color(199, 199, 199));
        sintomasJtextFIeld.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout sintomasPanelLayout = new javax.swing.GroupLayout(sintomasPanel);
        sintomasPanel.setLayout(sintomasPanelLayout);
        sintomasPanelLayout.setHorizontalGroup(
                sintomasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sintomasPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sintomasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sintomasJtextFIeld)
                                .addContainerGap())
        );
        sintomasPanelLayout.setVerticalGroup(
                sintomasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sintomasPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sintomasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sintomasJtextFIeld, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(sintomasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        PreguntajLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        PreguntajLabel.setForeground(new java.awt.Color(1, 1, 1));
        PreguntajLabel.setText(" ¿El paciente se encuentra en un estado grave?  ");

        buttonGroup1.add(FatalSijRadioButton);
        FatalSijRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        FatalSijRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        FatalSijRadioButton.setText("SI  ");
        FatalSijRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatalSijRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(fatalNojRadioButton);
        fatalNojRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        fatalNojRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        fatalNojRadioButton.setText("NO ");

        SIllaRuedasjPanel.setBackground(new java.awt.Color(254, 254, 254));
        SIllaRuedasjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("¿Necesita silla de ruedas? ");

        buttonGroup2.add(sillaRuedasSijRadioButton);
        sillaRuedasSijRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        sillaRuedasSijRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        sillaRuedasSijRadioButton.setText("SI ");

        buttonGroup2.add(sillaRuedasNoRadioButton);
        sillaRuedasNoRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        sillaRuedasNoRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        sillaRuedasNoRadioButton.setText("NO");
        sillaRuedasNoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sillaRuedasNoRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SIllaRuedasjPanelLayout = new javax.swing.GroupLayout(SIllaRuedasjPanel);
        SIllaRuedasjPanel.setLayout(SIllaRuedasjPanelLayout);
        SIllaRuedasjPanelLayout.setHorizontalGroup(
                SIllaRuedasjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SIllaRuedasjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sillaRuedasSijRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(sillaRuedasNoRadioButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SIllaRuedasjPanelLayout.setVerticalGroup(
                SIllaRuedasjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SIllaRuedasjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SIllaRuedasjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(sillaRuedasSijRadioButton)
                                        .addComponent(sillaRuedasNoRadioButton))
                                .addContainerGap())
        );

        OxigenojPanel.setBackground(new java.awt.Color(254, 254, 254));
        OxigenojPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        OxigenojLabel.setBackground(new java.awt.Color(254, 254, 254));
        OxigenojLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        OxigenojLabel.setForeground(new java.awt.Color(1, 1, 1));
        OxigenojLabel.setText("¿Necesita Oxigeno? ");

        buttonGroup3.add(OxigenoSIjRadioButton);
        OxigenoSIjRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        OxigenoSIjRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        OxigenoSIjRadioButton.setText("SI ");
        OxigenoSIjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OxigenoSIjRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(1, 1, 1));
        jRadioButton1.setText("NO");

        javax.swing.GroupLayout OxigenojPanelLayout = new javax.swing.GroupLayout(OxigenojPanel);
        OxigenojPanel.setLayout(OxigenojPanelLayout);
        OxigenojPanelLayout.setHorizontalGroup(
                OxigenojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OxigenojPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(OxigenojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(OxigenoSIjRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jRadioButton1)
                                .addContainerGap())
        );
        OxigenojPanelLayout.setVerticalGroup(
                OxigenojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OxigenojPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OxigenojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(OxigenojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(OxigenoSIjRadioButton)
                                        .addComponent(jRadioButton1))
                                .addContainerGap())
        );

        CovidjPanel.setBackground(new java.awt.Color(254, 254, 254));
        CovidjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CovidjPanel.setForeground(new java.awt.Color(1, 1, 1));

        CovidjLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        CovidjLabel.setForeground(new java.awt.Color(1, 1, 1));
        CovidjLabel.setText("¿Tiene Covid? ");

        buttonGroup4.add(OxigenoSijRadioButton);
        OxigenoSijRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        OxigenoSijRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        OxigenoSijRadioButton.setText("SI");

        buttonGroup4.add(OxigenoNojRadioButton);
        OxigenoNojRadioButton.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        OxigenoNojRadioButton.setForeground(new java.awt.Color(1, 1, 1));
        OxigenoNojRadioButton.setText("NO");

        javax.swing.GroupLayout CovidjPanelLayout = new javax.swing.GroupLayout(CovidjPanel);
        CovidjPanel.setLayout(CovidjPanelLayout);
        CovidjPanelLayout.setHorizontalGroup(
                CovidjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CovidjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CovidjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OxigenoSijRadioButton)
                                .addGap(26, 26, 26)
                                .addComponent(OxigenoNojRadioButton)
                                .addContainerGap())
        );
        CovidjPanelLayout.setVerticalGroup(
                CovidjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CovidjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(CovidjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CovidjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OxigenoSijRadioButton)
                                        .addComponent(OxigenoNojRadioButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GuardarjButton.setBackground(new java.awt.Color(255, 0, 0));
        GuardarjButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        GuardarjButton.setForeground(new java.awt.Color(1, 1, 1));
        GuardarjButton.setText("Guardar");
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        regresarButton.setBackground(new java.awt.Color(255, 0, 0));
        regresarButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        regresarButton.setForeground(new java.awt.Color(1, 1, 1));
        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        BuscaIDjPanel.setBackground(new java.awt.Color(254, 254, 254));
        BuscaIDjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BuscaIdjLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        BuscaIdjLabel.setForeground(new java.awt.Color(1, 1, 1));
        BuscaIdjLabel.setText("Ingrese el ID de la persona ");

        BuscarIdjTextField.setBackground(new java.awt.Color(187, 187, 187));
        BuscarIdjTextField.setForeground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout BuscaIDjPanelLayout = new javax.swing.GroupLayout(BuscaIDjPanel);
        BuscaIDjPanel.setLayout(BuscaIDjPanelLayout);
        BuscaIDjPanelLayout.setHorizontalGroup(
                BuscaIDjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuscaIDjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BuscaIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarIdjTextField)
                                .addContainerGap())
        );
        BuscaIDjPanelLayout.setVerticalGroup(
                BuscaIDjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BuscaIDjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BuscaIDjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BuscaIdjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(BuscarIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        listaPacientesjPanel.setBackground(new java.awt.Color(255, 0, 0));
        listaPacientesjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        listaPacientesjPanel.setForeground(new java.awt.Color(1, 1, 1));

        ListaPacientesjLabel.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        ListaPacientesjLabel.setForeground(new java.awt.Color(1, 1, 1));
        ListaPacientesjLabel.setText("Lista Pacientes");

        javax.swing.GroupLayout listaPacientesjPanelLayout = new javax.swing.GroupLayout(listaPacientesjPanel);
        listaPacientesjPanel.setLayout(listaPacientesjPanelLayout);
        listaPacientesjPanelLayout.setHorizontalGroup(
                listaPacientesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listaPacientesjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ListaPacientesjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        listaPacientesjPanelLayout.setVerticalGroup(
                listaPacientesjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listaPacientesjPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ListaPacientesjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addContainerGap())
        );

        listaPacientesjTextArea.setBackground(new java.awt.Color(170, 170, 170));
        listaPacientesjTextArea.setColumns(20);
        listaPacientesjTextArea.setForeground(new java.awt.Color(1, 1, 1));
        listaPacientesjTextArea.setRows(5);
        jScrollPane1.setViewportView(listaPacientesjTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(regresarButton)
                                                .addGap(524, 524, 524)
                                                .addComponent(GuardarjButton)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(enfermedadPrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(sintomasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(BuscaIDjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(temperaturaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(PreguntajLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(listaPacientesjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(75, 75, 75))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(78, 78, 78)
                                                                                .addComponent(FatalSijRadioButton)
                                                                                .addGap(82, 82, 82)
                                                                                .addComponent(fatalNojRadioButton)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(27, 27, 27))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(CovidjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(SIllaRuedasjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(OxigenojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap())))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(369, 369, 369))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(BuscaIDjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(enfermedadPrincipalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(sintomasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(temperaturaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(PreguntajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(listaPacientesjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(13, 13, 13)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(FatalSijRadioButton)
                                                                        .addComponent(fatalNojRadioButton))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(SIllaRuedasjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(OxigenojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(CovidjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(GuardarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(regresarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        archivojMenu.setText("Archivo");

        guardarjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardarjMenuItem.setText("Guardar");
        archivojMenu.add(guardarjMenuItem);

        regresarjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        regresarjMenuItem.setText("Regresar");
        archivojMenu.add(regresarjMenuItem);

        jMenuBar1.add(archivojMenu);

        registrosjMenu.setText("Registros");

        menuPrincipaljMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuPrincipaljMenuItem.setText("Menu Principal");
        registrosjMenu.add(menuPrincipaljMenuItem);

        ingresarPersonaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        ingresarPersonaMenuItem.setText("Registrar Persona");
        registrosjMenu.add(ingresarPersonaMenuItem);

        jMenuBar1.add(registrosjMenu);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>                        

    private void nombreEnfermedadjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void FatalSijRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sillaRuedasNoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void OxigenoSIjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Panelpersona panelPersona = new Panelpersona();
        panelPersona.setVisible(true);
        this.dispose();
    }

    int i = 0;

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nombre = buscarNombre(Integer.parseInt(this.BuscarIdjTextField.getText()));
            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "No se ha registrado ningun usuario con esa identificacion");
            } else {
                if (this.fatalNojRadioButton.isSelected() == true) {
                    i += 1;

                    this.pacienteAux.setNombre(nombre);
                    this.pacienteAux.setId(Integer.parseInt(this.BuscarIdjTextField.getText()));
                    this.pacienteAux.setNumeroPaciente(i);
                    this.pacienteAux.setEnfermedadPrincipal(this.nombreEnfermedadjTextField.getText());
                    this.pacienteAux.setSintomas(this.sintomasJtextFIeld.getText());
                    this.pacienteAux.setTemperatura(Integer.parseInt(this.temperaturajTextField.getText()));
                    listaPaciente.add(pacienteAux);
                    this.listaPacientesjTextArea.append(pacienteAux.toString() + "\n");

                } else if (this.FatalSijRadioButton.isSelected() == true) {

                    this.pacienteFAux.setNombre(nombre);
                    this.pacienteFAux.setId(Integer.parseInt(this.BuscarIdjTextField.getText()));
                    this.pacienteFAux.setEnfermedadPrincipal(this.nombreEnfermedadjTextField.getText());
                    this.pacienteFAux.setSintomas(this.sintomasJtextFIeld.getText());
                    this.pacienteFAux.setTemperatura(Integer.parseInt(this.temperaturajTextField.getText()));
                    listaPaciente.add(pacienteFAux);
                    this.listaPacientesjTextArea.append(pacienteFAux.toString() + "\n");
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor diligencie el formulario correctamente");
        }
    }

    public static String buscarNombre(int id) {
        for (Persona i : listaPersona) {
            if (i.getId() == id) {
                return i.getNombre();
            }
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify                     
    private javax.swing.JPanel BuscaIDjPanel;
    private javax.swing.JLabel BuscaIdjLabel;
    private javax.swing.JTextField BuscarIdjTextField;
    private javax.swing.JLabel CovidjLabel;
    private javax.swing.JPanel CovidjPanel;
    private javax.swing.JRadioButton FatalSijRadioButton;
    private javax.swing.JButton GuardarjButton;
    private javax.swing.JLabel ListaPacientesjLabel;
    private javax.swing.JRadioButton OxigenoNojRadioButton;
    private javax.swing.JRadioButton OxigenoSIjRadioButton;
    private javax.swing.JRadioButton OxigenoSijRadioButton;
    private javax.swing.JLabel OxigenojLabel;
    private javax.swing.JPanel OxigenojPanel;
    private javax.swing.JLabel PreguntajLabel;
    private javax.swing.JPanel SIllaRuedasjPanel;
    private javax.swing.JMenu archivojMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel enfermedadPrinLabel;
    private javax.swing.JPanel enfermedadPrincipalPanel;
    private javax.swing.JRadioButton fatalNojRadioButton;
    private javax.swing.JMenuItem guardarjMenuItem;
    private javax.swing.JMenuItem ingresarPersonaMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listaPacientesjPanel;
    private javax.swing.JTextArea listaPacientesjTextArea;
    private javax.swing.JMenuItem menuPrincipaljMenuItem;
    private javax.swing.JTextField nombreEnfermedadjTextField;
    private javax.swing.JMenu registrosjMenu;
    private javax.swing.JButton regresarButton;
    private javax.swing.JMenuItem regresarjMenuItem;
    public static javax.swing.JRadioButton sillaRuedasNoRadioButton;
    public static javax.swing.JRadioButton sillaRuedasSijRadioButton;
    private javax.swing.JTextField sintomasJtextFIeld;
    private javax.swing.JLabel sintomasLabel;
    private javax.swing.JPanel sintomasPanel;
    private javax.swing.JLabel temperaturaLabel;
    private javax.swing.JPanel temperaturaPanel;
    private javax.swing.JTextField temperaturajTextField;
    private javax.swing.JLabel textoTituloLabel;
    private javax.swing.JPanel tituloPanel;
    // End of variables declaration                   
}
