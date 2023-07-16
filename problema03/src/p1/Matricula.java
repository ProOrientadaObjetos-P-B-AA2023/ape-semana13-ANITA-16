package p1;

public abstract class Matricula {
    private double tarifa;
    public abstract void establecerTarifa();

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public double getTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "tarifa=" + tarifa +
                '}';
    }
}
