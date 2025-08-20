import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
        //Ejercicio #4
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la calificacion del estudiante: ");
        int calificacion;
        calificacion = input.nextInt();
        if(calificacion>60){
            System.out.println("El estudiante aprobo el curso");
        }else if(calificacion==60){
            System.out.println("Paso por los pelos");
        }else{ 
            System.out.println("Sobese el bolsillo");
        }
    }
}