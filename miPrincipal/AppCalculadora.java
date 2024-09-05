package miPrincipal;

public class AppCalculadora {
    public static void menu(){
    }
    

    private double operador1;
    private double operador2;

    public void setOperador(double a, double b){
    this.operador1 = a;
    this.operador2 = b;

    }
    //metodo sumar
    public double sumar(){
        return operador1 + operador2;
    }
    //metodo restar
    public double restar(){
        return operador1 - operador2;
    }
    //metodo dividir
    public double dividir(){
        return operador1 / operador2;
    }
    //metodo multiplicar
    public double multiplicar(){
        return operador1 *operador2;

    }
    public double residuo() {
        
            return operador1 % operador2;
                

       

                
            }            
}

