/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generador.de.examenes.proyecto1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Rafael Bugueño
 */
public class CatalogoPreguntas {
    //el catalogo de preguntas de cada tipo, del cual se escogeran 9 de manera equitativa
    // Enunciados y preguntas de cada tipo
    public ArrayList<String> enunciados_TF = new ArrayList<>(Arrays.asList(
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
    public ArrayList<String> respuestas_TF = new ArrayList<>(Arrays.asList("f", "f", "t", "t", "f", "f", "f", "t", "f", "t", "f", "t", "t", "t", "t", "t", "f", "t", "t", "f", "f", "t"));
    public ArrayList<String> enunciados_SM = new ArrayList<>(Arrays.asList(
        "¿Cuál es el nombre del río más largo del mundo?\n\ta) Río Nilo\n\tb) Río Amazonas\n\tc) Río Danubio\n\td) Río Misisipi",
        "¿Cuál es el océano más grande del mundo?\n\ta) Océano Pacífico\n\tb) Océano Índico\n\tc) Océano Ártico\n\td) Océano Atlántico",
        "¿Cuál es el país más grande del mundo?\n\ta) China\n\tb) Francia\n\tc) Rusia\n\td) India",
        "¿Cuál es el país que tiene forma de bota?\n\ta) España\n\tb) Honduras\n\tc) Noruega\n\td) Italia",
        "¿En qué país se encuentra ubicada la Casa Rosada?\n\ta) Perú\n\tb) Argentina\n\tc) Chile\n\td) Mexico",
        "¿Cuál es la segunda montaña más alta del mundo?\n\ta) K2\n\tb) Monte Everest\n\tc) K1\n\td) K3",
        "¿Cuándo terminó la II Guerra Mundial?\n\ta) 1945\n\tb) 1947\n\tc) 1919\n\td) 1943"
    ));
    public ArrayList<Integer> respuestas_SM = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 1, 0, 0));
    public ArrayList<String> enunciados_RC = new ArrayList<>(Arrays.asList(
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
    public ArrayList<String> respuestas_RC = new ArrayList<>(Arrays.asList("1914", "1945", "Hiroshima", "1865", "Neil Armstrong", "Amazonas", "África", "Japón", "Pacífico", "Tokio", "Perú", "Emiratos Árabes Unidos", "China", "Sena", "Francia", "Grecia", "Absolutismo", "La Declaración de Independencia"));

    //constructor
    CatalogoPreguntas(){
        
    }
    
}
