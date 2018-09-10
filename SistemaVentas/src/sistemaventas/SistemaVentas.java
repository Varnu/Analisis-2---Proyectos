/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

import java.util.ArrayList;
import java.util.Calendar;
import procesoVenta.Caja;
import procesoVenta.Factura;
import procesoVenta.Producto;
import procesoVenta.Venta;
import view.JOP;

/**
 *
 * @author alejandrom.montoya
 */
public class SistemaVentas {
    JOP visual = new JOP();
    Caja caja;
    int idVentas = 0;
    
    private ArrayList<Producto> CrearProductos() {
        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(new Producto("1", "leche", 1900));
        productos.add(new Producto("2", "Arroz", 1300));
        productos.add(new Producto("3", "huevo", 300));
        productos.add(new Producto("4", "Arepa", 1500));
        productos.add(new Producto("5", "pan", 1000));
        return productos;
    }
    public void iniciarCaja(){
       caja = new Caja();
       crearVenta();
       
    }
    public void crearVenta(){
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));
        Venta venta = new Venta(idVentas,  dia+"/"+mes+"/"+annio);
        anadirLineaProducto(venta);
    }
    public void anadirLineaProducto(Venta venta){
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
        continuarRegistro(venta);
    }
    public void continuarRegistro(Venta venta){
        int desicion = visual.opcionYN("¿Desea continuar añadiendo productos?", "Sistema de Ventas");
        if(desicion == 0){
            anadirLineaProducto(venta);
        }else if(desicion == 1){
            calcularTotal(venta);
        }
    }
    public void calcularTotal(Venta venta){
        Factura fact = new Factura(venta);
        
        int desicion=visual.opcionYN(fact.imprimeRecibo()+"\n ¿Desea iniciar otra venta?", "Sistema de Ventas");
        if(desicion == 0){
            anadirLineaProducto(venta);
        }
    }
}
