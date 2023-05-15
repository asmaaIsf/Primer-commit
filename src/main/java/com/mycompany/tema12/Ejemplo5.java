/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema12;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author asmaa <your.asmaa at your.org>
 */
public class Ejemplo5 extends JFrame implements ActionListener {

    JMenuBar menuPpal;
    JMenu menuArchivo;

    public Ejemplo5() {
        super("Mi aplicación");//Titulo de la ventana
        setSize(500, 300); //tamaño del frame
        setLocationRelativeTo(null); //centra en la pantalla
        setResizable(false);//impide que se redimensione
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creo la barra menú y lo añado a la ventana
        menuPpal = new JMenuBar();
        this.setJMenuBar(menuPpal);
        
        //Creamos una opción de menú: opción Archivo y lo añado a la barra de menús
        menuArchivo = new JMenu("Archivo");
        menuPpal.add(menuArchivo);
        //Creamos dos items del menú Archivo y lo añadimos a esa opción de menú
        JMenuItem abrir = new JMenuItem("Abrir");
        menuArchivo.add(abrir);
        JMenuItem salir = new JMenuItem("Salir");
        menuArchivo.add(salir);
        //El item Salir registra un evento
        salir.addActionListener(this);//La ventana recibe el evento

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cerrando ventana");
        this.dispose();
    }

    public static void main(String[] args) {
        Ejemplo5 vp = new Ejemplo5();
        vp.setVisible(true);

    }

}
