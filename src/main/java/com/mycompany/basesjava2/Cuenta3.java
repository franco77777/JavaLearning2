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
public class Cuenta3 {
    public static int buscarNumeroCuenta (Cuenta1 cuentas [], int n){
        int indice = -1;
         for (int j = 0; j < cuentas.length; j++) {
                           if(cuentas[j].getNumeroDeCuenta() == n){
                           indice = j;
                           } 
                           
    }
         return indice;
    }
   public static void main (String [] args){
       Scanner input = new Scanner(System.in);
       String nombre, apellido, dni;
       int numeroCuenta,nCuentas,opcion,indiceCuenta;
       double saldo,cantidad;
       Cuenta1 cuentas[];
       Cuenta2 clientes;
       System.out.println("digie el nombre del cliente");
       nombre = input.nextLine();
       System.out.println("digite el apellido del cliente;");
       apellido=input.nextLine();
       System.out.println("digite el dni del cliente");
       dni=input.nextLine();
       System.out.println("ahora digite el numero de cuentas");
       nCuentas=input.nextInt();
       
       cuentas = new Cuenta1[nCuentas];
       
       for (int i = 0; i < cuentas.length; i++) {
           System.out.println("digite los datos para la cuenta" + (1+i)+":");
           System.out.println("digite el numero de cuenta: ");
           numeroCuenta=input.nextInt();
           System.out.println("digite el saldo de la cuenta");
           saldo = input.nextDouble();
           
           cuentas[i]= new Cuenta1(numeroCuenta,saldo);}
           
           do{
               System.out.println("menu:");
               System.out.println("1. ingresar dinero en la cuenta");
               System.out.println("2. retirar dinero de la cuenta");
               System.out.println("3. consultar saldo de la cuenta");
               System.out.println("4. salir");
               System.out.println("digite la opcion de menu");
               opcion= input.nextInt();
               switch (opcion){
                   case 1 -> {
                       System.out.println("digite numero de la cuenta");
                       numeroCuenta= input.nextInt();
                       indiceCuenta=buscarNumeroCuenta(cuentas,numeroCuenta);
                       if(indiceCuenta==-1){
                           System.out.println("numero de cuenta inexistente");
                       } else {
                           System.out.println("ingrese cantidad a depostitar");
                           cantidad = input.nextDouble();
                           cuentas[indiceCuenta].ingresarDinero(cantidad);
                           System.out.println("carga exitosa");
                       }
               }
                   case 2 -> {
                        System.out.println("digite numero de la cuenta");
                       numeroCuenta= input.nextInt();
                       indiceCuenta=buscarNumeroCuenta(cuentas,numeroCuenta);
                       if(indiceCuenta==-1){
                           System.out.println("numero de cuenta inexistente");
                       } else {
                           System.out.println("ingrese cantidad a retirar");
                           cantidad = input.nextDouble();
                           cuentas[indiceCuenta].retirarDinero(cantidad);
                           System.out.println("retiro exitoso");
                       }
                   }
                   case 3 ->{
                       System.out.println("digite numero de la cuenta");
                       numeroCuenta= input.nextInt();
                       indiceCuenta=buscarNumeroCuenta(cuentas,numeroCuenta);
                       if(indiceCuenta==-1){
                           System.out.println("numero de cuenta inexistente");
                       } else {
                           System.out.println("el saldo es " + cuentas[indiceCuenta].getSaldo());
                       }
                   }
                   case 4 ->{
                       break;
                   }
                   default ->{
                       System.out.println("error,opcion inexistente");
                   }
               }
           } while(opcion != 4);
       }
   } 

