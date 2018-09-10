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
public class Impuesto {
    
    public double calcularIva(Linea linea){
        int subtotal=linea.getCantidad()*linea.getProducto().getVal();
        return subtotal*0.19;
    }
}
