package Sistemas;

import Classes.Registro_horas;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class Registro_horasDAO {
    
    public long Cal_horas_trabalhadas(Registro_horas registroHoras) {
    LocalTime entrada = registroHoras.getHorario_entrada();
    LocalTime saida = registroHoras.getHorario_saida();
    
    if (entrada != null && saida != null) {
        Duration duracao = Duration.between(entrada, saida);
        return duracao.toSeconds();
    } else {
        JOptionPane.showMessageDialog(null, "Horário de entrada ou saída está null.");
        return 0;
    }
}
}
