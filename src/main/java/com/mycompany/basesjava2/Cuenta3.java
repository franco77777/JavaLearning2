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
   public static void main (String [] args){
       Scanner input = new Scanner(System.in);
       String nombre, apellido, dni;
       int numeroCuenta,nCuentas,opcion;
       double saldo;
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
           
           cuentas[i]= new Cuenta1(numeroCuenta,saldo);
           
           do{
               System.out.println("menu:");
               System.out.println("1. ingre dinero en la cuenta");
               System.out.println("2. retirar dinero de la cuenta");
               System.out.println("3. consultar saldo de la cuenta");
               System.out.println("4. salir");
               System.out.println("digite la opcion de menu");
               opcion= input.nextInt();
           } while();
       }
   } 
}
