package exercicio3;

import java.util.Date;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Compromissos
        Compromisso compromisso1 = new Compromisso(new Date(), "09:00", "Ainhamento equipe");
        Compromisso compromisso2 = new Compromisso(new Date(), "15:00", "Treinameto");
        Compromisso compromisso3 = new Compromisso(new Date(), "17:00", "Feedback");

        agenda.adicionarCompromisso(compromisso1);
        agenda.adicionarCompromisso(compromisso2);
        agenda.adicionarCompromisso(compromisso3);

        // Data específica
        List<Compromisso> compromissosHoje = agenda.getCompromissosPorData(new Date());
        System.out.println("Compromissos para hoje:");
        for (Compromisso compromisso : compromissosHoje) {
            System.out.println("Hora: " + compromisso.getHora() + ", Descrição: " + compromisso.getDescricao());
        }
    }
}
