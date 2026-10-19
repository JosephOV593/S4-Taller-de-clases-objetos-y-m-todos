package Ejercicio312;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura (String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        establecerNumeroPieza(numeroPieza);
        establecerDescripcionPieza(descripcionPieza);
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);

    }

}
