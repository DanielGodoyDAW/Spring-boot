package Maquina_Snacks_archivos.servicio;

import Maquina_Snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements ISevicioSnacks {
    private static final List<Snack> snacks;

    //Bloque stático inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas Fritas", 1.50));
        snacks.add(new Snack("Chocolate", 1.20));
        snacks.add(new Snack("Galletas", 1.00));
        snacks.add(new Snack("Refresco", 1.80));
        snacks.add(new Snack("Chicles", 0.80));
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public void mostrarSnack() {
        var inventarioSnacks = "";
        for(var snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("Snacks en el inventario:\n" + inventarioSnacks);
    }
    public  List<Snack> getSnacks() {
        return snacks;
    }
}
