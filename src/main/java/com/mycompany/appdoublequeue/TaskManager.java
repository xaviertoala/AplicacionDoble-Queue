
package com.mycompany.appdoublequeue;
import java.util.Deque;
import java.util.ArrayDeque;

public class TaskManager {
 
    private Deque<String> tareas;

    public TaskManager() {
        tareas = new ArrayDeque<>();
    }

    // --- Métodos para AGREGAR ---
    public void agregarUrgente(String tarea) {
        tareas.addFirst(tarea);
    }

    public void agregarNormal(String tarea) {
        tareas.addLast(tarea);
    }

    // --- Métodos para ELIMINAR ---
    public String completarPorInicio() {
        if (tareas.isEmpty()) 
            return "NO HAY TAREA POR ELIMINAR.";
        return tareas.removeFirst();
    }

    public String completarPorFinal() {
        if (tareas.isEmpty()) 
            return "NO HAY TAREA POR ELIMINAR.";
        return tareas.removeLast();
    }

    // --- Método para mostrar ---
    public void mostrar() {
        for (String t : tareas) {
            System.out.print("[" + t + "] ");
        }
        System.out.println();
    }

}
