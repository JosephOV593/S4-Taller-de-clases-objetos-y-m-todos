package Ejercicio313;

import java.util.Scanner;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Solicitamos datos de los empleados
        System.out.println("+--- Datos del primer empleado ---+");
        Empleado empleado1 = leerEmpleado(entrada);

        System.out.println("\n+--- Datos del segundo empleado ---+");
        Empleado empleado2 = leerEmpleado(entrada);

        //Mostrarmos el salario anual de cada empleado
        System.out.println("\n+--- Salario anual ---+");
        mostrarSalarioAnual(empleado1);
        mostrarSalarioAnual(empleado2);

        //Damos el aumento del 10% a cada empleado usando get y set
        empleado1.establecerSalarioMensual(empleado1.obtenerSalarioMensual() * 1.10);
        empleado2.establecerSalarioMensual(empleado2.obtenerSalarioMensual() * 1.10);

        //Mostramos el nuevo salario anual después del aumento
        System.out.println("\n--- Salario anual después del aumento del 10% ---");
        mostrarSalarioAnual(empleado1);
        mostrarSalarioAnual(empleado2);

        entrada.close();
    }

    // Pide por consola los tres datos y devuelve el Empleado creado.
    // Se Usamos nextLine() para evitar problemas con el salto de linea pendientes en el Scanner
    private static Empleado leerEmpleado(Scanner entrada) {
        System.out.print("Primer nombre: ");
        String primerNombre = entrada.nextLine();
        System.out.print("Apellido paterno: ");
        String apellidoPaterno = entrada.nextLine();
        System.out.print("Salario mensual (use punto decimal, ej. 1200.50): ");
        double salarioMensual = Double.parseDouble(entrada.nextLine());
        return new Empleado(primerNombre, apellidoPaterno, salarioMensual);
    }

    // Muestra el salario anual (salario mensual x 12 que es lo que equivale el año) de un empleado
    private static void mostrarSalarioAnual(Empleado empleado) {
        double salarioAnual = empleado.obtenerSalarioMensual() * 12;
        System.out.printf("%s %s: $%.2f%n",
                empleado.obtenerPrimerNombre(), empleado.obtenerApellidoPaterno(), salarioAnual);
    }
}