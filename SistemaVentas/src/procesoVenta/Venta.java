/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesoVenta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanf.gallo
 */
public class Venta {
    private int id;
    private String fechaVenta;
    private double total;
    private List<Linea> list;
    

    public Venta(int id, String fechaVenta, double total) {
        this.id = id;
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.list= new ArrayList<Linea>();
    }
    
    public Venta(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public List<Linea> obtenerLista(){
        //obtener un tetorno de lista
        
        return this.list;
    }
    
    public void anadirLinea(Producto producto, int cantidad){
        Linea nueva = new Linea(producto, cantidad);
       this.list.add(nueva);
    }
    
    public void eliminarLinea(){
        
    }
    
    
}
