/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_v2;

/**
 *
 * @author vanes
 */
public class class_usuario extends class_libro{
    
    private String id_Usuario;
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;
 
    public class_usuario(String id_libro, String libro, String autor,String id_Usuario, String nombre, int telefono, String correo, String direccion) {
        super(id_libro, libro, autor);
        this.id_Usuario=id_Usuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public class_usuario(String id_Usuario, String nombre, int telefono, String correo, String direccion) {
        super(null, null, null);
         this.id_Usuario=id_Usuario;
        this.nombre=nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    
    
    
    
    
}
