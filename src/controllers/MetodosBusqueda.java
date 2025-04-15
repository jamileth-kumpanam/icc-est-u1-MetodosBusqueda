package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
    }

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    //retornar la posición del valor buscado
    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++){
            if(people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        
        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson]);
            System.out.println(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona con código" + codeToFind + "no encontrado");
        }

    }
}