package com.mycompany.unidad1;

/**
 *
 * @author adlzm
 */
 import java.util.Scanner; // Importación necesaria

public class Terreno {
    public static void main(String[] args) {
        // 1. Crear el objeto Scanner correctamente
        Scanner leer = new Scanner(System.in); 

        // 2. Declarar TODAS las variables necesarias
        float ancho, largo, precio, cantidad, costoTotal, perimetro;

        // //ENTRADAS
        System.out.print("Dame lo ancho del terreno: ");
        ancho = leer.nextFloat(); 

        System.out.print("Dame lo largo del terreno: ");
        largo = leer.nextFloat();

        System.out.print("Dame el precio: ");
        precio = leer.nextFloat();

        // //PROCESO
        // Calculamos el perímetro (suma de los 4 lados)
        
        perimetro = (ancho * 2) + (largo * 2);
        // Cantidad de alambre (5 vueltas)
        cantidad = perimetro * 5;
        // Costo final
        costoTotal = cantidad * precio;

        // //SALIDAS
        System.out.println("\nEl perimetro es: " + perimetro);
        System.out.println("La cantidad de alambre es: " + cantidad);
        System.out.println("El costo es: " + costoTotal);
        
        leer.close();
        
    }
}

    

