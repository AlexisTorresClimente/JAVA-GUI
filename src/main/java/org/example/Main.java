package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static String[] Columnas = {"a", "b", "c"};
    public static Object[][] Informacion;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main(); // Crear instancia de Main en lugar de JFrame

            frame.setTitle("Archivo");
            frame.setSize(500, 320);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            Informacion = new Object[][]{
                    {"Dato 1A", "Dato 1B", "Dato 1C"},
                    {"Dato 2A", "Dato 2B", "Dato 2C"},
                    {"Dato 3A", "Dato 3B", "Dato 3C"},
                    {"Dato 4A", "Dato 4B", "Dato 4C"},
                    {"Dato 5A", "Dato 5B", "Dato 5C"},
                    {"Dato 6A", "Dato 6B", "Dato 6C"},
                    {"Dato 7A", "Dato 7B", "Dato 7C"},
                    {"Dato 8A", "Dato 8B", "Dato 8C"},
                    {"Dato 9A", "Dato 9B", "Dato 9C"},
                    {"Dato 10A", "Dato 10B", "Dato 10C"},
                    {"Dato 11A", "Dato 11B", "Dato 11C"},
                    {"Dato 12A", "Dato 12B", "Dato 12C"},
                    {"Dato 13A", "Dato 13B", "Dato 13C"},
                    {"Dato 14A", "Dato 14B", "Dato 14C"},
                    {"Dato 15A", "Dato 15B", "Dato 15C"},
                    {"Dato 16A", "Dato 16B", "Dato 16C"},
                    {"Dato 17A", "Dato 17B", "Dato 17C"},
                    {"Dato 18A", "Dato 18B", "Dato 18C"},
                    {"Dato 19A", "Dato 19B", "Dato 19C"},
                    {"Dato 20A", "Dato 20B", "Dato 20C"}
            };

            String nameMenu = "Menu Archivo";
            String[] opciones = {"Lista Datos", "Listar"};
            ActionListener[] actions = new ActionListener[2];

            actions[1] = e -> {
                frame.dispose();
            };

            final JScrollPane scrollPane = NewScrollPanel.NewScrollPanel(Columnas, Informacion, 450, 300);
            actions[0] = e -> {
                frame.panelChanger(scrollPane); // Llamar al método panelChanger en la instancia de Main
            };

            frame.setJMenuBar(NewMenu.NewMenu(nameMenu, opciones, actions));

            JFrameSettings.MainSettings(frame, "Archivo", 500, 360);
        });
    }

    public void panelChanger(Component Panel) {
        getContentPane().removeAll();
        getContentPane().add(Panel);

        revalidate();
        repaint();
    }
}
