// Taller de Programación en Java: Uso de Set
// 🚀 Ejercicio 3: Lista de Palabras Únicas con TreeSet
package com.ejercicio3;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Set<String> palabras = new TreeSet<>();
        
            // 1. Pedir al usuario que ingrese varias palabras
            System.out.print("Ingrese la cantidad de palabras: ");
            int cantidad = scanner.nextInt();
                scanner.nextLine();

            // 2. Almacenar las palabras en un TreeSet<String> para ordenarlas automáticamente
            for(int i = 0; i < cantidad; i++){
                System.out.print("Ingrese la palabra " + (i+1) + ": ");
                palabras.add(scanner.nextLine());
            }

            // 3. Mostrar las palabras ordenadas alfabéticamente.
            System.out.println("\nPalabras ordenadas: ");
            for(String palabra : palabras){
                System.out.println("-" + palabra);
            }

            // 4. Permitir que el usuario busque si una palabra está en la lista.
            System.out.print("\nIngrese la palabra que desea buscar: ");
            String buscar = scanner.nextLine();
            if(palabras.contains(buscar)){
                System.out.println(buscar + " está en la lista.");
            } else{
                System.out.println(buscar + " no está en la lista.");
            }
        }
    }
}