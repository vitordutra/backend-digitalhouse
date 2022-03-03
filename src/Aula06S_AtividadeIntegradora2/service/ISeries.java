package Aula06S_AtividadeIntegradora2.service;

import Aula06S_AtividadeIntegradora2.exceptions.SerieNaoHabilitadaException;

public interface ISeries {
    String getSerie(String titulo) throws SerieNaoHabilitadaException;
}
