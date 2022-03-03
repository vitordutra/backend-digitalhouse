package Aula06S_AtividadeIntegradora2.service;

import Aula06S_AtividadeIntegradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_AtividadeIntegradora2.model.Filme;

public class GradeFilmesProxy implements IGradeFilmes {
    private int ip;
    private GradeFilmes gradeFilmes = new GradeFilmes();

    public GradeFilmesProxy(int ip) {
        this.ip = ip;
    }

    public void addFilme(Filme filme) {
        gradeFilmes.addFilme(filme);
    }

    public int getIp() {
        return ip;
    }

    @Override
    public Filme getFilme(String titulo) throws FilmeNaoHabilitadoException {
        Filme filme = gradeFilmes.getFilme(titulo);

        if (this.getIp() >= 0 && this.getIp() <= 49 && filme.getPais().equals("AR")) {
            return filme;
        } else if (this.getIp()  >= 50 && this.getIp()  <= 99 && filme.getPais().equals("BR")) {
            return filme;
        } else if (this.getIp()  >= 100 && this.getIp()  <= 149 && filme.getPais().equals("CO")) {
            return filme;
        } else {
            throw new FilmeNaoHabilitadoException("Filme não disponível no seu país");
        }
    }
}
