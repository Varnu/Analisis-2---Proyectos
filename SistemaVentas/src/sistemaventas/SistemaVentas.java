/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

import java.util.ArrayList;
import procesoVenta.Producto;
import procesoVenta.Venta;
import view.JOP;

/**
 *
 * @author alejandrom.montoya
 */
public class SistemaVentas {
    JOP visual = new JOP();
    Venta venta;
    private ArrayList<Producto> CrearProductos() {
        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(new Producto("1", "leche", 1900));
        productos.add(new Producto("2", "Arroz", 1300));
        productos.add(new Producto("3", "huevo", 300));
        productos.add(new Producto("4", "Arepa", 1500));
        productos.add(new Producto("5", "pan", 1000));
        return productos;
    }
    public void iniciarVenta(){
        venta = new Venta();
        anadirLineaProducto();
    }
    public void anadirLineaProducto(){
        ArrayList<Producto> productos = CrearProductos();
        ArrayList<String> nombreProductos = new ArrayList<>();
        for(int i = 0;i<productos.size();i++){
            nombreProductos.add(i+" "+productos.get(i).getNombre());
        }
        String mensajeInterno = "Catalogo de Productos";
        String menWindow = "Sistema de Ventas";
        String producto = visual.comboString(mensajeInterno, menWindow, nombreProductos);
        int cantidad = visual.leerInt("Ingrese cantidad");
        int productoIndice = Integer.parseInt(String.valueOf(producto.charAt(0)));
        venta.anadirLinea(cantidad, productos.get(productoIndice));
    }
}
