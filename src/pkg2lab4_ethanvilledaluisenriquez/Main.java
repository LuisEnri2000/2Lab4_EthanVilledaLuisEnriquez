package pkg2lab4_ethanvilledaluisenriquez;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) throws ParseException {
        
        Random r = new Random();
        
        int op = 1;
        
        // Equipos predeterminados!
        ArrayList<Equipos> equipos = new ArrayList();
        Scanner l = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        equipos.add(new Equipos("Ethanoides FC", "Anfield Nou", "Suiza", "Ethan", "Ethan", "Luis", format.parse("2001/03/30"), "Azul"));
        equipos.add(new Equipos("Luisotopos FC", "Santaigo Trafford", "Arabia", "LuisE", "LuisE", "Paloma", format.parse("2000/05/12"), "Rosado"));
        equipos.get(0).getLista().add(new Pateadores(100, 100, 100, "Ethan1", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(0).getLista().add(new Pateadores(100, 100, 100, "Ethan2", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(0).getLista().add(new Pateadores(100, 100, 100, "Ethan3", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(1).getLista().add(new Pateadores(100, 100, 100, "Ethan1", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(1).getLista().add(new Pateadores(100, 100, 100, "Ethan2", "", 1, "", "", "", 1, 2001, 5));
        equipos.get(1).getLista().add(new Pateadores(100, 100, 100, "Ethan3", "", 1, "", "", "", 1, 2001, 5));
        int men = 0;
        
        
        while (men != 6) {
            // MENU        
            System.out.println("Menu:");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Agregar jugador");
            System.out.println("3. Modificar jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Jugar una partida");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            op = l.nextInt();

            System.out.println();

            if (op == 1) {

                try {
                    // Agregar un equipo
                    // Nombre, Estadio, País, Nombre de Entrenador, Nombre de Dueño, Nombre de Mascota, Fecha de Creación y su Color principal.
                    System.out.println("Nuevo equipo!");

                    System.out.print("Nombre del equipo: "); l.nextLine(); String nombre = l.nextLine();
                    System.out.print("Estadio: "); l.nextLine(); String estadio = l.nextLine();
                    System.out.print("Pais: "); l.nextLine(); String pais = l.nextLine();
                    System.out.print("Nombre de entrenador: "); l.nextLine(); String entrenador = l.nextLine();
                    System.out.print("Nombre del dueño: "); l.nextLine(); String dueno = l.nextLine();
                    System.out.print("Nombre de mascota: "); l.nextLine(); String mascota = l.nextLine();
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
                try {
                    // Agregar jugador
                    // Nombre, Apodo, Numero de Camiseta, Equipo de Futbol Favorito, Equipo de Baloncesto Favorito, Jugador Favorito, 
                    // Si es mayor de edad o no, Año de Nacimiento y Numero de Estrellas (1-5)
                    System.out.println("Agregar jugador! :D");
                    System.out.print("Nombre: "); String nombre = l.next();
                    System.out.print("Apodo: "); String aka = l.next();
                    System.out.print("Numero de camiseta: "); int num_camiseta=l.nextInt();
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
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i + ". " + equipos.get(i).getNombre());
                    }
                    System.out.print("Opcion: "); int equipo = l.nextInt();

                    if (opcion == 1 && equipos.get(equipo).getPat() < 3) {
                        System.out.println("Ingrese habilidad pateadora [1-100]: ");
                        int hab_pateadora=l.nextInt();
                        System.out.println("Ingrese fuerza [1-100]: ");
                        int fuerza=l.nextInt();
                        System.out.println("Ingrese habilidad regateadora [1-100]: ");
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
                catch (Exception e) {
                    System.out.println("Error de capa 8! Ten mas cuidado!");
                }

            }

            if(op==3)
            {
                try {
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
                        System.out.print("1. Editar nombre\n2. Editar apodo\n3.Editar numero de camiseta\n4. Editar equipo de futbol favorito\n"
                                + "5. Editar equipo de baloncesto favorito\n6. Editar Jugador favorito\n7. Editar mayor/menor\n8. Editar anio de nacimiento\n"
                                + "9. Editar numero de estrellas\n10. Editar habilidad pateadora\n11. Editar fuerza\n12. Editar habilidad regateadora\n"
                                + "Que desea ingresar?[1-12]: "); int opcedit=l.nextInt();
                        switch(opcedit)
                        {
                            case 1: System.out.print("Ingrese nuevo nombre: "); String nombre=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNombre(nombre);
                                break;
                            case 2: System.out.print("Ingrese nuevo apodo: "); String aka=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setApodo(aka);
                                break;
                            case 3: System.out.print("Ingrese nuevo numero de camiseta: "); int num=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNum_camiseta(num);
                                break;
                            case 4: System.out.print("Ingrese nuevo equipo de futbol favorito: "); String eff=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_fut_fav(eff);
                                break;
                            case 5: System.out.print("Ingrese nuevo equipo de baloncesto favorito: "); String efb=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_bal_fav(efb);
                                break;
                            case 6: System.out.print("Ingrese nuevo jugador favorito: "); String jf=l.next();((Jugadores)equipos.get(equi).getLista().get(juga)).setJugador_fav(jf);
                                break;
                            case 7: System.out.print("1. Mayor\n2. Menor\nEs mayor o menor?"); int mom=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setMayorono(mom);
                                break;
                            case 8: System.out.print("Ingrese nuevo anio de nacimiento: "); int anio=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setAnio_nacimiento(anio);
                                break;
                            case 9: System.out.print("Ingrese nuevo numero de estrellas: "); int stars=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setN_estrellas(stars);
                                break;
                            case 10: System.out.print("Ingrese nueva habilidad pateadora: "); int HP=l.nextInt(); ((Pateadores)equipos.get(equi).getLista().get(juga)).setHab_pateadora(HP);
                                break;
                            case 11:System.out.print("Ingrese nueva fuerza: "); int Fuerza=l.nextInt(); ((Pateadores)equipos.get(equi).getLista().get(juga)).setFuerza(Fuerza);
                                break;
                            case 12: System.out.print("Ingrese nueva habilidad regateadora: "); int hr=l.nextInt(); ((Pateadores)equipos.get(equi).getLista().get(juga)).setHab_regateadora(hr);
                                break;
                        }
                    }
                    else
                    {
                        System.out.print("1. Editar nombre\n2. Editar apodo\n3.Editar numero de camiseta\n4. Editar equipo de futbol favorito\n"
                                + "5. Editar equipo de baloncesto favorito\n6. Editar Jugador favorito\n7. Editar mayo/menor\n8. Editar anio de nacimiento\n"
                                + "9. Editar numero de estrellas\n10. Editar habilidad pateadora\n11. Editar fuerza\n12. Editar habilidad regateadora\n"
                                + "Que desea ingresar?[1-12]: "); int opcedit=l.nextInt();
                        switch(opcedit)
                        {
                            case 1: System.out.print("Ingrese nuevo nombre: "); String nombre=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNombre(nombre);
                                break;
                            case 2: System.out.print("Ingrese nuevo apodo: "); String aka=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setApodo(aka);
                                break;
                            case 3: System.out.print("Ingrese nuevo numero de camiseta: "); int num=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setNum_camiseta(num);
                                break;
                            case 4: System.out.print("Ingrese nuevo equipo de futbol favorito: "); String eff=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_fut_fav(eff);
                                break;
                            case 5: System.out.print("Ingrese nuevo equipo de baloncesto favorito: "); String efb=l.next(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setEquipo_bal_fav(efb);
                                break;
                            case 6: System.out.print("Ingrese nuevo jugador favorito: "); String jf=l.next();((Jugadores)equipos.get(equi).getLista().get(juga)).setJugador_fav(jf);
                                break;
                            case 7: System.out.print("1. Mayor\n2. Menor\nEs mayor o menor?"); int mom=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setMayorono(mom);
                                break;
                            case 8: System.out.print("Ingrese nuevo anio de nacimiento: "); int anio=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setAnio_nacimiento(anio);
                                break;
                            case 9: System.out.print("Ingrese nuevo numero de estrellas: "); int stars=l.nextInt(); ((Jugadores)equipos.get(equi).getLista().get(juga)).setN_estrellas(stars);
                                break;
                            case 10: System.out.print("Ingrese nuevo tiro de 3 puntos: "); int t3=l.nextInt(); ((Tiradores)equipos.get(equi).getLista().get(juga)).setTiro_de3(t3);
                                break;
                            case 11:System.out.print("Ingrese nuevo tiro de 2 puntos: "); int t2=l.nextInt(); ((Tiradores)equipos.get(equi).getLista().get(juga)).setTiro_de2(t2);
                                break;
                            case 12: System.out.print("Ingrese nuevo manejo del balon: "); int MB=l.nextInt(); ((Tiradores)equipos.get(equi).getLista().get(juga)).setManejo_balon(MB);
                                break;
                        }
                    }
                }
                catch (Exception e) {
                    System.out.println("Error de capa 8! Intenta de nuevo!");
                }
            }

            if (op==4)
            {
                try {
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
                catch (Exception e) {
                    System.out.println("Error de capa 8! Intenta de nuevo!");
                }
            }
            
            try {
                if (op == 5) {
                    boolean ganador = false;
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i + ". " + equipos.get(i).getNombre());
                    }
                    System.out.println("Ingrese # del equipo 1: "); int e1 = l.nextInt();
                    System.out.println("Ingrese # del equipo 2: "); int e2 = l.nextInt();
                    String nom1 = equipos.get(e1).getNombre();
                    String nom2 = equipos.get(e2).getNombre();
                    int punt1 = 0, punt2 = 0;
                    int turn = e1;

                    while (!ganador) {
                        System.out.println(equipos.get(turn).getNombre());
                        for (int i = 0; i < ((Equipos)equipos.get(turn)).getLista().size(); i++) 
                        {
                            System.out.println(i + ". " + ((Jugadores)equipos.get(turn).getLista().get(i)).getNombre());
                        }
                        System.out.print("Ingrese el jugador: ");
                        int juga=l.nextInt();

                        boolean tirado = false; 
                        int contPases = 0;

                        while (!tirado && contPases < 5) {
                            System.out.println("Ingrese que quiere hacer: ");
                            System.out.println("1. Pasar");
                            System.out.println("2. Tirar");
                            System.out.print("Opcion: "); int subop = l.nextInt();

                            if (subop == 1) {

                                if (((Jugadores)equipos.get(turn).getLista().get(juga)) instanceof Pateadores) {
                                    for (int i = 0; i < ((Equipos)equipos.get(turn)).getLista().size(); i++) 
                                    {
                                        if ((Jugadores)equipos.get(turn).getLista().get(i) instanceof Tiradores)
                                        System.out.println(i + ". " + ((Jugadores)equipos.get(turn).getLista().get(i)).getNombre());
                                    }
                                }else{
                                    for (int i = 0; i < ((Equipos)equipos.get(turn)).getLista().size(); i++) 
                                    {
                                        if ((Jugadores)equipos.get(turn).getLista().get(i) instanceof Pateadores)
                                        System.out.println(i + ". " + ((Jugadores)equipos.get(turn).getLista().get(i)).getNombre());
                                    }

                                }   

                                System.out.print("Ingrese el jugador: ");
                                juga=l.nextInt();
                                contPases ++;
                            }

                            if (subop == 2) {

                                double prob = ((Jugadores)equipos.get(turn).getLista().get(juga)).getProb();
                                int temp = r.nextInt(100);

                                if (temp >= 1 && temp <= prob) {
                                    System.out.println("A N O T A S T E !");
                                    if (turn == 1) {
                                        punt1 ++;
                                    }else{
                                        punt2 ++;
                                    }
                                }else{
                                    System.out.println("Oof! Fallaste!");
                                }

                                tirado = true;
                            }
                        }

                        if ( punt1 < 11 && punt2 < 11 ) {
                            if (turn == 1) {
                                turn = 2;
                            }else{
                                turn = 1;
                            }
                        }else{
                            ganador = true;
                        }

                    }

                    System.out.println("Fin del juego!");

                }
            }
            catch (Exception e) {
                System.out.println("Algo anda mal! Intenta de nuevo!");
            }
            
            
            System.out.println();
        }
        
    }
    
    public static void printArray(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ". " + x.get(i));
        }
        
    }
    
    public static void validar1_100(int n) throws Nuestra_Excepcion {
        if (n > 100 || n < 1 ) {
            //throw new Nuestra_Excepecion();
        }        
    }
    
    
}
