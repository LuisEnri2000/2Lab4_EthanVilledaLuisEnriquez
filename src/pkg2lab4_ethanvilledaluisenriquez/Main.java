package pkg2lab4_ethanvilledaluisenriquez;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) throws ParseException {
        
        int op = 1;
        ArrayList<Equipos> equipos = new ArrayList();
        Scanner l = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        
        
        // MENU
        System.out.println("Menu:");
        System.out.println("1. Agregar equipo");
        op = l.nextInt();
        
        System.out.println();
        
        if (op == 1) {
            
            try {
                // Agregar un equipo
                // Nombre, Estadio, País, Nombre de Entrenador, Nombre de Dueño, Nombre de Mascota, Fecha de Creación y su Color principal.
                System.out.println("Nuevo equipo!");

                System.out.print("Nombre del equipo: "); String nombre = l.next();
                System.out.print("Estadio: "); String estadio = l.next();
                System.out.print("Pais: "); String pais = l.next();
                System.out.print("Nombre de entrenador: "); String entrenador = l.next();
                System.out.print("Nombre del dueño: "); String dueno = l.next();
                System.out.print("Nombre de mascota: "); String mascota = l.next();
                System.out.print("Fecha de creacion (yyyy/MM/dd): "); Date d = format.parse(l.next());
                System.out.print("Color: "); String color = l.next(); 

                // Agregar a la lista
                equipos.add(new Equipos(nombre, estadio, pais,entrenador,dueno,mascota,d,color));
                System.out.println("Equipo agregado exitosamente!");
            }
            catch(Exception e) {
                System.out.println("Hubo un error al agregar tu equipo! Intenta de nuevo!");
            }
        }
        
        if (op == 2) {
            // Agregar jugador
            // Nombre, Apodo, Numero de Camiseta, Equipo de Futbol Favorito, Equipo de Baloncesto Favorito, Jugador Favorito, 
            // Si es mayor de edad o no, Año de Nacimiento y Numero de Estrellas (1-5)
            System.out.println("Agregar jugador! :D");
            System.out.print("Nombre: "); String nombre = l.next();
            System.out.print("Apodo: "); String aka = l.next();
            System.out.print("Equipo de futbol favorito: "); String lF = l.next();
            System.out.print("Equipo de baloncesto favorito: "); String lB = l.next();
            System.out.print("Jugador favorito: "); String lJ = l.next();
            System.out.print("Mayor de edad (1. Si 2. No): "); int may = l.nextInt();
            Boolean mayor = false;
            if (may == 1) mayor = true; 
            System.out.print("Año de Nacimiento: "); int ano = l.nextInt();
            int stars = 0;
            do {
                System.out.print("Estrellas (1-5): "); stars = l.nextInt();              
            } while (stars > 5 || stars < 1);
                        
            int opcion = 0;
            do {
                System.out.println("Posicion:");
                System.out.println("1. Pateador");
                System.out.println("2. Tirador");
                opcion = l.nextInt();
            } while (opcion != 1 && opcion != 2);
            
            System.out.println("Equipos! ");
            printArray(equipos);
            System.out.print("Opcion: "); int equipo = l.nextInt();
            
            if (opcion == 1) {
                
            }else{
                
            }
            
        }
        
        
        
    }
    
    public static void printArray(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ". " + x.get(i));
        }
        
    }
    
}
