
package service;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Arthur
 */
public class afastamentoService {
    
    public boolean emptyFilds(JTextField txtDataFinal, JTextField txtDataInicial) {
        //Verifica se os campos estão vazios
        if (txtDataInicial.getText().isEmpty() || txtDataFinal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return false; // Retorna falso imediatamente se estiver vazio
        }
        //Armazena os valores dos campos
        String dataInicial = txtDataInicial.getText();
        String dataFinal = txtDataFinal.getText();

        //Define o padrão de data (Regex)
        String regexData = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

        //Valida os formatos das datas com Regex
        if (!dataInicial.matches(regexData)) {
            JOptionPane.showMessageDialog(null, "Preencha a data inicial no formato\ndd/MM/yyyy");
            return false; // Retorna falso se o formato estiver errado
        }

        if (!dataFinal.matches(regexData)) {
            JOptionPane.showMessageDialog(null, "Preencha a data final no formato\ndd/MM/yyyy");
            return false; // Retorna falso se o formato estiver errado
        }

        // Se todos os testes passarem, o método retorna verdadeiro
        return true;
    }
    
}
