
import pckControladores.NodoController;
import pckModelos.ListaEnlazada;
import pckVistas.frmMain;
import pckVistas.frmNodos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author huawei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmMain VistaPrincipal = new frmMain();
        frmNodos VistaNodos = new frmNodos(VistaPrincipal, true);
        ListaEnlazada NuevaLista = new ListaEnlazada();
        
        //LEVANTAR EL CONTROLADOR
        NodoController nuevoControlador = new NodoController(VistaPrincipal, VistaNodos, NuevaLista);
    }
    
}
