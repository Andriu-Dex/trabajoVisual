/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoequipo.Colaboradores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ClaseLlerena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        // Lista de palabras
        String[] palabras = {
            "java", "consola", "programacion", "ahorcado", "variable",
            "metodo", "objeto", "clase", "herencia", "interfaz"
        };

        String palabra = palabras[rand.nextInt(palabras.length)];
        char[] oculto = new char[palabra.length()];
        for (int i = 0; i < oculto.length; i++) {
            oculto[i] = '_';
        }

        int intentos = 6;
        boolean ganado = false;

        System.out.println("¡Bienvenido al Ahorcado!");
        System.out.println("Adivina la palabra:");

        while (intentos > 0 && !ganado) {
            // Mostrar estado
            System.out.print("Palabra: ");
            for (char c : oculto) {
                System.out.print(c + " ");
            }
            System.out.println("\nIntentos restantes: " + intentos);

            // Leer letra
            System.out.print("Introduce una letra: ");
            String linea = leer.nextLine().toLowerCase();
            if (linea.isEmpty()) {
                System.out.println("Por favor, introduce al menos un carácter.");
                continue;
            }
            char letra = linea.charAt(0);

            // Comprobar letra
            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && oculto[i] == '_') {
                    oculto[i] = letra;
                    acierto = true;
                }
            }
            if (!acierto) {
                intentos--;
                System.out.println("❌ La letra '" + letra + "' no está.");
            } else {
                System.out.println("✅ Buen trabajo, la letra '" + letra + "' sí está.");
            }

            // Comprobar si terminó
            ganado = true;
            for (char c : oculto) {
                if (c == '_') {
                    ganado = false;
                    break;
                }
            }
            System.out.println();
        }

        // Resultado final
        if (ganado) {
            System.out.print("🎉 ¡Felicidades! Has adivinado: ");
            System.out.println(palabra);
        } else {
            System.out.println("😢 Se acabaron los intentos. La palabra era: " + palabra);
        }

        leer.close();
    }
}
