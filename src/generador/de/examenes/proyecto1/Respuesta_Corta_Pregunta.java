/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generador.de.examenes.proyecto1;

/**
 *
 * @author ULS36409
 */
public class Respuesta_Corta_Pregunta extends Pregunta{
  
    String respuestaCorrecta;
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
}
