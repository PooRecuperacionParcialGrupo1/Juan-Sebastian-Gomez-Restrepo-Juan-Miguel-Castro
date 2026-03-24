/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;
import java.util.ArrayList;
 import java.util.HashSet;

/**
 *
 * @author gomez
 */
public class AppStreaming {
    public static void main(String[] args){
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        ArrayList<Podcast> podcasts = new ArrayList<>();
        HashSet<String> titulos = new HashSet<>();
        
        Pelicula p1 = new Pelicula("Toy Story" , 140, 2013, "X");
        Pelicula p2 = new Pelicula("Spider Man", 140, 2011, "Y");
        Pelicula p3 = new Pelicula("Rapidos y Furiosos", 120, 2009, "Z");
        Pelicula p4 = new Pelicula("titanic", 160, 2000, "A");
        
        if (titulos.add(p1.titulo)) peliculas.add(p1);
        if (titulos.add(p2.titulo)) peliculas.add(p2);
        if (titulos.add(p3.titulo)) peliculas.add(p3);
        if (titulos.add(p4.titulo)) peliculas.add(p4);
        
        Podcast pd1 = new Podcast("NBA", 160, 2003, "h");
        Podcast pd2 = new Podcast("Pele", 140, 2021, "i");
        Podcast pd3 = new Podcast("Habadana", 110, 2033, "k");
        Podcast pd4 = new Podcast("Tecnologia", 60, 2019, "l");
        
        if (titulos.add(pd1.titulo)) podcasts.add(pd1);
        if (titulos.add(pd2.titulo)) podcasts.add(pd2);
        if (titulos.add(pd3.titulo)) podcasts.add(pd3);
        if (titulos.add(pd4.titulo)) podcasts.add(pd4);
        
        for (Pelicula p : peliculas) {
            System.out.println(p.ObtenerResumen());
            p.iniciarReproduccion();
        }

        for (Podcast po : podcasts) {
            System.out.println(po.ObtenerResumen());
            po.iniciarReproduccion();
        }
        
        for (Pelicula p : peliculas) {
            p.configurarVisualizacion();
            p.configurarVisualizacion("4K");
            p.configurarVisualizacion("1080p", "Español");
        }

    }
}  

