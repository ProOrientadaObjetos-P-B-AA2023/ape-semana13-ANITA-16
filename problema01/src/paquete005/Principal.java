package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.*;
import paquete006.DatosAgua;
import paquete006.DatosLuz;
import paquete006.DatosPropiedades;
import paquete006.DatosTelefono;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        BilleteraPagos pago = new BilleteraPagos();
        ArrayList<PagoAguaPotable> agua= new ArrayList<>();
        ArrayList<PagoLuzElectrica> luz= new ArrayList<>();
        ArrayList<PagoPredial> propiedades= new ArrayList<>();
        ArrayList<PagoTelefonoConvencional> telefono= new ArrayList<>();
        double[][] informacionCasaAgua= new DatosAgua().datosCasas();
        for (int i = 0; i < informacionCasaAgua.length; i++) {
            agua.add(new PagoAguaPotable("CASA",informacionCasaAgua[i][0],informacionCasaAgua[i][1],informacionCasaAgua[i][2]));
        }
        double[][] informacionComercialAgua= new DatosAgua().datosComerciales();
        for (int i = 0; i < informacionComercialAgua.length; i++) {
            agua.add(new PagoAguaPotable("COMERCIAL",informacionComercialAgua[i][0],informacionComercialAgua[i][1],informacionComercialAgua[i][2]));
        }
        double[][] informacionLuzCasa= new DatosLuz().datosLoja();
        Ciudad ciudad1= new Ciudad("LOJA");
        for (int i = 0; i < informacionLuzCasa.length; i++) {
            luz.add(new PagoLuzElectrica(ciudad1,informacionLuzCasa[i][0],informacionLuzCasa[i][1],informacionLuzCasa[i][2]));
        }
        double[][] informacionLuzComercio= new DatosLuz().datosGeneral();
        Ciudad ciudad= new Ciudad("OTRA");
        for (int i = 0; i < informacionLuzComercio.length; i++) {
            luz.add(new PagoLuzElectrica(ciudad,informacionLuzComercio[i][0],informacionLuzComercio[i][1],informacionLuzComercio[i][2]));
        }
        double[][] informacionPropiedades= new DatosPropiedades().datos();
        for (int i = 0; i < informacionPropiedades.length; i++) {
            propiedades.add(new PagoPredial(informacionPropiedades[i][0],informacionPropiedades[i][1]));
        }
        double[][] informacionTelefono= new DatosTelefono().datos();
        for (int i = 0; i < informacionTelefono.length; i++) {
            telefono.add(new PagoTelefonoConvencional(informacionTelefono[i][0],informacionTelefono[i][1],informacionTelefono[i][2]));
        }
        for(Pago p: agua)
            p.calcularPago();
        for (Pago p: luz)
            p.calcularPago();
        for (Pago p: propiedades)
            p.calcularPago();
        for (Pago p: telefono)
            p.calcularPago();


        CalcularGastoPagos gastosPagos= new CalcularGastoPagos(agua,luz,propiedades,telefono);

        Persona persona= new Persona("juan", "plaza", 25,"110758472",ciudad1);
        pago= new BilleteraPagos(persona,"diciembre",agua,luz,propiedades,telefono,gastosPagos.calcularGastoPagos());
        System.out.println(pago);
    }
}