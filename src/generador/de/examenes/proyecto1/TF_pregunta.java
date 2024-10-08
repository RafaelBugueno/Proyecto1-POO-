/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generador.de.examenes.proyecto1;

/**
 *
 * @author ULS36409
 */
public class TF_pregunta extends Pregunta{
    public boolean respuestaCorrecta;
    static String identificador="introduzca T para verdadero o F para falso";
    
    //constructor
    TF_pregunta(String text,int peso,boolean respuesta){
        super(text,peso,identificador);
        this.respuestaCorrecta = respuesta;
    }
    
    //metodos
    @Override
    public boolean buscar(String respuesta){
        boolean respuestaBooleana;
        int paciencia=3;
        while(true){
            /*verifica si la respuesta es t o f
            otorga la oportunidad al usuario de corregir 3 veces
            en caso de introducir un caracter que no corresponda*/
            
            //CONSIDERAR ACEPTAR TAMBIEN TRUE FALSE COMO PALABRAS
            if (respuesta.equalsIgnoreCase("t")){
                respuestaBooleana=true;
                break;
            }
            else if (respuesta.equalsIgnoreCase("f")){
                respuestaBooleana=false;
                break;
            }
            else if (paciencia>0){
                System.out.println("introduzca una respuesta valida (T/t o F/f)");
                System.out.println("quedan " + String.valueOf(paciencia) + " intentos");
                paciencia--;
            }
            else{
                System.out.println("intentos acabados, 0 puntos");
                return false;
            }
        }
        return (respuestaCorrecta==respuestaBooleana);
    }
}