package p1;
public class MatriculaJardin extends Matricula{
    private double costoDesayunos;
    private double costoLibros;
    private double costoPaseos;

    public MatriculaJardin(double costoDesayunos, double costoLibros, double costoPaseos) {
        this.costoDesayunos = costoDesayunos;
        this.costoLibros = costoLibros;
        this.costoPaseos = costoPaseos;
    }

    public void establecerTarifa(){
        super.setTarifa(costoDesayunos+costoLibros+costoPaseos);
    }

    @Override
    public String toString() {
        return "MatriculaJardin{" +
                "costoDesayunos=" + costoDesayunos +
                ", costoLibros=" + costoLibros +
                ", costoPaseos=" + costoPaseos +
                '}'+super.toString();
    }
}

