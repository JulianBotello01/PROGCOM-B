import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int saldo;
        saldo = 1623500;
        System.out.println("Ingrese la cantidad de dinero que quiere retirar: ");
        int retiro;
        retiro = input.nextInt();
        int saldoF;
        if(saldo>retiro){
            saldoF = saldo-retiro;
            System.out.println("Usted ha retirado "+retiro+" su nuevo saldo es de: "+saldoF);
        }else{
            System.out.println("El retiro que desea realizar exede su saldo actual");
        }
    }
}