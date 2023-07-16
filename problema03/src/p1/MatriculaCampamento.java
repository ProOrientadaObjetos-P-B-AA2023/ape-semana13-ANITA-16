package p1;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula{
    private double costoTransporte;
    private double costoComida;
    private double costoInstructores;

    public MatriculaCampamento(double costoTransporte, double costoComida, double costoInstructores) {
        this.costoTransporte = costoTransporte;
        this.costoComida = costoComida;
        this.costoInstructores = costoInstructores;
    }

    public void establecerTarifa(){
        super.setTarifa(costoTransporte + costoComida + costoInstructores);
    }

    @Override
    public String toString() {
        return "MatriculaCampamento{" +
                "costoTransporte=" + costoTransporte +
                ", costoComida=" + costoComida +
                ", costoInstructores=" + costoInstructores +
                '}'+super.toString();
    }
}
