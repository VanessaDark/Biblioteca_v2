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
    
    private String usuario;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    public class_usuario(String id_libro, String libro, String autor, String usuario, String nombre, String telefono, String correo, String direccion) {
        super(id_libro, libro, autor);
        this.usuario = usuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

  

    public void DatosUsuario(String usuario, String nombre, String telefono, String correo, String direccion) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
