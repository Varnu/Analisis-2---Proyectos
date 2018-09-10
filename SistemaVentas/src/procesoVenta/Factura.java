/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesoVenta;

import java.util.List;

/**
 *
 * @author juanf.gallo
 */
public class Factura {
    private Venta vta;

    public Venta getVta() {
        return vta;
    }

    public void setVta(Venta vta) {
        this.vta = vta;
    }

    public Factura(Venta vta) {
        this.vta = vta;
    }
    
        
    public String imprimeRecibo(){
        String s = "";
        String p = "";
        List<Linea> list;
        Producto current; 
        int cant;
        double val;
        list = this.vta.obtenerLista();
        for(int i = 0; i < list.size(); i++){
            current = list.get(i).getProducto();
            cant = list.get(i).getCantidad();
            val = current.getVal();
            p = p + " " + current.getNombre() + "\t" + 
                    " \nCantidad: "  + cant + "\t"
                    + "\nValor: " + cant*val + "\n";
        }
        s = "Su compra fue efectuda el dia:" + vta.getFechaVenta() + "\n"
                + "Sus productos : " + p + "\n"
                + "Total: " + this.vta.getTotal() ;
        return s;
    }
}
