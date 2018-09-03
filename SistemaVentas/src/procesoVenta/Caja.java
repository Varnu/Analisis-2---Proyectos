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
 * @author Study-Development
 */
public class Caja {
    List<Venta>ventas = new ArrayList<Venta>();
    int idVentaFinal;
    public Caja(){
        int idVentaFinal = -1;
    }
    public void crearVenta(){
        Venta venta = new Venta();
        ventas.add(venta);
        idVentaFinal++;
    }
    public Venta consultarVenta(int id){
        return ventas.get(id);
    }
    public Venta consultarUltimaVenta(){
        if(idVentaFinal>=0){
            return ventas.get(idVentaFinal);
        }
        return null;
    }
}
