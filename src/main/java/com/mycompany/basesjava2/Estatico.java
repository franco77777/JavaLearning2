/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava2;

/*los objetos estaticos afectan a todos las instancias
 */
public class Estatico {
    private static String frase = "la frase";
    
    public static void main (String[]args){
        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();
        
        obj2.frase = "gola";
        System.out.println(obj1.frase);
        System.out.println(obj2.frase);
    }
}
