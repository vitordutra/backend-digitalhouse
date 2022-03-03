package Aula06S_AtividadeIntegradora2;

import Aula06S_AtividadeIntegradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_AtividadeIntegradora2.exceptions.SerieNaoHabilitadaException;
import Aula06S_AtividadeIntegradora2.model.Filme;
import Aula06S_AtividadeIntegradora2.service.GradeFilmesProxy;
import Aula06S_AtividadeIntegradora2.service.SerieProxy;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("Madagascar", "BR", "https://mad.com");
        Filme f2 = new Filme("Os Pinguins de Madagascar", "AR", "https://penguin.com");
        Filme f3 = new Filme("Madagascar 2", "CO", "https://mad2.net");

        GradeFilmesProxy gradeFilmes = new GradeFilmesProxy(75);
        gradeFilmes.addFilme(f1);
        gradeFilmes.addFilme(f2);
        gradeFilmes.addFilme(f3);

        try {
            System.out.println(gradeFilmes.getFilme("Os Pinguins de Madagascar").getLink());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(gradeFilmes.getFilme("Madagascar").getLink());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e.getMessage());
        }

        // ------ //
        SerieProxy serie = new SerieProxy();

        try {
            System.out.println(serie.getSerie("serie1"));
            System.out.println(serie.getSerie("serie2"));
            System.out.println(serie.getSerie("serie3"));
            System.out.println(serie.getSerie("serie4"));
            System.out.println(serie.getSerie("serie5"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e.getMessage());
        }
    }
}
