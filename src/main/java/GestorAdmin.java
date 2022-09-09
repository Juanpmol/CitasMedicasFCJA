/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Recursos.Conexion;

/**
 *
 * @author MegaProyecto
 */
    
public class GestorAdmin {
    private static LinkedList<Admin> admin;
    private static Connection conex;
    
    public GestorAdmin(){
        //admin = new LinkedList<>();
        conex = Recursos.Conexion.establecerConexion();
        
        
    }


    //1er metodo del CRUD -> Create admin
    public void RegistrarAdmin (Admin admin){
        //admin.add(admin);
        PreparedStatement pst;
        try{
            pst = conex.prepareStatement("insert into TblAdmin values(?,?,?,?,?,?,?)");
            pst.setString(1, admin.getIdentificacion());
            pst.setString(2, admin.getNombre1());
            pst.setString(3, admin.getNombre2());
            pst.setString(4, admin.getApellido1());
            pst.setString(5, admin.getApellido2());
            pst.setDate(6, admin.getFechaNacimiento());
            pst.setString(7, admin.getSexo());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Administrador registrado");
        }
        catch(SQLException ex){
            Logger.getLogger(GestorAdmin.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode()==2627){
                JOptionPane.showMessageDialog(null, "Este número de documento ya existe, el registro no fue realizado");
            }
            
        }
    }
    //2do método del CRUD -> Read admin de acuerdo a un parámetro
    public LinkedList<Admin> getAdminByParametro(int parametro, String valor){
        LinkedList<Admin> resultado = new LinkedList<>();
        String instruccionSql="";
        switch(parametro)
        {
            case 1 -> {
                instruccionSql= "Select * from TblAdmin where IdAdmin ='" + valor+"' ";
                break;
            }
            case 2 -> {
                valor = valor.toUpperCase();
                valor = valor.trim();
                String[] newStr = valor.split("\\s+");
                if(newStr.length >1 )
                {
                    instruccionSql = "Select * from TblAdmin where Nombre1='"+newStr[0]+"' and Nombre2='"+newStr[1]+"'";
                }
                else {
                    instruccionSql = "Select * from TblAdmin where Nombre1='"+valor+"' ";                      
                }
                break;
            }
                        
            case 3 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from TblAdmin where Apellido1='"+newStr1[0]+"' and Apellido2='"+newStr1[1]+"' ";
                }
                else {
                    instruccionSql = "Select * from TblAdmin where Apellido1='"+valor+"'";
                }
                break;
            }   
        }
        
        //JOptionPane.showMessageDialog(null, instruccionSql);
        
        try{
            PreparedStatement st=conex.prepareStatement(instruccionSql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                resultado.add(new Admin(rs.getString("IdAdmin"),
                        rs.getString("Nombre1"),
                        rs.getString("Nombre2"),
                        rs.getString("Apellido1"),
                        rs.getString("Apellido2"), 
                        rs.getDate("Fechanacimiento"),
                        rs.getString("Sexo")));  
            }
            st.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
        
        return resultado;
    }
}
    

