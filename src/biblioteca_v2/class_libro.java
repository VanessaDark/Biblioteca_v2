/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_v2;

/**
 *
 * @author vanes
 */
public class class_libro {
    
    private String id_libro;
    private String libro;
    private String autor;
    private String editorial;
    private String edicion;
    private String fecha;
    private int cantidad;

    public class_libro(String id_libro, String libro, String autor) {
        this.id_libro = id_libro;
        this.libro = libro;
        this.autor = autor;
    }

    public class_libro(String id_libro, String libro, String autor, String editorial, String edicion, String fecha, int cantidad) {
        this.id_libro = id_libro;
        this.libro = libro;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
    
    

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
}
