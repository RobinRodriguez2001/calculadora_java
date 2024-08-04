package modelo;

import java.io.File;
import java.io.IOException;

public class crear_archivo {

    File archivo;

    private void creararchivo() {
        archivo = new File("bitacoraCalculadora.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con exito");
            } else {
                System.out.println("Error al crear Archivo");
            }
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

    private void eliminar() {
        if (archivo.delete()) {
            System.out.println("Archivo eliminado con exito");
        } else {
            System.out.println("Error al eliminar el Archivo");
        }
    }
    public static void main(String[] args){
        crear_archivo archivo = new crear_archivo();
        archivo.creararchivo();
    }
}
