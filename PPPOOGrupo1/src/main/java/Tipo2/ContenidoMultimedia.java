/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

/**
 *
 * @author gomez
 */
public abstract class ContenidoMultimedia {
    String titulo;
    int anioLanzamiento;
    int duracionMinutos;

    public ContenidoMultimedia(String titulo, int anioLanzamiento, int duracionMinutos) {
        this.titulo=titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.duracionMinutos = duracionMinutos;
    }
    
    abstract void IniciarReproduccion();
    public String ObtenerResuemn(){
        return titulo + " - "+anioLanzamiento;
    }    
}
