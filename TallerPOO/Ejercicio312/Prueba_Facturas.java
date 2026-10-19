package Ejercicio312;

import javax.swing.JOptionPane;

public class Prueba_Facturas {

    public static void main(String[] args) {
        String numeroPieza = JOptionPane.showInputDialog ("Número de Pieza:");
        String descripcionPieza = JOptionPane.showInputDialog ("Descripción de Pieza:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de artículos:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio por artículo (use punto decimal xfa):"));

        Facturas factura = new Facturas(numeroPieza, descripcionPieza, cantidad, precio);

        JOptionPane.showMessageDialog(null,
                "Número de pieza: " + factura.obtenerNumeroPieza()
                + "\nDescripción: " + factura.obtenerDescripcionPieza()
                + "\nCantidad: " + factura.obtenerCantidad()
                + "\nPrecio por artículo: $" + factura.obtenerPrecioPorArticulo()
                + "\nMonto de la factura: $" + factura.obtenerMontoFactura(),
                "Factura inicial", JOptionPane.INFORMATION_MESSAGE);

        // Probamos un método establecer: se cambia la cantidad y se recalcula el monto
        int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Nueva cantidad (pruebe también con 0 o un negativo):"));
        factura.establecerCantidad(nuevaCantidad);

        JOptionPane.showMessageDialog(null,
                "Cantidad guardada: " + factura.obtenerCantidad()
                + "\nNuevo monto de la factura: $" + factura.obtenerMontoFactura(),
                "Factura actualizada", JOptionPane.INFORMATION_MESSAGE);
    }
}
