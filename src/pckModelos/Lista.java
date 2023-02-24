/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

/**
 *
 * @author umg
 */
public class Lista {
    Nodo primero;
    
    public void InsertarNodo(int dato){
        Nodo nodoNuevo = new Nodo(dato);
        if(primero == null){
            primero = nodoNuevo;
        }
        else{
            nodoNuevo.siguiente = primero;          
            primero = nodoNuevo;

        }
    }
    public void ListarNodos(){
        Nodo auxiliar;
        auxiliar = primero;
        while(auxiliar != null){
            System.out.println(auxiliar.getDato());
            auxiliar = auxiliar.siguiente;
        }
    }
}
