package screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean status;
    private int eposidiostemporada;
    private int duracaoEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getEposidiostemporada() {
        return eposidiostemporada;
    }

    public void setEposidiostemporada(int eposidiostemporada) {
        this.eposidiostemporada = eposidiostemporada;
    }

    public int getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }
}
