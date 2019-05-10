package pkg2lab4_ethanvilledaluisenriquez;
public class Jugadores {
    private String nombre;
    private String Apodo;
    private int num_camiseta;
    private String equipo_fut_fav;
    private String equipo_bal_fav;
    private String jugador_fav;
    private boolean mayorono;
    private int anio_nacimiento;
    private int n_estrellas;

    public Jugadores() {
    }

    public Jugadores(String nombre, String Apodo, int num_camiseta, String equipo_fut_fav, String equipo_bal_fav, String jugador_fav, boolean mayorono, int anio_nacimiento, int n_estrellas) {
        this.nombre = nombre;
        this.Apodo = Apodo;
        this.num_camiseta = num_camiseta;
        this.equipo_fut_fav = equipo_fut_fav;
        this.equipo_bal_fav = equipo_bal_fav;
        this.jugador_fav = jugador_fav;
        this.mayorono = mayorono;
        this.anio_nacimiento = anio_nacimiento;
        this.n_estrellas = n_estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getEquipo_fut_fav() {
        return equipo_fut_fav;
    }

    public void setEquipo_fut_fav(String equipo_fut_fav) {
        this.equipo_fut_fav = equipo_fut_fav;
    }

    public String getEquipo_bal_fav() {
        return equipo_bal_fav;
    }

    public void setEquipo_bal_fav(String equipo_bal_fav) {
        this.equipo_bal_fav = equipo_bal_fav;
    }

    public String getJugador_fav() {
        return jugador_fav;
    }

    public void setJugador_fav(String jugador_fav) {
        this.jugador_fav = jugador_fav;
    }

    public boolean isMayorono() {
        return mayorono;
    }

    public void setMayorono(boolean mayorono) {
        this.mayorono = mayorono;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public int getN_estrellas() {
        return n_estrellas;
    }

    public void setN_estrellas(int n_estrellas) {
        this.n_estrellas = n_estrellas;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", Apodo=" + Apodo + ", num_camiseta=" + num_camiseta + ", equipo_fut_fav=" + equipo_fut_fav + ", equipo_bal_fav=" + equipo_bal_fav + ", jugador_fav=" + jugador_fav + ", mayorono=" + mayorono + ", anio_nacimiento=" + anio_nacimiento + ", n_estrellas=" + n_estrellas + '}';
    }
    
    
}
