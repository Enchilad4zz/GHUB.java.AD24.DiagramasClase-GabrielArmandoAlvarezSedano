package miPrincipal;

public class Rectangulo {
    private int ancho;
    private int altura;
    private String colorFondo;
    private String colorBorde;

    // Constructor
    public Rectangulo(int ancho, int altura, String colorFondo, String colorBorde) {
        this.ancho = ancho;
        this.altura = altura;
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    // Método para cambiar el tamaño
    public void cambiarTamaño(int nuevoAncho, int nuevaAltura) {
        this.ancho = nuevoAncho;
        this.altura = nuevaAltura;
    }

    // Método para modificar el color de fondo
    public void modificarColorFondo(String nuevoColorFondo) {
        this.colorFondo = nuevoColorFondo;
    }

    // Método para modificar el color de borde
    public void modificarColorBorde(String nuevoColorBorde) {
        this.colorBorde = nuevoColorBorde;
    }

    // Método para mostrar el rectángulo de forma visual en la consola
    public void mostrar() {
        System.out.println("Rectángulo:");
        System.out.println("Ancho: " + ancho + " | Altura: " + altura);
        System.out.println("Color de Fondo: " + colorFondo);
        System.out.println("Color del Borde: " + colorBorde);
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.println(colorBorde + " ".repeat(ancho));
            } else {
                System.out.println(colorBorde + " " + colorFondo.repeat(ancho - 2) + " " + colorBorde);
            }
        }
    }

    public static void main(String[] args) {
        // Crear un rectángulo
        Rectangulo rect = new Rectangulo(10, 5, "Blanco", "Negro");

        // Mostrar el rectángulo
        rect.mostrar();

        // Cambiar tamaño
        rect.cambiarTamaño(15, 7);
        rect.mostrar();

        // Cambiar color de fondo y borde
        rect.modificarColorFondo("Rojo");
        rect.modificarColorBorde("Azul");
        rect.mostrar();
    }
}
