package paquete;

/**
 * Clase CafeteraInterface
 *
 * @author Santiago Jurado Castilla
 * @version 1.0
 */

public interface CafeteraInterface {

    /**
     * Metodo para agregar cafe a la cafetera
     * @param cantidad Parámetro de tipo entero
     * @throws Exception Indica Error al añadir cafe
     */
    void agregarCafe(int cantidad) throws Exception;
    
}
