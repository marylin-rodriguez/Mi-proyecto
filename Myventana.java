package org.marylin;
import javax.swing.*;
import java.awt.*;

public class Myventana extends JFrame {

        private JTextField texto1, texto2;
        private JButton boton1, boton2;
        private JPanel contentPane;

        public void ventana() {
            // Establecemos el tamaño y la posición de la ventana
            setBounds(50, 20, 280, 180);
            // Hacemos la ventana visible
            setVisible(true);
            // Creamos el panel principal (contentPane) y le damos un color de fondo
            contentPane = new JPanel();
            contentPane.setBackground(Color.BLACK); // Puedes cambiar el color aquí
            setContentPane(contentPane);
            contentPane.setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Creamos los campos de texto
            texto1 = new JTextField();
            texto2 = new JTextField();
            // Creamos los botones
            boton1 = new JButton();
            boton2 = new JButton();
            // Insertamos los campos de texto, establecemos sus coordenadas y texto inicial
            texto1.setBounds(50, 10, 160, 25);
            contentPane.add(texto1);
            texto1.setText("usuario");
            // Método similar para el texto2
            texto2.setBounds(50, 40, 160, 25);
            contentPane.add(texto2);
            texto2.setText("contraseña");
            // Insertamos el botón, establecemos sus coordenadas y texto
            boton1.setBounds(50, 110, 160, 25);
            contentPane.add(boton1);
            boton1.setText("OK");
        }

        public static void main(String[] args) {
            // Crear una instancia de la ventana
            var ventana = new App.Ventana();
        }
    }


