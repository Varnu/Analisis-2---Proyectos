/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesoVenta;

/**
 *
 * @author Study-Development
 */
public class Cajero extends Persona{
    String turno;
    Caja caja = new Caja();

    public Cajero(String turno, Caja caja) {
        this.turno = turno;
        this.caja = caja;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }
    
    
}
