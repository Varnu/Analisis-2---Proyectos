/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesoVenta;

/**
 *
 * @author alejandrom.montoya
 */
public class Producto {
    private String id;
    private String nombre;
    private int val;

    public Producto(String id, String nombre, int val) {
        this.id = id;
        this.nombre = nombre;
        this.val = val;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
}
