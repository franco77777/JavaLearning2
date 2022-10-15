/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava2;

import java.util.Scanner;

/**
 *
 * @author 4R3S
 */
public class Cuenta2 {
    private String nombre,apellido,dni;
    Cuenta1 cuentas [];
   

    public Cuenta2(String nombre, String apellido, String dni, Cuenta1 [] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    public void ingresarDinero(int n,double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public double consultarSaldo(int n){
        return cuentas[n].getSaldo();
    }
}
