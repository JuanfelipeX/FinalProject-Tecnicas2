package Vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelBienvenida extends JFrame {

    FondoPanel fondo = new FondoPanel();

    JPanel jpnDatos;
    JLabel lblNombreClinica;
    JButton btnSiguiente;
    
 
    public PanelBienvenida() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setContentPane(fondo);
        this.jpnDatos = new JPanel(new FlowLayout());
        this.lblNombreClinica = new JLabel("BIENVENIDO A LA CLINICA");
        this.jpnDatos.add(this.lblNombreClinica);
        this.lblNombreClinica.setFont(new Font("Bold Italic", Font.PLAIN, 18));
        this.btnSiguiente = new JButton("Siguente");
        this.btnSiguiente.setBounds(200, 210, 100, 80);
        this.fondo.add(this.btnSiguiente);
        
        ActionListener oyente =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Panelpersona().setVisible(true);
            }
        };
        
        this.btnSiguiente.addActionListener(oyente);
        
        
        jpnDatos.setSize(500,500);
        jpnDatos.setVisible(true);
                     
       this.getContentPane().setLayout(new BorderLayout());
        add(jpnDatos, BorderLayout.NORTH);
           
    }
    
    
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/Fondo clinica.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    public static void main(String[] args) {
        new PanelBienvenida().setVisible(true);
    }

}
