package miPrincipal;

import java.util.Scanner;

public class Principal {
    public String getGreeting() {
        return "Hello World!";
        
        
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opc = 0;
        

        System.out.println("---------------MENU PRINCIPAL-----------");
        System.out.println("Seleccione una de las siguientes opciones");
        System.out.println("1)Calculadora");
        System.out.println("2)Automovil");
        System.out.println("3)Estudiante");


        opc = teclado.nextInt();
        


    }
}


