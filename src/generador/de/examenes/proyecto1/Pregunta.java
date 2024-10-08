/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generador.de.examenes.proyecto1;

/**
 *
 * @author ULS36409
 */
public abstract class Pregunta {
    private int peso;
    public String text;
    public String textIdentificador;
    
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
    abstract boolean buscar(String respuesta);
}

