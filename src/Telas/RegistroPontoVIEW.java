package Telas;

import Classes.Funcionarios;
import Classes.Registro_horas;
import Sistemas.Registro_horasDAO;
import Sistemas.Sessao;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class RegistroPontoVIEW extends javax.swing.JFrame {

    Registro_horas registroHoras = new Registro_horas();
    Registro_horasDAO dao = new Registro_horasDAO();
    Funcionarios atual = Sessao.getUsuarioLogado();

    private LocalDateTime agora;
    private LocalTime horarioIncial;
    private LocalTime horarioFinal;
    private LocalTime horasTrabalhadas;

    public RegistroPontoVIEW() {
        initComponents();
        dataHoraAtual();
        horarioAtualSistema();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDataHoraAtual = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        txtHorarioEnt = new javax.swing.JTextField();
        txtHorarioSai = new javax.swing.JTextField();
        lblHorasT = new javax.swing.JLabel();
        txtHorasTrabalhadas = new javax.swing.JTextField();
        lblbancoH = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 63, 146));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data e hora de acesso ao sistema:");

        lblDataHoraAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDataHoraAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblDataHoraAtual.setText("lblDataAtual");

        lblEntrada.setBackground(new java.awt.Color(204, 204, 204));
        lblEntrada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrada.setText("Horário de Entrada");

        lblSaida.setBackground(new java.awt.Color(204, 204, 204));
        lblSaida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaida.setForeground(new java.awt.Color(255, 255, 255));
        lblSaida.setText("Horário de Saída");

        txtHorarioEnt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHorarioEnt.setEnabled(false);

        txtHorarioSai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHorarioSai.setEnabled(false);
        txtHorarioSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioSaiActionPerformed(evt);
            }
        });

        lblHorasT.setBackground(new java.awt.Color(204, 204, 204));
        lblHorasT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHorasT.setForeground(new java.awt.Color(255, 255, 255));
        lblHorasT.setText("Horas Trabalhadas");

        txtHorasTrabalhadas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblbancoH.setBackground(new java.awt.Color(204, 204, 204));
        lblbancoH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblbancoH.setForeground(new java.awt.Color(255, 255, 255));
        lblbancoH.setText("Banco de Horas extras");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sem registro de horas extras*");

        btnFinalizar.setBackground(new java.awt.Color(51, 51, 51));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(204, 204, 204));
        btnFinalizar.setText("Finalizar espediente");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblDataHoraAtual)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblEntrada))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbancoH)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblHorasT)
                                            .addComponent(txtHorarioEnt)
                                            .addComponent(txtHorasTrabalhadas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFinalizar)))))
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblSaida))
                            .addComponent(txtHorarioSai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataHoraAtual)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntrada)
                    .addComponent(lblSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorarioEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorarioSai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(lblHorasT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHorasTrabalhadas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lblbancoH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHorarioSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioSaiActionPerformed

    }//GEN-LAST:event_txtHorarioSaiActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // Pega a hora atual do sistema
        LocalTime horarioFinal = LocalTime.now();

        // Atualiza o campo txtHorarioSai com a hora atual formatada
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        txtHorarioSai.setText(horarioFinal.format(formatter));

        // Pega o horário inicial do campo txtHorarioEnt
        LocalTime horarioInicial;
        try {
            horarioInicial = LocalTime.parse(txtHorarioEnt.getText(), formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Formato do horário inválido em Horário Entrada.");
            return;
        }

        // Calcula a duração
        Duration duracao = Duration.between(horarioInicial, horarioFinal);
        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart();
        long segundos = duracao.toSecondsPart();

        String tempoTotal = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        txtHorasTrabalhadas.setText(tempoTotal);

        // Setando dados no objeto
        registroHoras.setFuncionario_id(atual.getId());
        registroHoras.setData_registro(dataAtualSistema());
        registroHoras.setHorario_entrada(horarioInicial);
        registroHoras.setHorario_saida(horarioFinal);

        // Salva no banco
        dao.salvar(registroHoras);
        
        JOptionPane.showMessageDialog(this, "Ponto finalizado");
        this.dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroPontoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPontoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPontoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPontoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPontoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDataHoraAtual;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblHorasT;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblbancoH;
    private javax.swing.JTextField txtHorarioEnt;
    private javax.swing.JTextField txtHorarioSai;
    private javax.swing.JTextField txtHorasTrabalhadas;
    // End of variables declaration//GEN-END:variables

    //recebe a data atual da máquina do usuário
    public Date dataAtualSistema() {
        return new Date();
    }

    //recebe o horário atual da máquina do usuário
    public void horarioAtualSistema() {
        LocalTime horaAtual = LocalTime.now();
        String horaFormatada = horaAtual.toString().substring(0, 8);
        txtHorarioEnt.setText(horaFormatada);
    }

    //Set nos atributos horario de entrada/saída
    public void conversaoDeTipos() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime horarioIncial = LocalTime.parse(txtHorarioEnt.getText(), formatter);
            LocalTime horarioFinal = LocalTime.parse(txtHorarioSai.getText(), formatter);

            registroHoras.setHorario_entrada(horarioIncial);
            registroHoras.setHorario_saida(horarioFinal);

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Formato do horário inválido. Use HH:mm:ss.");
        }
    }

    //recebe a data e o horário atual da máquina do usuário
    public void dataHoraAtual() {
        agora = LocalDateTime.now();
        //formatando a saída data e horário
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        lblDataHoraAtual.setText(dataHoraFormatada);
    }
}
