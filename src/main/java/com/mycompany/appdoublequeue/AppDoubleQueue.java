
package com.mycompany.appdoublequeue;
import java.util.Deque;
import java.util.ArrayDeque;

public class AppDoubleQueue {

    public static void main(String[] args) {
        
        /*Aplicacion de colas dobles en "Gestion de tareas pendientes": 
        Es una aplicacion de tareas, los usuarios pueden agregar 
        tareas nuevas al inicio (mas urgentes) o al final (menos urgentes). 
        Tambien pueden eliminar tareas completadas desde cualquier extremo*/
        

        TaskManager gestor = new TaskManager();

        //  AGREGAR  
        gestor.agregarUrgente("ESTRUCTURA DE DATOS (1)");
        gestor.agregarNormal("Realidad (1)");
        gestor.agregarUrgente("CALCULO (2)");
        gestor.agregarNormal("Gestion (2)");
        gestor.agregarUrgente("BASE DE DATOS");

        System.out.println("Tareas actuales:");
        gestor.mostrar();

        //  ELIMINAR  
        System.out.println("\nTarea completada eliminada x inicio: " + gestor.completarPorInicio());
        System.out.println("Tarea completada eliminada x final: " + gestor.completarPorFinal());
        
        //  MOSTRAR FALTANTES
        System.out.println("\nTareas x hacer, despues de eliminar:");
        gestor.mostrar();
      
    }
}
