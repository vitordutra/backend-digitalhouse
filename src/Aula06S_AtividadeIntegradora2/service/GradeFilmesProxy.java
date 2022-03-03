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

    @Override
    public Filme getFilme(String titulo) throws FilmeNaoHabilitadoException {
        Filme filme = gradeFilmes.getFilme(titulo);

        if (ip >= 0 && ip <= 49 && filme.getPais().equals("AR")) {
            return filme;
        } else if (ip >= 50 && ip <= 99 && filme.getPais().equals("BR")) {
            return filme;
        } else if (ip >= 100 && ip <= 149 && filme.getPais().equals("CO")) {
            return filme;
        } else {
            throw new FilmeNaoHabilitadoException("Filme não disponível no seu país");
        }
    }
}
