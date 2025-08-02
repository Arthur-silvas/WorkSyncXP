package Sistemas;

import Classes.Relatorios;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RelatoriosDAO {

    private static ArrayList<Relatorios> relatorios = new ArrayList<>();

    public void gerarRelatorio(int id_funcionarios, Date dataGeracao, String descricao) {

    }
    
    public void registrar(Relatorios relatorio){
        relatorios.add(relatorio);
    }

    public void listar(JTable model) {
        try{
        DefaultTableModel Dtmodel = (DefaultTableModel) model.getModel();
        for (Relatorios relatorio : relatorios) {
            Object[] dados = {
                relatorio.getId(),
                relatorio.getFuncionarios_id(),
                relatorio.getDescricao(),
                relatorio.getData_geracao()

            };
            Dtmodel.addRow(dados);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar");
        }
    }
}
