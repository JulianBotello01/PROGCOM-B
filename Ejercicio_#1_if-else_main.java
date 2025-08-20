import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        //Ejercicio #1
        System.out.println("Ingrese un numero entero");
        Scanner input = new Scanner(System.in);
        int numero;
        numero = input.nextInt();
        if(numero>=0){
            System.out.println("el número elegido es positivo.");
        }else{
             System.out.println("el número elegido es negativo.");
        }
                
    }
}