

package com.mycompany.unidad01;


 
import java.util.Scanner;

public class Examenunidad1 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        //Variables
        String Venta;
        float Preciobase,Cantidad;
        float Comprapreciobase, Preciocredito, Preciocontado, Incremento, Ahorro;
        float Tasaimpuesto = 0.15f; //IVA 15%
        float Tasadescuento = 0.20f; // Descuento 20%
        
        //Entrada
        
        System.out.print("Dame Venta");
        Venta = leer.nextLine();
        
        System.out.print("Dame Preciobase");
        Preciobase = leer.nextFloat();
        
        System.out.print("Dame Cantidad");
        Cantidad = leer.nextFloat();
        
        //Proceso
        
        Comprapreciobase = Preciobase * Cantidad;
        
        Incremento = Comprapreciobase * Tasaimpuesto;
        Preciocredito = Comprapreciobase + Incremento;
        
        Ahorro = Comprapreciobase * Tasadescuento;
        Preciocontado = Comprapreciobase - Ahorro;
        
        
        //Salida
        
        System.out.println("\n--- Resumen de venta ---");
        System.out.println("Nombre de Venta es:" + Venta);
        System.out.println("El Preciobase es:" + Preciobase);
        System.out.println("La Cantidad es:" + Cantidad);
        System.out.println("La Comprapreciobase es:" + Comprapreciobase);
        System.out.println("El Preciocredito es:" + Preciocredito);
        System.out.println("El Preciocontado es:" + Preciocontado);
        System.out.println("El Incremento es:" + Incremento);
        System.out.println("El Ahorro es:" + Ahorro);
        
        leer.close();
      
    
        
        
        
    }
    
}
