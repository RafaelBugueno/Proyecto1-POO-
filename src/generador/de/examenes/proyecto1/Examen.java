
package generador.de.examenes.proyecto1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Examen {
    //el catalogo de preguntas de cada tipo, del cual se escogeran 9 de manera equitativa
    // Enunciados y preguntas de cada tipo
    /*private ArrayList<String> enunciados_TF = new ArrayList<>(Arrays.asList(
        "¿China es el país más grande del mundo?",
        "¿Venus es el planeta más cercano al sol?",
        "¿La Tabla Periódica tiene 118 elementos?",
        "¿El español proviene del Latín?",
        "¿Goya pintó 'Las Meninas'?",
        "¿El río más largo del mundo es el Nilo?",
        "¿El ser humano tiene 36 dientes?",
        "¿Colón descubrió América en 1492?",
        "¿El oro es el mineral más duro del mundo?",
        "¿El mosquito es el animal que más mata en el mundo?",
        "¿La bandera norteamericana tiene 42 estrellas?",
        "¿El rascacielos más alto del mundo está en Dubái?",
        "¿Próxima Centauri es la estrella más cercana a la Tierra después del Sol?",
        "¿El desierto de Atacama está en Chile?",
        "¿El guepardo es el animal más rápido del mundo?",
        "¿La ballena azul es el animal más grande del mundo?",
        "¿Los pulpos tienen cuatro corazones?",
        "¿El rodio es el metal más caro del mundo?",
        "¿El disco más vendido de la historia es 'Thriller', de Michael Jackon?",
        "¿Un lustro comprende un período de 8 años?",
        "¿El órgano más grande del cuerpo humano es el cerebro?",
        "¿'Blancanieves y los siete enanitos' es la primera película de Disney?"
    ));
    private ArrayList<String> respuestas_TF = new ArrayList<>(Arrays.asList("f", "f", "t", "t", "f", "f", "f", "t", "f", "f", "f", "t", "t", "t", "t", "t", "f", "t", "t", "f", "f", "t"));
    private ArrayList<String> enunciados_SM = new ArrayList<>(Arrays.asList(
        "¿Cuál es el nombre del río más largo del mundo?\n\ta) Río Nilo\n\tb) Río Amazonas\n\tc) Río Danubio\n\td) Río Misisipi",
        "¿Cuál es el océano más grande del mundo?\n\ta) Océano Pacífico\n\tb) Océano Índico\n\tc) Océano Ártico\n\td) Océano Atlántico",
        "¿Cuál es el país más grande del mundo?\n\ta) China\n\tb) Francia\n\tc) Rusia\n\td) India",
        "¿Cuál es el país que tiene forma de bota?\n\ta) España\n\tb) Honduras\n\tc) Noruega\n\td) Italia",
        "¿En qué país se encuentra ubicada la Casa Rosada?\n\ta) Perú\n\tb) Argentina\n\tc) Chile\n\td) Mexico",
        "¿Cuál es la segunda montaña más alta del mundo?\n\ta) K2\n\tb) Monte Everest\n\tc) K1\n\td) K3",
        "¿Cuándo terminó la II Guerra Mundial?\n\ta) 1945\n\tb) 1947\n\tc) 1919\n\td) 1943"
    ));
    private ArrayList<Integer> respuestas_SM = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 1, 0, 0));
    private ArrayList<String> enunciados_RC = new ArrayList<>(Arrays.asList(
        "¿En qué año empezó la Primera Guerra Mundial?",
        "¿En qué año se fundó la ONU?",
        "¿Cuál fue la primera ciudad en ser atacada con una bomba atómica?",
        "¿En qué año se abolió la esclavitud en Estados Unidos?",
        "¿Quién fue el primer hombre en pisar la luna, según registros oficiales?",
        "¿Cuál es el río más largo del mundo?",
        "¿En qué continente se encuentra el desierto del Sahara?",
        "¿Qué país es conocido como el país del sol naciente?",
        "¿Cuál es el océano más grande del mundo?",
        "¿Cuál es la ciudad más poblada del mundo?",
        "¿En qué país se encuentran las ruinas de Machu Picchu?",
        "¿En qué país se encuentra la ciudad de Dubái?",
        "¿Cuál es el país más poblado del mundo?",
        "¿Qué río atraviesa París?",
        "¿En qué país se encuentra la Torre Eiffel?",
        "¿Qué país es considerado la cuna de la democracia?",
        "¿Cuál es el sistema político en el que el poder reside en una sola persona que gobierna de por vida?",
        "¿Qué documento fundacional de los Estados Unidos fue firmado en 1776?"
    ));    
    private ArrayList<String> respuestas_RC = new ArrayList<>(Arrays.asList("1914", "1945", "Hiroshima", "1865", "Neil Armstrong", "Amazonas", "África", "Japón", "Pacífico", "Tokio", "Perú", "Emiratos Árabes Unidos", "China", "Sena", "Francia", "Grecia", "Absolutismo", "La Declaración de Independencia"));
    */
    //private CatalogoPreguntas catalogo= new CatalogoPreguntas();
    private ArrayList<Pregunta> preguntas = new ArrayList<>(); // Aquí se almacenan todas las preguntas creadas
    private ArrayList<String> respuestas = new ArrayList<>(); // Aquí se almacenan todas las respuestas del usuario
    int numPreguntas;
    int puntaje = 0, puntajeTotal = 0;
    
    Examen(int numPreguntas,CatalogoPreguntas catalogo) {

        this.numPreguntas = numPreguntas;

        if (numPreguntas > 10) {
            numPreguntas /= 10;
        }

        // Creación de preguntas
        for (int i = 0; i < numPreguntas; i++) {
            preguntas.add(this.crearPregunta(i % 3,catalogo));
        }

        // Realización de preguntas
        for (int i = 0; i < numPreguntas; i++) {
            this.realizarPregunta(i);
        }

        // Revisión
        this.imprimirRespuestas();

        // Entrega de rendimiento
        this.displayRendimiento();
    }
    
    public Pregunta crearPregunta(int item,CatalogoPreguntas catalogo) {
        //el parametro item indica que tipo de pregunta sera,
        //el constructor se encargara de ir rotando entre las 3 equitativamente
        Random random = new Random();
        int randomIndex;
        switch (item) {
            case 0: { // Verdadero o falso
                randomIndex = random.nextInt(catalogo.enunciados_TF.size());
                Pregunta pregunta = new TF_pregunta(catalogo.enunciados_TF.get(randomIndex), 2, catalogo.respuestas_TF.get(randomIndex));
                catalogo.enunciados_TF.remove(randomIndex);
                catalogo.respuestas_TF.remove(randomIndex);
                return pregunta;
            }
            case 1: { // Selección múltiple
                randomIndex = random.nextInt(catalogo.enunciados_SM.size());
                Pregunta pregunta = new Seleccion_Mult_Pregunta(catalogo.enunciados_SM.get(randomIndex), 1, catalogo.respuestas_SM.get(randomIndex));
                catalogo.enunciados_SM.remove(randomIndex);
                catalogo.respuestas_SM.remove(randomIndex);
                return pregunta;
            }
            case 2: { // Respuesta corta
                randomIndex = random.nextInt(catalogo.enunciados_RC.size());
                Pregunta pregunta = new Respuesta_Corta_Pregunta(catalogo.enunciados_RC.get(randomIndex), 3, catalogo.respuestas_RC.get(randomIndex));
                catalogo.enunciados_RC.remove(randomIndex);
                catalogo.respuestas_RC.remove(randomIndex);
                return pregunta;
            }
        }
        return null;
    }

    public void realizarPregunta(int index) {
        Pregunta preguntaActual = preguntas.get(index);
        
        // Enunciado
        System.out.println((index + 1) + ") " + preguntaActual.getText());
        
        // Respuesta
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        respuestas.add(respuesta);

        // Verificación y puntaje
        if (preguntaActual.buscar(respuesta)) {
            puntaje += preguntaActual.getPeso();
        }
        puntajeTotal += preguntaActual.getPeso();
    }

    public void imprimirRespuestas() {
        for (int i = 0; i < numPreguntas; i++) {
            System.out.print((i + 1) + ")\tRespuesta: " + respuestas.get(i) + "\tRespuesta correcta: ");
            preguntas.get(i).printRespuestaCorrecta();
        }
    }

    public void displayRendimiento() {
        float rendimiento = (float) puntaje / puntajeTotal * 100;
        System.out.println("Rendimiento: " + rendimiento + "%");
    }
}