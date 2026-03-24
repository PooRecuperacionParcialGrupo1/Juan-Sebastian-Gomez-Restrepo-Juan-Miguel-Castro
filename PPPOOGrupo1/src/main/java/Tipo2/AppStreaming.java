/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;
 import java.util.HashSet;

/**
 *
 * @author gomez
 */
public class AppStreaming {
    public static void main(String[] args){
        Pelicula p1 = new Pelicula("Toy Story" , 140, 2013, "X");
        Pelicula p2 = new Pelicula("Spider Man", 140, 2011, "Y");
        Pelicula p3 = new Pelicula("Rapidos y Furiosos", 120, 2009, "Z");
        Pelicula p4 = new Pelicula("titanic", 160, 2000, "A");
        
        Podcast pd1 = new Podcast("NBA", 160, 2003, "h");
        Podcast pd2 = new Podcast("Pele", 140, 2021, "i");
        Podcast pd3 = new Podcast("Habadana", 110, 2033, "k");
        Podcast pd4 = new Podcast("Tecnologia", 60, 2019, "l");
        
        HashSet<String> titulos=new HashSet<>();
        ContenidoMultimedia[] contenidos = {p1, p2, p3, p4, pd1, pd2, pd3, pd4};
    }
}
