/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.numeros.sumatoria;

/**
 *
 * @author adael
 */
public class SumatoriaNumeros {
    //Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
    
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        do {
            suma += i;       
            i++;             
        } while (i <= 50);   

        System.out.println("La sumatoria de 1 a 50 es: " + suma);
    }
}
