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
public class Punto4 {public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        
        System.out.println("CÁLCULO DE PRODUCTO VECTORIAL EN R3");
       
        int[] array1=new int[3];
        int[] array2=new int[3];
        int producto=0;
        
        
        for(int i=0; i<array1.length; i++){
            System.out.println("Ingrese Valor: "+(i+1)+" del primer arreglo");
            array1[i]=num.nextInt();
        }
        
        for(int i=0; i<array1.length; i++){
            System.out.println("Ingrese Valor: "+(i+1)+" del segundo arreglo");
            array2[i]=num.nextInt();
        }
        
        int componenteI=array1[1]*array2[2]-array2[1]*array1[2];
        int componenteJ=-(array1[0]*array2[2]-array2[0]*array1[2]);
        int componenteK=array1[0]*array2[1]-array2[0]*array1[1];
        
        
        
        System.out.println("El producto vectorial o proucto CRUZ es: ");
            System.out.println("La componente i es: "+componenteI);
            System.out.println("La componente J es: "+componenteJ);
            System.out.println("La componente k es: "+componenteK);
    }
    
}