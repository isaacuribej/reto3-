/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julio.reto3;

import java.util.Scanner;



/**
 *
 * @author Julio Buitrago
 */
public class Punto2 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int suma=0;
        int promedio=0;
        int menor=10000;
        int mayor=0;

        System.out.println("Entre el tamaño del arreglo");
        int n=num.nextInt();
        int[] numeros=new int[n];
        
        for(int i=0; i<numeros.length; i++){
            System.out.println("Ingrese Valor");
            numeros[i]=num.nextInt();
        }
        for(int i=0; i<numeros.length; i++){
            suma=suma+numeros[i];
            promedio=suma/numeros.length;
                      
        }
        for(int i=0; i<numeros.length; i++){
            if (menor>numeros[i]) {
                menor=numeros[i];
                
            }
        }
        for(int i=0; i<numeros.length; i++){
            if (mayor<numeros[i]) {
                mayor=numeros[i];
                
            }
        
        }
        
        System.out.println("La suma es: " +suma);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El menor es: "+menor);
        System.out.println("El mayor es: "+mayor);
            
    }                   
}

    
  
