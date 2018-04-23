package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Metodos {


    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField jtNumero;
    Graphics grafico;
    
    public Metodos(){
        
        //Instanciamos los componentes
        marco = new JFrame("Boletin 24 Programacion");
        panel = new JPanel();
        jtNumero = new JTextField("0");
        boton1 = new JButton("Dibujar");
        boton2 = new JButton("Limpiar");
        
        //Añadimos las caracteristicas
         marco = new JFrame("Boletin 24 Programacion");
        panel = new JPanel();
        jtNumero = new JTextField("0");
        boton1 = new JButton("Dibuja");
        boton2 = new JButton("Limpia");
        // Se dan las características a los objetos:
        marco.setSize(1200, 600);
        panel.add(jtNumero);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        Dibujar dib = new Dibujar();
        // Se añade al boton el ActionListener:
        boton1.addActionListener(dib);
        boton2.addActionListener(dib);
        // Se hace visible:
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
     public class Dibujar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
             Object boton = ae.getSource();
            if (boton == boton1) {
                paint(panel.getGraphics());
            } else {
                jtNumero.setText("0");
                panel.repaint();
            }
        }
       public void paint(Graphics g) {
            int x = 50;
            int y = 50;
            for (int i = 0; i < Integer.parseInt(jtNumero.getText()); i++) {
                if (x > 950) {
                    x = 50;
                    y = y + 50;
                }
                x = x + 50;
                g.setColor(Color.RED);
                g.fillOval(x, y, 20, 20);
            }

        }
    }   
     }

