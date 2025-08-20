import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        //Ejercicio #7
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el año en el que se encuentra: ");
        int fecha;
        fecha = input.nextInt();
        if(fecha%400!=0){
            if(fecha%4==0 && fecha%100!=0){
                System.out.println("El año en el que se encuentra es biciesto");
            }else{
                System.out.println("El año en el que se encuentra NO es biciesto");
            }
        }else{
            System.out.println("El año en el que se encuentra NO es biciesto");
        }
    }
}