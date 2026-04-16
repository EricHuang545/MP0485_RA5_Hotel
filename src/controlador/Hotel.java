/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Habitacion;
import persistencia.FicheroHabitaciones;

/**
 *
 * @author 芒果
 */
public class Hotel {

    private static ArrayList<Habitacion> habitaciones = new ArrayList<>();;

    public static void guardar() {
        FicheroHabitaciones fh = new FicheroHabitaciones();
        fh.crearFichero();
        fh.guardar(habitaciones);
    }

    public static void cargar() {
        FicheroHabitaciones fh = new FicheroHabitaciones();
        fh.crearFichero();
        habitaciones = fh.cargar();
    }

    public static void registrarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public static Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }

    public static void eliminarHabitacion(int numero) {
        Habitacion habitacion = buscarHabitacion(numero);
        habitaciones.remove(habitacion);
    }

    public static void cambiarDisponibilidad(int numero) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion.getDisponible()) {
            habitacion.setDisponible(false);
        } else {
            habitacion.setDisponible(true);
        }

    }

    public static ArrayList<Habitacion> listarHabitaciones() {
        return habitaciones;
    }
}
