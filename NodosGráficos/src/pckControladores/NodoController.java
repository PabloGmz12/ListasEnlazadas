/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pckModelos.ListaEnlazada;
import pckVistas.frmMain;
import pckVistas.frmNodos;

/**
 *
 * @author huawei
 */
public class NodoController implements ActionListener{
    //LEVANTAR EL FORM PRINCIPAL
    frmMain VistaPrincipal;
    frmNodos VistaNodos;
    ListaEnlazada NuevaLista;

    public NodoController(frmMain VistaPrincipal, frmNodos VistaNodos, ListaEnlazada NuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.NuevaLista = NuevaLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnAgregarNodo.addActionListener(this);
        
        //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmMain.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnAgregarNodo){
            //ABRIR LA VISTA NODOS
            //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA NODOS
            this.VistaNodos.btnApilar.addActionListener(this);
            this.VistaNodos.btnEncolar.addActionListener(this);
            //LEVANTAR EL FORMULARIO SECUNDARIO
            this.VistaNodos.setLocationRelativeTo(null);
            this.VistaNodos.setVisible(true);
        }
        
        if(e.getSource()== this.VistaNodos.btnApilar){
            this.NuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
            this.VistaNodos.txtLista.setText(this.NuevaLista.Listar());
        }
        
        if(e.getSource()== this.VistaNodos.btnEncolar){
            this.NuevaLista.Encolar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
            this.VistaNodos.txtLista.setText(this.NuevaLista.ListarCola());
        }
    }
    
}
