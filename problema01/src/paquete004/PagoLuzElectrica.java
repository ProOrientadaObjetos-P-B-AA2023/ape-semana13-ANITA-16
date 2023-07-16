package paquete004;

import paquete002.Ciudad;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends Pago{
    Ciudad ciudad;
    double tarifaBase;
    double kilovatiosConsumidos;
    double costoKilovatio;

    public PagoLuzElectrica(Ciudad ciudad, double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        this.ciudad = ciudad;
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    public void calcularPago() {
        if (ciudad.equals("LOJA")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" +
                "ciudad=" + ciudad +
                ", tarifaBase=" + tarifaBase +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio + super.toString()+
                '}';
    }
}
