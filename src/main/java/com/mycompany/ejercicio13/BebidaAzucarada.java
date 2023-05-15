/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio13;

/**
 *
 * @author DAW
 */
public class BebidaAzucarada extends Bebida {
    private int azucar;
    private boolean promocion;
    
    //constructor

    public BebidaAzucarada(int azucar, boolean promocion, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.azucar = azucar;
        this.promocion = promocion;
    }
    
}
