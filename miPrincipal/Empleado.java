package miPrincipal;

import java.util.Scanner;

public class Empleado {
    private int id;
    private double salario;
    private int maxHoras;
    private boolean altaSeguridadSocial;
    private boolean altaSeguro;

    // Constructor
    public Empleado(int id, double salario, int maxHoras) {
        this.id = id;
        this.salario = salario;
        this.maxHoras = maxHoras;
        this.altaSeguridadSocial = false;
        this.altaSeguro = false;
    }

    // Método para ingresar datos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del empleado: ");
        this.id = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        this.salario = scanner.nextDouble();

        System.out.print("Ingrese el número máximo de horas por semana: ");
        this.maxHoras = scanner.nextInt();

        // Inicialmente, no está dado de alta en seguridad social ni en seguros
        this.altaSeguridadSocial = false;
        this.altaSeguro = false;
    }

    // Método para visualizar los datos del empleado
    public void visualizarDatos() {
        System.out.println("ID del empleado: " + this.id);
        System.out.println("Salario del empleado: " + this.salario);
        System.out.println("Número máximo de horas por semana: " + this.maxHoras);
        System.out.println("Alta en seguridad social: " + (this.altaSeguridadSocial ? "Sí" : "No"));
        System.out.println("Alta en seguros: " + (this.altaSeguro ? "Sí" : "No"));
    }

    // Método para dar de alta en seguridad social
    public void darAltaSeguridadSocial() {
        this.altaSeguridadSocial = true;
        System.out.println("Empleado con ID " + this.id + " dado de alta en seguridad social.");
    }

    // Método para dar de baja en seguridad social
    public void darBajaSeguridadSocial() {
        this.altaSeguridadSocial = false;
        System.out.println("Empleado con ID " + this.id + " dado de baja en seguridad social.");
    }

    // Método para dar de alta en seguros
    public void darAltaSeguro() {
        this.altaSeguro = true;
        System.out.println("Empleado con ID " + this.id + " dado de alta en seguros.");
    }

    // Método para dar de baja en seguros
    public void darBajaSeguro() {
        this.altaSeguro = false;
        System.out.println("Empleado con ID " + this.id + " dado de baja en seguros.");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Empleado empleado = new Empleado(0, 0.0, 0);
        empleado.ingresarDatos();
        empleado.visualizarDatos();
        empleado.darAltaSeguridadSocial();
        empleado.darAltaSeguro();
        empleado.visualizarDatos();
        empleado.darBajaSeguridadSocial();
        empleado.darBajaSeguro();
        empleado.visualizarDatos();
      scanner.close();   
    }

}
