package pkg2lab4_ethanvilledaluisenriquez;
public class Pateadores extends Jugadores
{
    private int hab_pateadora;
    private int fuerza;
    private int hab_regateadora;

    public Pateadores() 
    {
        super();
    }

    public Pateadores(int hab_pateadora, int fuerza, int hab_regateadora, String nombre, String Apodo, int num_camiseta, String equipo_fut_fav, String equipo_bal_fav, String jugador_fav, int mayorono, int anio_nacimiento, int n_estrellas) {
        super(nombre, Apodo, num_camiseta, equipo_fut_fav, equipo_bal_fav, jugador_fav, mayorono, anio_nacimiento, n_estrellas);
        this.hab_pateadora = hab_pateadora;
        this.fuerza = fuerza;
        setHab_pateadora(hab_pateadora);
    }

    public int getHab_pateadora() {
        return hab_pateadora;
    }

    public void setHab_pateadora(int hab_pateadora) {
        if (hab_pateadora < 1 || hab_pateadora > 100)
            this.hab_pateadora = hab_pateadora;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHab_regateadora() {
        return hab_regateadora;
    }

    public void setHab_regateadora(int hab_regateadora) {
        this.hab_regateadora = hab_regateadora;
    }

    @Override
    public String toString() {
        return "Pateadores{" + "hab_pateadora=" + hab_pateadora + ", fuerza=" + fuerza + ", hab_regateadora=" + hab_regateadora + '}';
    }
    
    
}
