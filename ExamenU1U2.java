/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el nombre del videojuego 1");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingresa el precio del videojuego 1");
        double precio1 = scanner.nextDouble();
        
        scanner.nextLine();
        System.out.println("Ingrese el nombre del videojuego 2");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingresa el precio del videojuego 2");
        double precio2 = scanner.nextDouble();
        
        scanner.nextLine();
        System.out.println("Ingrese el nombre del videojuego 3");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingresa el precio del videojuego 3");
        double precio3 = scanner.nextDouble();
        
        double descuento1 = precio1-((precio1*30)/100);
        double descuento2 = precio2-((precio2*65)/100);
        double descuento3 = precio3-((precio3*15)/100);
        
        System.out.println("El precio final del videojuego 1 es: " + "$" + descuento1);
        System.out.println("El precio final del videojuego 2 es: " + "$" + descuento2);
        System.out.println("El precio final del videojuego 3 es: " + "$" + descuento3);
        
        scanner.close();
    }
    
}
