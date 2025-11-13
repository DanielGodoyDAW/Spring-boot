package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    static void main() {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            //revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            //Guardamos la info en el archivo
            salida.close();
            System.out.println("Se agrego contenido al archivo");
        }catch(Exception e){
            System.out.println("Error al abrir el archivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
