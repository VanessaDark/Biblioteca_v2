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
    
    private String id_prestamo;
    private String fechaInicio;
    private String fechaDevolucion;
 
    public class_usuario(String id_libro, String libro, String autor,String id_Usuario, String nombre, int telefono, String correo, String direccion,String id_prestamo,String fechaInicio,String fechaDevolucion) {
        super(id_libro, libro, autor);
        this.id_Usuario=id_Usuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.id_prestamo=id_prestamo;
        this.fechaInicio=fechaInicio;
        this.fechaDevolucion=fechaDevolucion;
    }

    public class_usuario(String id_Usuario, String nombre, int telefono, String correo, String direccion) {
        super(null, null, null);
         this.id_Usuario=id_Usuario;
        this.nombre=nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(String id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
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
