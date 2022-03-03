package Aula06S_AtividadeIntegradora2.service;

import Aula06S_AtividadeIntegradora2.exceptions.SerieNaoHabilitadaException;

public class SerieProxy implements ISeries {
    private int numberOfViews = 0;

    @Override
    public String getSerie(String titulo) throws SerieNaoHabilitadaException {
        Serie serie = new Serie();
        if (numberOfViews < 4) {
            numberOfViews++;
            return serie.getSerie(titulo);
        } else {
            throw new SerieNaoHabilitadaException("Número de reproduções excedido.");
        }
    }
}
