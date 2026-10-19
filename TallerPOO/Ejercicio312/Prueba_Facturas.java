package Ejercicio312;

import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
    String numeroPieza = JOptionPane.showInputDialog ("Número de Pieza:");
    String descripcionPieza = JOptionPane.showInputDialog ("Descripción de Pieza:")
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de artículos:"));
    double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio por artículo (use punto decimal xfa):"));

    }
}
