package actividad3_competenciatrail;

import java.time.LocalTime;

public class MainCompetencia {
    public static void main(String[] args) {
        CatalogoCompetencia catalogo = new CatalogoCompetencia();
        Categoria categoria = new Categoria("Libre 10K", 10.0, "Varonil");
        Competidor competidor = new Competidor("Carlos Ruiz", "Masculino", categoria);

        catalogo.agregarCategoria(categoria);
        catalogo.agregarCompetidor(competidor);

        competidor.registrarParticipacion(true, LocalTime.of(1, 15, 30), true);
        
        catalogo.eliminarCompetidor(competidor);
        catalogo.eliminarCategoria(categoria);
    }
}