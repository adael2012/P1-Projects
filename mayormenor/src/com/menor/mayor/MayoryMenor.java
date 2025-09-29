/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.menor.mayor;

/**
 *
 * @author adael
 */
public class MayoryMenor {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3;
        
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
            System.out.println("El numero menor es: " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("El numero mayor es: " + numero2);
            System.out.println("El numero menor es: " + numero1);
        } else {
            System.out.println("Los numeros son iguales.");       
        }
    }
}