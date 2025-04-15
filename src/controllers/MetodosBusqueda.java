package controllers;

import views.ShowConsole;

public class MetodosBusqueda {
    ShowConsole showConsole = new ShowConsole();
    private int[]arreglo[1,2,3,4,5,6,7,8,9,10];
    private 
    public int MetodosBusqueda(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                showConsole.mostrarMensaje("Encontrado en la posición: " + i);
                return i;
            }
        }
        showConsole.mostrarMensaje("Elemento no encontrado.");
        return -1;
    }
}

