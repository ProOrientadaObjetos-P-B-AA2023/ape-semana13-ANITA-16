package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class VentasTvs {
    ArrayList<Televisor> televisores;
    public VentasTvs(ArrayList<Televisor> televisores) {
        this.televisores = televisores;
    }

    public double establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
        }
        return s;
    }
    public String listaMarcasVendidas(){
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", s, televisores.get(i).obtenerMarca());
        }
        return s;
    }
    public double televisorMasCaro(){
        double s = televisores.get(0).obtenerPrecio();
        for (int i = 1; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > s) {
                s = televisores.get(i).obtenerPrecio();
            }
        }
        return s;
    }
}
