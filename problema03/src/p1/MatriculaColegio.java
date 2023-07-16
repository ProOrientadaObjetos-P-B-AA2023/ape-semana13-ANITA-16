package p1;
public class MatriculaColegio extends Matricula{
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;

    public MatriculaColegio(double costoDeportes, double costoFolletos, double costoUniformes, double costoLaboratorios) {
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
        this.costoLaboratorios = costoLaboratorios;
    }

    public void establecerTarifa(){
        super.setTarifa(costoDeportes + costoFolletos + costoUniformes + costoLaboratorios);
    }

    @Override
    public String toString() {
        return "MatriculaColegio{" +
                "costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                ", costoLaboratorios=" + costoLaboratorios +
                '}'+super.toString();
    }
}