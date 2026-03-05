package com.mycompany.unidad1;

import java.util.Scanner;

public class PreExamen { 
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        // Variables
        String Nombreproducto;
        float Cantidadproducto, Precioproducto;
        float Descuento, Totalventa, Subtotal, Impuesto, Totalpagar;
        float Tasadescuento = 0.10f; // 10% Descuento
        float Tasaimpuesto = 0.16f;  // 16% IVA
        
        // Entradas
        System.out.print("Dame Nombre del Producto: ");
        Nombreproducto = leer.nextLine();
        
        System.out.print("Dame Cantidad de Producto: ");
        Cantidadproducto = leer.nextFloat();
        
        System.out.print("Dame Precio del Producto: ");
        Precioproducto = leer.nextFloat();
        
        // Procesos 
        Totalventa = Cantidadproducto * Precioproducto;   // Total sin descuento
        Descuento = Totalventa * Tasadescuento;           // Descuento sobre el total
        Subtotal = Totalventa - Descuento;                // Subtotal después del descuento
        Impuesto = Subtotal * Tasaimpuesto;               // IVA sobre el subtotal
        Totalpagar = Subtotal + Impuesto;                 // Total final a pagar
        
        // Salidas
        System.out.println("\n--- Resumen de venta ---");
        System.out.println("Producto: " + Nombreproducto);
        System.out.println("Cantidad: " + Cantidadproducto);
        System.out.println("Precio del producto es :" + Precioproducto);
        System.out.println("Total de venta: $" + Totalventa);
        System.out.println("Descuento (10%): $" + Descuento);
        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Impuesto (16%): $" + Impuesto);
        System.out.println("Total a pagar: $" + Totalpagar);
        
        leer.close();
    }
}

