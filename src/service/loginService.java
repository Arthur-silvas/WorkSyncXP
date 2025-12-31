package service;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Arthur
 */
public class loginService {
        public boolean emptyFilds(JTextField txtEmail, JTextField txtCpf ) {
        boolean empty = true;
        String login = txtEmail.getText().trim(); 
        String senha = txtCpf.getText().trim();
        if (txtEmail.getText().isEmpty() || txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos de login e senha");
        } else {
            boolean RegexEmail = login.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
            boolean RegexCpf = senha.matches("^\\d{11}$");
            if (RegexEmail == false) {
                JOptionPane.showMessageDialog(null, "Digite um e-mail válido (já cadastrado)\n (ex: exemplo@dominio.com)");
            } else if (RegexCpf == false) {
                JOptionPane.showMessageDialog(null, "Preencha o CPF com\n(11 dígitos numéricos)");
            } else {
                empty = false;
            }
        }
        return empty;
    }
}
