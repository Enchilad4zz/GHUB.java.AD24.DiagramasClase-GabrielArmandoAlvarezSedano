package miPrincipal;

public class AppEstudiante {
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante (double nota1, double nota2, double nota3){
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    }
    

    public double calcularPromedio(){
        return (nota1 + nota2 + nota3 ) / 3;
    }
    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;

    }
    public double getNota2(){
        return nota2;

    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota3(){
        return nota3;

    }
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

        public static void main(String[] args) {
           
            Estudiante estudiante = new AppEstudiante (85, 90, 100);

                double promedio = estudiante.calcularPromedio;

           
           
           
           System.out.println("El promedio del alumno es: "+ promedio );
        }
    
    }     

