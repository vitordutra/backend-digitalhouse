package Aula06S_AtividadeIntegradora2.service;

import Aula06S_AtividadeIntegradora2.exceptions.SerieNaoHabilitadaException;

public class Serie implements ISeries {

    @Override
    public String getSerie(String titulo) throws SerieNaoHabilitadaException {
        return "www." + titulo;
    }
}
