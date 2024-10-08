/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generador.de.examenes.proyecto1;

import java.util.ArrayList;

/**
 *
 * @author ULS36409
 */
public class Seleccion_Mult_Pregunta extends Pregunta{
    int respuestaCorrecta;
    ArrayList <String> alternativas;
    static String identificador="introduzca la alternativa correcta";
    
    //constructor
    Seleccion_Mult_Pregunta(String pregunta, int peso, ArrayList<String> newAlternativas,int respuesta){
        super(pregunta,peso,identificador);
        this.alternativas=newAlternativas;
        this.respuestaCorrecta=respuesta;
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
}
