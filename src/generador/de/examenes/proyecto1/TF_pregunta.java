
package generador.de.examenes.proyecto1;

public class TF_pregunta extends Pregunta{
    public String respuestaCorrecta;
    static String identificador="introduzca T para verdadero o F para falso";
    
    //constructor
    TF_pregunta(String text,int peso, String respuesta){
        super(text,peso,identificador);
        this.respuestaCorrecta = respuesta;
    }
    
    //metodos
    @Override
    public boolean buscar(String respuesta){

        String respuestaUsuario;
        int paciencia=3;
        while(true){
            /*verifica si la respuesta es t o f
            otorga la oportunidad al usuario de corregir 3 veces
            en caso de introducir un caracter que no corresponda*/
            
            //CONSIDERAR ACEPTAR TAMBIEN TRUE FALSE COMO PALABRAS
            if (respuesta.equalsIgnoreCase("t")){
                respuestaUsuario="t";
                break;
            }
            else if (respuesta.equalsIgnoreCase("f")){
                respuestaUsuario="f";
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
        return (respuestaCorrecta == respuestaUsuario);
    }

    @Override
    public void printRespuestaCorrecta() {
        System.out.println(respuestaCorrecta);
    }
}