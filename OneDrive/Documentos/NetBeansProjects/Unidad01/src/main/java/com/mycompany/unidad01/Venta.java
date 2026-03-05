 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad1;

/**
 *
 * @author adlzm
 */
 import java.util.Scanner; // Venta
public class Venta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables descriptivas alfanumericas
        String DescripcionProducto;
        float PrecioVenta,PrecioCompra,CantidadProductos;
        float TotalPrecioCompra,TotalPrecioVenta,Gananciatotal;
        
        //Entradas
        
        System.out.print("DescripcionProducto");
        DescripcionProducto = leer.nextLine();
        
        System.out.print("Dame PrecioVenta");
        PrecioVenta = leer.nextFloat();
        
        System.out.print("Dame PrecioCompra");
        PrecioCompra = leer.nextFloat();
        
        System.out.print("Dame CantidadProductos");
        CantidadProductos = leer.nextFloat();
        
        //Proceso
        
        //Calcular Total Precio de venta
        TotalPrecioVenta = PrecioVenta * CantidadProductos;
        
        //Calcular Total Precio de compra
        TotalPrecioCompra = PrecioCompra * CantidadProductos;
        
        //Calcular Ganancias
        Gananciatotal = TotalPrecioVenta-TotalPrecioCompra;
        
        //Salidas
        
        System.out.println("\n---Resumen de venta");
        System.out.println("El TotaldePrecioVenta es:$" + TotalPrecioVenta);
        System.out.println("El TotaldePrecioCompra es:$" + TotalPrecioCompra);
        System.out.println("Ganancia es:$" + Gananciatotal);
        
        leer.close();
    }

        
        
    }

