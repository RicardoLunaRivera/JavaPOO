package C19_EjercicioVideoJuego;

import C19_EjercicioVideoJuego.logica.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class EjecicioVideojuego {

    public static void main(String[] args) {
        List<VideoJuego> videoJuegoList = new ArrayList<VideoJuego>();
        VideoJuego videoJuego1 = new VideoJuego(1234,"Mario Party", "Nintendo 64", 5, "Plataforma");
        VideoJuego videoJuego2 = new VideoJuego(5612,"Mario Car 8", "Nintendo Switch", 5, "Plataforma");
        VideoJuego videoJuego3 = new VideoJuego(1593,"Super Mario 64", "Nintendo 64", 2, "Plataforma");
        VideoJuego videoJuego4 = new VideoJuego(7539,"Counter Strike", "PC", 1, "Plataforma");
        VideoJuego videoJuego5 = new VideoJuego(8523,"Tom Rider", "PlayStation", 1, "Plataforma");

        videoJuegoList.add(videoJuego1);
        videoJuegoList.add(videoJuego2);
        videoJuegoList.add(videoJuego3);
        videoJuegoList.add(videoJuego4);
        videoJuegoList.add(videoJuego5);

        for (VideoJuego videoJuego : videoJuegoList){
            System.out.println("VideoJuego: " + videoJuego.getTitulo() + " -  Consola: " + videoJuego.getConsola() +
                    " - Jugdores: " + videoJuego.getNumJugadores());
        }

        //Cambiarle el nombre y los jugadores a 2
        videoJuego1.setTitulo("Mario Party 64");
        videoJuego1.setNumJugadores(10);

        videoJuego3.setTitulo("Super Mario Star 64");
        videoJuego3.setNumJugadores(1);

        System.out.println("\n ## Nueva Lista ##");
        for (VideoJuego videoJuego : videoJuegoList){
            System.out.println("VideoJuego: " + videoJuego.getTitulo() + " -  Consola: " + videoJuego.getConsola() +
                    " - Jugdores: " + videoJuego.getNumJugadores());
        }

        //Mostrar solo los juegos de Nintendo 64
        System.out.println("\n Videojuegos de Nintendo 64");
        for (VideoJuego videoJuego : videoJuegoList){
            if(videoJuego.getConsola() == "Nintendo 64"){
                System.out.println("Videojuego: " + videoJuego.getTitulo());
            }
        }
    }

}
