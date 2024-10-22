
package generador.de.examenes.proyecto1;

public class GeneradorDeExamenesProyecto1 {

    public static void main(String[] args) {
        CatalogoPreguntas catalogo= new CatalogoPreguntas();
        Examen examen_test = new Examen(9, catalogo);
    }
}
