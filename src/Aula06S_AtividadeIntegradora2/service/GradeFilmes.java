package Aula06S_AtividadeIntegradora2.service;

import Aula06S_AtividadeIntegradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_AtividadeIntegradora2.model.Filme;

import java.util.ArrayList;

public class GradeFilmes implements IGradeFilmes {
    private ArrayList<Filme> listaFilmes = new ArrayList();

    public void addFilme(Filme filme) {
        listaFilmes.add(filme);
    }

    @Override
    public Filme getFilme(String titulo) throws FilmeNaoHabilitadoException{
        for (Filme filme : listaFilmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }
}

