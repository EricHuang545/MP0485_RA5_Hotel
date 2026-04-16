/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Habitacion;

/**
 *
 * @author 芒果
 */
public class FicheroHabitaciones {

    private static String rutaArchivo = System.getProperty("user.dir");
    public static String separador = File.separator;
    public static File carpeta = new File(rutaArchivo + separador + "datos");
    public static File archivo = new File(rutaArchivo + separador + "datos" + separador + "habitaciones.txt");


    public static void crearFichero() {
        try {
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public static void guardar(ArrayList<Habitacion> habitaciones) {
        try {
            FileWriter fw = new FileWriter(archivo, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Habitacion habitacion : habitaciones) {
                bw.write(habitacion.toString());
                bw.newLine();
                bw.flush();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    
    public static ArrayList<Habitacion> cargar() {
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
        
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while((linea = br.readLine()) != null){
                String[] habitacion = linea.split(";");
                habitaciones.add(new Habitacion(Integer.parseInt(habitacion[0]), habitacion[1], Integer.parseInt(habitacion[2]), Boolean.parseBoolean(habitacion[3])));
            }
            br.close();
        } catch(IOException e){
            System.out.println("Error");
        }
        return habitaciones;
    }
}
