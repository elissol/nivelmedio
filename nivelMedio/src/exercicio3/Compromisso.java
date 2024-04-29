package exercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Compromisso {
    private Date data;
    private String hora;
    private String descricao;

    public Compromisso(Date data, String hora, String descricao) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getDescricao() {
        return descricao;
    }
}

