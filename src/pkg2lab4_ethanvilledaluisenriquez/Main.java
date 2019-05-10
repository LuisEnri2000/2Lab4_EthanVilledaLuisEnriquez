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
        equipos.add(new Equipos("Ethanoides FC", "Anfield Nou", "Suiza", "Ethan", "Ethan", "Luis", format.parse("2001/03/30"), "Azul"));
        equipos.add(new Equipos("Luisotopos FC", "Santaigo Trafford", "Arabia", "LuisE", "LuisE", "Paloma", format.parse("2000/05/12"), "Rosado"));
        equipos.get(0).getLista().add(new Pateadores(100, 100, 100, "Ethan1", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(0).getLista().add(new Pateadores(100, 100, 100, "Ethan2", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(0).getLista().add(new Pateadores(100, 100, 100, "Ethan3", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(1).getLista().add(new Pateadores(100, 100, 100, "Ethan1", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(1).getLista().add(new Pateadores(100, 100, 100, "Ethan2", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(1).getLista().add(new Pateadores(100, 100, 100, "Ethan3", "", 1, "", "", "", 1, 2001, 5));
        System.out.println("Menu:");
        System.out.println("1. Agregar equipo");
        System.out.println("2. Agregar jugador");
        System.out.println("3. Modificar jugador");
        System.out.println("4. Eliminar jugador");
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
            System.out.print("Numero de camisata: "); int num_camiseta=l.nextInt();
            System.out.print("Equipo de futbol favorito: "); String lF = l.next();
            System.out.print("Equipo de baloncesto favorito: "); String lB = l.next();
            System.out.print("Jugador favorito: "); String lJ = l.next();
            System.out.print("Mayor de edad (1. Si 2. No): "); int may = l.nextInt();
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
            
            if (opcion == 1 && equipos.get(equipo).getPat() < 3) {
                System.out.println("Ingrese habilidad pateadora [1-100]: ");
                int hab_pateadora=l.nextInt();
                System.out.println("Ingrese habilidad pateadora [1-100]: ");
                int fuerza=l.nextInt();
                System.out.println("Ingrese habilidad pateadora [1-100]: ");
                int hab_regateadora=l.nextInt();
                equipos.get(equipo).addPat();
                equipos.get(equipo).getLista().add(new Pateadores(hab_pateadora, fuerza, hab_regateadora, nombre, aka, num_camiseta, lF, lB, lJ, may, ano, stars));
                System.out.println("Agregado exitosamente! ");
            }
            
            if (opcion == 2 && equipos.get(equipo).getPat() < 2) {
                System.out.println("Ingrese tiro de 3 puntos [1-100]: ");
                int tiro3=l.nextInt();
                System.out.println("Ingrese tiro de 2 puntos [1-100]: ");
                int tiro2=l.nextInt();
                System.out.println("Ingrese manejo del balon [1-100]: ");
                int man_balon=l.nextInt();
                equipos.get(equipo).addTir();
                equipos.get(equipo).getLista().add(new Tiradores(tiro3, tiro2, man_balon, nombre, aka, num_camiseta, lF, lB, lJ, may, ano, stars));
                System.out.println("Agregado exitosamente! ");
            }
            
        }
        
        if(op==3)
        {
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println(i + ". " + equipos.get(i).getNombre());
            }
            System.out.print("Ingrese el equipo del jugador: ");
            int equi=l.nextInt();
            for (int i = 0; i < ((Equipos)equipos.get(equi)).getLista().size(); i++) 
            {
                System.out.println(i + ". " + ((Jugadores)equipos.get(equi).getLista().get(i)).getNombre());
            }
            System.out.print("Ingrese el jugador: ");
            int juga=l.nextInt();
            if (((Jugadores)equipos.get(equi).getLista().get(juga)) instanceof Pateadores)
            {
                System.out.print("Ingrese nuevo nombre: "); String nombre=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNombre(nombre);
                System.out.print("Ingrese nuevo apodo: "); String aka=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setApodo(aka);
                System.out.print("Ingrese nuevo numero de camiseta: "); int num=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNum_camiseta(num);
                System.out.print("Ingrese nuevo equipo de futbol favorito: "); String eff=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_fut_fav(eff);
                System.out.print("Ingrese nuevo equipo de baloncesto favorito: "); String efb=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_bal_fav(efb);
                System.out.print("Ingrese nuevo jugador favorito: "); String jf=l.next();((Jugadores)equipos.get(equi).getLista().get(juga)).setJugador_fav(jf);
                System.out.print("1. Mayor\n2. Menor\nEs mayor o menor?"); int mom=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setMayorono(mom);
                System.out.print("Ingrese nuevo anio de nacimiento: "); int anio=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setAnio_nacimiento(anio);
                System.out.print("Ingrese nuevo numero de estrellas: "); int stars=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setN_estrellas(stars);
                System.out.print("Ingrese nueva habilidad pateadora: "); int HP=l.nextInt(); ((Pateadores)equipos.get(equi).getLista().get(juga)).setHab_pateadora(HP);
                System.out.print("Ingrese nueva fuerza: "); int Fuerza=l.nextInt(); ((Pateadores)equipos.get(equi).getLista().get(juga)).setFuerza(Fuerza);
                System.out.print("Ingrese nueva habilidad regateadora: "); int hr=l.nextInt(); ((Pateadores)equipos.get(equi).getLista().get(juga)).setHab_regateadora(hr);
            }
            else
            {
                System.out.print("Ingrese nuevo nombre: "); String nombre=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNombre(nombre);
                System.out.print("Ingrese nuevo apodo: "); String aka=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setApodo(aka);
                System.out.print("Ingrese nuevo numero de camiseta: "); int num=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNum_camiseta(num);
                System.out.print("Ingrese nuevo equipo de futbol favorito: "); String eff=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_fut_fav(eff);
                System.out.print("Ingrese nuevo equipo de baloncesto favorito: "); String efb=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_bal_fav(efb);
                System.out.print("Ingrese nuevo jugador favorito: "); String jf=l.next();((Jugadores)equipos.get(equi).getLista().get(juga)).setJugador_fav(jf);
                System.out.print("1. Mayor\n2. Menor\nEs mayor o menor?"); int mom=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setMayorono(mom);
                System.out.print("Ingrese nuevo anio de nacimiento: "); int anio=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setAnio_nacimiento(anio);
                System.out.print("Ingrese nuevo numero de estrellas: "); int stars=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setN_estrellas(stars);
                System.out.print("Ingrese nuevo tiro de 3 puntos: "); int t3=l.nextInt(); ((Tiradores)equipos.get(equi).getLista().get(juga)).setTiro_de3(t3);
                System.out.print("Ingrese nuevo tiro de 2 puntos: "); int t2=l.nextInt(); ((Tiradores)equipos.get(equi).getLista().get(juga)).setTiro_de2(t2);
                System.out.print("Ingrese nuevo manejo del balon: "); int MB=l.nextInt(); ((Tiradores)equipos.get(equi).getLista().get(juga)).setManejo_balon(anio);
            }
        }
        
        if (op==4)
        {
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println(i + ". " + equipos.get(i).getNombre());
            }
            System.out.print("Ingrese el equipo del jugador: ");
            int equi=l.nextInt();
            //Validar
            for (int i = 0; i < ((Equipos)equipos.get(equi)).getLista().size(); i++) 
            {
                System.out.println(i + ". " + ((Jugadores)equipos.get(equi).getLista().get(i)).getNombre());
            }
            System.out.print("Ingrese el jugador: ");
            int juga=l.nextInt();
            //Validar
            equipos.get(equi).getLista().remove(juga);
        }
        
    }
    
    public static void printArray(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ". " + x.get(i));
        }
        
    }
    
}
