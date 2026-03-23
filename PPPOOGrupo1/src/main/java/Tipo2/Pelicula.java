/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

/**
 *
 * @author gomez
 */
public class Pelicula extends ContenidoMultimedia {
    String director;
    
    public Pelicula(String titulo, int duracionMinutos, int anioLanzamiento, String director) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director=director;
    }
    
    @Override
    public void iniciarReproduccion(){
        System.out.println("Cargando video y ajustando subtitulos para la pelicula...");
    }
    
    public void configurarVisualizacion(){
        System.out.println("Reproduciendo en calidad automatica, idioma original.");
    }
    public void configurarVisualizacion(String artCalidad){
        System.out.println("Reproduciendo en calidad "+ artCalidad);
    }
    public void configurarVisualizacion(String calidad, String idiomaSubtitulos){
        System.out.println("Reproduciendo en calidad" + calidad + "con subtitulos en " + idiomaSubtitulos);
    }
}
