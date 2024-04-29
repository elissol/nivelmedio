package exercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



class Agenda {
    private List<Compromisso> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    public List<Compromisso> getCompromissosPorData(Date data) {
        List<Compromisso> compromissosDataEspecifica = new ArrayList<>();
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getData().equals(data)) {
                compromissosDataEspecifica.add(compromisso);
            }
        }
        return compromissosDataEspecifica;
    }
}

