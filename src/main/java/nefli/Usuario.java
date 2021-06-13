package nefli;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Pelicula> peliculasPendientes = new ArrayList<>();
  Reproductor reproductor;

  public void reproducirPelicula(Pelicula pelicula) {
    reproductor.play(pelicula.getIdVideo(), pelicula.getMinutosRestantes());
  }

  public List<Pelicula> mostrarContinuarViendo() {
    return peliculasPendientes;
  }

  public void elegidaAContinuar(Pelicula pelicula) {
    peliculasPendientes.remove(pelicula);
    this.reproducirPelicula(pelicula);
  }

  public void pararPelicula(Pelicula pelicula, int minutosTranscurridos) {
    reproductor.stop();
    pelicula.pararEn(minutosTranscurridos);
    peliculasPendientes.add(pelicula);
  }


}
