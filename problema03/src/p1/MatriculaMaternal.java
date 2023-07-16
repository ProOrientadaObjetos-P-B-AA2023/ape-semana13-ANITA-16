package p1;
public class MatriculaMaternal extends Matricula{
    private double costoDesayunos;
    private double costoAlmuerzo;
    private double costoMedico;

    public MatriculaMaternal(double costoDesayunos, double costoAlmuerzo, double costoMedico) {
        this.costoDesayunos = costoDesayunos;
        this.costoAlmuerzo = costoAlmuerzo;
        this.costoMedico = costoMedico;
    }

    public void establecerTarifa(){
        // tarifa = costo desayunos + costo almuerzo + costo medico
        super.setTarifa(costoDesayunos+costoAlmuerzo+costoMedico);
    }

    @Override
    public String toString() {
        return "MatriculaMaternal{" +
                "costoDesayunos=" + costoDesayunos +
                ", costoAlmuerzo=" + costoAlmuerzo +
                ", costoMedico=" + costoMedico +
                '}'+super.toString();
    }
}