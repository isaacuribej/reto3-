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
public class Punto3 {
    public static void main(String[] args) {
        
        Scanner num=new Scanner(System.in);
        
        System.out.println("Entre el tamaño de los arreglos a multiplicar");
        int n=num.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[n];
        int producto=0;
        
        
        for(int i=0; i<array1.length; i++){
            System.out.println("Ingrese Valor: "+(i+1)+" del primer arreglo");
            array1[i]=num.nextInt();
        }
        
        for(int i=0; i<array1.length; i++){
            System.out.println("Ingrese Valor: "+(i+1)+" del segundo arreglo");
            array2[i]=num.nextInt();
        }
        
        for(int i=0; i<array1.length; i++){
            producto=producto+(array1[i]*array2[i]);
            
        }
        
        System.out.println("El producto escalar de dichos vectores es: "+producto);
    }
    
}
