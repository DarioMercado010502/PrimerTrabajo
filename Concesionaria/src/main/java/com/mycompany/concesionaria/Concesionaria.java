package com.mycompany.concesionaria;

import java.util.Scanner; // 1. IMPORTACIÓN NECESARIA

public class Concesionaria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // 2. DECLARACIÓN DE VARIABLES (Todos los nombres )
        float precio, porcentajeInicial, plazo;
        float pagoInicial, pagoMensual, totalFinanciar;

        // //ENTRADAS
        System.out.print("Dame el precio del auto");
        precio = leer.nextFloat();

        System.out.print("Dame el porcentaje de pago inicial");
        porcentajeInicial = leer.nextFloat();

        System.out.print("Dame el plazo en meses");
        plazo = leer.nextFloat();

        // //PROCESO
        // Calculamos pago inicial
        pagoInicial = precio * (porcentajeInicial / 100);
        
        // Calculamos el total a financiar
        totalFinanciar = precio - pagoInicial;
        
        // Calculamos pago mensual
        pagoMensual = totalFinanciar / plazo;

        // //SALIDAS
        System.out.println("\n--- Resumen de Cotización ---");
        System.out.println("El pago inicial es: " + pagoInicial);
        System.out.println("El total a financiar es: " + totalFinanciar);
        System.out.println("El pago mensual es: " + pagoMensual);
        
        leer.close();
    }
}
    
    

