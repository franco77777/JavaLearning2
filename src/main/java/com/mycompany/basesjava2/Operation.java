/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava2;

import javax.swing.JOptionPane;

/**
 *
 * @author 4R3S
 */
public class Operation {
    int numero1,numero2,suma;
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("hola"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("hola"));
    }
    
    public void suma (){
        suma = numero1 + numero2;
    }
    public void resultado (){
        System.out.println("la suma es "+ suma);
    }
    
}
