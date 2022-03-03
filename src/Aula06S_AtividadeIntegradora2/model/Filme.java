package Aula06S_AtividadeIntegradora2.model;

public class Filme {
    private String titulo;
    private String pais;
    private String link;

    public Filme(String titulo, String pais, String link) {
        this.titulo = titulo;
        this.pais = pais;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
