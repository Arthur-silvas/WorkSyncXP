package Sistemas;

import Classes.Funcionarios;
import Telas.FuncionariosVIEW;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FuncionariosDAO {

    private static ArrayList<Funcionarios> funcionarios = new ArrayList<>();

    public void cadastrar(Funcionarios funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarDados(JTable model) {
        try {
            DefaultTableModel Dtmodel = (DefaultTableModel) model.getModel();
            for (Funcionarios funcionario : funcionarios) {
                Object[] dados = {
                    funcionario.getId(),
                    funcionario.getNome(),
                    funcionario.getDataNasc(),
                    funcionario.getTelefone(),
                    funcionario.getEmail(),
                    funcionario.getCargo_id()
                };
                Dtmodel.addRow(dados);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar");
        }
    }
    
    public void atualizar(){
        
    }
    
    //public void remover(){
    //    funcionarios.remove();
    //}

}
