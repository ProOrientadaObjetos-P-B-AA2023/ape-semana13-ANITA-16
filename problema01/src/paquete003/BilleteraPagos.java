package paquete003;

import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public String mes;


    public ArrayList<PagoAguaPotable> pagoAgua;
    public ArrayList<PagoLuzElectrica> pagoLuz;
    public ArrayList<PagoPredial> pagoPropiedades;
    public ArrayList<PagoTelefonoConvencional> pagoTelefono;

    public BilleteraPagos() {}

    public BilleteraPagos(Persona persona, String mes, ArrayList<PagoAguaPotable> pagoAgua, ArrayList<PagoLuzElectrica> pagoLuz, 
                          ArrayList<PagoPredial> pagoPropiedades, ArrayList<PagoTelefonoConvencional> pagoTelefono,double gastoPagos) {
        this.persona = persona;
        this.mes = mes;
        this.pagoAgua = pagoAgua;
        this.pagoLuz = pagoLuz;
        this.pagoPropiedades = pagoPropiedades;
        this.pagoTelefono = pagoTelefono;
        this.gastoPagos=gastoPagos;
    }

    @Override
    public String toString() {
        return "Presentar Reporte"+"BilleteraPagos{" +
                "\npersona=" + persona +
                ", \ngastoPagos=" + gastoPagos +
                ", \nmes='" + mes + '\'' +
                ", \nagua=" + pagoAgua +
                ", \nluz=" + pagoLuz +
                ", \npropiedades=" + pagoPropiedades +
                ", \ntelefono=" + pagoTelefono +
                '}';
    }
}
