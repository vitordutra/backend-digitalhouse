package Aula06S_AtividadeIntegradora2.service;

import Aula06S_AtividadeIntegradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_AtividadeIntegradora2.model.Filme;

public interface IGradeFilmes {
    Filme getFilme(String titulo) throws FilmeNaoHabilitadoException;
}
