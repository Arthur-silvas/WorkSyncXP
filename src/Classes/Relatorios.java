package Classes;

import java.util.Date;

public class Relatorios {
    private int id;
    private int funcionarios_id;
    private Date data_geracao;
    private String descricao; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFuncionarios_id() {
        return funcionarios_id;
    }

    public void setFuncionarios_id(int funcionarios_id) {
        this.funcionarios_id = funcionarios_id;
    }

    public Date getData_geracao() {
        return data_geracao;
    }

    public void setData_geracao(Date data_geracao) {
        this.data_geracao = data_geracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
