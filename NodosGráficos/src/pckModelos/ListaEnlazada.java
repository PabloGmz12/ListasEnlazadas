/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

import javax.swing.JOptionPane;

/**
 *
 * @author huawei
 */
public class ListaEnlazada {
    Nodo primero;
    Nodo cola;
    Nodo cabeza;
    Nodo auxiliar;
    String cadena = "";
    
public void Apilar(){
    
}

public void Apilar(int dato){
    Nodo nuevoNodo = new Nodo(dato);
    
    if(primero == null){
        primero = nuevoNodo;
    }
    else{
        nuevoNodo.next = primero;
        primero = nuevoNodo;
    }
    JOptionPane.showMessageDialog(null, "NODO APILADO");
}
public void Encolar(){
    
}

public void Encolar(int dato){
    Nodo nuevoNodo = new Nodo(dato);
    
    if(cola == null){
        cabeza = nuevoNodo;
        cola = nuevoNodo;
    }
    else{
        cola.next = nuevoNodo;
        cola = nuevoNodo;
    }
    JOptionPane.showMessageDialog(null, "NODO ENCOLADO");
}

public String Listar(){
    auxiliar = primero;
    cadena = "";
    while(auxiliar!=null){
        cadena = cadena + "["+auxiliar.getDato()+"]";
        auxiliar = auxiliar.next;
    }
    return cadena;
}
public String ListarCola(){
    auxiliar = cabeza;
    cadena = "";
    while(auxiliar!=null){
        cadena = cadena + "["+auxiliar.getDato()+"]";
        auxiliar = auxiliar.next;
    }
    return cadena;
}
}
