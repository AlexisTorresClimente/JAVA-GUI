package org.example;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NewScrollPanel {

    /**
     * Crea un JScrollPane que contiene una JTable con los datos proporcionados.
     *
     * @param columnas los nombres de las columnas de la tabla
     * @param informacion los datos de la tabla en forma de matriz
     * @param TableWidth el ancho deseado para la tabla
     * @param TableHeight la altura deseada para la tabla / DEJAR UN MARGEN DE 60PX ENTRE EL TAMAÑO DE LA VENTANA Y LA DEL SCROLLPANEL
     * @return un JScrollPane que contiene la JTable con los datos
     */
    public static JScrollPane NewScrollPanel(String[] columnas, Object[][] informacion, int TableWidth, int TableHeight) {

        DefaultTableModel model = new DefaultTableModel(columnas, 0);
        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(TableWidth, TableHeight));

        for (Object[] fila : informacion) {
            model.addRow(fila);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(TableWidth, TableHeight));

        table.setEnabled(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        return scrollPane;
    }
}