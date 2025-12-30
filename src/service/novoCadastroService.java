
package service;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur  
 */
public class novoCadastroService {
    
        public boolean EmptyFilds(String nome, String dataNascimento, String rg, String cpf, String tel, String endereco, String email) {
        boolean empty = true;

        if (nome.isEmpty()
                || dataNascimento.isEmpty()
                || rg.isEmpty()
                || cpf.isEmpty()
                || tel.isEmpty()
                || endereco.isEmpty()
                || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para\nfinalizar");
        } else {
            boolean RegexData = dataNascimento.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
            boolean RegexRg = rg.matches("^\\d{9}$");
            boolean RegexCpf = cpf.matches("^\\d{11}$");
            boolean RegexTel = tel.matches("^\\d{5}-\\d{4}$");

            if (RegexData == false) {
                JOptionPane.showMessageDialog(null, "Preencha a data no formato \n(dd/mm/yyyy)");
            } else if (RegexRg == false) {
                JOptionPane.showMessageDialog(null, "Preencha o RG com\n(9 dígitos numéricos)");
            } else if (RegexCpf == false) {
                JOptionPane.showMessageDialog(null, "Preencha o CPF com\n(11 dígitos numéricos)");
            } else if (RegexTel == false) {
                JOptionPane.showMessageDialog(null, "Preencha o telefone no formato \n(XXXXX-XXXX)");
            } else {

                empty = false;
            }
        }
        return empty;
    }
    
}
