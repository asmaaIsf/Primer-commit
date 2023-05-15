/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema12;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author asmaa <your.asmaa at your.org>
 */
class MiPanel extends JPanel implements ActionListener {

    //El método actionPerformed de ActionListener registra las acciones a realizar
    //cuando se da el evento
    @Override
    public void actionPerformed(ActionEvent e) {
        //Este evento es provocado por dos botones, en caso de ser el Azul
        //el panel cambia a color azul, en caso de ser el rojo cambiará a rojo
        String opcion = e.getActionCommand();//Nos dice el texto del botón que ha lanzado el evento
        if (opcion.equals("Azul")) {
            setBackground(Color.blue);
        } else if (opcion.equals("Rojo")) {
            setBackground(Color.red);
        }
    }

}

class MiVentana extends JFrame {

    MiVentana() {
        //Propiedades de la ventana
        super("Titulo de Ventana ");//Titulo de la ventana
        setSize(500, 300); //tamaño del frame
        setLocationRelativeTo(null); //centra en la pantalla
        setResizable(false);//impide que se redimensione
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel con dos botones
        MiPanel panel = new MiPanel();
        //Añadimos el panel a la ventana
        this.add(panel);
        //Creo un botón y lo añado al panel
        JButton botonA = new JButton("Azul");
        panel.add(botonA);
        //Registramos el evento asociado a este boton
        botonA.addActionListener(panel);//El oyente es el panel => es quien implementa ActionListener

        JButton botonR = new JButton("Rojo");
        panel.add(botonR);
        botonR.addActionListener(panel);
        //El panel es el objte oyente que debe implementar ActionListener
    }
}

public class EjemploEventos {

    public static void main(String[] args) {
        MiVentana v = new MiVentana();
        v.setVisible(true);
    }
}