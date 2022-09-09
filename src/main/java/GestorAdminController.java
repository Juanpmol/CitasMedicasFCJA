/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MegaProyecto
 */
public class GestorAdminController implements ActionListener {
    
    Modelo.GestorAdmin adminModelo;
    Vista.ConsAdminFrame consultarAdminVista;
    
    public GestorAdminController(Vista.ConsAdminFrame consultarAdminVista){
        this.consultarAdminVista = consultarAdminVista;
        adminModelo = new Modelo.GestorAdmin();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String valor = consultarAdminVista.valorABuscar.getText();
        int parametro=0;
        
        if(consultarAdminVista.rdbIdentificacion.isSelected()){
            parametro = 1;
            
        }
        if(consultarAdminVista.rdbNombre.isSelected()){
            parametro = 2;
        }
        if(consultarAdminVista.rdbApellido.isSelected()){
            parametro = 3;
        }
        
        
        
        String registro [] = new String[7];
        String titulos []= {
            "identificacion",
            "nombre1",
            "nombre2",
            "apellido1",
            "apellido2",
            "fechaNacimiento",
            "sexo"
        };
        
        
        
        if(e.getSource().equals(consultarAdminVista.btn_buscar)){
            
            tmodelo = new DefaultTableModel();
            LinkedList<Modelo.Admin> admin = adminModelo.getAdminByParametro(parametro,valor);
            if(admin.isEmpty() && parametro==1)
                JOptionPane.showMessageDialog(null, "No se encontraron administradores con ese número de documento");
            else if(admin.isEmpty() && parametro==2)
                JOptionPane.showMessageDialog(null, "No se encontraron administradores con ese nombre");
            else if(admin.isEmpty() && parametro==3)
                JOptionPane.showMessageDialog(null, "No se encontraron administradores con ese apellido");
            //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            tmodelo.setColumnIdentifiers(titulos);
        
            for(Modelo.Admin p:admin){
                registro[0]=p.getIdentificacion();
                registro[1]=p.getNombre1();
                registro[2]=p.getNombre2();
                registro[3]=p.getApellido1();
                registro[4]=p.getApellido2();
                registro[5]=p.getFechaNacimiento().toString();
                registro[6]=p.getSexo(); 
                tmodelo.addRow(registro);
            }
            consultarAdminVista.tableData.setModel(tmodelo);
        }
        
        if(e.getSource().equals(consultarAdminVista.btn_cerrar)){
            consultarAdminVista.dispose();
        }
        
        
    }
    
}
