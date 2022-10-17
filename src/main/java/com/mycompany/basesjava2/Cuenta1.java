/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basesjava2;

/**
 *
 * @author 4R3S
 */
public class Cuenta1 {
    private int numeroDeCuenta;
    private double saldo;
    
    public Cuenta1(int numeroDeCuenta, double saldo){
        this.numeroDeCuenta=numeroDeCuenta;
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void ingresarDinero(double cantidad){
        this.saldo = this.saldo + cantidad;
    }
    public void retirarDinero (double cantidad){
        saldo =- cantidad;
    }
}
