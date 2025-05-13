/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoequipo.Colaboradores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ClaseNavarro {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int adivinanza;

        System.out.println("🎲 ¡Bienvenido al Juego de la Adivinanza!");
        System.out.println("Adivina un número entre 1 y 100.");

        do {
            System.out.print("Introduce tu número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("❌ Eso no es un número válido. Intenta de nuevo.");
                scanner.next(); // limpiar entrada inválida
                System.out.print("Introduce tu número: ");
            }

            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroSecreto) {
                System.out.println("🔻 Muy bajo. Intenta un número más alto.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("🔺 Muy alto. Intenta un número más bajo.");
            } else {
                System.out.println("🎉 ¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }

        } while (adivinanza != numeroSecreto);

        scanner.close();
        System.out.println("👋 Gracias por jugar.");
        System.out.println("Adios");
    }
}
