package org.example;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * La calse NewMenu se utiliza para generar Menus para JFrames
 */

public class NewMenu extends JFrame{

    /**
     * Este programa genera una ventana con una única barra de menú
     *
     * @param NamesMenu una matriz de String que contiene los nombres de los menús principales
     * @param Opciones una matriz bidimensional que contiene los nombres de los elementos del menú
     *                 Opciones[x][y] representa el nombre del elemento del menú en la posición x, y
     * @param Actions una matriz bidimensional que contiene las acciones asociadas a cada elemento del menú
     *                Actions[x][y] representa la acción asociada al elemento del menú en la posición x, y
     */

    public JMenuBar NewMenu(String[] NamesMenu, String[][] Opciones, ActionListener[][] Actions) {
        JMenuBar Bar = new JMenuBar();
        setJMenuBar(Bar);
        for (int x = 0; x < NamesMenu.length; x++) {
            JMenu Menu = new JMenu(NamesMenu[x]);
            Bar.add(Menu);
            for (int y = 0; y < Opciones[x].length; y++) {
                JMenuItem Item = new JMenuItem(Opciones[x][y]);
                Menu.add(Item);
                Item.addActionListener(Actions[x][y]);
            }
        }
        JMenu Salir = new JMenu("Salir");
        Bar.add(Salir);
        JMenuItem SalirItem = new JMenuItem("Salir");
        Salir.add(SalirItem);
        SalirItem.addActionListener(e -> System.exit(0));
        return Bar;
    }

    /**
     * Este progama genera un Menu con una unica barra:
     *
     * Los Action deben de ser añadidos del siguiente modo:
     *         ActionListener[] Actions = new ActionListener[i];
     *         Actions [i]= e -> {dispose();};
     *         Actions [i]= e -> {dispose();};
     * @param Opciones otorga el numero y los nombres de los items en el menu bar
     * @param Actions  inserta las acciones mediante ActionListeners en cada uno de los Items
     * Es importante mantener el orden
     *
     *  Finalmente añade un item Salir que cierra el progama
     */

    public static JMenuBar NewMenu(String NameMenu, String[] Opciones, ActionListener[] Actions){
        JMenuBar Bar = new JMenuBar();
        JMenu Menu = new JMenu(NameMenu);
        Bar.add(Menu);
        for (int i=0; i< Opciones.length; i++){
            JMenuItem Item = new JMenuItem(Opciones[i]);
            Menu.add(Item);
            Item.addActionListener(Actions[i]);
        }
        JMenuItem Salir = new JMenuItem("Salir");
        Menu.add(Salir);
        Salir.addActionListener(e->  System.exit(0));
        return Bar;
    }

}