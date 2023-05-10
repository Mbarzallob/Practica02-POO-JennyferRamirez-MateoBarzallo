/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista;
import java.util.Scanner;
/**
 *
 * @author SOPORTETICS
 */

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        // Implementación del menu en el cual se puede acceder a los comandos propuestos
        System.out.println("1. Ingreso de Cantante");
        System.out.println("2. Ingreso de Compositor");
        System.out.println("3. Agregar Clientes");
        System.out.println("4. Imprimir Persona");
        System.out.println("5. Busqueda de cantante por nombre de disco");
        System.out.println("6. Busqueda de compositor por nombre de cancion");
        System.out.println("7. Salir");
        
        int opcion = 10;
        while (opcion != 0) {
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}