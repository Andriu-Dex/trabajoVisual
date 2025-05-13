/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajoequipo.Colaboradores;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Andriu Dex
 */
public class ClaseParedes {

    public static void main(String[] args) {
        System.out.println("Mi nombre es Steven y estudio en la UTA");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("🎮 ¡Bienvenido a Piedra, Papel o Tijeras!");
        System.out.println("Escribe tu elección: piedra, papel o tijeras");

        String eleccionUsuario;
        String eleccionPC;
        boolean seguirJugando = true;

        while (seguirJugando) {
            System.out.print("\n👉 Tu elección: ");
            eleccionUsuario = scanner.nextLine().toLowerCase();

            // Validar elección del usuario
            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras")) {
                System.out.println("❌ Opción inválida. Intenta con piedra, papel o tijeras.");
                continue;
            }

            // Elección de la computadora
            eleccionPC = opciones[random.nextInt(3)];
            System.out.println("🧠 La computadora eligió: " + eleccionPC);

            // Resultado
            if (eleccionUsuario.equals(eleccionPC)) {
                System.out.println("🤝 ¡Empate!");
            } else if ((eleccionUsuario.equals("piedra") && eleccionPC.equals("tijeras"))
                    || (eleccionUsuario.equals("papel") && eleccionPC.equals("piedra"))
                    || (eleccionUsuario.equals("tijeras") && eleccionPC.equals("papel"))) {
                System.out.println("🎉 ¡Ganaste!");
            } else {
                System.out.println("💥 Perdiste. ¡Suerte para la próxima!");
            }

            // Jugar otra vez
            System.out.print("¿Quieres jugar otra vez? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("s")) {
                seguirJugando = false;
                System.out.println("👋 ¡Gracias por jugar!");
            }
        }

        scanner.close();
        ClaseAguilar erick = new ClaseAguilar();
        erick.calificar(10);
    }
}

