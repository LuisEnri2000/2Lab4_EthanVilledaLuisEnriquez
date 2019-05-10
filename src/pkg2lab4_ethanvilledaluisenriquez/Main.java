package pkg2lab4_ethanvilledaluisenriquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        int op = 1;
        ArrayList<Equipos> equipos = new ArrayList();
        Scanner l = new Scanner(System.in);
        
        // MENU
        System.out.println("Menu:");
        System.out.println("1. Agregar equipo");
        op = l.nextInt();
        
        System.out.println();
        
        if (op == 1) {
            // Agregar un equipo
            // Nombre, Estadio, País, Nombre de Entrenador, Nombre de Dueño, Nombre de Mascota, Fecha de Creación y su Color principal.
            System.out.println("Nuevo equipo!");
            System.out.print("Nombre del equipo: "); String nombre = l.next();
            System.out.print("Nombre de entrenador: "); String entrenador = l.next();
            System.out.print("Nombre del dueño: "); String dueno = l.next();
            System.out.print("Nombre de mascota: "); String mascota = l.next();
            System.out.print("Fecha de creacion: "); String f = l.next();
            System.out.print("Color: "); String color = l.next();
            
            equipos.add(new Equipos(nombre,entrenador,dueno,mascota,f,color));
            
            
        }
        
    }
    
}
