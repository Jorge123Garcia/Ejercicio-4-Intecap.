

package com.mycompany.ingresarveintenumeros;

import java.util.Scanner;

public class IngresarVeinteNumeros {

    public static void main(String[] args) {
        int array [][]= new int [5][4];
        
        for (int i = 0; i<array.length; i++){
        for (int j = 0;  j< array[i].length; j++){
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero = sp.nextInt();
        array[i][j] = numero;}
        
        
        }
        
 for (int i = 0; i < array.lenght; i++){
for (int j =0; j < array[i].length; j++){
System.out.println(array [i][j]);
}}
    }
    
    
    
}

