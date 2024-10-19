
package generador.de.examenes.proyecto1;

public abstract class Pregunta {
    private int peso;
    public String text;
    public String textIdentificador;
    public String respuestaCorrecta;
    
    //constructor
    Pregunta(String newText,int newPeso,String identificador){
        this.text=newText;
        this.peso=newPeso;
        this.textIdentificador=identificador;
    }
    
    //metodos
    public int getPeso(){
        return peso;
    }
    public void setPeso(int newPeso){
        peso=newPeso;
    }
    public String getText(){
        return text;
    }
    abstract void printRespuestaCorrecta();
    abstract boolean buscar(String respuesta);
}

