package paquete004;

import java.util.ArrayList;

public class CalcularGastoPagos {
    public ArrayList<PagoAguaPotable> pagoAgua;
    public ArrayList<PagoLuzElectrica> pagoLuz;
    public ArrayList<PagoPredial> pagoPropiedades;
    public ArrayList<PagoTelefonoConvencional> pagoTelefono;

    public CalcularGastoPagos(ArrayList<PagoAguaPotable> pagoAgua, ArrayList<PagoLuzElectrica> pagoLuz, 
                             ArrayList<PagoPredial> pagoPropiedades, ArrayList<PagoTelefonoConvencional> pagoTelefono) {
        this.pagoAgua = pagoAgua;
        this.pagoLuz = pagoLuz;
        this.pagoPropiedades = pagoPropiedades;
        this.pagoTelefono = pagoTelefono;
    }
    public double calcularGastoPagos(){
        double gastoPagos=0;
        for(Pago pago: pagoAgua)
            gastoPagos+=pago.pago;
        for (Pago pago: pagoLuz)
            gastoPagos+=pago.pago;
        for (Pago pago: pagoPropiedades)
            gastoPagos+=pago.pago;
        for (Pago pago: pagoTelefono)
            gastoPagos+=pago.pago;
        return gastoPagos;
    }
}
