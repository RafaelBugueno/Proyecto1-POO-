
package generador.de.examenes.proyecto1;

public class Respuesta_Corta_Pregunta extends Pregunta{
  
    public String respuestaCorrecta;
    static String identificador="escriba la respuesta correcta";
    
    //constructor
    Respuesta_Corta_Pregunta(String pregunta, int peso, String respuesta){
        super(pregunta,peso,identificador);
        this.respuestaCorrecta=respuesta;
    }
    @Override
    public boolean buscar(String respuesta){
        return (respuesta.equalsIgnoreCase(respuestaCorrecta));
    }
    @Override
    public void printRespuestaCorrecta() {
        System.out.println(respuestaCorrecta);
    }
}
