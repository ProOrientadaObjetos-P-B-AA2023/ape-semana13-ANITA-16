/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(new Televisor("LG-50 pulgadas",850.5));
        tvs.add(new Televisor("SAMSUMG-45 pulgadas",100.5));
        tvs.add(new Televisor("SONY-30 pulgadas",500.5));
        System.out.println("");
        for (Televisor televisor: tvs){
            System.out.println(televisor);
        }
        System.out.printf("Precio Total: %.2f\n", new VentasTvs(tvs).establecerPrecioTotal());
        System.out.println("Precio mas caro: "+ new VentasTvs(tvs).televisorMasCaro());
        //System.out.printf("%s\n", t1.listaMarcasVendidas(tvs));
        System.out.println("");
    }
}

