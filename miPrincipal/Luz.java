package miPrincipal;

public class Luz {
    // Atributo para el color actual de la luz del semáforo
    private String color;

    // Constructor que inicializa el semáforo en rojo
    public Luz() {
        this.color = "Rojo";  // Color inicial
    }

    // Método para obtener el color actual del semáforo
    public String getColor() {
        return this.color;
    }

    // Método que cambia el color de la luz en el orden rojo → verde → amarillo → rojo
    public void cambio() {
        switch (color) {
            case "Rojo":
                color = "Verde";
                break;
            case "Verde":
                color = "Amarillo";
                break;
            case "Amarillo":
                color = "Rojo";
                break;
            default:
                System.out.println("Color no válido");
                break;
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Luz
        Luz semaforo = new Luz();
        
        // Mostrar el color inicial
        System.out.println("Color inicial: " + semaforo.getColor());

        // Simular el cambio de luz varias veces
        semaforo.cambio();  // Cambia a Verde
        System.out.println("Color actual: " + semaforo.getColor());

        semaforo.cambio();  // Cambia a Amarillo
        System.out.println("Color actual: " + semaforo.getColor());

        semaforo.cambio();  // Cambia a Rojo
        System.out.println("Color actual: " + semaforo.getColor());
    }
}
