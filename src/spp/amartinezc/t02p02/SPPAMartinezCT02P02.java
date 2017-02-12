/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.t02p02;
import java.util.*;
/**
 *
 * @author andres
 */
public class SPPAMartinezCT02P02 {

    /**
     * @param args the command line  arguments
     */
    public static void main(String[] args) {
        menu();
    }
public static void menu(){
    
    int valinf, valsup, numeros;
    Scanner kb=new Scanner(System.in);
    System.out.print("Ingrese su valor inferior: ");
    valinf=kb.nextInt();
    System.out.print("Ingrese su valor superior: ");
    valsup=kb.nextInt();
    
    if(valinf>valsup){
        System.out.println("Opción no válida");
        menu();
    }
    
    System.out.println("Numeros enteros entre "+valinf+" y "+valsup+"\n");
    for (numeros = valinf+1; numeros< valsup; numeros++) {
  
        System.out.println(numeros+":\n");  
        
    if(numeros%2==0){
        System.out.println("*Es par");
    }else{
        System.out.println("No es par");
    }
    
    if(numeros%3==0){
        System.out.println("*Es divisible entre 3");
    }else{
        System.out.println("No es divisible entre 3");
    }
    
    if(numeros%5==0){
        System.out.println("*Es divisible entre 5\n");
    }else{
        System.out.println("No es divisible entre 5\n");
   }   
  } 
    regresar();
 }
public static void regresar(){
    System.out.println("[1]Volver a ingresar valores\n[2]Salir");
    Scanner kb=new Scanner(System.in);
    int opcion;
    opcion=kb.nextInt();
    
    if(opcion==1){
        menu();
    }else if(opcion==2){
        System.out.println("Adiós!!");
        System.exit(0);
    }else{
        System.out.println("opción no válida");
        regresar();
    }
}
}



