import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        //Ejercicio #5
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = input.nextInt();
        if(numero%2==0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es inpar");
        }
    }
}