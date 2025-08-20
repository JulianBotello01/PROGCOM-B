import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        //Ejercicio #3
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int pNumero;
        pNumero = input.nextInt();
        System.out.println("Ingrese el segundo número");
        int sNumero;
        sNumero = input.nextInt();
        if(pNumero>sNumero){
            System.out.println("El número mayor es el primer número");
        }else if(sNumero>pNumero){
             System.out.println("El número mayor es el segundo número");
        }else{
            System.out.println("Los dos números tienen el mismo valor");
        }
    }
}