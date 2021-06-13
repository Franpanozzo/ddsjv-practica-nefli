package nefli;

public class Pelicula {
  int idVideo;
  int minutosRestantes;


  public Pelicula(int idVideo) {
    this.idVideo = idVideo;
  }

  public void pararEn(int minutosTranscurridos) {
    minutosRestantes -= minutosTranscurridos;
  }

  public int getIdVideo() {
    return idVideo;
  }

  public int getMinutosRestantes() {
    return minutosRestantes;
  }
}
