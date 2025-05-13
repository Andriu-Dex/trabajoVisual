/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoequipo.Colaboradores;
 import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author USUARIO
 */
public class ClaseMolina {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Configuración del juego
        int rangoMin = 1;
        int rangoMax = 100;
        int numeroSecreto = random.nextInt(rangoMax) + rangoMin;
        int intentosMaximos = 10;
        int intentos = 0;
        
        System.out.println("¡Bienvenido a Adivina el Número!");
        System.out.println("He pensado un número entre " + rangoMin + " y " + rangoMax + ".");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinarlo.");
        
        // Bucle principal del juego
        while (intentos < intentosMaximos) {
            intentos++;
            System.out.print("\nIntento #" + intentos + ". Ingresa tu suposición: ");
            
            // Validación de entrada
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // Limpiar el valor incorrecto
                System.out.print("Intento #" + intentos + ". Ingresa tu suposición: ");
            }
            
            int suposicion = scanner.nextInt();
            
            // Comprobar la suposición
            if (suposicion == numeroSecreto) {
                System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
                break;
            } else if (suposicion < numeroSecreto) {
                System.out.println("El número secreto es MAYOR que " + suposicion + ".");
            } else {
                System.out.println("El número secreto es MENOR que " + suposicion + ".");
            }
            
            // Mostrar intentos restantes
            System.out.println("Te quedan " + (intentosMaximos - intentos) + " intentos.");
        }
        
        // Si se agotaron los intentos
        if (intentos == intentosMaximos) {
            System.out.println("\n¡Lo siento! Has agotado tus " + intentosMaximos + " intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }
        
        // Preguntar si quiere jugar de nuevo
        System.out.print("\n¿Quieres jugar de nuevo? (s/n): ");
        String respuesta = scanner.next().toLowerCase();
        
        if (respuesta.equals("s")) {
            main(args); // Reiniciar el juego
        } else {
            System.out.println("¡Gracias por jugar! ¡Hasta la próxima!");
        }
        
        scanner.close();
    }
}

