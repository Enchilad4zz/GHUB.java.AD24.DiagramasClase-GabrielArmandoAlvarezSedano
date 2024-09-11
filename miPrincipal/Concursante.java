package miPrincipal;

import java.util.Scanner;

public class Concursante {
    private int respuestasCorrectas;
    private int respuestasIncorrectas;
    private int respuestasEnBlanco;

    // Constructor
    public Concursante(int respuestasCorrectas, int respuestasIncorrectas, int respuestasEnBlanco) {
        this.respuestasCorrectas = respuestasCorrectas;
        this.respuestasIncorrectas = respuestasIncorrectas;
        this.respuestasEnBlanco = respuestasEnBlanco;
    }

    
    public int getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public int getRespuestasIncorrectas() {
        return respuestasIncorrectas;
    }

    public int getRespuestasEnBlanco() {
        return respuestasEnBlanco;
    }

    // Metodo para calcular el puntaje
    public int calcularPuntaje() {
        return (respuestasCorrectas * 4) - respuestasIncorrectas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar las respuestas correctas, incorrectas y en blanco
        System.out.print("Ingrese el número de respuestas correctas: ");
        int correctas = sc.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int incorrectas = sc.nextInt();

        System.out.print("Ingrese el número de respuestas en blanco: ");
        int enBlanco = sc.nextInt();

        // Crear un objeto Concursante
        Concursante concursante = new Concursante(correctas, incorrectas, enBlanco);

        // Mostrar el puntaje final
        System.out.println("El puntaje final es: " + concursante.calcularPuntaje());

        
    }
}
