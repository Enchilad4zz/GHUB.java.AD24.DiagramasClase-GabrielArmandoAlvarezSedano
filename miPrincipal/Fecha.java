package miPrincipal;
public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    // Constructor
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método para establecer la fecha
    public void setFecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método para calcular el número de días desde el inicio del año hasta esta fecha
    private int calcularDiasDesdeInicioDelAno() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTotales = dia;

        for (int i = 0; i < mes - 1; i++) {
            diasTotales += diasPorMes[i];
        }

        // Ajustar por años bisiestos
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) && mes > 2) {
            diasTotales += 1;
        }

        return diasTotales;
    }

    // Método para encontrar la fecha más cercana al día actual
    public static Fecha fechaMasProxima(Fecha fecha1, Fecha fecha2, Fecha fechaActual) {
        int diasFecha1 = Math.abs(fecha1.calcularDiasDesdeInicioDelAno() - fechaActual.calcularDiasDesdeInicioDelAno());
        int diasFecha2 = Math.abs(fecha2.calcularDiasDesdeInicioDelAno() - fechaActual.calcularDiasDesdeInicioDelAno());

        // Devuelve la fecha con la menor diferencia en días
        return diasFecha1 < diasFecha2 ? fecha1 : fecha2;
    }

    // Método para mostrar la fecha en formato dd/mm/yyyy
    public void mostrarFecha() {
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Fecha fechaActual = new Fecha(11, 9, 2024); // Ejemplo: 11 de septiembre de 2024
        Fecha fecha1 = new Fecha(10, 9, 2024);      // Ejemplo: 10 de septiembre de 2024
        Fecha fecha2 = new Fecha(15, 9, 2024);      // Ejemplo: 15 de septiembre de 2024

        Fecha fechaMasProxima = Fecha.fechaMasProxima(fecha1, fecha2, fechaActual);

        System.out.println("Fecha más próxima al día actual:");
        fechaMasProxima.mostrarFecha();
    }
}
