package com.mycompany.unidad1;

/**
 *
 * @author adlzm
 */
import java.util.Scanner; // Recibodepago importacion.
public class Recibodepago {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de variables descriptivas y constante.
        String NombreEmpleado;
        float HorasTrabajadas,HorasExtras,PagoxHora;
        float TotalxHoraNormal,TotalxHorasExtras,Subtotal,Impuesto,TotalaPagar;
        float TasaImpuesto = 0.15f; //Impuesto porcentaje
        
        
        //Entradas
        
        System.out.print("Nombre del empleado");
        NombreEmpleado = leer.nextLine();
        
        System.out.print("Dame HorasTrabajadas");
        HorasTrabajadas = leer.nextFloat();
        
        System.out.print("Dame PagoxHora");
        PagoxHora = leer.nextFloat();
        
        System.out.print("Dame HorasExtras");
        HorasExtras = leer.nextFloat();
        
        
        //Proceso
        
        //Calcular Total  x hora normal
        TotalxHoraNormal = HorasTrabajadas * PagoxHora;
         
        //Calcular Total x hora extras
        TotalxHorasExtras = HorasExtras * (PagoxHora * 2);
        
        //Calcular Subtotal
        Subtotal = TotalxHoraNormal + TotalxHorasExtras;
        
        //Calcular Impuestos 
        Impuesto = Subtotal * TasaImpuesto;
        
        //Calcular Total
        TotalaPagar = Subtotal - Impuesto;
        
        //Salidas
        System.out.println("\n---Resumen de Recibo");
        System.out.println("El Pago por horas normales es:$" + TotalxHoraNormal);
        System.out.println("EL Pago por horas extras es:$ " + TotalxHorasExtras);
        System.out.println("El Subtotal es:$" + Subtotal);
        System.out.println("El Impuesto es:$" + Impuesto);
        System.out.println("El TotalaPagar es:$" + TotalaPagar);
        
        leer.close();
    
        
    }
}

