package mochila;
import java.io.*;
import java.util.Scanner;
public class Mochila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant;
        System.out.println("maximo que carga la  mochila");
         cant = sc.nextInt();  
    int dinero[]= new int [9]; 
    int i=0; 
    while(cant>0){ 
        while(cant-10>=0){ 
            cant=cant-10; 
            dinero[0]++; 
        } 
        while(cant-7>=0){ 
            cant=cant-7; 
            dinero[1]++; 
        } 
        while(cant-5>=0){ 
            cant=cant-5; 
            dinero[2]++; 
        } 
        while(cant-2>=0){ 
            cant=cant-2; 
            dinero[3]++; 
        } 
        while(cant-1>=0){ 
            cant=cant-1; 
            dinero[4]++; 
        }  
    } 
    for(i=0;i<5;i++){ 
        if(i==0) 
            System.out.println(dinero[i]+ " paquetes de 10"); 
            if(i==1) 
                System.out.println(dinero[i]+ " paquetes de 7"); 
            if(i==2) 
                System.out.println(dinero[i]+ " paquetes de 5"); 
            if(i==3) 
                System.out.println(dinero[i]+ " paquetes de 2"); 
            if(i==4) 
                System.out.println(dinero[i]+ " paquetes de 1"); 
            
    } 
    }
    
}
