package p1;
public class MatriculaEscuela extends Matricula{
    private double costoLibros;
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;

    public MatriculaEscuela(double costoLibros, double costoDeportes, double costoFolletos, double costoUniformes) {
        this.costoLibros = costoLibros;
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
    }

    public void establecerTarifa(){
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        super.setTarifa(costoLibros+costoDeportes+costoFolletos+costoUniformes);
    }

    @Override
    public String toString() {
        return "MatriculaEscuela{" +
                "costoLibros=" + costoLibros +
                ", costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                '}'+super.toString();
    }
}
