package paquete004;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago{
    double valorPropiedad;
    double porcentaje;

    public PagoPredial(double valorPropiedad, double porcentaje) {
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    public void calcularPago(){
        pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }

    @Override
    public String toString() {
        return "PagoPredial{" +
                "valorPropiedad=" + valorPropiedad +
                ", porcentaje=" + porcentaje + super.toString()+
                '}';
    }
}

