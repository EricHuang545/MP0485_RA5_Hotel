/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 芒果
 */
public class Habitacion {
    private int numero;
    private String piso;
    private int precioNoche;
    private boolean disponible;

    public Habitacion(int numero, String piso, int precioNoche, boolean disponible) {
        this.numero = numero;
        this.piso = piso;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public boolean getDisponible(){
        return disponible;
    }
    
    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return numero + ";" + piso + ";" + precioNoche + ";" + disponible;
    }
    
    public String infoHabitacion(){
        return "Numero: " + numero + "\n" + 
                "Piso: " + piso + "\n" + 
                "Precio por noche: " + precioNoche + "\n" + 
                "Disponible: " + disponible;
    }
    
    public String listaHabitacion(){
        return "Habitacion: " + numero + " - " + piso + " (" + precioNoche + ") " + disponible;
    }
}
