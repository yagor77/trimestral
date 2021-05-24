package paquete;

/**
 * Clase Cafetera que implementa la interface CafeteraInterface
 *
 * @author Santiago Jurado Castilla
 * @version 1.0
 */
public class Cafetera implements CafeteraInterface {

    private int capacidadMaxima;
    private int cantidadActual;

    /**
     * Constructor de la clase Cafetera con dos parametros
     *
     * @param capacidadMaxima Parámetro de tipo entero
     * @param cantidadActual Parámetro de tipo entero
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    /**
     * Constructor de la clase Cafetera con un parametro
     *
     * @param capacidadMaxima Parámetro de tipo entero
     */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    /**
     * Constructor de la clase Cafetera
     */
    public Cafetera() {
        this(1000, 0);
    }

    /**
     * Método que indica la capacidad maxima
     *
     * @return getCapacidadMaxima
     */
    public int get_capacidadMaxima() {
        return getCapacidadMaxima();
    }

    /**
     * Método set del parámetro capacidadMaxima
     *
     * @param capacidadMaxima Parámetro de tipo entero
     */
    public void set_capacidadMaxima(int capacidadMaxima) {
        this.setCapacidadMaxima(capacidadMaxima);
    }

    /**
     * Método para llenar la cafetera
     *
     */
    public void llenarCafetera() {
        setCantidadActual(getCapacidadMaxima());
    }

    /**
     * Metodo para servir una taza
     *
     * @param tamanoTaza Parámetro de tipo entero
     * @throws Exception Indica que no hay cafe
     */
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadActual(getCantidadActual() - tamanoTaza);
        if (getCantidadActual() < 0) {
            setCantidadActual(0);
            throw new Exception("No hay café");
        }
    }
    
    /**
     * Metodo para vaciar la cafetera
     */
    public void vaciarCafetera() {
        setCantidadActual(0);
    }
    
    /**
     * Metodo para agregar cafe
     * @param cantidad Parámetro de tipo entero
     * @throws Exception Indica que rebosa
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        setCantidadActual(getCantidadActual() + cantidad);
        if (getCantidadActual() > getCapacidadMaxima()) {
            setCantidadActual(getCapacidadMaxima());
            throw new Exception("Rebosa");
        }

    }

    /**
     * Metodo que indica la capacidad maxima de la cafetera
     * @return the capacidadMaxima
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /** 
     * Metodo set para poner la capacidad maxima
     * @param capacidadMaxima the capacidadMaxima to set
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Metodo que indica la capacidad actual de la cafetera
     * @return the cantidadActual
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Metodo set para poner la cantidad actual en la cafetera
     * @param cantidadActual the cantidadActual to set
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
