/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaavl;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class JOP {
    String lector;
    
    public void mostrarMensaje(String menInterno, String menWindow){
        JOptionPane.showMessageDialog(null, menInterno, menWindow, JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostrarMensajeError(String menInterno, String menWindow){
        JOptionPane.showMessageDialog(null, menInterno, menWindow, JOptionPane.ERROR_MESSAGE);
    }
    
    public String leerString(String mensaje){
        lector=JOptionPane.showInputDialog(mensaje);
        return lector;
    }
    
    public double leerDouble(String mensaje){
        double dato;
        try{
            lector=JOptionPane.showInputDialog(mensaje);
            dato=(double)Double.parseDouble(lector);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"tipo de dato no valido, por favor ingrese el dato de nuevo","error",JOptionPane.ERROR_MESSAGE);
            leerDouble(mensaje);
            return 0;
        }
        return dato;
    }
    
    public int leerInt(String mensaje){
        int dato;
        try{
            lector=JOptionPane.showInputDialog(mensaje);
            dato=(int)Integer.parseInt(lector);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"tipo de dato no valido, por favor ingrese el dato de nuevo","error",JOptionPane.ERROR_MESSAGE);
            leerInt(mensaje);
        }
        return (int)Integer.parseInt(lector);
    }
    
    public long leerLong(String mensaje){
        long dato;
        
            lector=JOptionPane.showInputDialog(mensaje);
            dato=(long)Long.parseLong(lector);
        
        return (long)Long.parseLong(lector);
    }
    
    public char leerChar(String mensaje){
        lector=JOptionPane.showInputDialog(mensaje);
        return lector.charAt(0);
    }
    
    public String comboString(String menInterno, String menWindow,String[] opciones){
        Object lectura=JOptionPane.showInputDialog(null,menInterno,menWindow,JOptionPane.QUESTION_MESSAGE,null,opciones,"seleccione");
        return (String)lectura;
    } //usa como prametro un arreglo de strings para crear una lista despegable de opciones
    
    public int opcionYN(String menInterno, String menWidow){
        int respuesta=JOptionPane.showOptionDialog(null, menInterno, menWidow, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,null,null);
        return respuesta;
        
    } //crea las opciones yes-no y cancel y retorna un entero entre -1 y 2 ciendo -1 cuando se cierra la ventana y 2 cancel
}
