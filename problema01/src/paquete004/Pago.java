package paquete004;

import java.util.ArrayList;
import paquete002.Ciudad;



public abstract class Pago {
    double pago;
    public abstract void calcularPago();

    @Override
    public String toString() {
        return "Pago{" +
                "pago=" + pago +
                '}';
    }
    
}

class CalcularGastoPagos {
    public ArrayList<PagoAguaPotable> pagoAgua;
    public ArrayList<PagoLuzElectrica> pagoLuz;
    public ArrayList<PagoPredial> pagoPredial;
    public ArrayList<PagoTelefonoConvencional> pagoTelefono;

    public CalcularGastoPagos() {}
    public CalcularGastoPagos(ArrayList<PagoAguaPotable> pagoAgua, ArrayList<PagoLuzElectrica> pagoLuz, 
                              ArrayList<PagoPredial> pagoPredial, ArrayList<PagoTelefonoConvencional> pagoTelefono) {
        this.pagoAgua = pagoAgua;
        this.pagoLuz = pagoLuz;
        this.pagoPredial = pagoPredial;
        this.pagoTelefono = pagoTelefono;
    }
    
    public double calcularGastoPagos(){
        double gastoPagos=0;
        for(Pago pago: pagoAgua)
            gastoPagos += pago.pago;
        
        for (Pago pago: pagoLuz)
            gastoPagos += pago.pago;
        
        for (Pago pago: pagoPredial)
            gastoPagos += pago.pago;
        
        for (Pago pago: pagoTelefono)
            gastoPagos+=pago.pago;
        
        return gastoPagos;
    }
}