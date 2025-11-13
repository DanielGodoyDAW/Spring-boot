package Archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    static void main() {
        var nombreArchivo = "mi_archivo.txt";
        try{
            //leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo:");
            for(String linea : lineas){
                System.out.println(linea);
            }
            //lineas.forEach(System.out::println);
        }catch(Exception e){
            System.out.println("Error al leer archivo " +e.getMessage());
            e.printStackTrace();
        }
    }
}
