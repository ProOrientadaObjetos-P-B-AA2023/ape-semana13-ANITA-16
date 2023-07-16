package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> matriculas= new ArrayList<>();
        matriculas.add(new MatriculaCampamento(250,130,70));
        matriculas.add(new MatriculaColegio(543,123,431,5));
        matriculas.add( new MatriculaEscuela(123,345,567,45));
        matriculas.add (new MatriculaJardin(651,123,100));
        matriculas.add(new MatriculaMaternal(567,12,30));
        matriculas.add(new MatriculaMaternal(109,231,30));
        for (Matricula matricula: matriculas){
            matricula.establecerTarifa();
        }
        TipoMatricula tipos= new TipoMatricula(matriculas);
        for (Matricula matricula: matriculas)
            System.out.println(matricula);
        System.out.printf("Promedio Tarifas: %s\n", tipos.establecerPromedioTarifas());
    }
}
