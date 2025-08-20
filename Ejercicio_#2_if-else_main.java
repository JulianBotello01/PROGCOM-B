import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        //Ejercicio #2
        System.out.println("Ingrese su edad");
        Scanner input = new Scanner(System.in);
        int edad;
        edad = input.nextInt();
        if(edad>=18){
            System.out.println("Usted es mayor de edad.");
        }else if(edad<=17 && edad>0){
             System.out.println("Usted es menor de edad.");
        }else{
            System.out.println("La edad no es valida");
        }
    }
}