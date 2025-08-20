import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        //Ejercicio #6
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int pNumero;
        pNumero = input.nextInt();
        System.out.println("Ingrese el segundo número");
        int sNumero;
        sNumero = input.nextInt();
        System.out.println("Ingrese el tercer número");
        int tNumero;
        tNumero = input.nextInt();
        if(pNumero>sNumero && pNumero>tNumero){
            System.out.println("El primer número es el número mayor");
        }else if(sNumero>pNumero && sNumero>tNumero){
            System.out.println("El segundo número es el número mayor");
        }else if(tNumero>pNumero && tNumero>sNumero){
            System.out.println("El tercer número es el número mayor");
        }else{
            System.out.println("Los tres números tienen el mismo valor");
        }
    }
}