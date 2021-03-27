
package com.julio.reto3;

import java.util.Scanner;

/**
 *
 * @author Julio Buitrago
 */
public class Punto1 {
    static int[][] matriz1=null;
    static Scanner sc =new Scanner(System.in);
  
    
    public static void main(String[] args) {
        matriz1 = definirDim(matriz1);
        
        System.out.println("Filas: " + matriz1.length);
        System.out.println("Columnas: " + matriz1[0].length);
        
        System.out.println();
        
        ingresarVal(matriz1);
        
        System.out.println(); 
        
        imprimirMat(matriz1);
               
        
    }
    public static int[][] definirDim (int[][] x) {
        System.out.println("Ingrese el Tamaño de la Matriz MxN filas&columnas, separados por el Símbolo &");
        String datosIngresados = sc.next();
       
        String[]datos = datosIngresados.split("&");
        
        int filas = Integer.parseInt(datos [0]);
        int columnas = Integer.parseInt(datos [1]);
        
        x = new int[filas][columnas];
        
        return x;
        
    }
    public static void ingresarVal(int[][] x) {
        System.out.println("Ingrese los valores de la matriz");
        for (int[] x1 : x) {
            for (int j = 0; j < x1.length; j++) {
                x1[j] = Integer.parseInt(sc.next());
            }
        }
        
    }
    
    public static void imprimirMat(int[][] x) {
        for (int[] x1 : x) {
            for (int j = 0; j < x1.length; j++) {
                System.out.print(x1[j]);
            }
            System.out.println();
        }
        
    }
    
}
