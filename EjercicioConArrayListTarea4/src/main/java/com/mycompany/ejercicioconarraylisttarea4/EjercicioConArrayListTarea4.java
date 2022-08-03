
//Este ejercicio recorre un arraylist e imprime los datos ingresados.
package com.mycompany.ejercicioconarraylisttarea4;

import java.util.ArrayList;

public class EjercicioConArrayListTarea4 {

    public static void main(String[] args) {
        
        
        ArrayList <String> cadenas;
        
        cadenas = new ArrayList<String>();
        
        cadenas.add("Ejercicio 4");
        cadenas.add("utilizando");
        cadenas.add("ArrayLists");
        cadenas.add("Intecap 2022");
        
        for (int i = 0; i < cadenas.size(); i++){
        System.out.println("-->"+cadenas.get(i));}
                
                
        
    }
}
