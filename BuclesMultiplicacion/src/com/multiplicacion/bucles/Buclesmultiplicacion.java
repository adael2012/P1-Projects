/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.multiplicacion.bucles;

/**
 *
 * @author adael
 */
public class Buclesmultiplicacion {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
