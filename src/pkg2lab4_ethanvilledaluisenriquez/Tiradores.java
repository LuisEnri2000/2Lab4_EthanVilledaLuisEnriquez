package pkg2lab4_ethanvilledaluisenriquez;
public class Tiradores extends Jugadores
{
    private int tiro_de3;
    private int tiro_de2;
    private int manejo_balon;

    public Tiradores() {
        super();
    }

    public Tiradores(int tiro_de3, int tiro_de2, int manejo_balon, String nombre, String Apodo, int num_camiseta, String equipo_fut_fav, String equipo_bal_fav, String jugador_fav, int mayorono, int anio_nacimiento, int n_estrellas) {
        super(nombre, Apodo, num_camiseta, equipo_fut_fav, equipo_bal_fav, jugador_fav, mayorono, anio_nacimiento, n_estrellas);
        this.tiro_de3 = tiro_de3;
        this.tiro_de2 = tiro_de2;
        this.manejo_balon = manejo_balon;
    }

    public int getTiro_de3() {
        return tiro_de3;
    }

    public void setTiro_de3(int tiro_de3) {
        this.tiro_de3 = tiro_de3;
    }

    public int getTiro_de2() {
        return tiro_de2;
    }

    public void setTiro_de2(int tiro_de2) {
        this.tiro_de2 = tiro_de2;
    }

    public int getManejo_balon() {
        return manejo_balon;
    }

    public void setManejo_balon(int manejo_balon) {
        this.manejo_balon = manejo_balon;
    }

    @Override
    public String toString() {
        return "Tiradores{" + "tiro_de3=" + tiro_de3 + ", tiro_de2=" + tiro_de2 + ", manejo_balon=" + manejo_balon + '}';
    }
    
    
}
