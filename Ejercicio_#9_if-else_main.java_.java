import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un número entero: ");
        int numero;
        numero = input.nextInt();
        if(numero%3==0 && numero%5==0){
            System.out.println("FizzBuzz");
        }else if(numero%3==0){
            System.out.println("Fizz");
        }else if(numero%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println("El número ingresado no aplica a ninguna categoría");
        }
    }
}