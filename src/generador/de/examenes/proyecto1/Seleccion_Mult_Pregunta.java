
package generador.de.examenes.proyecto1;

import java.util.ArrayList;

public class Seleccion_Mult_Pregunta extends Pregunta {
    public int respuestaCorrecta;
    ArrayList <String> alternativas;
    static String identificador="introduzca la alternativa correcta";
    
    //constructor
    Seleccion_Mult_Pregunta(String pregunta, int peso, int respuesta){
        super(pregunta,peso,identificador);
        this.respuestaCorrecta = respuesta;
    }
    
    @Override
    public boolean buscar(String respuesta){
        int alternativa;
        
        //CONSIDERAR USAR SWITCH/CASE
        if (respuesta.equalsIgnoreCase("a")){
            alternativa=0;
        }
        else if (respuesta.equalsIgnoreCase("b")){
            alternativa=1;
        }
        else if (respuesta.equalsIgnoreCase("c")){
            alternativa=2;
        }
        else if (respuesta.equalsIgnoreCase("d")){
            alternativa=3;
        }
        else{
            return false;
        }
        return(alternativa==respuestaCorrecta);
    }

    @Override
    public void printRespuestaCorrecta() {
        char alternativaCorrecta = (char) (97 + respuestaCorrecta);
        System.out.println(alternativaCorrecta);
    }
}
