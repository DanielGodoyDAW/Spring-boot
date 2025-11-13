package Maquina_Snacks_archivos.servicio;

import Maquina_Snacks_archivos.dominio.Snack;

import java.util.List;

public interface ISevicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnack();
    List<Snack> getSnacks();
}
